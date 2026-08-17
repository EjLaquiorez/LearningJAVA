🎯 Exercise 021.7 — Information Flow and Responsibility Mapping

We're continuing Topic 021.

So far, you've learned to separate:

Responsibility
        ≠
Information
        ≠
Information source
        ≠
Information user

Now we're going to combine them into an information flow model.

Scenario

A restaurant has this process:

Customer
   ↓
Requests cancellation
   ↓
Restaurant System
   ↓
Needs payment status
   ↓
Needs preparation status
   ↓
Evaluates cancellation rule
   ↓
Determines whether cancellation is allowed

We later investigated one source:

Kitchen Staff
   ↓
Updates preparation status
   ↓
Restaurant System

The payment-status source is still unknown.

Q1 — Map the Information Flow

Complete the following:

Q1: 
 
Information: 
Preparation status 
 
Produced by: 
kitchen staff 
 
Production responsibility: 
updates preparation status
 
Used by: 
restaurant system
 
Used for: 
Determines whether cancellation is allowed
 
Producer inside / outside our system: 
outside
 
Information user inside / outside our system: 
inside
 
Why can information produced outside our system 
still be used by our system? 
Information produced outside our system can still be used by our system because an external actor or system can provide information that our system needs to perform one of its own responsibilities. The information crosses the system boundary and becomes an input to our system.
________________________
🧠 Think carefully

We're separating two boundaries:

Responsibility boundary
Kitchen Staff
   ↓
Updates preparation status
   ↓
OUTSIDE OUR SYSTEM
Information usage
Preparation status
   ↓
Restaurant System
   ↓
Uses it
   ↓
INSIDE OUR SYSTEM

Don't say:

"Because preparation status belongs to the kitchen."

The information itself isn't necessarily "owned by the kitchen" in the same sense as the responsibility.

We're asking:

Who produces/updates it?
Who uses it?
What does the user use it for?
Your turn — Q1 only.

Now Q2 will make this harder by introducing two pieces of information with different levels of certainty.

Q2:

Information 1:
Payment status

Produced by:
Unknown source / needs investigation

Known or unknown:
Unknown

Used by:
Restaurant System

Used for:
Determines whether cancellation is allowed


Information 2:
Preparation status

Produced by:
Kitchen Staff

Known or unknown:
Known

Used by:
Restaurant System

Used for:
Determines whether cancellation is allowed


What is the difference between these two information flows?

The source of the payment status is still unknown and needs
investigation, while the preparation status is known to be
produced and updated by the Kitchen Staff. Both pieces of
information are used by the Restaurant System to determine
whether cancellation is allowed.

Don't assume the payment-status source.

Q3 — Information Dependency

Now let's go one level deeper.

Suppose the Restaurant System has payment status, but it does not have preparation status.

The system knows:

Payment status = Unpaid
Preparation status = Unknown

The cancellation rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

Q3

Q3:

Can the Restaurant System confidently determine that cancellation
is allowed?

Yes / No:
No.

Why:
The system cannot confidently determine that cancellation is allowed
because the preparation status is missing. The business rule requires
knowing that the order is unpaid AND that preparation has not started.
We know the order is unpaid, but we do not know the preparation
status.


What required information is missing?
Preparation status.


What should the system do with this situation?
We need to investigate what the business expects the system to do
when the required preparation status is unavailable. We should not
assume that preparation has not started or automatically decide
whether cancellation should be allowed.

Don't design the technical solution yet.
Explain the engineering reasoning.

Think carefully about the difference between:

Unpaid
+
Preparation NOT started

and:

Unpaid
+
Preparation status UNKNOWN

Answer Q3 only.

🎯 Exercise 021.7 — Q4: Conflicting Information

Now we're going to add another layer of reasoning.

So far, we've handled:

Information available
        ↓
Information missing
        ↓
Don't assume
        ↓
Investigate

Now suppose information is available, but two sources disagree.

Scenario

The Restaurant System receives:

Payment status:
Unpaid

The Kitchen Staff says:

Preparation status:
Preparation has started

The Restaurant System also receives another update saying:

Preparation status:
Preparation has NOT started

Now we have a conflict.

The cancellation rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

Q4 — Analyze the Conflict

Answer:

Q4:

What information do we have?

1. Payment status:
Unpaid

2. Preparation status:
Conflicting:
- Preparation has started
- Preparation has NOT started


Is the information consistent?

Yes / No:
No.

Why:
Two sources provide conflicting information about the preparation
status. One says preparation has started, while the other says
preparation has not started.


Can the Restaurant System confidently determine
that cancellation is allowed?

Yes / No:
No.

Why:
The cancellation rule requires the order to be unpaid and for
preparation not to have started. Although the payment status is
unpaid, the preparation status is conflicting, so the system cannot
confidently determine whether the business rule is satisfied.


What should we investigate before deciding how
the system should handle this conflict?

We should investigate why the information conflicts, which source
is authoritative, which status should be considered valid, and what
the business expects the system to do when the sources disagree.


Should we simply choose one preparation status
and ignore the other?

Yes / No:
No.

Why:
We do not yet know which source or status is authoritative. Choosing
one without a defined business rule would be an unsupported
assumption.
🧠 Important

Don't immediately decide:

"The latest status must be correct."

or:

"The Kitchen Staff must always be correct."

Those might eventually be valid business rules, but the scenario hasn't established them.

We need to investigate:

Conflicting information
        ↓
Why are the values different?
        ↓
Which source is authoritative?
        ↓
Which update is valid?
        ↓
What happens when sources disagree?

This is another example of engineering judgment before implementation.

Your job isn't to invent the conflict-resolution rule.

Your job is to identify that a conflict exists and that the business needs to define how it should be handled.

Answer Q4 only.

🏁 Exercise 021.7 — Q5: Final Information-Flow Judgment

This is the final question of Exercise 021.7.

You've now handled three information states:

KNOWN
↓
We have reliable information.


UNKNOWN
↓
We don't have the required information.


CONFLICTING
↓
We have information, but the sources disagree.

These states should not be treated the same way.

Q5 — Final Judgment

Imagine you're documenting the Restaurant System's cancellation responsibility.

Complete:

Q5:

System responsibility:
Determine whether the order is eligible for cancellation.


Required information:
1. Payment status
2. Preparation status


Case A:
Payment status = Unpaid
Preparation status = Not started

Can the system evaluate the cancellation rule?

Yes / No:
Yes.

Why:
Both required conditions are known and satisfied: the order is unpaid
and preparation has not started. Therefore, the cancellation rule can
be evaluated.


Case B:
Payment status = Unpaid
Preparation status = Unknown

Can the system confidently determine that cancellation is allowed?

Yes / No:
No.

Why:
The preparation status is unknown, so the system cannot determine
whether the condition that preparation has not started is satisfied.


Case C:
Payment status = Unpaid
Preparation status = Conflicting

Can the system confidently determine that cancellation is allowed?

Yes / No:
No.

Why:
The preparation status is conflicting, so the system does not know
which value is authoritative and therefore cannot confidently
evaluate the cancellation rule.


What should an engineer document when required information
is unknown or conflicting?

The engineer should document that the required information is
unavailable or conflicting, identify the affected business decision,
and record what needs to be investigated with the business.


Why should we avoid inventing a value for missing or conflicting
information?

Because inventing a value could cause the system to make an incorrect
business decision. The value should be based on evidence or an
explicitly defined business rule.





Why should we avoid inventing a value for missing or conflicting
information?
🧠 Your mental model

Use:

Required information
        ↓
What is its state?
        ↓
 ┌──────┼─────────┐
 ↓      ↓         ↓
Known  Unknown  Conflicting
 ↓      ↓         ↓
Evaluate  Investigate  Investigate
rule      missing      conflict

The important part is not to jump directly into implementation.

For example, don't say:

"If unknown, set it to false."

That is a system behavior decision.

First ask:

What does the business want the system to do when the information is unavailable or contradictory?

Your turn — Q5 only.
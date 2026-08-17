🎯 Exercise 021.9 — Responsibility vs. Dependency vs. Decision Ownership

We're continuing Topic 021.

This exercise targets one of the most important distinctions you've been practicing:

Responsibility ownership
        ≠
Information dependency
        ≠
Decision ownership
Scenario

The Restaurant System is responsible for:

Determining whether an order is eligible for cancellation.

The business rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

The system needs:

Payment status
Preparation status

We know:

Kitchen Staff
→ Updates preparation status

The Restaurant System:

→ Uses preparation status
→ Uses payment status
→ Determines cancellation eligibility
Q1 — Identify the Three Different Relationships

Complete:

Q1: 
 
Who owns the responsibility of updating preparation status? 
________________________________ kitchen staff 
 
 
Who owns the responsibility of determining whether cancellation 
is allowed? 
________________________________ restaurant system
 
 
Who does the Restaurant System depend on for preparation status? 
________________________________  kitchen staff
 
 
Does depending on the Kitchen Staff mean the Kitchen Staff owns 
the cancellation decision? no, its a different responsibility
 
Yes / No: 
 
Why? 
________________________________ 
 
 
Does the Restaurant System owning the cancellation decision mean 
it must produce the preparation status itself? 
 
Yes / No:  No , it's the kitchen staff responsibility
 
Why? 
________________________________
________________________________
🧠 Use this mental model
Kitchen Staff
    │
    └── Responsibility:
        Update preparation status
              │
              ↓
        Preparation status
              │
              │ dependency
              ↓
Restaurant System
    │
    └── Responsibility:
        Determine cancellation eligibility

Notice:

Kitchen Staff owns one responsibility.

Restaurant System owns another responsibility.

The Restaurant System depends on information produced by the Kitchen Staff, but that dependency does not transfer responsibility ownership.

Likewise, the Restaurant System uses preparation status, but using information does not mean it must produce that information.

⚠️ Don't overthink this one

We're not asking you to decide:

how the systems communicate
what API should exist
what database stores the status
what happens when the status is unavailable

Stay at the responsibility and information level.

Answer Q1 only.

Q2 — The Dependency Trap

Now let's make one small change.

Suppose the Kitchen Staff says:

"We haven't updated the preparation status yet."

The Restaurant System therefore has:

Payment status = Unpaid
Preparation status = Unknown

Answer:

Q2:


Does the Restaurant System still own the cancellation decision?

Yes.

Why?
The Restaurant System still owns the responsibility of determining
whether the order is eligible for cancellation. Missing information
does not transfer that responsibility.


Does the Kitchen Staff now become responsible for deciding
whether the order can be cancelled?

No.

Why?
The Kitchen Staff is responsible for updating preparation status,
not for determining whether cancellation is allowed.


What responsibility is currently blocked by the missing
preparation status?

Determining whether the order is eligible for cancellation.


Who owns that responsibility?

Restaurant System.


What responsibility does the Kitchen Staff still own?

Updating the preparation status.


What does the Restaurant System depend on from the Kitchen Staff?

The preparation status needed to evaluate the cancellation rule.


What does the Restaurant System depend on from the
Kitchen Staff?
🧠 Remember

The question is not:

"Who has the missing information?"

The question is:

"Who owns the responsibility?"

The missing information may prevent a responsibility from being completed, but that doesn't automatically transfer ownership.

Answer Q2 only.



🎯 Exercise 021.9 — Q3: Producer vs. Decision Owner

Now we introduce a more difficult situation.

Scenario

The Restaurant System owns:

Determining whether an order is eligible for cancellation.

The Kitchen Staff owns:

Updating the preparation status.

The Restaurant System needs the preparation status to evaluate the cancellation rule.

Now imagine this happens:

Kitchen Staff:
"Preparation has NOT started."


Restaurant System's records:
"Preparation has STARTED."

The two parties disagree.

Q3

Answer:

Q3:

Who owns the responsibility of updating preparation status?
Kitchen Staff.


Who owns the responsibility of determining cancellation eligibility?
Restaurant System.


What information is conflicting?
The Kitchen Staff says preparation has NOT started, while the
Restaurant System's records say preparation has STARTED.


Can the Restaurant System confidently determine whether
cancellation is allowed?

Yes / No:
No.

Why?
The preparation status is conflicting, so the system does not know
which value is authoritative or correct. Therefore, it cannot
confidently determine whether the condition "preparation has not
started" is satisfied.


Does the conflict transfer the cancellation decision
responsibility to the Kitchen Staff?

Yes / No:
No.

Why?
The Kitchen Staff owns the responsibility of updating preparation
status, while the Restaurant System owns the responsibility of
determining cancellation eligibility. A conflict in information
does not transfer decision ownership.


What should the engineer investigate before deciding
how the Restaurant System should handle the conflict?

The engineer should investigate what caused the conflict, which
source is authoritative, why the values differ, and what the
business considers the correct status when the sources disagree.
________________________________
🧠 Important distinction

Don't reason:

"Kitchen Staff says preparation hasn't started, so trust them."

And don't reason:

"The Restaurant System's record says preparation started, so trust the system."

Neither source has been established as authoritative in this scenario.

Your job is to identify:

Conflict
   ↓
Decision affected
   ↓
Decision owner remains the same
   ↓
Investigate authority / business rule

The key question is:

Who owns the decision?

not:

Who provided the information?

Answer Q3 only.

🎯 Exercise 021.9 — Q4: Responsibility vs. Accountability

Now we're going one level deeper.

So far, we've established:

Kitchen Staff
→ Updates preparation status


Restaurant System
→ Determines cancellation eligibility

But here's the question:

If the Restaurant System makes the cancellation decision, does that mean it is responsible for producing all the information used in that decision?

No.

This is where we distinguish responsibility for an activity from responsibility for providing information.

Scenario

The Restaurant System needs:

Payment status
Preparation status

We know:

Kitchen Staff
→ Updates preparation status

The Restaurant System:

→ Uses preparation status
→ Uses payment status
→ Determines cancellation eligibility

Suppose the Kitchen Staff provides an incorrect preparation status.

For example:

Actual:
Preparation has started


Provided status:
Preparation has NOT started

The Restaurant System uses the provided information and evaluates the cancellation rule.

Q4

Answer:

Q4:

Who owns the responsibility of updating preparation status?

Kitchen Staff.


Who owns the responsibility of determining cancellation eligibility?

Restaurant System.


If the Kitchen Staff provides incorrect preparation status,
does that automatically mean the Restaurant System failed to
perform its cancellation-decision responsibility?

No.

Why?

The Restaurant System's responsibility is to evaluate cancellation
eligibility using the information available to it. The Kitchen Staff
owns the responsibility of updating preparation status. Whether
either party failed requires further investigation.


Does the Restaurant System become responsible for correcting
the Kitchen Staff's preparation-status information?

No.

Why?

The Restaurant System uses the preparation status to perform its
cancellation decision. The responsibility for updating or correcting
that information remains with the Kitchen Staff unless the business
explicitly assigns that responsibility elsewhere.


What should we investigate about the incorrect information?

We should investigate why the information is incorrect, how the
incorrect value was produced, whether the source is authoritative,
and who is responsible for correcting it.


What is the difference between:

"owning the cancellation decision"

and

"owning the preparation-status update"?

Owning the cancellation decision means being responsible for
determining whether the order is eligible for cancellation.
Owning the preparation-status update means being responsible for
providing or updating the preparation status. These are separate
responsibilities with different owners.
________________________________
🧠 Think carefully

Don't automatically assign blame.

We're not asking:

"Who is at fault?"

We're asking:

"Which responsibility belongs to whom?"

Keep the responsibilities separate:

Kitchen Staff
        ↓
Update preparation status
        ↓
Preparation status
        ↓
Restaurant System
        ↓
Determine cancellation eligibility

The fact that one responsibility depends on the output of another responsibility doesn't merge those responsibilities.

Answer Q4 only.

🏁 Exercise 021.9 — Q5: Final Challenge

This is the final challenge of Exercise 021.9.

You've now practiced:

Responsibility ownership
        ↓
Information production
        ↓
Information usage
        ↓
Dependency
        ↓
Decision ownership
        ↓
Decision readiness
Scenario

A customer requests cancellation of an order.

The Restaurant System must determine:

Whether the order is eligible for cancellation.

The business rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

The Restaurant System requires:

Payment status
Preparation status

We know:

Kitchen Staff
→ Updates preparation status


Restaurant System
→ Determines cancellation eligibility

Current information:

Payment status = Unpaid
Preparation status = Unknown
Q5 — Build the Complete Model

Answer each part in your own words.

1. Who owns the cancellation decision?

Restaurant System.


2. What responsibility does the Kitchen Staff own?

Updating the preparation status.


3. What information does the Restaurant System depend on
   from the Kitchen Staff?

Preparation status.


4. Why does the Restaurant System need this information?

To evaluate whether the condition "preparation has not started"
is satisfied by the cancellation rule.


5. Does using preparation status make the Restaurant System
   responsible for producing preparation status?

No.

Why?

The Restaurant System uses and evaluates the preparation status;
using information does not make it responsible for producing it.


6. Does the Kitchen Staff producing preparation status make
   them responsible for the cancellation decision?

No.

Why?

The Kitchen Staff owns the responsibility of updating preparation
status, while the Restaurant System owns the responsibility of
determining cancellation eligibility.


7. Is the Restaurant System currently decision-ready?

No.

Why?

The preparation status is unknown, so the Restaurant System does
not have all the reliable information required to evaluate the
cancellation rule.


8. Does the unknown preparation status change who owns
   the cancellation decision?

No.

Why?

The Restaurant System still owns the cancellation decision. The
unknown information prevents it from confidently completing the
responsibility but does not transfer responsibility ownership.


9. What should an engineer investigate before deciding
   how the system should behave when preparation status
   is unknown?

Investigate why the preparation status is unavailable, how it is
normally produced or provided, what the business expects when it
is unavailable, and whether there is a defined rule for handling
the cancellation decision in that situation.


10. Explain this entire relationship:

The Kitchen Staff is responsible for updating the preparation
status, which the Restaurant System depends on when determining
whether an order is eligible for cancellation. The Restaurant
System uses the preparation status together with payment status
to evaluate the cancellation rule. Although the Restaurant System
depends on information produced by the Kitchen Staff, it still
owns the cancellation decision. If the preparation status is
unknown, the Restaurant System is not decision-ready, but the
responsibility for the cancellation decision does not transfer
to the Kitchen Staff.

________________________________
🧠 Final challenge rule

For #10, don't just list the relationships.

Try to explain the reasoning:

Who produces what → who depends on it → why they need it → who owns the final decision → what happens to the reasoning when information is unavailable.

And remember the distinction you've been practicing:

PRODUCES INFORMATION
        ≠
USES INFORMATION
        ≠
OWNS THE DECISION

Also:

MISSING INFORMATION
        ≠
TRANSFERRED RESPONSIBILITY

Answer all 10.
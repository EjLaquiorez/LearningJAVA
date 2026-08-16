Next: Exercise 020.10 — Final Mastery Challenge

You've now worked through:

020.1  Responsibility → Information
020.2  Information vs Solution
020.3  Information Sources
020.4  Information Crossing Boundary
020.5  Don't Invent Information
020.6  Information vs Available Information
020.7  Confirmed vs Assumed Information
020.8  Information Ownership
020.9  Full University Scenario

We're ready for the final mastery challenge.

I won't give you the answer structure yet beyond the exercise itself. This time I want to see whether you can independently apply the complete model:

Responsibility
      ↓
Information needed
      ↓
Information source
      ↓
Ownership
      ↓
System boundary
      ↓
Information flow
      ↓
Unknowns
      ↓
Engineering judgment
🎯 Exercise 020.10 — Q1

Scenario:

A restaurant currently handles cancellation requests like this:

Customer
   ↓
Requests cancellation
   ↓
Restaurant Staff
   ↓
Checks order status
   ↓
Restaurant Staff
   ↓
Determines whether cancellation is allowed
   ↓
Restaurant System
   ↓
Records cancellation decision

The owner says:

"We want the system to determine whether the order is eligible for cancellation. It needs to know whether the order has been paid and whether preparation has started."

Q1 — Identify the Responsibility
Q1:

Current owner:
Restaurant Staff

Proposed owner:
Restaurant System

Responsibility:
Determine whether cancellation is allowed.

Don't move to the information yet.

First identify exactly what responsibility is being transferred from the restaurant staff to the system.

🎯 Q2 — Identify the Information Needed

The owner says:

"It needs to know whether the order has been paid and whether preparation has started."

Now identify the information the system needs.

Use:

Q2:

Information needed:
1. Whether the order has been paid
2. Whether preparation has started

Why:
The system needs this information to determine whether the
cancellation is allowed.
Think carefully

Don't answer with:

"Cancellation rules."

That's the rule, not the information.

Ask:

What facts does the system need to know in order to apply the cancellation rule?

Take Q2.
🎯 Q3 — Identify the Information Sources

Now we go one level deeper.

We know the system needs:

1. Whether the order has been paid
2. Whether preparation has started

But where does each piece of information come from?

Use:

Q3:

Information:
Whether the order has been paid

Source:
Needs investigation

Inside / Outside our system:
Needs investigation

Why:
The scenario tells us that payment status is needed, but it
does not tell us where the payment information comes from.


Information:
Whether preparation has started

Source:
Needs investigation

Inside / Outside our system:
Needs investigation

Why:
The scenario tells us that preparation status is needed, but it
does not identify who or what produces that information. We
should investigate its source instead of assuming that restaurant
staff provides it.
🧠 Important

The scenario does not explicitly tell us who produces these pieces of information.

So don't automatically say:

"Payment system."

or:

"Kitchen system."

If we don't know, say:

Needs investigation.

This is testing whether you can distinguish:

Information we need
        ↓
Source we actually know
        ↓
Source we don't know

Take Q3.

🎯 Q4 — Information Ownership

Now let's make the distinction even harder.

Suppose investigation reveals:

The kitchen system updates the order's preparation status whenever food preparation begins.

Our restaurant system needs that information to determine cancellation eligibility.

Answer:

Q4:

Information:
Whether preparation has started

Who produces/updates the information:
Kitchen System

Who owns the responsibility:
Kitchen System

Inside / Outside our system:
Outside

Why:
The Kitchen System is responsible for updating the preparation
status, and it is outside our Restaurant System's boundary.

Think about the difference between:

Kitchen System
→ owns updating preparation status

and:

Restaurant System
→ needs and uses preparation status

Don't let "our system needs the information" turn into "our system owns the information."

Take Q4.

🎯 Q5 — Information Flow Across the Boundary

Now let's put everything together.

We know:

The Kitchen System updates preparation status.
The Restaurant System needs preparation status.
The Restaurant System uses it to determine whether cancellation is allowed.

Complete:

Q5:

Source:
Kitchen System

Information:
Preparation status

↓

Kitchen System sends the preparation status

↓

Our system receives:
Preparation status

↓

Our system uses the information to:
Determine whether cancellation is allowed.
Important

Don't jump to implementation.

Don't say:

"API"

"Database"

"Webhook"

"HTTP request"

We haven't established any of those.

We're only describing the information flow, not the technical mechanism.

Think:

Who produces it?
        ↓
What information?
        ↓
Crosses boundary
        ↓
Who receives it?
        ↓
What does our system do with it?

Take Q5.

🎯 Q6 — Final Engineering Judgment

Now we combine everything.

The restaurant owner says:

"Since the restaurant system needs the preparation status, let's make the restaurant system responsible for updating it too. That way everything is in one system."

Would you agree?

Q6:

Yes / No:
No

Why:
The Restaurant System needing the preparation status does not
mean it should own the responsibility of producing or updating
that information. The Kitchen System is responsible for updating
the preparation status, while our Restaurant System receives and
uses that information to determine whether cancellation is allowed.

What responsibility currently belongs to the Kitchen System?
Updating the order's preparation status.

What responsibility belongs to our Restaurant System?
Receiving and using the preparation status to determine whether
the cancellation is allowed.


What responsibility currently belongs to the Kitchen System?


What responsibility belongs to our Restaurant System?
Think carefully.

Use everything you've learned:

Needs information
        ≠
Owns responsibility for producing it

And:

Uses information
        ≠
Owns the source responsibility

Don't think about technical difficulty.

Think about responsibility ownership and system boundaries.

🎯 Q7 — Unknowns Before Changing Ownership

The owner now says:

"Fine. But eventually we might want the Restaurant System to update the preparation status itself."

Before deciding whether that responsibility should move into our system, what would we need to investigate?

Give me at least 3.

Q7:


1. We don't know whether what causes the status to change
2. We don't know whether what will affect on moving the responsibilities
3. We don't know whether the Kitchen System has other responsibilities tied to the status


Why:

Think about:

Who currently owns the preparation-status decision
What causes the status to change
Whether the Kitchen System has other responsibilities tied to the status
Whether moving the responsibility would change the business process
Whether the restaurant has actually decided to transfer that responsibility

Don't design the solution yet.

Q8 — Final Mastery Challenge

Now let's bring the entire exercise together.

The owner says:

"The Restaurant System needs payment status and preparation status to determine whether a cancellation is allowed."

Complete the reasoning chain:

Q8:

Business responsibility:
Determine whether a cancellation is allowed.

Current responsibility owner:
Restaurant Staff

Proposed responsibility owner:
Restaurant System

Information needed:
1. Payment status
2. Preparation status

Information source:
1. Needs investigation
2. Kitchen System

Which information source is currently unknown?
The source of the payment status is unknown.

What does our Restaurant System do with the information?
It uses the payment status and preparation status to determine
whether the cancellation is allowed.

What still needs to be investigated?
1. Where the payment status comes from.
2. How the payment status is produced or updated.
3. Whether there are other business rules or information needed
   to determine cancellation eligibility.

What still needs to be investigated?
🧠 Your complete mental model

Try to reason through:

Business responsibility
        ↓
Who currently owns it?
        ↓
Who is proposing to own it?
        ↓
What information is needed?
        ↓
Where does each piece of information come from?
        ↓
Does it cross our system boundary?
        ↓
What does our system do with it?
        ↓
What don't we know yet?
        ↓
Engineering judgment

This is the final question of 020.10.

Take it slowly. I care more about your reasoning than getting every sentence perfect.
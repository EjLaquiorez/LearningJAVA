🎯 Exercise 021.5 — From System Responsibility to System Model

Now we're going to combine what you've learned in 021.1–021.4.

So far:

Business activity
        ↓
Specific responsibility
        ↓
Who owns it?
        ↓
Inside / Outside
        ↓
What information does the system need?
        ↓
Where does that information come from?
        ↓
What is still unknown?

Now we want to turn that reasoning into a simple system model.

Scenario

The restaurant has this cancellation process:

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
Determines whether cancellation is allowed
   ↓
?

Known business rule:

An order can be cancelled only if it is unpaid and preparation has not started.

But we still don't know where the payment status and preparation status come from.

Q1 — Complete the System Model

Fill in the chain:

Q1:

Customer
   ↓
Business activity:
Requests order cancellation


   ↓


Restaurant System
   ↓
Information needed:
1. Payment status
2. Preparation status


   ↓


Restaurant System
   ↓
Responsibility:
Determine whether the order is eligible for cancellation


   ↓


Business rule:
An order can be cancelled only if it is unpaid and preparation
has not started.


   ↓


Information sources:
1. Payment status → Unknown / needs investigation
2. Preparation status → Unknown / needs investigation
Important

Do not invent the information sources.

We already established:

Payment status
→ Unknown


Preparation status
→ Unknown

So you can write:

Needs investigation

where appropriate.

🧠 Your reasoning sequence

Before answering, think:

What does the customer do?
        ↓
What does our system need to know?
        ↓
What does our system do with that information?
        ↓
What business rule does it evaluate?
        ↓
Where does the information come from?
        ↓
What don't we know yet?

This is the next step toward being able to look at a business scenario and construct a system model without jumping into implementation.

Your turn — Q1 only.

🎯 Exercise 021.5 — Q2: What Crosses the System Boundary?

Now we focus on information flow across the boundary.

We established:

Customer
   ↓
Requests cancellation
   ↓
Restaurant System

The Restaurant System needs:

Payment status
Preparation status

But we don't yet know their sources.

That's important.

Q2 — Analyze the Information Flow

For each piece of information, complete:

Q2:

1. Information:
Payment status

Does this information cross our system boundary?
Unknown.

Why:
The scenario tells us that the system needs the payment status,
but it does not tell us where the information comes from. Therefore,
we cannot yet confirm whether it crosses our system boundary.

What does our system use it for?
The system uses the payment status to evaluate whether the order
satisfies the cancellation rule.


2. Information:
Preparation status

Does this information cross our system boundary?
Unknown.

Why:
The scenario tells us that the system needs the preparation status,
but it does not tell us where the information comes from. Therefore,
we cannot yet confirm whether it crosses our system boundary.

What does our system use it for?
The system uses the preparation status to evaluate whether the
order satisfies the cancellation rule.


What does our system use it for?
🧠 Be careful with the first question

We know the Restaurant System needs the information.

But we don't know its source.

Therefore, you should not automatically say:

"Yes, it crosses the boundary."

We need to distinguish:

Known:
Restaurant System needs payment status.


Unknown:
Where payment status comes from.


Therefore:
The boundary crossing is not yet confirmed.

Same for preparation status.

Think like this
Information needed
        ↓
Do we know its source?
        ↓
       NO
        ↓
Can we confirm the boundary crossing?
        ↓
       NO
        ↓
Needs investigation

And remember the second part:

What does the system use the information for?

That part is known:

Payment status
        +
Preparation status
        ↓
Evaluate cancellation rule
        ↓
Determine cancellation eligibility
Your turn — Q2 only.


🎯 Exercise 021.5 — Q3: Responsibility vs. Information

Now we're testing a distinction that is very important.

We know:

Restaurant System
   ↓
Needs:
Payment status
Preparation status

But needing information does not automatically mean the system is responsible for producing it.

For example:

System needs:
Preparation status

does not mean:

Restaurant System
   ↓
Produces preparation status

The source might be another actor or external system. We simply don't know yet.

Q3:

Does needing preparation status mean the Restaurant System is
responsible for producing/updating preparation status?

No.

Why?
Producing or updating preparation status is a different responsibility
from using preparation status to evaluate whether cancellation is
allowed.


What is the Restaurant System actually responsible for?

The Restaurant System is responsible for determining whether the order
is eligible for cancellation using the payment status and preparation
status.


What do we still need to investigate about the preparation status?

We need to investigate who produces or provides the preparation status.
🧠 Use this mental model
Information needed
        ≠
Information produced

For example:

Restaurant System
        ↓
NEEDS
Preparation status

is different from:

Restaurant System
        ↓
PRODUCES
Preparation status

We need evidence before assigning the second responsibility.

This connects directly to your Topic 020 work:

What information does our system need?
        ↓
Who produces that information?
        ↓
Who owns that responsibility?
        ↓
Inside or outside our system?
Your turn — Q3 only.

🎯 Exercise 021.5 — Q4: What Happens When Information Is Missing?

Now we make the reasoning slightly harder.

The Restaurant System needs:

Payment status
Preparation status

to determine whether cancellation is allowed.

But we've established that the source of the preparation status is still unknown.

Scenario

A customer requests cancellation.

The Restaurant System tries to determine whether cancellation is allowed, but the preparation status is not available.

A developer says:

"If the preparation status is missing, just assume preparation hasn't started."

Q4

Would you accept that approach?

Q4:

Yes / No:
No.

Why:
The preparation status is required to evaluate the cancellation
rule, but the information is currently missing. We should not
invent a value for missing information.


What information is missing?
Preparation status.


What should we investigate before deciding how the system should behave?
We should investigate how the business expects the system to behave
when the preparation status is unavailable, and whether the
cancellation decision can safely be made without it.


Does "missing information" automatically mean
"preparation has not started"?

No.

Why:
Missing information only means that we do not currently know the
preparation status. We should not assume that preparation has not
started without evidence.
🧠 Be careful

This is another place where engineers can accidentally turn an unknown into a fact.

We currently know:

Preparation status
→ Needed by our system
→ Source unknown

We do not know:

Preparation has not started

Those are completely different statements.

Think:

Unknown
   ≠
No

For example:

"We don't know whether preparation has started."

does not mean:

"Preparation has not started."

Before deciding system behavior, we need to investigate what the business expects when required information is unavailable.

Your turn — Q4 only.

🎯 Exercise 021.5 — Q5: Final System Responsibility Model

This is the final question of Exercise 021.5.

You've already established:

Business activity:
Customer requests cancellation


System responsibility:
Determine whether the order is eligible for cancellation


Information needed:
1. Payment status
2. Preparation status


Information sources:
Unknown / needs investigation

Now we're going to put everything together.

Q5 — Complete the Reasoning Chain

Complete this:

Q5:


Customer
   ↓
Business activity:
____________________________




   ↓




Restaurant System
   ↓
System responsibility:
____________________________




   ↓




Information needed:
1. _________________________
2. _________________________




   ↓




Information sources:
1. _________________________
2. _________________________




   ↓




Business rule:
____________________________




   ↓




What the system does:
____________________________




   ↓




What remains unknown:
____________________________
🧠 Final challenge

Then answer this:

The developer says: "Since the system needs the preparation status, let's make the Restaurant System responsible for updating it too."

Would you agree?

Yes / No:


Why:

Your reasoning should distinguish:

System needs information
        ≠
System produces information

And remember the principle you've been practicing throughout Topic 020 and 021:

Don't assign a responsibility to our system simply because our system needs the information involved in that responsibility.

Take your time and answer Q5 only.
🎯 Exercise 021.6 — Responsibility Ownership vs. Information Ownership

We're continuing Topic 021.

You now understand:

Business activity
      ↓
Responsibility
      ↓
Information needed
      ↓
Information source
      ↓
System responsibility

This exercise focuses on a subtle but important distinction:

Who uses information is not necessarily the same as who owns the responsibility for producing it.

Scenario

A restaurant system determines whether an order can be cancelled.

The rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

The Restaurant System needs:

Payment status
Preparation status

We know:

Restaurant System
    ↓
Uses payment status
Uses preparation status
    ↓
Determines cancellation eligibility

But the sources of those statuses are not yet established.

Q1 — Identify the Responsibility

Complete:

Q1:

Responsibility:
Determine whether an order can be cancelled
        ↓
Owner:
Restaurant System
        ↓
Needs:
Payment status
Preparation status
        ↓
User:
Restaurant System
🧠 Important

Don't answer:

"The Restaurant System owns everything because it uses the information."

Instead ask:

What exactly is the responsibility?
        ↓
Who owns THAT responsibility?

For example:

Determine cancellation eligibility
        ↓
Restaurant System

That doesn't tell us who owns:

Produce payment status
Produce preparation status

Those are separate responsibilities.

Your turn — Q1 only.

Q2 — Information Producer vs. Information User

Consider:

Restaurant System
        ↓
Needs preparation status
        ↓
Uses it to determine cancellation eligibility

Answer:

Q2:

Who uses the preparation status?
Restaurant System


Who produces or updates the preparation status?
Unknown source / needs investigation


Do we know the producer from the scenario?

Yes / No:
No


Why?
The scenario does not identify who produces or updates the
preparation status.


Does the Restaurant System automatically become the producer just
because it uses the information?

Yes / No:
No


Why?
Using information and producing or updating information are
separate responsibilities. The Restaurant System may use the
preparation status to determine whether cancellation is allowed,
but that does not establish that it owns the responsibility of
producing or updating the status.
🧠 Remember
USES information
      ≠
PRODUCES information

Don't invent the producer.

If the scenario doesn't tell you, unknown is the correct engineering answer.

Your turn — Q2 only.

Q3 — What If the Producer Is Discovered?

Suppose the restaurant tells you:

"The kitchen staff updates the preparation status whenever food preparation begins."

Now we have new information.

Answer:

Q3:

Who produces/updates the preparation status?
Kitchen staff


Who uses the preparation status?
Restaurant System


Who owns the responsibility of updating it?
Kitchen staff


Who owns the responsibility of determining whether
cancellation is allowed?
Restaurant System


Are these the same responsibility?

Yes / No:
No.


Why?
Updating the preparation status and determining whether an order
can be cancelled are two different responsibilities owned by
different parties. The kitchen staff is responsible for updating
the preparation status, while the Restaurant System uses that
information to determine whether cancellation is allowed.

Think carefully about responsibility ownership, not just information flow.

Exercise 021.6 — Q4: Boundary Defense

Now we test whether you can defend the boundary when someone makes a seemingly reasonable argument.

We now know:

Kitchen Staff
   ↓
Updates preparation status
   ↓
[Information crosses boundary]
   ↓
Restaurant System
   ↓
Uses preparation status
   ↓
Determines whether cancellation is allowed

A developer says:

"Since the kitchen staff is outside our Restaurant System, the preparation status shouldn't be part of our system model."

Q4 — Defend the System Model

Do you agree?

Q4:

Yes / No:
No.

Why:
The preparation status is relevant to our system because the
Restaurant System needs it to determine whether an order can be
cancelled. The fact that the Kitchen Staff produces the information
outside our system does not make the information irrelevant to our
system.


Is preparation status relevant to our Restaurant System?

Yes / No:
Yes.

Why:
The Restaurant System uses the preparation status to evaluate the
cancellation rule and determine whether cancellation is allowed.


Does information need to be produced inside our system
for our system to use it?

Yes / No:
No.

Why:
Information can be produced by an external actor or system and then
used by our system. Producing or updating the preparation status is
a different responsibility from using that information to determine
whether cancellation is allowed.


What is the Kitchen Staff responsible for?
Updating the preparation status.


What is the Restaurant System responsible for?
Using the preparation status and payment status to determine whether
the order is eligible for cancellation.
🧠 Important distinction

The developer is mixing up:

WHO PRODUCES THE INFORMATION

with:

WHETHER OUR SYSTEM NEEDS THE INFORMATION

These are different questions.

For example:

OUTSIDE OUR SYSTEM


Kitchen Staff
   ↓
Updates preparation status
   ↓
Preparation status
   │
   │ crosses boundary
   ↓


INSIDE OUR SYSTEM


Restaurant System
   ↓
Uses preparation status
   ↓
Determines cancellation eligibility

The fact that Kitchen Staff produces the information outside our system does not make the information irrelevant to our system.

Your job is to defend that distinction.

Answer Q4 only.

🏁 Exercise 021.6 — Q5: Final Boundary Challenge

This is the final question for Exercise 021.6.

We've established:

Kitchen Staff
   ↓
Updates preparation status
   ↓
Preparation status
   ↓
Restaurant System
   ↓
Uses preparation status
   +
Payment status
   ↓
Evaluates cancellation rule
   ↓
Determines whether cancellation is allowed

Now I want you to explain the whole model in your own reasoning.

Q5

Complete:

Q5:

Who produces the preparation status? kitchen staff 


What is their responsibility? updates the preparation status 


Who uses the preparation status? restaurant system 


What does our Restaurant System use it for? evaluate the cancellation rule/ determines whether the cancellation is allowed 


Is the preparation-status responsibility inside or outside
our system? outside 


Is the preparation status itself relevant to our system?


Why? Yes, It complies an important role on how will the restaurant system evaluates the cancellation rule based on that information 


What is the key difference between:

"producing information"

and

"using information"?Producing information means creating or updating a piece of information and therefore owning the responsibility for that information. Using information means consuming that information to perform another responsibility, such as evaluating a business rule.
🧠 Final challenge

Then defend this statement:

"The preparation status is produced outside our system, but it is still part of our system model."

Explain why this statement is correct.

Don't just say:

"Because the system needs it."

Explain the relationship between:

Source
   ↓
Information
   ↓
System
   ↓
Responsibility

Take Q5 only.
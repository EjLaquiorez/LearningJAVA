Topic 020.1 — Responsibility → Information

Let's start with the first exercise.

Scenario

The restaurant system has this responsibility:

"The restaurant system determines whether an order can be cancelled."

Your task is to identify at least two pieces of information the system may need in order to perform that responsibility.

Use this format:

Q1:


Responsibility:
Determine whether an order can be cancelled.


Information needed:
1. Order state
2. Payment state


Why:
🧠 Important

Don't think about:

database columns
tables
APIs
Java classes
UI

Think only:

"What does the system need to know in order to perform this responsibility?"

🎯 Topic 020.1 — Q2

Now let's apply the same reasoning to a different domain.

Responsibility

"The enrollment system checks whether all required documents have been submitted."

Give me at least two pieces of information the system may need.

Use:

Q2:


Information needed:
1. Required documents
2. Submitted documents


Why:

Don't think about databases yet.

Think:

What must the system know to perform this responsibility?

🎯 Q3 — Responsibility → Information

Now let's try another one.

Responsibility

"The hospital system determines whether a selected doctor is available."

What information might the system need?

Use:

Q3:

Information needed:
1. Doctor schedule / availability
2. Selected doctor

Potential additional information:
3. Type of appointment

Why:
The system needs to know the selected doctor's availability
in order to determine whether an appointment can be scheduled.
Other information, such as appointment type, may also affect
availability, but we would need to investigate whether that
is actually part of the hospital's scheduling rules.

Think carefully about:

What does the system need to know before it can determine whether the doctor is available?

Don't think about how we would store it yet.

Q4 — Information vs. Business Rule

Now we're going to make it slightly harder.

Consider this statement:

"Students can cancel their enrollment application only before the registrar has approved it."

Identify:

Q4:

Business rule:
Students can only cancel their enrollment application before
the registrar has approved it.

Information needed:
1. Current enrollment application status
2. Whether the registrar has approved the application

Why:
The system needs this information to determine whether the
cancellation request is still allowed under the business rule.

Separate these two:

What is the rule?

from:

What must the system know to apply the rule?

Take your time.

🎯 Q5 — Information Source

Now let's add the next layer.

We know:

Restaurant System
      ↓
Needs preparation status

Scenario:

Kitchen Staff
      ↓
Prepares food
      ↓
Kitchen System
      ↓
Updates order status to "Ready"
      ↓
Restaurant System

Answer:

Q5:

Information needed:
1. Current food order status

Who provides/produces this information:
1. Kitchen System

Is the source inside or outside our system:
Outside

Why:
The Kitchen System is outside our system boundary and
produces the order status that the Restaurant System needs
to receive.
Think carefully

Don't say:

"Restaurant System provides it."

Ask:

Who actually produces the information that our system needs?

This connects Topic 019 (system boundary) with Topic 020 (information).

Take it one step at a time.

🎯 Q6 — Information Needed vs. Information Available

Now let's make this harder.

Scenario:

"The hospital system should check whether the selected doctor is available."

We know the system needs doctor availability information.

But we do not know where that information comes from.

Answer:

Q6:

Information needed:
1. Doctor availability information

What do we know about where this information comes from?
We don't know yet.

What do we still need to investigate?
We need to investigate where the hospital gets the doctor's
availability or schedule information and who is responsible
for maintaining it.

Why:
The system needs reliable doctor availability information to
determine whether the selected doctor is available, but the
scenario does not tell us where that information comes from.
We should investigate this instead of assuming its source.
🧠 Be careful

Don't invent:

"The receptionist provides it."

Don't invent:

"The doctor's calendar provides it."

Don't invent:

"The hospital database provides it."

The scenario hasn't told us.

Your job is to recognize the gap in our knowledge.

This is another major engineering habit:

Information needed
        ↓
Source unknown
        ↓
Don't guess
        ↓
Investigate

Take Q6.
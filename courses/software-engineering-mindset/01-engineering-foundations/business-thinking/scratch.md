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
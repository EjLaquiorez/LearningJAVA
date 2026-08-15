Exercise 019.8 — Full Business Scenario
Scenario: University Enrollment

A university currently handles enrollment like this:

Student
   ↓
Submits enrollment application
   ↓
Registrar
   ↓
Checks submitted documents
   ↓
Registrar
   ↓
Determines whether requirements are satisfied
   ↓
Registrar
   ↓
Approves or rejects enrollment
   ↓
Enrollment System
   ↓
Records enrollment status
   ↓
Student
   ↓
Checks enrollment status

The university is considering improving the process with software.

The registrar tells you:

"We want students to submit their applications online, and we want the system to automatically check whether all required documents have been submitted. The registrar should then be able to review the application and approve or reject it. Once the decision is made, students should be able to see their enrollment status."

Q1 — Identify Every Responsibility

Separate the scenario into individual activities.

Use:

Q1:


1.
Actor:
Responsibility:
Inside / Outside:
Why:


2.
Actor:
Responsibility:
Inside / Outside:
Why:


3.
Actor:
Responsibility:
Inside / Outside:
Why:


4.
Actor:
Responsibility:
Inside / Outside:
Why:


5.
Actor:
Responsibility:
Inside / Outside:
Why:


6.
Actor:
Responsibility:
Inside / Outside:
Why:

There may be more than six.

⚠️ Important

Don't automatically classify something as inside because the proposed system could perform it.

For example:

"Registrar checks documents."

The question is:

Who currently owns that responsibility?

Not:

"Could software do it?"

Q2 — Separate Current Responsibility From Proposed System Responsibility

This is the important part.

The registrar says:

"The system should automatically check whether all required documents have been submitted."

We now have two different responsibilities:

Current business responsibility
Registrar
   ↓
Checks submitted documents
Proposed system responsibility
System
   ↓
Checks whether required documents have been submitted

Answer:

Q2:


Current responsibility owner:


Proposed system responsibility:


What changed:


Why is this an important distinction?
Q3 — Identify the Decision Owner

The registrar says:

"The registrar should review the application and approve or reject it."

Answer:

Q3:


Who owns the approval/rejection decision?


Why?


Should we assume the system should make this decision?


Why or why not?

Think back to our previous lesson:

Registrar
   ↓
Makes decision
   ↓
System
   ↓
Records decision

versus:

System
   ↓
Evaluates rules
   ↓
Makes decision

These are different responsibilities.

Q4 — Identify the System Responsibilities

Based only on the scenario, list the responsibilities that the university enrollment system is expected to perform.

Q4:


1.
2.
3.

Be careful.

Only include responsibilities supported by the scenario.

Don't invent:

database technology
notification methods
dashboards
APIs
frameworks
programming languages

We're still thinking before implementation.

Q5 — Identify the System Boundary

Now construct the boundary.

Q5:


INSIDE OUR SYSTEM:


1.
2.
3.


OUTSIDE OUR SYSTEM:


1.
2.
3.
4.

Possible actors/entities include:

Student
Registrar
Enrollment System

But you must decide what responsibilities belong to each.

Q6 — Identify Unknowns

Give me at least four things we still need to investigate before designing the system.

Use:

"We don't know whether..."

Examples:

Q6:


1. We don't know whether...
2. We don't know whether...
3. We don't know whether...
4. We don't know whether...

Think about:

document requirements
exceptions
registrar judgment
incomplete applications
changing requirements
status definitions
rejected applications
resubmissions

Don't assume the answers.

Q7 — Engineering Judgment

The registrar says:

"Since the system can automatically check the documents, let's also make it automatically approve or reject students."

Would you agree?

Q7:


Yes / No:


Why:

Your answer should distinguish:

Checking whether documents are present
                ≠
Deciding whether enrollment should be approved
🧠 Final Challenge

Finish this reasoning chain:

Student
   ↓
Business activity:
?


   ↓


Registrar
   ↓
Business responsibility:
?


   ↓


Enrollment System
   ↓
System responsibility:
?


   ↓


Student
   ↓
Expected outcome:
?

The goal isn't to produce a perfect system design.

The goal is to demonstrate that you can answer:

Who does what, who owns that responsibility, what belongs inside our system, and what still needs investigation?

Start with Q1.
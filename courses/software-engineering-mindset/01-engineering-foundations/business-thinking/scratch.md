🏁 Exercise 019.10 — Final Mastery Challenge
Scenario — Hospital Appointment System

A hospital currently handles appointments like this:

Patient
   ↓
Requests an appointment
   ↓
Receptionist
   ↓
Checks doctor availability
   ↓
Receptionist
   ↓
Schedules the appointment
   ↓
Appointment System
   ↓
Records appointment
   ↓
Patient
   ↓
Receives appointment information

The hospital is considering a new system.

The hospital manager says:

"We want patients to request appointments online. The system should check whether the selected doctor is available. If the doctor is available, the system should schedule the appointment and send the patient a confirmation."

You are the engineer analyzing the request.

Q1 — Separate the Responsibilities

Break the scenario into individual responsibilities.

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

Don't group everything into:

"The system handles appointments."

Identify the individual responsibilities.

Q2 — Identify the Proposed Responsibility Change

The current process says:

Receptionist
    ↓
Checks doctor availability

But the proposed process says:

System
    ↓
Checks doctor availability

Answer:

Q2:


Current responsibility owner:


Proposed responsibility owner:


What changed:


Why is this important?

Remember our Topic 019 lesson:

A responsibility can be reassigned to the system, but that does not automatically transfer every related responsibility.

Q3 — Who Owns the Scheduling Decision?

The manager says:

"If the doctor is available, the system should schedule the appointment."

Answer:

Q3:


Who currently owns the scheduling responsibility?


Why?


Is this responsibility explicitly being assigned to the system
in the proposed process?


Yes / No:


Why?

Be careful here.

Don't confuse:

Check availability

with:

Schedule appointment

They may be related, but they are still different responsibilities.

Q4 — System Boundary

Separate the responsibilities.

INSIDE OUR SYSTEM
1.
2.
3.
OUTSIDE OUR SYSTEM
1.
2.
3.

For every item, think:

Who actually performs this responsibility?

Q5 — Requirement vs. Responsibility vs. Solution

Consider these statements:

A

"Patients must be able to request appointments online."

B

"The system must check whether the selected doctor is available."

C

"Add an appointment calendar to the patient portal."

Classify each:

Q5:


A:
Requirement / System Responsibility / Solution


Why:


B:
Requirement / System Responsibility / Solution


Why:


C:
Requirement / System Responsibility / Solution


Why:

This connects Topic 018 → Topic 019.

Q6 — Identify Unknowns

Before implementing the system, give me at least four things we still don't know.

Use:

"We don't know whether..."

Think about:

doctor availability
conflicting appointments
cancellations
emergency appointments
scheduling rules
receptionist overrides
appointment types
unavailable doctors

Don't invent answers.

Q6:


1. We don't know whether...


2. We don't know whether...


3. We don't know whether...


4. We don't know whether...
Q7 — Engineering Judgment

The manager says:

"If the system can see that the doctor is available, it should automatically schedule every appointment."

Would you immediately agree?

Q7:


Yes / No:


Why:

Your reasoning should distinguish:

Knowing availability
        ≠
Being authorized to schedule

Ask yourself:

Are there other business rules?

Are there exceptions?

Can the receptionist override the system?

Are all appointment types handled the same way?

🧠 Final Mastery Challenge

Complete this reasoning chain:

Patient
   ↓
Business activity:
?




   ↓




Hospital System
   ↓
System responsibility:
?




   ↓




Doctor / Receptionist
   ↓
Business responsibility:
?




   ↓




Hospital System
   ↓
System responsibility:
?




   ↓




Patient
   ↓
Expected outcome:
?

Then finish this sentence:

"Before deciding what software should own, I need to understand..."

🎯 What I'm Evaluating

This final exercise is not mainly about getting every classification correct.

I'm evaluating whether you can independently reason through:

Activity
   ↓
Actor
   ↓
Responsibility
   ↓
Current owner
   ↓
Proposed owner
   ↓
System boundary
   ↓
Information crossing boundary
   ↓
Unknowns
   ↓
Engineering judgment

And especially whether you can avoid this mistake:

"Software can do it"
        ↓
"Therefore software should do it"

That is not our engineering reasoning model.

Start with Q1 only.

Take each activity one at a time and defend who owns that exact responsibility.
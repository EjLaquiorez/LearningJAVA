Exercise 019.10 — Final Mastery Challenge — Improved Answers

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

Q1 — Separate the Responsibilities

1.

Actor: Patient

Responsibility: Requests an appointment

Inside / Outside: Outside

Why: The patient is the person who initiates the appointment request. The patient is therefore responsible for performing this business activity, which is outside our system boundary.

2.

Actor: Receptionist

Responsibility: Checks doctor availability

Inside / Outside: Outside

Why: In the current process, the receptionist is responsible for checking whether the doctor is available.

Important: The proposed system later changes this responsibility by assigning the availability check to the system.

3.

Actor: Appointment System

Responsibility: Records the appointment

Inside / Outside: Inside

Why: The scenario explicitly states that the appointment system records the appointment. Therefore, recording the appointment is a responsibility owned by our system.

4.

Actor: Receptionist

Responsibility: Schedules the appointment

Inside / Outside: Outside

Why: In the current process, the receptionist is responsible for scheduling the appointment.

Important

Do not add activities that are not established by the scenario.

For example:

"Doctor meets patient."

This should not be included because the scenario is specifically describing the appointment scheduling process, and the doctor's meeting with the patient is not part of the information provided.

A useful engineering habit is:

Don't add facts that the scenario hasn't established.

Q2 — Identify the Proposed Responsibility Change

The current process says:

Receptionist
    ↓
Checks doctor availability

The proposed process says:

System
    ↓
Checks doctor availability

Answer

Current responsibility owner: Receptionist

Proposed responsibility owner: Hospital System

What changed: The responsibility for checking doctor availability is being transferred from the receptionist to the system.

Why is this important?

Because the system is now being given a responsibility that was previously performed by a human.

This means we need to understand what the receptionist actually considers when checking availability and whether that process can be reliably represented by the system.

The important point is:

The responsibility owner changed.

Q3 — Who Owns the Scheduling Decision?

The manager says:

"If the doctor is available, the system should schedule the appointment."

Answer

Who currently owns the scheduling responsibility?

Receptionist.

Why?

The current process explicitly shows:

Receptionist
    ↓
Schedules the appointment

Is this responsibility explicitly being assigned to the system?

Yes.

Why?

The manager explicitly states:

"If the doctor is available, the system should schedule the appointment."

Therefore, the proposed process transfers the scheduling responsibility from the receptionist to the system.

Do not confuse:

Check availability
        ↓
Is the doctor available?

with:

Schedule appointment
        ↓
Create/commit the appointment

Both are separate responsibilities.

Q4 — System Boundary

INSIDE OUR SYSTEM

Check whether the selected doctor is available.

Schedule the appointment when the doctor is available.

Record the appointment.

Send a confirmation to the patient.

These responsibilities are explicitly assigned to the proposed system by the manager's statement.

OUTSIDE OUR SYSTEM

Patient requests an appointment.

Patient receives/acts on the appointment confirmation.

The receptionist's current responsibility of checking availability.

The receptionist's current responsibility of scheduling the appointment.

Important distinction

The receptionist's checking and scheduling responsibilities are part of the current process, but the proposed process transfers those responsibilities to the system.

Current process

Patient
   ↓
Receptionist
   ├── Check availability
   └── Schedule appointment
   ↓
Appointment System
   └── Record appointment

Proposed process

Patient
   ↓
Hospital System
   ├── Check availability
   ├── Schedule appointment
   ├── Record appointment
   └── Send confirmation

The important boundary change is that some responsibilities previously owned by the receptionist are now proposed to be owned by the system.

Q5 — Requirement vs. Responsibility vs. Solution

A

"Patients must be able to request appointments online."

Classification: Requirement

Why: It describes the capability that is needed for patients. It does not specify a particular implementation.

B

"The system must check whether the selected doctor is available."

Classification: System Responsibility

Why: It describes an action that our system is expected to perform.

It answers:

What must our system do?

rather than:

How should we implement it?

C

"Add an appointment calendar to the patient portal."

Classification: Solution

Why: It proposes a particular implementation or interface approach for allowing patients to request appointments.

It answers:

How could we provide this capability?

Q6 — Identify Unknowns

Before implementing the system, there are still important business details we do not know.

We don't know what rules determine whether a doctor is considered available.

We don't know whether there are situations where an appointment could conflict with another appointment or scheduling constraint.

We don't know what happens when an appointment is cancelled.

We don't know what scheduling rules or exceptions the receptionist currently applies when scheduling appointments.

These are useful unknowns because they identify missing business knowledge rather than simply restating information already provided by the scenario.

Q7 — Engineering Judgment

The manager says:

"If the system can see that the doctor is available, it should automatically schedule every appointment."

Answer

Yes / No: No.

Why:

We should not immediately assume that knowing a doctor's availability is enough to authorize the system to automatically schedule every appointment.

We first need to understand the hospital's scheduling rules, exceptions, appointment types, conflicting appointments, emergency situations, and whether receptionists currently have authority to override normal scheduling rules.

For example:

Doctor available
       ↓
Is the appointment allowed?
       ↓
Are there exceptions?
       ↓
Can the receptionist override?
       ↓
Should the system schedule automatically?

Therefore:

Knowing availability does not automatically mean the system is authorized to schedule every appointment.

🧠 Final Mastery Challenge

Patient
   ↓
Business activity:
Requests an appointment
   ↓
Hospital System
   ↓
System responsibility:
Checks whether the selected doctor is available
   ↓
Hospital System
   ↓
System responsibility:
Schedules the appointment if the doctor is available
   ↓
Hospital System
   ↓
System responsibility:
Records the appointment
   ↓
Hospital System
   ↓
System responsibility:
Sends confirmation
   ↓
Patient
   ↓
Expected outcome:
Receives confirmation of the appointment

Final Reasoning

"Before deciding what software should own, I need to understand the hospital's current scheduling process, the rules used to determine availability and eligibility, the exceptions handled by receptionists, and which responsibilities the hospital actually wants to transfer to the system."

🧠 Topic 019 Mental Model

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

Do not think:

"Software can do it"
        ↓
"Therefore software should do it"

Instead think:

Who performs it?
      ↓
What exactly are they doing?
      ↓
Who owns that responsibility?
      ↓
Is it current or proposed?
      ↓
Has the responsibility been transferred?
      ↓
What remains unknown?

Key Lessons From Topic 019

1. Don't invent activities

If the scenario does not say:

"Doctor meets patient"

do not add it to the analysis.

2. Distinguish current and proposed responsibility

Current:
Receptionist → Checks availability

Proposed:
System → Checks availability

The important change is:

The responsibility owner changed.

3. Related responsibilities are not automatically the same

Check availability
        ≠
Schedule appointment
        ≠
Record appointment
        ≠
Send confirmation

Each can be a separate responsibility with a different owner.

4. Software capability does not automatically determine ownership

Can software do it?
        ↓
Does the business want the system to own it?
        ↓
What rules and exceptions apply?
        ↓
What responsibility is actually being transferred?

5. Always identify the exact responsibility

Ask:

"Who performs this exact responsibility?"

Do not replace an activity with a related activity just because they belong to the same business process.

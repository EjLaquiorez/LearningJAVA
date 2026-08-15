Exercise 019.8 — Improved Answers
Q1 — Identify Every Responsibility
1. Student submits the enrollment application

Actor: Student
Responsibility: Submit enrollment application
Inside / Outside: Outside
Why: The student is responsible for submitting the enrollment application. The system may receive and process the application, but the student owns the action of submitting it.

2. Registrar checks submitted documents

Actor: Registrar
Responsibility: Check submitted documents
Inside / Outside: Outside
Why: In the current process, the registrar is responsible for checking the submitted documents. Although this responsibility may later be automated, we should not treat it as a system responsibility until that change is explicitly proposed.

3. Enrollment System receives the online application

Actor: Enrollment System
Responsibility: Receive/process submitted enrollment applications
Inside / Outside: Inside
Why: The proposed process explicitly states that students will submit their applications online. Therefore, the enrollment system must handle the submitted application.

4. Enrollment System checks required documents

Actor: Enrollment System
Responsibility: Automatically check whether all required documents have been submitted
Inside / Outside: Inside
Why: The registrar explicitly proposed that the system should perform this responsibility automatically.

5. Registrar reviews and decides

Actor: Registrar
Responsibility: Review the application and approve or reject enrollment
Inside / Outside: Outside
Why: The scenario explicitly assigns the approval/rejection decision to the registrar. The registrar remains responsible for the decision even though the system performs the document check.

6. Enrollment System records the enrollment status

Actor: Enrollment System
Responsibility: Record the enrollment status
Inside / Outside: Inside
Why: The current process explicitly states that the enrollment system records the enrollment status.

7. Student views enrollment status

Actor: Student
Responsibility: View/check enrollment status
Inside / Outside: Outside
Why: The student is responsible for checking or viewing the result. The system's responsibility is to make that status available.

8. Enrollment System makes the status available

Actor: Enrollment System
Responsibility: Make the enrollment status available to students
Inside / Outside: Inside
Why: The scenario states that students should be able to see their enrollment status. The system therefore needs to provide the information, although the specific interface has not yet been decided.

Q2 — Current vs. Proposed Responsibility
Current responsibility owner

Registrar

The current process shows:

Registrar
    ↓
Checks submitted documents
Proposed system responsibility

Enrollment System

Enrollment System
    ↓
Automatically checks whether
required documents were submitted
What changed?

A specific responsibility that was previously performed by the registrar is now proposed to be performed automatically by the enrollment system.

The registrar is not necessarily losing all responsibility.

Instead, the responsibilities are being divided:

Enrollment System
    ↓
Checks required documents
        ↓
Registrar
    ↓
Reviews application
    ↓
Approves / Rejects
Why is this distinction important?

Because automating one responsibility does not mean that the entire business decision should also be automated.

We must identify exactly which responsibility is being transferred to the system.

Q3 — Identify the Decision Owner
Who owns the approval/rejection decision?

Registrar

Why?

The scenario explicitly states that:

The registrar should review the application and approve or reject it.

Therefore, the registrar currently owns the approval/rejection decision.

Should we assume the system should make this decision?

No.

Why?

We don't yet know enough about how the registrar makes the decision.

We would need to investigate:

What rules are used?
What information does the registrar consider?
What exceptions exist?
Are there situations requiring human judgment?
Can the registrar override certain rules?

Therefore:

Checking documents
        ≠
Approving/rejecting enrollment
Q4 — Identify the System Responsibilities

Based only on the scenario:

Receive/process submitted enrollment applications.
Automatically check whether all required documents have been submitted.
Record the enrollment status.
Make the enrollment status available to students.

Notice that we are not saying:

Build a website.

Build a dashboard.

Send an email.

Use PostgreSQL.

Those are implementation decisions that have not been established.

Q5 — Identify the System Boundary
INSIDE OUR SYSTEM
Receive/process enrollment applications
Automatically check required documents
Record enrollment status
Make enrollment status available to students
OUTSIDE OUR SYSTEM
Student
Submit enrollment application
View/check enrollment status
Registrar
Review enrollment application
Determine whether requirements are satisfied
Approve or reject enrollment

The important thing is that we're classifying responsibilities, not simply saying:

Student = outside
Registrar = outside
System = inside

For example:

Student
   ↓
Views status
   ↓
Outside responsibility


Enrollment System
   ↓
Makes status available
   ↓
Inside responsibility
Q6 — Identify Unknowns
We don't know which documents are required for an enrollment application.
We don't know what exceptions exist in the enrollment process.
We don't know how the registrar handles applications that fail to satisfy the requirements.
We don't know what information and criteria the registrar considers when approving or rejecting an application.

Additional valid questions would be:

We don't know whether students can resubmit missing or corrected documents.
We don't know whether the registrar can override the result of the document check.
We don't know what enrollment statuses exist and what each status means.
We don't know whether different types of students have different enrollment requirements.

Notice the pattern:

We don't know → investigate → gather evidence → understand the business → then design.

Q7 — Engineering Judgment
Yes / No:

No.

Why?

We should not automatically make the system approve or reject students simply because it can check whether required documents have been submitted.

First, we need to understand how the registrar makes the enrollment decision.

We need to investigate the rules, criteria, exceptions, and cases that require human judgment.

For example:

System
   ↓
Checks whether required documents exist

does not necessarily mean:

System
   ↓
Decides whether the student qualifies

The first responsibility is explicitly proposed.

The second responsibility still belongs to the registrar.

🧠 Final Reasoning Chain
Student
   ↓
Submits enrollment application
   ↓
Enrollment System
   ↓
Receives/processes application
   ↓
Checks whether required documents were submitted
   ↓
Registrar
   ↓
Reviews application
   ↓
Determines whether requirements are satisfied
   ↓
Approves or rejects enrollment
   ↓
Enrollment System
   ↓
Records enrollment status
   ↓
Student
   ↓
Views enrollment status

And the boundary looks like:

                 OUR SYSTEM
┌──────────────────────────────────────┐
│                                      │
│       Enrollment System              │
│                                      │
│  • Receive application               │
│  • Check required documents          │
│  • Record enrollment status          │
│  • Make status available             │
│                                      │
└──────────────────────────────────────┘
       ↑                         ↓
       │                         │
    Student                  Student
    submits                  views status


             ↑
             │
          Registrar
        reviews + decides
The key reasoning to remember

The most important lesson from this exercise is:

Don't ask only "Can the software do this?" Ask "Who currently owns this responsibility, and has there been a justified decision to move that responsibility into the system?"

That's the difference between engineering analysis and simply turning every business activity into software.
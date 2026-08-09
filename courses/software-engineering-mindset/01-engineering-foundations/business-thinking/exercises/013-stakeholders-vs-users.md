# Topic 013 — Stakeholders vs Users

## Objective

Learn to distinguish between:

- **Users**
- **Stakeholders**
- **Participants**
- **External Parties**

and understand that these categories can overlap.

The goal is to understand the wider business environment around software, not only the people who directly use it.

---

# 1. What Is a User?

A **user** is a person who directly interacts with a system to perform or receive a system-supported activity.

Example:

```text
Waiter
    ↓
Restaurant System
```

The waiter might:

- Create an order
- View an order
- Update an order
- Check order status

Therefore:

```text
Waiter = User
```

because the waiter directly interacts with the system.

---

# 2. Do Not Define a User by Job Title

Do not assume:

```text
Manager → Not a User
Owner → Not a User
Employee → User
```

Instead ask:

> Does this person directly interact with the system?

For example:

```text
Hospital Manager
    ↓
View appointment reports
```

Viewing reports is still direct interaction with the system.

Therefore:

```text
Hospital Manager = User
```

The important thing is the **relationship with the system**, not the person's job title.

---

# 3. What Is a Stakeholder?

A **stakeholder** is someone who is affected by the business process, system, or project, or has an interest in its outcome.

A stakeholder does **not** necessarily use the software.

Example:

```text
Restaurant Owner
```

The owner may never directly use the ordering system but may care about:

```text
Sales
Costs
Customer satisfaction
Operational efficiency
Business performance
```

Therefore:

```text
Restaurant Owner = Stakeholder
```

even if:

```text
Restaurant Owner ≠ User
```

---

# 4. User and Stakeholder Are Different Questions

Do not treat:

```text
User vs Stakeholder
```

as mutually exclusive categories.

Ask two separate questions:

### Question 1

```text
Does this person directly interact with the system?
```

If yes:

```text
User
```

### Question 2

```text
Is this person affected by or interested in
the system, process, or business outcome?
```

If yes:

```text
Stakeholder
```

Therefore, someone can be both:

```text
Person
├── User
└── Stakeholder
```

This is extremely common in real business systems.

---

# 5. Participant vs User vs Stakeholder

These concepts should not automatically be treated as the same.

## Participant

A **participant** is a person, organization, system, or external service involved in a business process.

Example:

```text
Customer
Payment System
Bank
Restaurant
```

## User

A **user** is someone who directly interacts with the software.

Example:

```text
Cashier
    ↓
Payment System
```

## Stakeholder

A **stakeholder** is someone affected by or interested in the outcome.

Example:

```text
Restaurant Owner
```

The owner may not directly use the payment system but cares about:

```text
Revenue
Costs
Financial accuracy
Business performance
```

Therefore:

```text
Restaurant Owner
└── Stakeholder
```

---

# 6. These Categories Can Overlap

One person can belong to multiple categories.

Example:

```text
Restaurant Manager
├── Participant
├── User
└── Stakeholder
```

The important lesson:

> **Analyze the person's actual relationship to the process and system instead of automatically assigning labels.**

---

# 7. A User Can Be a Stakeholder

A customer may:

```text
View menu
Place order
Pay
Receive receipt
```

Therefore:

```text
Customer
├── User
└── Stakeholder
```

The customer directly interacts with the system and is affected by its outcome.

---

# 8. A Stakeholder Does Not Need a Login

A common mistake is:

```text
Has login?
    ↓
User
```

and:

```text
No login?
    ↓
Not important
```

This is incorrect.

A stakeholder does not need to log into the software.

For example:

```text
Business Owner
└── Stakeholder
```

The owner may receive reports and care about:

```text
Revenue
Costs
Performance
```

without directly using the system.

---

# 9. A User Does Not Have to Be Defined by "Logging In"

Logging in is only one form of system interaction.

The stronger question is:

> **Does this person directly interact with the system to perform or receive a system-supported activity?**

For example:

```text
Hospital Manager
    ↓
View appointment reports
```

The manager is interacting with the system.

Therefore:

```text
Hospital Manager
├── User
└── Stakeholder
```

---

# 10. External Systems and APIs

An external system can interact with another system without being a human user.

Example:

```text
Hospital System
       │
       │ API
       ▼
Insurance System
```

An API integration does not automatically mean:

```text
Insurance Company = User
```

Investigate:

> Does a human directly interact with the system?

or:

> Is another system communicating with it automatically?

Therefore:

```text
Human
    ↓
Direct interaction
    ↓
User
```

versus:

```text
System
    ↓
API
    ↓
System
```

The second case is better understood as **system-to-system interaction**, not automatically as a human user.

---

# 11. Stakeholders Can Exist Outside the Organization

Stakeholders are not necessarily employees.

Potential stakeholders may include:

```text
Customer
Restaurant Owner
Bank
Payment Provider
Regulator
```

Therefore, ask:

> Who is affected by this process?

rather than simply:

> Who works here?

---

# 12. Why Stakeholder Thinking Matters

Different people care about different things.

Example:

```text
Waiter
    ↓
Operational efficiency

Owner
    ↓
Business performance

Accountant
    ↓
Financial accuracy

Customer
    ↓
Ease of ordering
```

If we only talk to the person using the software, we may miss important business requirements.

---

# 13. Stakeholder Goals

A stakeholder is not just a name on a list.

We need to understand:

> What does this stakeholder care about?

A useful model is:

```text
Stakeholder
    ↓
Goal
    ↓
Concern
    ↓
Business Impact
```

Example:

```text
Restaurant Owner
    ↓
Increase profitability
    ↓
Concerned about costs
    ↓
Poor process efficiency may reduce profit
```

---

# 14. Stakeholder Goals Can Conflict

Different stakeholders can want different things.

Example:

```text
Customer
    ↓
Fast service

Waiter
    ↓
Simple workflow

Manager
    ↓
Detailed tracking

Owner
    ↓
Lower operating costs
```

These goals may conflict.

For example:

```text
More tracking
    ↓
More information entered
    ↓
More work for waiter
```

The manager may like the additional information while the waiter may dislike the additional work.

Therefore:

> Engineering is not simply asking one person what they want and implementing it.

We need to understand the different interests involved.

---

# 15. Do Not Automatically Choose a Stakeholder's Side

Suppose a Registrar says:

> "Students should not be able to enroll until I manually approve every enrollment."

A Student says:

> "I want to enroll immediately without waiting for approval."

Do not immediately decide which stakeholder is correct.

Instead investigate:

```text
Why is manual approval required?

Is approval required for every student?

What exactly does the Registrar check?

Is there a university policy requiring approval?

Can those checks be automated?

What happens if approval is skipped?

How long does approval normally take?

What problems are caused by the current process?
```

The engineering sequence is:

```text
Stakeholder Statement
    ↓
Investigation
    ↓
Business Rule
    ↓
Evidence
    ↓
Requirement
```

---

# 16. Do Not Assume

Separate:

```text
Fact
```

from:

```text
Assumption
```

For example:

```text
Finance Department
    ↓
Outside the enrollment system
    ↓
Therefore not a User
```

This is not necessarily valid.

If Finance can:

```text
View enrollment and payment information
```

then Finance directly interacts with the system.

Therefore:

```text
Finance Department = User
```

The correct reasoning is:

```text
Evidence
    ↓
Classification
```

not:

```text
Job title
    ↓
Assumption
    ↓
Classification
```

---

# 17. "Unknown" Is a Valid Engineering Answer

Not every relationship can immediately be classified.

Suppose:

> "The payment provider needs access to our enrollment system."

Do not automatically say:

```text
User = Yes
```

or:

```text
User = No
```

Instead:

```text
Unknown
    ↓
Investigate
```

Ask:

```text
Does a human employee log into the system?

Does another system communicate with it?

Is the communication through an API?

What information is exchanged?
```

Then classify based on evidence.

> **Unknown is better than an unsupported assumption.**

---

# 18. Stakeholder Discovery

When nobody gives us a stakeholder list, discover stakeholders through the business process.

Example:

```text
Student Enrollment
```

```text
Student
    ↓
Select Courses
    ↓
Enrollment
    ↓
Approval
    ↓
Payment
    ↓
Enrollment Confirmed
```

Then investigate:

```text
Who performs this?
Who is affected?
Who depends on the information?
Who makes decisions?
Who owns the process?
Who pays?
Who handles problems?
```

---

# 19. Stakeholder Discovery Questions

When entering an unfamiliar business, ask:

### Identify

```text
Who is involved in this process?
```

### Usage

```text
Who directly uses the system?
```

### Impact

```text
Who is affected by the system or its outcome?
```

### Goals

```text
What does each stakeholder want to achieve?
```

### Concerns

```text
What is each stakeholder worried about?
```

### Decisions

```text
Who makes decisions about this process?
```

### Dependencies

```text
Who depends on the output of this process?
```

### Ownership

```text
Who owns or is accountable for this process?
```

### Financial Responsibility

```text
Who pays for or approves the system?
```

### Failure Responsibility

```text
Who handles problems when the process fails?
```

---

# 20. Stakeholder Discovery Framework

Use this framework when entering an unfamiliar business:

```text
                    BUSINESS PROCESS
                           │
          ┌────────────────┼────────────────┐
          ▼                ▼                ▼
        Who?          Who is affected?   Who depends?
          │                │                │
          └────────────────┼────────────────┘
                           ▼
                    Who makes decisions?
                           │
                           ▼
                     Who owns it?
                           │
                           ▼
                      Who pays?
                           │
                           ▼
                Who handles problems?
```

This is stronger than simply asking:

> "Who are the stakeholders?"

---

# 21. Restaurant Example

Consider:

```text
Customer
    ↓
Order
    ↓
Kitchen
    ↓
Food Prepared
    ↓
Customer
    ↓
Payment
```

### Who performs the activities?

```text
Customer
Waiter
Kitchen
Cashier
```

### Who is affected?

```text
Customer
Waiter
Kitchen
Cashier
Restaurant Owner
```

### Who depends on information?

```text
Kitchen
Cashier
Restaurant Owner
```

### Who makes decisions?

Possibly:

```text
Restaurant Manager
```

### Who owns the business process?

Possibly:

```text
Restaurant Owner / Management
```

### Who pays for the system?

Possibly:

```text
Restaurant Owner
```

The stakeholder picture is therefore larger than the list of system users.

---

# 22. Stakeholder Does Not Mean "Everyone"

Someone does not become a stakeholder simply because they are important.

Ask:

> What is their relationship to the business process, system, or outcome?

A person may be:

```text
Yes
```

or:

```text
No
```

or:

```text
Unknown — investigate
```

The classification should be based on evidence.

It is normal for many people in a real business process to be stakeholders.

---

# 23. University Enrollment Example

Possible participants:

```text
Student
Registrar
Professor
Finance Department
University Administration
Payment Provider
```

Potential classifications depend on actual system interaction.

For example:

```text
Student
├── User
└── Stakeholder
```

```text
Registrar
├── User
└── Stakeholder
```

If the Professor can view enrolled students:

```text
Professor
├── User
└── Stakeholder
```

If Finance can view enrollment and payment information:

```text
Finance Department
├── User
└── Stakeholder
```

If Administration can view enrollment reports:

```text
University Administration
├── User
└── Stakeholder
```

If the Payment Provider communicates through an API:

```text
Enrollment System
       │
       │ API
       ▼
Payment Provider
```

do not automatically classify the provider as a human user.

Investigate the actual relationship.

---

# 24. Hospital Appointment Example

Consider:

```text
Patient
Receptionist
Doctor
Hospital Manager
Insurance Company
Hospital Owner
```

### Patient

```text
User: Yes
Stakeholder: Yes
```

Reason:

```text
Patient
    ↓
Books appointment
```

Main concern:

```text
Book an appointment successfully.
```

### Receptionist

```text
User: Yes
Stakeholder: Yes
```

Reason:

```text
Receptionist
    ↓
Create / modify appointments
```

Main concern:

```text
Manage appointments accurately and efficiently.
```

### Doctor

```text
User: Yes
Stakeholder: Yes
```

Reason:

```text
Doctor
    ↓
View appointments
```

Main concern:

```text
Know which patients are scheduled and when.
```

### Hospital Manager

If the system allows:

```text
Hospital Manager
    ↓
View appointment reports
```

then:

```text
User: Yes
Stakeholder: Yes
```

Viewing reports is still direct interaction with the system.

Main concern:

```text
Monitor appointment activity and hospital performance.
```

### Insurance Company

If information is exchanged through an API:

```text
Hospital System
       │
       │ API
       ▼
Insurance System
```

then:

```text
User: Not established / likely No
Stakeholder: Yes
```

Main concern:

```text
Receive information needed for coverage.
```

### Hospital Owner

If the owner does not directly use the system:

```text
User: No
Stakeholder: Yes
```

Main concern:

```text
Monitor overall hospital performance.
```

---

# 25. Stakeholder Map

A simple stakeholder analysis can begin with:

```text
Stakeholder
    ↓
Relationship
    ↓
Goal
    ↓
Concern
    ↓
Business Impact
```

Example:

```text
Restaurant Owner
    ↓
Owns the business
    ↓
Increase profitability
    ↓
Concerned about costs
    ↓
Poor process efficiency may reduce profit
```

---

# 26. Engineering Principle

Do not define the system only from the perspective of its users.

Think:

```text
                         BUSINESS
                            │
             ┌──────────────┼──────────────┐
             ▼              ▼              ▼
           Users       Stakeholders   External Parties
             │              │              │
             └──────────────┼──────────────┘
                            ▼
                     Business Goals
                            │
                            ▼
                      Requirements
```

The software exists inside a larger business environment.

---

# 27. Core Mental Model

Remember:

```text
USER
↓
Directly interacts with the system
```

```text
STAKEHOLDER
↓
Affected by or interested in the outcome
```

And:

```text
User
  ∩
Stakeholder
```

is completely possible.

A common real-world situation is:

```text
Person
├── User
└── Stakeholder
```

The key engineering skill is:

> **Understand each person's actual relationship to the business and system rather than labeling people based on job titles.**

---

# 28. Engineering Investigation Rule

When information is incomplete:

```text
Do not assume.
```

Instead:

```text
Unknown
    ↓
Ask questions
    ↓
Gather evidence
    ↓
Classify
```

This is the same engineering habit used throughout Business Thinking:

```text
Problem vs Solution
        ↓
Don't accept the first solution

Cause and Effect
        ↓
Don't assume the first cause

Process Mapping
        ↓
Don't assume a simple linear process

Information Flow
        ↓
Don't assume information is obvious

Stakeholders vs Users
        ↓
Don't assume everyone has the same relationship
```

The common principle is:

> **Observe → Ask → Investigate → Understand → Then design.**

---

# Exercises Completed

## Exercise 1 — Restaurant Ordering System

Analyzed:

```text
Customer
Waiter
Kitchen Staff
Cashier
Restaurant Owner
```

Focused on:

- Users
- Stakeholders
- User + stakeholder overlap
- Stakeholders without direct system interaction
- Owner involvement
- Different stakeholder requirements

## Exercise 2 — University Enrollment System

Analyzed:

```text
Student
Registrar
Professor
Finance Department
University Administration
Payment Provider
```

Focused on:

- Users
- Stakeholders
- Overlapping classifications
- Stakeholders without direct system interaction
- Different stakeholder goals
- Stakeholder conflicts
- Investigation before deciding requirements
- Avoiding assumptions
- Discovering stakeholder needs

## Exercise 3 — Hospital Appointment System

Analyzed:

```text
Patient
Receptionist
Doctor
Hospital Manager
Insurance Company
Hospital Owner
```

Focused on:

- Direct system interaction
- Stakeholder impact
- External organizations
- API/system-to-system interaction
- User + stakeholder overlap
- Evidence-based classification

---

# Final Learning Checklist

- [x] What is a user?
- [x] What is a stakeholder?
- [x] Can someone be both?
- [x] Can a stakeholder exist without being a user?
- [x] Does a user have to be defined by a job title?
- [x] Does a user have to log in?
- [x] Can viewing a report make someone a user?
- [x] Can an external organization be a stakeholder?
- [x] Does an API integration automatically make someone a user?
- [x] How do we discover stakeholders?
- [x] How do stakeholder goals differ?
- [x] Can stakeholder goals conflict?
- [x] Should an engineer immediately choose which stakeholder is correct?
- [x] What should we do when the relationship is unclear?
- [x] Why is "Unknown — investigate" sometimes the correct answer?

---

# Engineering Principle

> **A good engineer does not only ask who uses the software.**

They ask:

```text
Who uses it?

Who is affected?

Who depends on it?

Who makes decisions?

Who owns the process?

Who pays for it?

Who handles failures?

What does each stakeholder want?

What is each stakeholder concerned about?
```

Then:

```text
Stakeholder Understanding
        ↓
Goals
        ↓
Concerns
        ↓
Business Rules
        ↓
Requirements
```

The software is only one part of the larger business system.

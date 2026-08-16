# Topic 021 — Exercises
## From Business Process to System Model

---

# Learning Rules

For every exercise:

1. Identify the business activity.
2. Identify who performs it.
3. Identify the exact responsibility.
4. Decide whether our system performs that responsibility.
5. Identify the information our system needs.
6. Identify where the information comes from.
7. Identify what crosses the system boundary.
8. Identify what remains unknown.
9. Do not jump into implementation.

Do not answer with:

```text
API
Database
Webhook
Framework
Programming language
Class
Endpoint
UI
```

unless the exercise explicitly asks for a solution.

---

# Exercise 021.1 — Business Activity → System Responsibility

## Scenario

A restaurant has this process:

```text
Customer
   ↓
Places order
   ↓
Restaurant System
   ↓
Records order
   ↓
Kitchen Staff
   ↓
Prepares food
```

### Q1

```text
Business activity:

Who performs the business activity:

What is their responsibility:

What is the system responsible for:

Why are the business activity and system responsibility different?
```

---

# Exercise 021.2 — Break Down a Broad Responsibility

Consider:

> "The restaurant system handles the order."

This is too broad.

### Q1

Break it into at least three specific system responsibilities.

```text
1.
2.
3.
```

### Q2

Why is:

> "Handle the order"

not precise enough for a system model?

---

# Exercise 021.3 — Identify What Belongs to Our System

## Scenario

```text
Customer
   ↓
Submits appointment request
   ↓
Appointment System
   ↓
Checks doctor availability
   ↓
Receptionist
   ↓
Approves scheduling exception
   ↓
Appointment System
   ↓
Records appointment
```

### Q1

Classify each responsibility:

```text
1. Customer submits appointment request
Inside / Outside:

2. System checks doctor availability
Inside / Outside:

3. Receptionist approves scheduling exception
Inside / Outside:

4. System records appointment
Inside / Outside:
```

### Q2

Explain why the receptionist's responsibility remains outside the system.

---

# Exercise 021.4 — Information Needed by the System

## Scenario

A restaurant system must determine whether an order is eligible for cancellation.

The known business rule is:

> An order can be cancelled only if it is unpaid and preparation has not started.

### Q1

What information does the system need?

```text
1.
2.
```

### Q2

For each piece of information, identify whether its source is known.

```text
Information:
Source:
Known / Unknown:
```

Do not invent the source if the scenario does not provide it.

---

# Exercise 021.5 — Information Producer vs. Information User

## Scenario

```text
Kitchen System
    ↓
Updates preparation status
    ↓
Restaurant System
    ↓
Receives preparation status
    ↓
Determines cancellation eligibility
```

### Q1

Who produces/updates the preparation status?

### Q2

Who uses the preparation status?

### Q3

Is the preparation-status responsibility inside or outside our system?

### Q4

Why doesn't receiving the information make the Restaurant System responsible for producing it?

---

# Exercise 021.6 — Requirement → System Responsibility

## Scenario

The university says:

> "Students must be able to see their current enrollment status."

### Q1

What is the requirement?

### Q2

What system responsibilities are supported by the scenario?

Give at least two.

```text
1.
2.
```

### Q3

Which of these is a solution rather than a responsibility?

```text
A. Make the enrollment status available to students.

B. Build a student dashboard.

Answer:
Why:
```

---

# Exercise 021.7 — Business Decision vs. System Responsibility

## Scenario

```text
Enrollment System
    ↓
Checks whether required documents are present
    ↓
Registrar
    ↓
Reviews application
    ↓
Approves / Rejects
```

### Q1

What does the system check?

### Q2

What decision does the registrar own?

### Q3

Why should we not automatically assume that the system should make the approval/rejection decision?

### Q4

What information would we investigate before considering automation of the decision?

Give at least three.

---

# Exercise 021.8 — Build an Information Flow

## Scenario

A payment system outside our restaurant system provides the payment result.

The restaurant system needs the result to update the order's payment state.

Complete:

```text
Source:

Information:

↓

Crosses system boundary

↓

Our system receives:

↓

Our system uses the information to:
```

### Important

Do not specify the technical mechanism.

---

# Exercise 021.9 — System Boundary Defense

A developer says:

> "The kitchen system is software, so we should include it inside our restaurant system model."

### Q1

Do you agree?

Yes / No:

### Q2

Why?

### Q3

What question should we ask instead of:

> "Is it software?"

### Q4

Complete:

```text
External system:
Responsibility:

Our system:
Responsibility:
```

---

# Exercise 021.10 — From Process to System Model

## Scenario

A university enrollment process is:

```text
Student
   ↓
Submits application
   ↓
Enrollment System
   ↓
Checks required documents
   ↓
Registrar
   ↓
Reviews application
   ↓
Approves / Rejects
   ↓
Enrollment System
   ↓
Records enrollment status
   ↓
Student
   ↓
Views status
```

### Q1 — Business Activities

List the individual business activities.

```text
1.
2.
3.
4.
5.
```

### Q2 — System Responsibilities

List only the responsibilities belonging to the Enrollment System.

```text
1.
2.
3.
```

### Q3 — Information

What information does the Enrollment System need?

Give at least three.

```text
1.
2.
3.
```

### Q4 — Information Sources

For each piece of information, identify the known source.

```text
Information:
Source:
```

If unknown, write:

> Needs investigation.

### Q5 — Boundary

```text
INSIDE OUR SYSTEM:

1.
2.
3.

OUTSIDE OUR SYSTEM:

1.
2.
3.
4.
```

### Q6 — Unknowns

Give at least four.

Use:

> We don't know whether...

```text
1.
2.
3.
4.
```

---

# Exercise 021.11 — Requirement, Responsibility, or Solution?

Classify each statement.

### A

> "Students must be able to see their enrollment status."

```text
Requirement / System Responsibility / Solution:

Why:
```

### B

> "The enrollment system must record the enrollment status."

```text
Requirement / System Responsibility / Solution:

Why:
```

### C

> "Create a dashboard showing enrollment status."

```text
Requirement / System Responsibility / Solution:

Why:
```

### D

> "The system must receive the preparation status from the kitchen system."

```text
Requirement / System Responsibility / Solution:

Why:
```

---

# Exercise 021.12 — Unknowns Before Modeling

A manager says:

> "The system needs to automatically determine whether an appointment can be scheduled."

Before modeling this responsibility, identify at least five things we need to investigate.

```text
1. We don't know whether...
2. We don't know whether...
3. We don't know whether...
4. We don't know whether...
5. We don't know whether...
```

Think about:

- doctor availability;
- appointment types;
- scheduling rules;
- conflicting appointments;
- emergency appointments;
- receptionist overrides;
- exceptions;
- cancellation rules.

Do not invent answers.

---

# Exercise 021.13 — Engineering Judgment

A developer says:

> "We already know the business process, so let's start designing the database."

Would you immediately agree?

```text
Yes / No:

Why:
```

Explain what should be understood before implementation begins.

---

# Exercise 021.14 — Final Topic Challenge

## Scenario

A pharmacy has:

```text
Customer
   ↓
Provides prescription
   ↓
Pharmacist
   ↓
Checks prescription
   ↓
Pharmacist
   ↓
Checks medicine availability
   ↓
Pharmacist
   ↓
Prepares medicine
   ↓
Customer
   ↓
Pays
   ↓
Pharmacy System
   ↓
Records sale
```

The pharmacy wants software improvements.

### Q1 — Business Activities

List the individual activities.

### Q2 — Responsibilities

Identify the responsibility owner for each activity.

### Q3 — System Boundary

Which responsibilities belong inside our system?

Which remain outside?

### Q4 — Information

What information does the Pharmacy System need?

### Q5 — Information Sources

Who or what produces each piece of information?

### Q6 — System Responsibilities

Write the responsibilities of the Pharmacy System without describing implementation.

### Q7 — Unknowns

Identify at least five things that still need investigation.

### Q8 — System Model

Construct a simple model:

```text
External Actor/System
        ↓
Information / Request
        ↓
Our System
        ↓
System Responsibility
        ↓
Information / Result
        ↓
External Actor/System
```

### Q9 — Engineering Judgment

The pharmacy owner says:

> "Just automate everything the pharmacist currently does."

Would you agree?

Explain why or why not.

---

# Topic 021 Mastery Challenge

Before considering Topic 021 mastered, you should be able to independently answer:

```text
What business activity is happening?
        ↓
Who performs it?
        ↓
What responsibility do they own?
        ↓
Which responsibility belongs to our system?
        ↓
What information does our system need?
        ↓
Who produces that information?
        ↓
What crosses our system boundary?
        ↓
What does our system do with it?
        ↓
What remains outside?
        ↓
What remains unknown?
        ↓
Can we describe the system responsibility
without describing implementation?
```

## Mastery Standard

You are ready to move toward Topic 022 only when you can:

- derive system responsibilities from a business process;
- separate business activities from system responsibilities;
- defend the system boundary;
- identify information needed by the system;
- distinguish information producers from information users;
- identify unknowns instead of inventing facts;
- distinguish system responsibility from implementation;
- explain the system model in clear sentences.

> **Do not memorize the model. Learn how to derive it from the business.**

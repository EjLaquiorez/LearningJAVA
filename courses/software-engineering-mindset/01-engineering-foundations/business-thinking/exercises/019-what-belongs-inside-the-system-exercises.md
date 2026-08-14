# Topic 019 — What Belongs Inside the System?
# Exercises

## Roadmap Position

- **Roadmap:** Roadmap B — Software Engineering Mindset
- **Module:** Module 1 — Business Thinking
- **Phase:** Phase 9 — System Boundaries
- **Topic:** 019 — What Belongs Inside the System?
- **Status:** 🚧 Currently Learning

---

# Exercise Objective

Practice determining:

- what belongs inside a software system,
- what remains outside,
- who is responsible for an activity,
- what the system should support,
- and where the system boundary should be placed.

Do not focus on technology yet.

Your reasoning should begin from:

```text
Business Process
    ↓
People / Actors
    ↓
Responsibilities
    ↓
Requirements
    ↓
System Responsibility
    ↓
System Boundary
```

---

# Exercise 019.1 — Inside or Outside?

For each activity, classify it as:

- **Inside the System**
- **Outside the System**
- **Needs More Information**

Explain why.

### Q1

A restaurant waiter physically brings the prepared food to the customer's table.

### Q2

The restaurant system records that an order has been marked as served.

### Q3

A registrar reviews a student's submitted documents and decides whether the requirements are satisfied.

### Q4

The enrollment system stores the student's enrollment status.

### Q5

A customer decides whether they want to purchase an item.

### Q6

The system calculates the total price of an order based on defined business rules.

### Q7

A bank's external payment system processes a payment request.

### Q8

The application records the result returned by the external payment system.

For every answer, use:

> **"I classify this as ___ because..."**

---

# Exercise 019.2 — Identify the Responsibility

Consider this process:

```text
Student submits enrollment application
        ↓
Registrar checks documents
        ↓
Registrar makes approval decision
        ↓
Enrollment status is recorded
        ↓
Student receives enrollment status
```

Answer:

### Q1

Who is responsible for checking the documents?

### Q2

Who is responsible for making the approval decision?

### Q3

What responsibility could belong to the software?

### Q4

What responsibility clearly belongs to a human actor?

### Q5

Why should we avoid automatically moving the registrar's approval decision into the software?

---

# Exercise 019.3 — Boundary Analysis

A pharmacy has this process:

```text
Customer gives prescription
        ↓
Pharmacist checks prescription
        ↓
Pharmacist verifies medicine availability
        ↓
Pharmacist prepares medicine
        ↓
Customer pays
        ↓
Sale is recorded
```

The pharmacy wants a software system to help manage the process.

Separate the activities into:

```text
System Responsibility
---------------------
1.
2.
3.

Outside System
---------------
1.
2.
3.
```

Then explain:

> **Why should those responsibilities be separated?**

---

# Exercise 019.4 — Don't Jump to Software

A university registrar says:

> "The system should approve enrollment automatically."

You are not allowed to accept the statement immediately.

Answer:

### Q1

What business decision is being discussed?

### Q2

Who currently appears to be responsible for that decision?

### Q3

What information would you need before deciding whether the system should make the decision?

### Q4

What business rules might be involved?

### Q5

Could the system simply record the registrar's decision instead?

Explain.

---

# Exercise 019.5 — Actor vs System

Consider this interaction:

```text
Customer → Order System
Customer submits order
```

Answer:

### Q1

Is the customer inside the system?

### Q2

What is the customer's responsibility?

### Q3

What could be the system's responsibility?

### Q4

Why is the customer considered an external actor?

### Q5

What does the boundary represent in this example?

---

# Exercise 019.6 — Requirements to System Responsibility

Use the following requirements.

### Requirement A

> "Employees must be able to find customer records."

### Requirement B

> "The system must retain completed orders."

### Requirement C

> "Managers must be informed when an order becomes significantly delayed."

### Requirement D

> "Customers must be able to know the current status of their orders."

For each requirement, answer:

```text
Requirement:
System responsibility:
What remains outside the system:
```

Do not design the UI or database.

Focus only on **responsibility**.

---

# Exercise 019.7 — Ambiguous Boundary

A restaurant owner says:

> "I want the system to handle delayed orders."

Do not immediately decide what belongs inside the system.

Answer:

### Q1

Why is the statement too vague?

### Q2

What could "handle delayed orders" mean?

Give at least three possibilities.

### Q3

What questions would you ask the owner?

Give at least four.

### Q4

Which parts might be business responsibilities rather than software responsibilities?

### Q5

Rewrite the statement into a clearer system responsibility if enough information is available.

If there is not enough information, explicitly say:

> **"More information is required."**

---

# Exercise 019.8 — Full Business Scenario

## Scenario

A university currently processes enrollment applications manually.

```text
Student submits application
        ↓
Registrar receives documents
        ↓
Registrar checks requirements
        ↓
Registrar approves or rejects application
        ↓
Registrar records decision
        ↓
Student contacts registrar to ask for status
```

The university proposes:

> "Build an enrollment system that handles everything automatically."

Analyze this statement.

### Q1 — Observation

What do we actually know from the scenario?

### Q2 — Stakeholder Request

What solution is being proposed?

### Q3 — Business Process

What activities currently happen?

### Q4 — Actors

Who participates?

### Q5 — Responsibilities

Who is responsible for each activity?

### Q6 — Possible System Responsibilities

Which responsibilities might reasonably belong to software?

### Q7 — Responsibilities That May Remain Outside

Which responsibilities might remain with people?

### Q8 — Unknowns

Give at least five things we do not know yet.

### Q9 — Investigation Questions

Give at least five questions you would ask before defining the system boundary.

### Q10 — Boundary

Describe your proposed system boundary in words.

Do not draw technical architecture.

---

# Exercise 019.9 — Explain Your Boundary

Choose one of your answers from Exercise 019.8.

Complete:

> **"I would place this responsibility inside the system because..."**

Then:

> **"I would keep this responsibility outside the system because..."**

Then:

> **"The boundary should be placed here because..."**

The goal is to practice **reasoning**, not merely classification.

---

# Exercise 019.10 — Final Challenge

You are analyzing a hospital appointment process.

The hospital says:

> "We need a system that manages appointments."

Current process:

```text
Patient requests appointment
        ↓
Receptionist checks doctor availability
        ↓
Receptionist selects an available schedule
        ↓
Receptionist records appointment
        ↓
Patient receives appointment details
        ↓
Doctor sees patient
```

The hospital wants to automate the process.

Answer all of the following:

### Q1

What is the business process?

### Q2

Who are the actors?

### Q3

What responsibilities currently belong to the receptionist?

### Q4

Which receptionist responsibilities could potentially be supported by software?

### Q5

Which responsibilities are clearly outside the software?

### Q6

What information does the system need to manage?

### Q7

What decisions may require business rules?

### Q8

What information is still unknown?

### Q9

What questions would you ask before defining the boundary?

### Q10

Describe the system boundary in your own words.

---

# Mastery Challenge

Do not consider Topic 019 mastered merely because you can label activities as inside or outside.

You should be able to explain:

> **Why does this responsibility belong to the system?**

and:

> **Why does this responsibility remain outside the system?**

A strong answer should connect the decision to:

```text
Business Process
      ↓
Actor
      ↓
Responsibility
      ↓
Requirement
      ↓
System Responsibility
      ↓
Boundary
```

---

# Final Reflection

Complete these sentences in your own words:

### 1

> A system boundary is...

### 2

> A business process is different from a software system because...

### 3

> An actor is outside the system because...

### 4

> I should not automatically put every business activity inside software because...

### 5

> Before defining a system boundary, I need to understand...

---

# Completion Criteria

Topic 019 can be considered mastered when you can:

- distinguish business activities from system responsibilities,
- identify actors outside the system,
- explain what belongs inside the system,
- explain what remains outside,
- identify unclear boundaries,
- ask questions before making boundary decisions,
- connect requirements to system responsibilities,
- avoid prematurely designing technical solutions,
- explain boundary decisions using business reasoning,
- apply the concept to an unfamiliar business scenario.

> **Do not move forward simply because the exercises are finished. Master the reasoning first.**

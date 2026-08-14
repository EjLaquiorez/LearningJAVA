# Topic 019 — What Belongs Inside the System?

## Roadmap Position

- **Roadmap:** Roadmap B — Software Engineering Mindset
- **Module:** Module 1 — Business Thinking
- **Phase:** Phase 9 — System Boundaries
- **Topic:** 019 — What Belongs Inside the System?
- **Status:** Currently Learning
- **Previous:** 018 — Requirements vs Solutions ✅
- **Next:** 020 — System Boundaries and External Systems

---

# Objective

Learn to determine:

- what should be handled by the software system,
- what remains outside the system,
- which responsibilities belong to people or existing processes,
- and where the boundary between the system and its surrounding environment should be placed.

The goal is **not** to start designing screens, classes, APIs, or databases.

The goal is to understand **what the system is responsible for** before deciding how the system should be built.

---

# Core Principle

> **Understand the system's responsibility before designing the system.**

A business process is usually larger than the software.

People, policies, physical activities, external organizations, existing systems, and software may all participate in the same process.

Therefore:

> **Business process ≠ software system**

A software system may support only part of the overall business process.

---

# Why System Boundaries Matter

A common mistake is to treat the entire business process as if it belongs inside the software.

For example:

```text
Customer places order
        ↓
Staff prepares order
        ↓
Kitchen prepares food
        ↓
Staff serves customer
        ↓
Customer receives food
```

A restaurant system might support:

```text
Order creation
Order status
Payment record
Order information
```

But that does not mean the software itself performs every physical activity.

The kitchen staff still prepares the food.

The waiter may still deliver it.

The customer still receives it.

The system may **record, communicate, coordinate, or enforce rules** without physically performing the business activity.

---

# The Core Mental Model

Think about a business process as a larger environment:

```text
                 BUSINESS ENVIRONMENT

        People      Processes      External Systems
           \            |              /
            \           |             /
             └────── System Boundary ──────┐
                                            │
                                      ┌─────▼─────┐
                                      │  SYSTEM   │
                                      │           │
                                      │ System    │
                                      │responsibilities
                                      └───────────┘
```

The question is not:

> "What can software do?"

The better question is:

> **"What responsibility should this system have within this business process?"**

---

# What We Need to Identify

When analyzing a system boundary, separate the following:

## 1. Inside the System

Responsibilities that the software is expected to perform or support.

Examples may include:

- storing required business information,
- retrieving information,
- applying defined business rules,
- recording a business event,
- communicating information,
- supporting a required business capability.

The exact responsibilities depend on the business requirements.

---

## 2. Outside the System

Responsibilities that remain with:

- people,
- physical activities,
- organizational procedures,
- external organizations,
- other systems,
- or activities not assigned to this software.

Examples:

```text
Employee physically checks a document
        ↓
Outside the software

System records the verification result
        ↓
Inside the software
```

The software can support the process without replacing every human activity.

---

# System Boundary Is a Responsibility Boundary

A useful question is:

> **"Who or what is responsible for this activity?"**

Suppose a university enrollment process contains:

```text
Student submits documents
        ↓
Registrar checks documents
        ↓
Registrar approves enrollment
        ↓
System records approval
        ↓
Student receives status
```

The system may be responsible for:

```text
Recording enrollment status
Providing enrollment status
```

while the registrar remains responsible for:

```text
Checking documents
Making the approval decision
```

Do not automatically move the registrar's responsibility into the software.

First understand the business responsibility.

---

# System Boundary vs. Solution Design

System boundary thinking happens **before** detailed solution design.

Avoid jumping immediately to:

```text
Controller
Service
Repository
Database
API
UI
```

Those are implementation concerns.

At this stage, think:

```text
Business responsibility
        ↓
System responsibility
        ↓
System boundary
        ↓
Later: system model
        ↓
Later: technical solution
```

---

# A Practical Boundary Analysis

For each activity or responsibility, ask:

### Question 1

> **What is happening?**

### Question 2

> **Who currently performs or owns it?**

### Question 3

> **What information is involved?**

### Question 4

> **Does the software need to perform or support this responsibility?**

### Question 5

> **If it is outside the system, who or what remains responsible?**

This helps prevent assumptions.

---

# Example — University Enrollment

Suppose the process is:

```text
Student submits enrollment application
        ↓
Registrar checks requirements
        ↓
Registrar approves or rejects
        ↓
Enrollment status is recorded
        ↓
Student checks status
```

Possible responsibility separation:

| Responsibility | Possible Owner |
|---|---|
| Submit application | Student / System |
| Check requirements | Registrar |
| Approve or reject | Registrar |
| Record enrollment status | System |
| Display enrollment status | System |
| Make final academic decision | Registrar |
| Physically verify documents | Registrar / Staff |

The important point is:

> **Do not assume every activity becomes a software responsibility.**

The boundary must be derived from the business understanding and requirements.

---

# System Boundary and Requirements

Topic 018 taught:

```text
Need
 ↓
Requirement
 ↓
Possible Solution
```

Topic 019 now asks another question:

```text
Requirement
 ↓
Who or what should be responsible?
 ↓
System boundary
```

For example:

> Students must be able to know their enrollment status.

This is a requirement.

Now we ask:

> **Should this software system be responsible for providing that information?**

If yes, that responsibility belongs inside the system boundary.

If another existing system is responsible for the information, the relationship may instead cross the system boundary.

---

# Avoid These Mistakes

## Mistake 1 — Everything becomes software

Bad thinking:

> "The business process happens, therefore the software should do all of it."

Better:

> "Which responsibilities actually belong to this system?"

---

## Mistake 2 — Designing technology too early

Bad thinking:

> "We need a database, so let's design the database."

Better:

> "What information must the system be responsible for?"

---

## Mistake 3 — Replacing business responsibilities without evidence

Bad thinking:

> "The registrar approves enrollment, so the system should automatically approve students."

That changes the business responsibility.

Better:

> "The registrar makes the approval decision. The system may record and communicate that decision."

---

## Mistake 4 — Confusing users with system responsibilities

A user interacting with the system does not mean the user becomes part of the software.

For example:

```text
Registrar → System
```

The registrar is an external actor interacting with the system.

The registrar is not literally inside the software.

---

# Important Distinction

Keep these concepts separate:

```text
Actor
    ↓
External participant interacting with the system

System
    ↓
Software responsibility being analyzed

External System
    ↓
Another software system outside this system's boundary

Business Process
    ↓
The larger real-world process surrounding the system
```

This distinction prepares us for Topic 020, where we will examine system boundaries and external systems more directly.

---

# Engineering Thinking Pattern

Use this sequence:

```text
Business Process
        ↓
Activities
        ↓
People / Actors
        ↓
Responsibilities
        ↓
Requirements
        ↓
System Responsibilities
        ↓
System Boundary
        ↓
System Model
        ↓
Solution
```

Do not reverse the order.

---

# Mental Model

When someone says:

> "The system should handle enrollment."

Do not immediately accept it.

Ask:

```text
What does "handle enrollment" mean?
        ↓
Which activities?
        ↓
Which responsibilities?
        ↓
Which decisions?
        ↓
Which information?
        ↓
Which responsibilities belong to people?
        ↓
Which belong to the system?
        ↓
Where should the boundary be?
```

The phrase **"the system handles it"** is often too vague.

Your job is to make the responsibility explicit.

---

# Connection to Previous Topics

Topic 019 builds directly on earlier learning.

```text
Process Mapping
        ↓
Who performs each activity?
        ↓
Stakeholders
        ↓
Responsibilities
        ↓
Business Rules
        ↓
Requirements
        ↓
System Responsibility
        ↓
System Boundary
```

You are moving from:

> **Understanding the business**

toward:

> **Understanding what the software system should be responsible for.**

---

# Mastery Criteria

Before considering Topic 019 mastered, you should be able to:

- explain what a system boundary means,
- distinguish a business process from a software system,
- identify responsibilities that belong inside the system,
- identify responsibilities that remain outside,
- distinguish actors from the system,
- avoid assuming that every business activity belongs in software,
- derive system responsibilities from requirements,
- explain your boundary decisions using business reasoning,
- apply the concept to an unfamiliar scenario.

---

# Key Takeaway

> **A system boundary defines what the software is responsible for within the larger business environment.**

The goal is not to put everything inside the system.

The goal is to place responsibilities in the correct location based on the business process, requirements, actors, information, and responsibilities.

---

# Topic 019 Summary

```text
Business Process
       ↓
Understand Activities
       ↓
Identify Actors
       ↓
Identify Responsibilities
       ↓
Understand Requirements
       ↓
Determine System Responsibilities
       ↓
Define System Boundary
       ↓
Only then move toward System Modeling
```

> **Understand what the system is responsible for before deciding how to build it.**

# Current Progress

## Roadmap B — Software Engineering Mindset

**Phase:** Phase 1 — Engineering Foundations  
**Module:** Module 1 — Business Thinking  
**Part:** Business Thinking  
**Current Topic:** **021 — From Business Process to System Model**  
**Status:** 🚧 Currently Learning

### Previous Completed Topics

- **015 — Stakeholder Priorities and Trade-offs** ✅
- **016 — Exceptions and Edge Cases** ✅
- **017 — Business Rules and Decision Logic** ✅
- **018 — Requirement vs. Solution** ✅
- **019 — Inside vs. Outside System** ✅
- **020 — Information Thinking** ✅ Mastered

### Next Topic

- **022 — From System Model to Solution** ⬜

---

# Current Learning Position

```text
Roadmap B — Software Engineering Mindset
        ↓
Phase 1 — Engineering Foundations
        ↓
Module 1 — Business Thinking
        ↓
Topic 021 — From Business Process to System Model
        ↓
🚧 CURRENT
```

**Repository area:**

```text
software-engineering-mindset/
└── modules/
    └── 01-engineering-foundations/
        └── business-thinking/
```

---

# Learning Objective

Learn how to translate the business understanding developed in the earlier topics into a clear model of what the system is responsible for doing.

This topic is **not** about choosing technologies or writing code.

The focus is:

```text
Business Process
    ↓
Actors
    ↓
Responsibilities
    ↓
Information
    ↓
Business Rules
    ↓
Requirements
    ↓
System Boundary
    ↓
System Responsibilities
    ↓
System Model
```

---

# Core Learning Principle

> **Understand the system before designing the solution.**

A system model should come from the business understanding already established. It should not be invented from technical preferences.

Do not jump directly from:

```text
Business request
    ↓
Code / Database / API / Framework
```

Instead reason through:

```text
Business
    ↓
Problem
    ↓
Process
    ↓
People
    ↓
Information
    ↓
Rules
    ↓
Requirements
    ↓
System Understanding
    ↓
System Model
    ↓
Solution
```

---

# Topic 021 — From Business Process to System Model

## Purpose

Develop the ability to take a known business process and identify the responsibilities that our system must perform, the information it must work with, and the interactions it must support.

## Key Questions

When modeling a system, ask:

1. What business activity is happening?
2. Who performs the activity?
3. What responsibility does each actor own?
4. Which responsibilities belong to our system?
5. What information does our system need?
6. Where does that information come from?
7. What business rules affect the responsibility?
8. What information crosses the system boundary?
9. What does our system do with that information?
10. What responsibilities remain outside the system?
11. What is still unknown?
12. Can the system responsibility be stated without describing implementation?

---

# Topic 021 Mental Model

```text
Business Activity
        ↓
Who performs it?
        ↓
What is their responsibility?
        ↓
Does our system perform/support it?
        ↓
What information does the system need?
        ↓
Where does the information come from?
        ↓
What crosses the system boundary?
        ↓
What does our system actually own?
        ↓
System Responsibilities
        ↓
System Model
```

---

# Important Distinctions

## Business Activity vs. System Responsibility

A business activity describes what happens in the business.

A system responsibility describes what our system must do to support that business activity.

```text
Business Activity
    ↓
Customer places an order

System Responsibility
    ↓
Record the order
```

Do not collapse the two into a vague statement such as:

> "The system handles the order."

---

## Responsibility vs. Implementation

A system responsibility says **what the system must do**.

It does not yet say **how it will be implemented**.

```text
Responsibility:
Record the appointment.

Implementation:
Use a relational database with a specific schema.
```

The second belongs to solution design, not system modeling.

---

## Information Needed vs. Information Ownership

The fact that our system needs information does not mean our system owns the responsibility of producing that information.

```text
Kitchen System
    ↓
Produces preparation status
    ↓
System Boundary
    ↓
Restaurant System
    ↓
Uses preparation status
```

This distinction was established in Topic 020 and must continue into Topic 021.

---

# Connection to Previous Topics

Topic 021 builds directly on the previous learning sequence:

```text
017 — Business Rules and Decision Logic
        ↓
018 — Requirement vs. Solution
        ↓
019 — Inside vs. Outside System
        ↓
020 — Information Thinking
        ↓
021 — From Business Process to System Model
```

The learner should now be able to combine:

- business rules
- requirements
- responsibility ownership
- system boundaries
- information sources
- information flow

into one coherent system model.

---

# Topic 021 Mastery Standard

Do not mark Topic 021 complete simply because the lessons and exercises have been finished.

The topic should be considered mastered when the learner can:

- Identify individual business activities.
- Identify the actor responsible for each activity.
- Distinguish business responsibilities from system responsibilities.
- Define system responsibilities without proposing implementation.
- Identify information required by a system responsibility.
- Identify the source and ownership of information.
- Respect the system boundary.
- Explain what information crosses the boundary.
- Connect requirements and business rules to system responsibilities.
- Identify unknowns instead of inventing facts.
- Construct a simple system model from an unfamiliar business scenario.
- Explain the reasoning behind the model in clear sentences.

---

# Progress Status

```text
015 — Stakeholder Priorities and Trade-offs      ✅
016 — Exceptions and Edge Cases                  ✅
017 — Business Rules and Decision Logic          ✅
018 — Requirement vs. Solution                   ✅
019 — Inside vs. Outside System                  ✅
020 — Information Thinking                       ✅ MASTERED
021 — From Business Process to System Model      🚧 CURRENT
022 — From System Model to Solution              ⬜
```

---

# Repository Structure

```text
business-thinking/
│
├── diagrams/
├── examples/
│
├── exercises/
│   ├── 015-stakeholder-priorities-and-trade-offs.md
│   ├── 016-exceptions-and-edge-cases.md
│   ├── 017-business-rules-and-decision-logic.md
│   ├── 018-requirement-vs-solution.md
│   ├── 019-inside-vs-outside-system.md
│   ├── 020-information-thinking.md
│   └── 021-from-business-process-to-system-model.md
│
├── references/
│   ├── 015-stakeholder-priorities-and-trade-offs.md
│   ├── 016-exceptions-and-edge-cases.md
│   ├── 017-business-rules-and-decision-logic.md
│   ├── 018-requirement-vs-solution.md
│   ├── 019-inside-vs-outside-system.md
│   ├── 020-information-thinking.md
│   └── 021-from-business-process-to-system-model.md
│
├── glossary.md
├── README.md
└── ROADMAP.md
```

The exact file names should remain synchronized with the actual repository materials.

---

# File Organization Principle

`ROADMAP.md` is the navigation and progress document.

It should answer:

- Where am I?
- What have I completed?
- What am I learning now?
- What comes next?
- What does each topic teach?
- How does the overall roadmap progress?
- Where are the related files?

Detailed teaching material belongs in:

```text
references/
exercises/
examples/
diagrams/
```

Do not turn `ROADMAP.md` into the complete lesson content.

---

# Progress Rules

The roadmap uses three statuses:

```text
✅ Completed
🚧 Currently Learning
⬜ Upcoming
```

Rules:

- Completed topics remain visible.
- The current topic is explicitly marked.
- Future topics remain upcoming.
- A topic is never marked completed without explicit confirmation.
- The learner never moves forward automatically.
- No topic is skipped.
- Mastery is prioritized over speed.
- When a topic is completed, all affected roadmap sections must be synchronized.

---

# Roadmap Maintenance Rules

Whenever progress changes, synchronize at minimum:

```text
Current Progress
Current Learning Position
Topic Statuses
Phase Statuses
Topic List
Repository Structure
Exercise Files
Reference Files
Mastery Checkpoint
Master Engineering-Thinking Progression
```

The roadmap must not contain conflicting progress information.

```text
Current Progress
        =
Current Learning Position
        =
Current Topic Status
        =
Repository Materials
```

Completed topics must remain visible as part of the learning history.

---

# Master Engineering-Thinking Progression

```text
Business
    ↓
Problem
    ↓
Observation
    ↓
Process
    ↓
People
    ↓
Information
    ↓
Causes
    ↓
Business Rules
    ↓
Requirements
    ↓
System Boundary
    ↓
System Understanding
    ↓
System Model
    ↓
Solution
```

Each stage exists for a reason:

- **Business** — understand the environment.
- **Problem** — identify what needs attention.
- **Observation** — separate facts from assumptions.
- **Process** — understand how work actually happens.
- **People** — identify actors and responsibilities.
- **Information** — identify what is created, used, changed, and communicated.
- **Causes** — investigate why problems occur.
- **Business Rules** — identify constraints, policies, decisions, and conditions.
- **Requirements** — express what the business needs the system to support.
- **System Boundary** — determine what belongs inside and outside the system.
- **System Understanding** — determine what the system is responsible for.
- **System Model** — organize those responsibilities and interactions into a coherent model.
- **Solution** — design an appropriate technical approach.

---

# Current Roadmap Snapshot

```text
Topics 001–014
    └── Completed ✅

015 — Stakeholder Priorities and Trade-offs
    └── Completed ✅

016 — Exceptions and Edge Cases
    └── Completed ✅

017 — Business Rules and Decision Logic
    └── Completed ✅

018 — Requirement vs. Solution
    └── Completed ✅

019 — Inside vs. Outside System
    └── Completed ✅

020 — Information Thinking
    └── Completed / Mastered ✅

021 — From Business Process to System Model
    └── Currently Learning 🚧

022 — From System Model to Solution
    └── Upcoming ⬜
```

---

# Immediate Learning Milestone

**021 — From Business Process to System Model**

The immediate goal is to learn how to construct a system model from the business understanding already developed.

The learner must not move to Topic 022 until Topic 021 has been explicitly reviewed and mastered.

---

# Guiding Principle

> **Understand before you build.**

The objective is not to memorize frameworks or produce technical designs prematurely.

The objective is to develop the habit of entering an unfamiliar problem, understanding the business, identifying responsibilities and information, defining the system boundary, modeling what the system actually owns, and only then moving toward a technical solution.

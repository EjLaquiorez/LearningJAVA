# Business Thinking — Roadmap

## Purpose

Learn how to think like a software engineer before designing or writing software.

The goal is to develop the ability to understand unfamiliar businesses, investigate problems, analyze processes, identify requirements, and reason about systems before deciding on a solution.

---

# Core Learning Principle

We do not jump directly from:

```text
Business Problem
       ↓
Software Solution
```

Instead:

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
Requirements
    ↓
System Understanding
    ↓
Solution
```

---

# Phase 1 — Understanding Problems

## 001 — Problem vs Solution ✅

Learn to distinguish between:

- What the business actually needs
- What the client thinks should be built

Core principle:

> A proposed solution is not automatically the real problem.

---

## 002 — Understanding Businesses Before Software ✅

Learn to understand:

- What the business does
- What value it provides
- Who is involved
- How work happens
- Where problems occur

---

# Phase 2 — Discovering Information

## 003 — Learning to Ask Better Questions ✅

Learn to identify what information is missing before asking questions.

Focus:

```text
Unknown Information
        ↓
Investigation
        ↓
Better Questions
        ↓
Better Understanding
```

---

## 004 — Engineering Information Map ✅

Learn to investigate a business problem using:

```text
Process
People
Data
Pain
Cause
Frequency
Impact
Constraints
Goal
Risks
```

This becomes a reusable engineering framework.

---

## 005 — Client Discovery Conversations ✅

Learn how to have productive conversations with clients and stakeholders.

Focus:

- Understanding the current process
- Clarifying business rules
- Discovering pain points
- Investigating causes
- Identifying constraints
- Understanding goals

---

# Phase 3 — Investigating Problems

## 006 — Cause-and-Effect Thinking ✅

Learn to trace a problem through its consequences and investigate possible causes.

Example:

```text
Orders are cancelled
        ↓
Customers wait too long
        ↓
Delivery is delayed
        ↓
Investigate delivery process
```

Goal:

> Do not stop at the first obvious explanation.

---

## 007 — Observation Before Questions ✅

Learn to observe a process before forming conclusions.

Look for:

- Activities
- Waiting
- Repetition
- Delays
- Manual work
- Decisions
- People
- Information movement

Separate:

```text
FACTS
vs
HYPOTHESES
vs
INVESTIGATIONS
```

---

# Phase 4 — Understanding Processes

## 008 — Decomposition Thinking ✅

Learn to break complex processes into smaller activities.

Example:

```text
Withdraw Money
      ↓
Insert Card
      ↓
Enter PIN
      ↓
Verify PIN
      ↓
Select Transaction
      ↓
Enter Amount
      ↓
Check Balance
      ↓
Dispense Cash
```

Goal:

> Make a process specific enough to understand what is actually happening.

---

## 009 — Bottleneck Thinking ✅

Learn to identify the part of a process that restricts overall performance.

Investigate:

- Processing time
- Queue length
- Capacity
- Staff availability
- Frequency
- Time of day

Core principle:

> Improving a non-bottleneck does not necessarily improve the overall process.

---

## 010 — Process Mapping ✅

Learn to represent a business workflow from beginning to end.

Understand:

- Sequential activities
- Decision points
- Happy paths
- Alternative paths
- Failure paths
- Loops

Core questions:

```text
What happens?
        ↓
What happens next?
        ↓
Can this step fail?
        ↓
What happens if it fails?
        ↓
Can the process repeat?
```

---

# Phase 5 — Modeling Responsibilities

## 011 — Swimlane Thinking ✅

Learn to separate responsibilities between participants.

Participants may include:

- Customers
- Employees
- Departments
- Internal systems
- External systems
- Banks
- Payment systems
- Suppliers

Core question:

> Who actually performs this activity?

---

## 012 — Information Flow ✅

Learn to identify what information moves between participants.

Example:

```text
Customer
    │
    │ Order
    ▼
Restaurant
```

Investigate:

- What information is produced?
- Who receives it?
- Who uses it?
- Where does it change?
- What happens if it is missing?
- What happens if it is incorrect?

---

# Phase 6 — Stakeholder Understanding

## 013 — Stakeholders vs Users 🚧

Learn the difference between:

### Users

People who directly interact with a system.

### Stakeholders

People who are affected by the system or business process, even if they never use the system.

Learn to identify:

- Users
- Owners
- Managers
- Employees
- Customers
- External organizations
- Decision makers

---

## 014 — Stakeholder Goals and Concerns 🚧

For each stakeholder, investigate:

```text
Responsibilities
Goals
Problems
Concerns
```

Understand why different stakeholders may disagree about the same system or process.

---

# Phase 7 — Business Rules

## 015 — Discovering Business Rules 🚧

Learn to identify rules that control how a business operates.

Examples:

```text
Customers cannot cancel after X days.

Only authorized employees can approve refunds.

A student must complete prerequisites before enrollment.

A withdrawal cannot exceed the available balance.
```

Learn to distinguish:

```text
Business Rule
       vs
Software Feature
```

---

## 016 — Exceptions and Edge Cases 🚧

Learn to ask:

> What happens when the normal process does not work?

Investigate:

- Missing information
- Invalid information
- Failed payments
- Unavailable inventory
- Cancellations
- Rejections
- Timeouts
- External system failures

---

# Phase 8 — Requirements Thinking

## 017 — From Observation to Requirements 🚧

Learn how observations become requirements.

```text
Observation
     ↓
Problem
     ↓
Business Need
     ↓
Requirement
```

Avoid jumping directly from an observation to a feature.

---

## 018 — Functional vs Non-Functional Requirements 🚧

Learn to distinguish:

### Functional

What the system must do.

### Non-functional

How well the system must perform.

Examples:

```text
Functional:
The system must allow customers to place orders.

Non-functional:
The system should handle 1,000 concurrent orders.
```

---

# Phase 9 — System Boundaries

## 019 — What Belongs Inside the System? 🚧

Learn to distinguish between:

```text
Business Process
        ↓
Human Activity
        ↓
Internal System
        ↓
External System
```

Understand what the software should and should not be responsible for.

---

## 020 — System Boundaries and External Systems 🚧

Analyze interactions with:

- Payment providers
- Banks
- Suppliers
- Government systems
- Third-party APIs
- Authentication providers

Focus on:

```text
Who communicates with whom?
What information is exchanged?
Why is it exchanged?
What happens when communication fails?
```

---

# Phase 10 — Preparing for Software Design 🚧

## 021 — From Business Process to System Model 🚧

Connect everything learned so far:

```text
Business
   ↓
Problem
   ↓
Process
   ↓
Participants
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
System Model
```

---

## 022 — From System Model to Solution 🚧

Only after understanding the business and requirements do we begin discussing possible technical solutions.

This prepares us for later topics such as:

- APIs
- Databases
- Services
- Components
- Architecture
- Backend systems

---

# Mastery Checkpoint

Before leaving Business Thinking, you should be able to receive a completely unfamiliar business scenario and answer:

### Business

- What does the business do?
- What value does it provide?

### Problem

- What problem is occurring?
- What is fact?
- What is assumption?

### Process

- How does the work happen?
- Can I decompose it?

### People

- Who performs each activity?
- Who uses the system?
- Who are the stakeholders?

### Information

- What information moves through the process?
- Who creates it?
- Who receives it?

### Causes

- What might be causing the problem?
- What evidence do I need?

### Decisions

- Where can the process branch?
- What happens when something fails?

### Performance

- Where is the bottleneck?
- How often does it occur?
- What is its impact?

### Business Rules

- What rules control the process?

### Requirements

- What does the business actually need?

### System Boundary

- What belongs inside the system?
- What belongs outside it?

---

# Final Mental Model

The complete Business Thinking model:

```text
                  BUSINESS
                     │
                     ▼
                  PROBLEM
                     │
                     ▼
                OBSERVATION
                     │
                     ▼
                  PROCESS
                     │
           ┌─────────┼─────────┐
           ▼         ▼         ▼
         PEOPLE     DATA      RULES
           │         │         │
           └─────────┼─────────┘
                     ▼
               CAUSE & EFFECT
                     │
                     ▼
                  DECISIONS
                     │
                     ▼
              ALTERNATIVE FLOWS
                     │
                     ▼
                REQUIREMENTS
                     │
                     ▼
              SYSTEM BOUNDARY
                     │
                     ▼
              SYSTEM UNDERSTANDING
                     │
                     ▼
                SOFTWARE DESIGN
```

---

# Current Progress

```text
Phase 1 — Understanding Problems       ██████████ ✅
Phase 2 — Discovering Information      ██████████ ✅
Phase 3 — Investigating Problems       ██████████ ✅
Phase 4 — Understanding Processes      ██████████ ✅
Phase 5 — Modeling Responsibilities    ██████████ ✅

Phase 6 — Stakeholder Understanding    ███░░░░░░░ 🚧
Phase 7 — Business Rules               ░░░░░░░░░░░
Phase 8 — Requirements Thinking        ░░░░░░░░░░░
Phase 9 — System Boundaries            ░░░░░░░░░░░
Phase 10 — Preparing for Design        ░░░░░░░░░░░
```

---

# Current Learning Position

```text
Phase 6
    ↓
Stakeholder Understanding
    ↓
013 — Stakeholders vs Users
    ↓
Current Topic
```

The next learning topic is:

> **013 — Stakeholders vs Users**

---

# Folder Structure

```text
business-thinking/
│
├── diagrams/
│
├── examples/
│
├── exercises/
│   ├── 001-problem-vs-solution.md
│   ├── 002-understanding-businesses-before-software.md
│   ├── 003-learning-to-ask-better-questions.md
│   ├── 004-engineering-information-map.md
│   ├── 005-client-discovery-conversations.md
│   ├── 006-cause-and-effect-thinking.md
│   ├── 007-observation-before-questions.md
│   ├── 008-decomposition-thinking.md
│   ├── 009-bottleneck-thinking.md
│   ├── 010-process-mapping.md
│   ├── 011-swimlane-thinking.md
│   ├── 012-information-flow.md
│   ├── 013-stakeholders-vs-users.md
│   └── 014-stakeholder-goals-and-concerns.md
│
├── references/
│   ├── 001-problem-vs-solution.md
│   ├── 002-understanding-businesses-before-software.md
│   ├── 003-learning-to-ask-better-questions.md
│   ├── 004-engineering-information-map.md
│   ├── 005-client-discovery-conversations.md
│   ├── 006-cause-and-effect-thinking.md
│   ├── 007-observation-before-questions.md
│   ├── 008-decomposition-thinking.md
│   ├── 009-bottleneck-thinking.md
│   ├── 010-process-mapping.md
│   ├── 011-swimlane-thinking.md
│   ├── 012-information-flow.md
│   ├── 013-stakeholders-vs-users.md
│   └── 014-stakeholder-goals-and-concerns.md
│
├── glossary.md
├── README.md
└── ROADMAP.md
```

---

# Naming Convention

All Business Thinking files follow the same convention:

```text
[number]-[topic-name].md
```

The same topic number and slug should be used across:

```text
references/
exercises/
```

Example:

```text
Topic 009 — Bottleneck Thinking

references/
└── 009-bottleneck-thinking.md

exercises/
└── 009-bottleneck-thinking.md
```

This keeps the learning materials synchronized and makes it immediately clear which exercise and reference belong to each roadmap topic.

---

# Guiding Principle

> **Understand before you build.**

The objective is not to memorize frameworks.

The objective is to develop the habit of entering an unfamiliar problem, breaking it down, identifying what is known and unknown, and reasoning toward a solution systematically.

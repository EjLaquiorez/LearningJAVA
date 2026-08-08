# Business Thinking

## Objective

Learn to think like a software engineer before writing software.

This module focuses on understanding businesses, discovering problems, analyzing processes, identifying causes, and modeling how people and systems interact.

The goal is to develop engineering thinking that can be applied across different industries, companies, technologies, and countries.

---

# Learning Philosophy

Software engineering is not only about writing code.

Before building a solution, an engineer must understand:

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
Causes
   ↓
Requirements
   ↓
Solution
```

We focus on understanding the problem before deciding what to build.

---

# Topics

## 1. Problem vs Solution ✅

Learn to distinguish between:

- The problem the business is experiencing
- The solution the client proposes

Core mental model:

```text
Client Request
      ↓
Problem
      ↓
Root Cause
      ↓
Possible Solutions
      ↓
Software
```

---

## 2. Understanding Businesses Before Software ✅

Learn to understand a business before thinking about technology.

Questions include:

- What does the business do?
- What value does it provide?
- Who is involved?
- How does work happen?
- What information is used?
- Where are the problems?

---

## 3. Learning to Ask Better Questions ✅

Learn how to ask questions that uncover missing information rather than confirm assumptions.

The goal is not to memorize interview questions.

The goal is to identify:

> **What do I need to know before I can make a good engineering decision?**

---

## 4. Engineering Information Map ✅

A reusable framework for analyzing business problems.

```text
1. Process
2. People
3. Data
4. Pain
5. Cause
6. Frequency
7. Impact
8. Constraints
9. Goal
10. Risks
```

The framework helps identify unknown information before proposing solutions.

---

## 5. Client Discovery Conversations ✅

Learn how engineers investigate a business problem through conversation.

Focus areas:

- Understanding the current process
- Clarifying business rules
- Discovering pain points
- Investigating causes
- Identifying constraints
- Understanding desired outcomes

---

## 6. Cause-and-Effect Thinking ✅

Learn to trace problems beyond their obvious symptoms.

Example:

```text
Customers cancel orders
        ↓
Orders arrive late
        ↓
Delivery process is delayed
        ↓
Orders take too long to prepare
        ↓
Investigate the preparation process
```

The goal is to investigate the chain rather than immediately assume a solution.

---

## 7. Observation Before Questions ✅

Learn to observe a process before asking questions.

Observe:

- Activities
- People
- Waiting
- Repetition
- Delays
- Decisions
- Manual work
- Information movement

The engineer identifies what is known, unknown, and assumed.

---

## 8. Decomposition Thinking ✅

Learn to break large processes into smaller activities.

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

Decomposition makes complex processes easier to understand and investigate.

---

## 9. Bottleneck Thinking ✅

Learn to identify the part of a process that limits overall performance.

Investigate using evidence such as:

- Processing time
- Queue length
- Capacity
- Staff availability
- Frequency
- Time of day

Important principle:

> Improving a non-bottleneck does not necessarily improve the overall process significantly.

---

## 10. Process Mapping ✅

Learn to model how work flows from beginning to end.

Process mapping includes:

- Sequential activities
- Decision points
- Alternative paths
- Loops
- Failure paths

Core questions:

```text
What happens?
What happens next?
Can this step fail?
What happens if it fails?
Can the process repeat?
```

---

## 11. Swimlane Thinking ✅

Learn to identify **who performs each activity**.

A normal process map asks:

> What happens?

A swimlane diagram asks:

> What happens, and who does it?

Participants may include:

- Customers
- Employees
- Departments
- Internal systems
- External systems
- Banks
- Payment providers
- Suppliers

---

## 12. Information Flow 🚧

Learn to identify what information moves between participants.

Example:

```text
Customer
    │
    │ Order
    ▼
Restaurant
```

Questions:

- What information is being transferred?
- Who produces it?
- Who receives it?
- Who uses it?
- What happens if the information is missing or incorrect?

---

# Engineering Frameworks

Reusable frameworks are stored in:

```text
references/
```

Current references:

```text
references/
├── 004-engineering-information-map.md
├── 005-client-discovery-conversation.md
├── 006-cause-and-effect-thinking.md
├── 008-decomposition-thinking.md
├── 009-process-mapping.md
├── 011-swimlane-diagrams.md
├── 012-information-flow.md
├── 013-stakeholders-vs-users.md
└── 014-stakeholder-analysis.md
```

These references are designed to be reused across different exercises and business domains.

---

# Exercises

Practical exercises are stored in:

```text
exercises/
```

Current exercises:

```text
001-problem-vs-solution.md
002-bakery-analysis.md
003-atm-analysis.md
004-client-interview-questions.md
005-engineering-information-map.md
006-client-discovery-conversation.md
007-cause-and-effect-thinking.md
008-observation-before-questions.md
009-process-mapping.md
```

The exercises use different business scenarios to practice the same engineering principles.

Examples include:

- Bakery
- ATM
- Pharmacy
- Restaurant
- Supermarket
- Car repair shop
- University
- Library
- Online food ordering
- Payment processing

---

# Diagrams

Visual models are stored in:

```text
diagrams/
```

These will contain reusable visual representations of concepts such as:

- Process flows
- Decision branches
- Swimlanes
- Information flow
- Business workflows

---

# Examples

Reusable business case studies are stored in:

```text
examples/
```

Examples help connect abstract engineering concepts to real-world business situations.

---

# Glossary

Common engineering and business-thinking terms are maintained in:

```text
glossary.md
```

The glossary includes concepts such as:

- Problem
- Solution
- Stakeholder
- User
- Process
- Bottleneck
- Decomposition
- Decision Point
- Alternative Flow
- Swimlane
- Responsibility
- Information Flow

---

# Skills Developed

By completing this module, you are learning to:

- Separate problems from solutions.
- Understand unfamiliar businesses.
- Ask effective questions.
- Identify missing information.
- Separate facts from assumptions.
- Observe business processes.
- Decompose complex workflows.
- Identify bottlenecks.
- Model decision points.
- Model alternative paths.
- Identify loops.
- Identify responsibilities.
- Identify external participants.
- Trace information between participants.
- Think about failure scenarios.
- Communicate business processes clearly.

---

# Current Progress

```text
Business Thinking

██████████████████████░░ 90%

Completed:
✔ Problem vs Solution
✔ Understanding Businesses
✔ Learning to Ask Better Questions
✔ Engineering Information Map
✔ Client Discovery Conversations
✔ Cause-and-Effect Thinking
✔ Observation Before Questions
✔ Decomposition Thinking
✔ Bottleneck Thinking
✔ Process Mapping
✔ Swimlane Thinking

Current:
🚧 Information Flow
```

---

# Current Mental Model

When given a business problem:

```text
1. Understand the Business
          ↓
2. Identify the Problem
          ↓
3. Observe the Process
          ↓
4. Decompose the Process
          ↓
5. Identify People
          ↓
6. Identify Decisions
          ↓
7. Identify Bottlenecks
          ↓
8. Identify Causes
          ↓
9. Identify Information Flow
          ↓
10. Identify Requirements
          ↓
11. Design a Solution
```

We do not jump directly from:

```text
Problem → Software
```

We investigate what happens in between.

---

# What Comes Next

After Information Flow, we will continue developing the ability to understand:

```text
Business Processes
        ↓
Information
        ↓
Requirements
        ↓
System Boundaries
        ↓
Software Design
```

The purpose of this module is to build the thinking habits that will later support:

- Requirements engineering
- System analysis
- System design
- Architecture
- Backend development
- API design
- Database design

---

# Core Principle

> **Understand the problem before designing the solution.**

Good software engineering begins with understanding.
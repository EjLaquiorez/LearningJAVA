# Topic 018 — Requirements vs. Solutions

## Current Roadmap Position

```text
Roadmap B — Software Engineering Mindset
│
├── Phase 1 — Engineering Foundations
│   └── Module 1 — Business Thinking
│       └── Part A
│           ├── Topic 014 — Stakeholder Goals & Concerns ✅
│           ├── Topic 015 — Stakeholder Priorities & Trade-offs ✅
│           ├── Topic 016 — Exceptions & Edge Cases ✅
│           ├── Topic 017 — Business Rules & Decision Logic ✅ MASTERED
│           └── Topic 018 — Requirements vs. Solutions 🚧 CURRENT
```

## Objective

Learn to distinguish **what the business needs** from **how software might solve it**.

The goal is to avoid accepting a stakeholder's requested solution as an automatically correct requirement.

---

# Why This Topic Matters

Stakeholders often describe the solution they want:

> "We need a notification system."

But the underlying business need may be:

> "Customers need to know when their prescription is ready."

The first statement is a **solution**.

The second describes a **business need/requirement**.

An engineer should investigate the need before deciding whether the requested solution is appropriate.

---

# Core Distinction

## Business Requirement / Need

Describes **what the business needs to accomplish**.

Examples:

- Customers must be informed when their prescription is ready.
- Students must not enroll without satisfying the required prerequisite.
- Orders must be paid before food is released.

## Solution

Describes **how software might accomplish the need**.

Examples:

- Build an SMS notification system.
- Add a prerequisite-checking feature.
- Add a payment verification screen.

---

# Mental Model

Do not immediately follow:

```text
REQUEST
   ↓
BUILD IT
```

Instead:

```text
REQUEST
   ↓
PROBLEM / NEED
   ↓
GOAL
   ↓
REQUIREMENT
   ↓
CONSTRAINTS
   ↓
POSSIBLE SOLUTIONS
```

The stakeholder's requested solution is an input for investigation, not automatically the final answer.

---

# Example — Pharmacy

Stakeholder request:

> "We need a notification system."

First investigate:

> Why does the pharmacy need the notification system?

Possible business need:

> Customers need to know when their prescription is ready.

Then investigate the process:

```text
Prescription received
        ↓
Prescription checked
        ↓
Medicine prepared
        ↓
Prescription ready
        ↓
Customer informed
        ↓
Customer pickup
```

Only after understanding the process and requirement should possible solutions be evaluated.

---

# Example — Restaurant

Stakeholder says:

> "Build a mobile ordering app."

An engineer should ask:

> Why does the business want a mobile ordering app?

Possible investigation:

```text
Lunch rush
    ↓
Long ordering queue
    ↓
Customers abandon orders
```

But investigation might reveal:

```text
Ordering is actually fast
        ↓
Kitchen cannot process orders quickly
        ↓
Mobile ordering could increase incoming orders
        ↓
Existing kitchen bottleneck becomes worse
```

Therefore, the requested solution may not solve the real problem.

---

# Important Principle

> **A requested solution is not automatically the correct solution.**

A stakeholder may know what they want built, but the engineer must understand **why it is needed** and whether it addresses the actual business problem.

---

# Requirements vs. Solutions

| Statement | Type |
|---|---|
| Customers must know when their prescription is ready. | Business Requirement / Need |
| Build an SMS notification system. | Solution |
| Students must be prevented from enrolling when prerequisites are not satisfied. | Business Requirement |
| Add prerequisite validation to the enrollment system. | Solution |
| Restaurant customers should spend less time waiting to place an order. | Business Requirement / Goal |
| Build a mobile ordering application. | Solution |

---

# Relationship to Previous Topics

Topic 017 taught:

```text
Business Rule
    ≠
Software Solution
```

Topic 018 extends this:

```text
Business Need / Requirement
    ≠
Software Solution
```

The engineer must understand the business rule, requirement, process, constraints, and actual problem before selecting a solution.

---

# Engineering Questions

When a stakeholder requests a solution, ask:

1. What problem are we trying to solve?
2. Why is this problem important?
3. What business outcome do we want?
4. What does the business need to happen?
5. What constraints exist?
6. What evidence supports the need?
7. Is the requested solution actually capable of addressing the problem?
8. Are there alternative solutions?
9. What would happen if we did nothing?
10. What should success look like?

---

## Status

**Topic:** 018 — Requirements vs. Solutions  
**Status:** 🚧 In Progress  
**Previous Topic:** 017 — Business Rules & Decision Logic ✅ Mastered  
**Next:** Topic 018 Exercises

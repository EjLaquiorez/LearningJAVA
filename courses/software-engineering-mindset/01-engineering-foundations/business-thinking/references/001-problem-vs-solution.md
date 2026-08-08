# 001 — Problem vs Solution

## Purpose

Learn to distinguish between a **business problem** and a **proposed solution**.

Software engineers should not automatically assume that what a client asks to build is the actual problem that needs to be solved.

---

## Core Principle

> A proposed solution is not automatically the real problem.

A client may say:

> "We need a mobile application."

The engineer should not immediately begin designing the application.

Instead, investigate:

```text
Requested Solution
        ↓
What problem is this supposed to solve?
        ↓
What is happening today?
        ↓
Why is it a problem?
        ↓
What causes the problem?
        ↓
What alternatives exist?
        ↓
Possible Solution
```

---

## Problem

A **problem** describes an undesirable situation, limitation, inefficiency, risk, or unmet need.

Examples:

* Customers wait too long.
* Employees repeatedly enter the same information.
* Orders are frequently delayed.
* Managers cannot see current inventory.
* Payment information is sometimes recorded incorrectly.
* Employees spend too much time performing repetitive work.

A problem describes **what is wrong or what needs improvement**.

---

## Solution

A **solution** is a proposed way to address a problem.

Examples:

* Mobile application
* Web application
* Automated notification
* Barcode scanner
* Dashboard
* Payment integration
* Self-service kiosk
* Automated report

A solution describes **what we might build or change to address the problem**.

---

## Problem vs Solution

| Problem                               | Possible Solution   |
| ------------------------------------- | ------------------- |
| Customers wait too long               | Self-service kiosk  |
| Orders are entered incorrectly        | Validation system   |
| Inventory is difficult to track       | Inventory system    |
| Employees repeatedly copy information | Automation          |
| Managers lack visibility              | Dashboard           |
| Customers do not receive updates      | Notification system |

The left side describes the **business situation**.

The right side describes a **possible response**.

---

## Why This Matters

If an engineer accepts the proposed solution too quickly, they may build something that solves the wrong problem.

For example:

```text
Client:
"We need a mobile app."
```

An inexperienced approach:

```text
Mobile App
    ↓
Design Screens
    ↓
Write Code
```

An engineering approach:

```text
"We need a mobile app."
        ↓
Why?
        ↓
What problem exists?
        ↓
How does the current process work?
        ↓
Where does the problem occur?
        ↓
Why does it happen?
        ↓
What outcome does the business actually need?
        ↓
Evaluate possible solutions
```

The difference is **investigation before implementation**.

---

## Example — Restaurant

### Client Request

> "We need a self-service ordering kiosk."

Do not immediately treat the kiosk as the requirement.

Investigate:

```text
Self-Service Kiosk
        ↓
Why is it needed?
        ↓
Customers wait too long
        ↓
Why?
        ↓
Employees manually take every order
        ↓
Why does that cause a delay?
        ↓
Order-taking becomes a bottleneck
        ↓
When?
        ↓
During peak hours
```

The underlying problem may be:

> Order-taking capacity is insufficient during peak hours.

The kiosk may be one possible solution, but it is not automatically the only solution.

---

## The Problem-Solution Separation

Use this distinction:

```text
PROBLEM
What is happening that needs improvement?

        ↓

CAUSE
Why is it happening?

        ↓

GOAL
What should improve?

        ↓

SOLUTION
What could address the problem?
```

Do not skip directly from:

```text
Problem → Solution
```

without understanding the cause and desired outcome.

---

## Questions to Investigate

When someone proposes a solution, ask:

### Current Situation

* What happens today?
* Who performs the work?
* How often does it happen?
* How long does it take?

### Problem

* What is going wrong?
* Who is affected?
* How frequently does it happen?
* What is the impact?

### Cause

* Why is this happening?
* What happens before the problem?
* What conditions make it worse?
* Where does the process become difficult?

### Goal

* What should improve?
* What does success look like?
* What outcome does the business want?

### Constraints

* What cannot change?
* Are there budget constraints?
* Are there regulatory requirements?
* Are there technology limitations?
* Are there operational constraints?

---

## Mental Model

```text
Client Request
      ↓
Separate Solution from Problem
      ↓
Understand Current Situation
      ↓
Identify Problem
      ↓
Investigate Cause
      ↓
Understand Goal
      ↓
Explore Possible Solutions
      ↓
Select Appropriate Solution
```

---

## Engineering Habit

When someone says:

> "We need X."

Train yourself to think:

```text
Why do they need X?
```

Then continue:

```text
What problem does X address?
        ↓
How does the current process work?
        ↓
What is actually going wrong?
        ↓
Why is it happening?
        ↓
What does the business want to achieve?
```

---

## Common Mistakes

### 1. Treating the client's solution as the requirement

```text
"We need a mobile app."
```

does not necessarily mean:

```text
Requirement = Mobile App
```

The real requirement may be:

> Customers need a faster way to submit orders.

---

### 2. Designing before understanding

Starting with:

* Screens
* Buttons
* Database tables
* APIs
* Frameworks
* Classes

before understanding the business process can lead to solving the wrong problem.

---

### 3. Assuming the first explanation is the root cause

Example:

```text
Orders are delayed.
        ↓
"The cashier is too slow."
```

This is a hypothesis, not automatically a fact.

Investigate before concluding.

---

### 4. Assuming one solution is the only solution

A problem can often have multiple possible solutions.

```text
                 ┌── Kiosk
                 │
Problem ─────────┼── Better staffing
                 │
                 ├── Process improvement
                 │
                 └── Software system
```

The engineer should understand the problem before evaluating these options.

---

## Reusable Framework

When receiving a software request, use:

```text
1. What was requested?
        ↓
2. What problem is it supposed to solve?
        ↓
3. What happens today?
        ↓
4. Who is affected?
        ↓
5. Why does the problem happen?
        ↓
6. What is the desired outcome?
        ↓
7. What constraints exist?
        ↓
8. What possible solutions exist?
```

---

## Key Takeaway

> **Understand the problem before committing to the solution.**

A strong software engineer does not simply build what was requested.

They first understand **why it was requested**, **what problem exists**, and **what outcome the business actually needs**.

# Business Thinking Notes

> Module 1 - Engineering Foundations
>
> These are condensed notes from Topics 1–4. Each topic file contains the detailed lesson. This file serves as a quick review of the most important engineering concepts.

---

# Topic 1 — Problem vs Solution

## Core Principle

Clients usually ask for **solutions**.

Engineers discover the **actual problem**.

Never assume the client's requested solution is the best one.

Always ask:

- What problem are we solving?
- Why does it exist?
- Who experiences it?
- Is software actually needed?

### Mental Model

```
Request
    ↓
Problem
    ↓
Root Cause
    ↓
Possible Solutions
    ↓
Best Solution
    ↓
Software
```

### Remember

Software is the implementation of a solution—not the starting point.

---

# Topic 2 — Bakery Analysis

## Core Principle

Before building software:

Understand the business.

### Analyze

- Customers
- Employees
- Products
- Workflow
- Pain Points

### IPO Model

**Input**

- Customer Order
- Product
- Quantity
- Payment

↓

**Process**

- Check inventory
- Calculate total
- Receive payment
- Update stock

↓

**Output**

- Receipt
- Updated Inventory
- Sales Record

### Lesson

Software improves an existing business process.

Never automate something you don't understand.

---

# Topic 3 — ATM Analysis

## Core Principle

Large systems become simple when divided into smaller modules.

### ATM Workflow

```
Insert Card
    ↓
Enter PIN
    ↓
Authenticate
    ↓
Display Menu
    ↓
Perform Transaction
    ↓
Update Account
    ↓
Return Result
```

### Always Identify

Inputs

- Card
- PIN
- Amount

Processes

- Validate
- Compute
- Update
- Record

Outputs

- Cash
- Receipt
- Updated Balance

### Think About Failure

- Wrong PIN
- Insufficient Funds
- Network Failure
- ATM Out of Cash

Professional engineers design for both success and failure.

---

# Topic 4 — Thinking Like an Engineer

## Beginner

```
Problem
    ↓
Code
```

## Engineer

```
Problem
    ↓
Understand
    ↓
Analyze
    ↓
Design
    ↓
Implement
    ↓
Test
    ↓
Improve
```

### Engineering Questions

- What problem exists?
- Why does it exist?
- Who is affected?
- What constraints exist?
- What is success?

### Systems Thinking

Everything is connected.

Changing one feature can affect:

- Inventory
- Reports
- Database
- Customers
- Employees

Always think beyond the current feature.

---

# Engineering Mindset

Before coding, remember:

✓ Understand the business.

✓ Identify the real problem.

✓ Find the root cause.

✓ Design before implementing.

✓ Divide complex systems into modules.

✓ Consider edge cases.

✓ Build software that creates business value.

---

# One Sentence Summary

> "Great software engineers don't begin by writing code—they begin by understanding problems."
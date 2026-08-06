# Decomposition Thinking

## Objective

Learn how software engineers break large, complex problems into smaller, manageable pieces before designing or writing software.

---

# What is Decomposition?

Decomposition is the process of breaking a large problem into smaller problems that are easier to understand and solve.

Instead of trying to solve everything at once, software engineers divide the work into smaller parts.

**Think:**

> Big Problem → Smaller Problems → Individual Tasks

---

# Why Software Engineers Need This

Real businesses are complex.

A restaurant isn't just "serving food."

It involves:

- Customers
- Tables
- Orders
- Kitchen
- Inventory
- Billing
- Payments
- Employees

Trying to understand everything at once becomes overwhelming.

Decomposition allows engineers to study one part at a time.

---

# Mental Model

Imagine building a house.

You don't build the entire house at once.

You divide it into smaller projects:

```
House

├── Foundation
├── Walls
├── Roof
├── Plumbing
├── Electrical
└── Interior
```

Each part is easier to understand and complete.

Software works the same way.

---

# Example 1 — Coffee Shop

Instead of thinking:

> "Build a coffee shop system."

Break it into smaller parts.

```
Coffee Shop

├── Customer Orders
├── Drink Preparation
├── Payments
├── Inventory
├── Employee Management
└── Reports
```

Each part can now be analyzed independently.

---

# Example 2 — University

Instead of thinking:

> "Build a university system."

Break it down.

```
University

├── Admissions
├── Student Records
├── Enrollment
├── Courses
├── Professors
├── Scheduling
├── Grades
└── Tuition
```

Notice that each section solves one business problem.

---

# Example 3 — Airport

Airport operations are extremely large.

```
Airport

├── Flight Scheduling
├── Check-in
├── Security
├── Boarding
├── Baggage
├── Gates
└── Flight Tracking
```

Each department has different responsibilities but contributes to the same overall goal.

---

# Decomposition Process

Whenever you analyze a business, follow this process.

### Step 1

Understand the overall goal.

Example

```
Run a bakery.
```

---

### Step 2

Identify the major business processes.

Example

```
Production
Sales
Inventory
Purchasing
Reporting
```

---

### Step 3

Break each process into smaller tasks.

Example

Sales

```
Take Order

↓

Calculate Total

↓

Receive Payment

↓

Print Receipt

↓

Update Inventory
```

---

### Step 4

Analyze each task individually.

Ask:

- Who performs this task?
- What information is needed?
- What problems occur?
- What business rules apply?

---

# Benefits of Decomposition

- Reduces complexity.
- Makes problems easier to understand.
- Helps identify missing requirements.
- Makes software easier to design.
- Improves communication among team members.

---

# Common Mistakes

## ❌ Jumping into coding

Wrong:

"I'll start creating classes."

Correct:

"I'll first understand the business."

---

## ❌ Looking only at the whole system

Wrong:

"The airport is too complicated."

Correct:

"I'll analyze check-in first."

---

## ❌ Breaking everything into tiny pieces immediately

Too much decomposition can become confusing.

Break problems into meaningful business processes first.

---

# Best Practices

✔ Start with the business goal.

✔ Identify major processes.

✔ Divide processes into smaller tasks.

✔ Study one process at a time.

✔ Combine your understanding later.

---

# Checklist

Before moving to software design, ask yourself:

- What is the main business goal?
- What are the major processes?
- Can each process be analyzed independently?
- Which actors participate in each process?
- What information is required?
- What business rules apply?

---

# Relationship to Other Topics

Decomposition works together with:

- **Problem vs Solution** — Solve one problem at a time.
- **Business Process Analysis** — Break businesses into workflows.
- **Stakeholder Analysis** — Identify who is involved in each process.
- **Requirement Analysis** — Gather requirements for each smaller problem.
- **System Thinking** — Understand how the smaller parts work together.

---

# Summary

Decomposition is the habit of breaking a large business problem into smaller, manageable pieces.

Software engineers do not try to understand an entire system all at once. They first divide it into business processes, then into individual tasks, making complex systems easier to analyze, design, and eventually build.

Master decomposition first, and every future topic—UML, databases, APIs, object-oriented design, and system architecture—becomes much easier to learn.
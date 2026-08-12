# Topic 016 — Exceptions and Edge Cases

## Roadmap Position

- **Phase:** Phase 1 — Engineering Foundations
- **Module:** Module 1 — Engineering Foundations
- **Part:** Part A — Business Thinking
- **Previous Topic:** 015 — Stakeholder Priorities and Trade-offs
- **Current Topic:** 016 — Exceptions and Edge Cases
- **Status:** 🟢 Ready to Begin

---

## Topic Objective

Learn to recognize that real business processes do not always follow the normal or expected path.

An engineer must understand:

- The normal or "happy path"
- What can go wrong
- What happens when expected conditions are not met
- How exceptions affect people, processes, and information
- Why exceptions often reveal important business rules
- Why software should not be designed only around the normal scenario

The goal is not to imagine every possible problem. The goal is to systematically discover meaningful exceptions that the business must handle.

---

# 1. Normal Flow vs. Exception

A business process usually has an expected path.

```text
Customer places order
        ↓
Payment succeeds
        ↓
Order is accepted
        ↓
Staff prepares order
        ↓
Customer receives order
```

This is the **normal flow**.

But real businesses encounter situations such as:

```text
Customer places order
        ↓
Payment fails
        ↓
What happens?
```

Or:

```text
Order accepted
        ↓
Item becomes unavailable
        ↓
What happens?
```

These are **exceptions**.

An exception is a situation where the normal process cannot continue as expected and the business needs a different response.

---

# 2. Edge Case

An **edge case** is a less common or unusual situation that still needs to be considered because it can affect the process or system.

Examples:

- A customer cancels immediately after ordering
- A payment succeeds but the order is not recorded
- A prescription is prepared but never collected
- A student tries to enroll after the deadline
- Two people attempt to update the same record
- A required item becomes unavailable
- A customer provides incomplete information

An edge case does not necessarily mean something has "gone wrong." It may simply be a situation outside the most common path.

---

# 3. Happy Path Is Not Enough

A beginner may model only:

```text
Input
  ↓
Process
  ↓
Success
```

An engineer asks:

- What happens if it fails?
- What happens if information is missing?
- What happens if the user changes their mind?
- What happens if the resource is unavailable?
- What happens if the process happens twice?
- What happens if it happens too late?

This expands our thinking:

```text
                 ┌── Success
                 │
Input → Process ─┼── Failure
                 │
                 ├── Missing information
                 │
                 ├── Cancellation
                 │
                 └── Unavailable resource
```

---

# 4. Exceptions Often Reveal Business Rules

Consider a pharmacy:

> "Customers can pick up prescriptions when they are ready."

That sounds simple.

Now ask:

> What if the prescription is ready but the customer does not arrive?

Possible business rules may exist:

- Hold it for a certain period
- Return it to storage
- Notify the customer again
- Cancel the pickup
- Require reprocessing

The exception exposes a rule that was hidden in the normal process.

```text
Normal process
      ↓
Prescription ready
      ↓
Customer picks up

Exception
      ↓
Customer does not pick up
      ↓
Business must decide what happens
      ↓
Business rule becomes visible
```

---

# 5. Common Exception Categories

When analyzing a process, investigate common categories.

### Missing Information

```text
Required information
        ↓
Not provided
        ↓
Can the process continue?
```

### Invalid Information

```text
Information provided
        ↓
Does not meet requirements
        ↓
What happens?
```

### Failure

```text
Process starts
        ↓
Something fails
        ↓
What happens to the process?
```

### Cancellation

```text
Process started
        ↓
Person changes their mind
        ↓
Can the process be cancelled?
```

### Unavailability

```text
Required resource
        ↓
Not available
        ↓
What alternative exists?
```

### Timing

```text
Action occurs too late
        ↓
Deadline / time window exceeded
        ↓
What happens?
```

### Duplicate Action

```text
Same action occurs twice
        ↓
Should both be accepted?
```

### Unexpected Volume

```text
Normal workload
        ↓
Sudden large workload
        ↓
Can the process handle it?
```

---

# 6. Exception Thinking

Use this mental model:

```text
NORMAL FLOW
    ↓
What should normally happen?
    ↓
EXCEPTION
    ↓
What could prevent that from happening?
    ↓
CONSEQUENCE
    ↓
What happens if it occurs?
    ↓
BUSINESS RESPONSE
    ↓
What should the business do?
    ↓
BUSINESS RULE
    ↓
What rule can we learn from this?
```

---

# 7. Example — Restaurant

Normal process:

```text
Customer orders
      ↓
Kitchen receives order
      ↓
Food prepared
      ↓
Food served
      ↓
Customer pays
```

Now investigate exceptions.

### Exception A — Customer cancels

```text
Customer orders
      ↓
Kitchen receives order
      ↓
Customer cancels
```

Questions:

- Has preparation already started?
- Can the order still be cancelled?
- Who approves the cancellation?
- Is the customer charged?

### Exception B — Ingredient unavailable

```text
Order received
      ↓
Ingredient unavailable
```

Questions:

- Can the customer choose another item?
- Should the order be cancelled?
- Who informs the customer?

### Exception C — Duplicate order

```text
Customer submits order
      ↓
Same order submitted again
```

Questions:

- Should both orders be accepted?
- How is duplication detected?
- What happens to payment?

Notice that we are not designing software yet.

We are discovering **how the business behaves when the normal path breaks**.

---

# 8. Senior Engineer Mental Model

Do not ask only:

> "What happens when everything works?"

Also ask:

> "What happens when reality doesn't match the expected path?"

Use:

```text
Normal
  ↓
Variation
  ↓
Exception
  ↓
Business Response
  ↓
Rule
```

The objective is not to make the system complicated. The objective is to avoid building a system based on an incomplete understanding of the business.

---

# 9. Connection to Previous Topics

Topic 014 taught:

```text
Stakeholder
    ↓
Goals
    ↓
Concerns
```

Topic 015 added:

```text
Priorities
    ↓
Constraints
    ↓
Trade-offs
```

Topic 016 now asks:

```text
Process
    ↓
Normal Flow
    ↓
Exceptions
    ↓
Business Response
    ↓
Business Rules
```

Together:

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
Stakeholder Goals
   ↓
Priorities
   ↓
Constraints
   ↓
Exceptions
   ↓
Business Rules
   ↓
Requirements
```

---

# Key Principle

> **A process is not fully understood until we know what happens when the normal path does not work.**

Do not jump to:

> "The software should handle this."

First ask:

> **"How does the business actually handle this situation?"**

That answer comes before software design.

# Topic 021 — From Business Process to System Model

## Purpose

Learn how to translate business understanding into a clear model of what **our system is responsible for doing**.

This topic continues the reasoning developed in Topics 018–020:

```text
Requirement vs. Solution
        ↓
Inside vs. Outside System
        ↓
Information Thinking
        ↓
System Model
```

The goal is not to design technology yet.

---

# 1. Core Learning Principle

> **Understand the system before designing the solution.**

Do not jump directly from:

```text
Business request
    ↓
Code / Database / API / Framework
```

Instead:

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
Business Rules
    ↓
Requirements
    ↓
System Boundary
    ↓
System Responsibilities
    ↓
System Model
    ↓
Solution
```

The system model is the bridge between **business understanding** and **technical solution design**.

---

# 2. What Is a System Model?

A system model is a structured description of:

- what our system is responsible for;
- what information it receives and produces;
- which actors or external systems interact with it;
- what responsibilities remain outside it;
- and how the system supports the business process.

It should be based on what we have learned about the business.

It should **not** be invented from technical preferences.

---

# 3. Business Process vs. System Model

A business process describes what happens in the business.

Example:

```text
Customer
    ↓
Places order
    ↓
Kitchen
    ↓
Prepares food
    ↓
Customer
    ↓
Receives order
```

A system model asks:

```text
What does OUR system need to do
to support this process?
```

For example:

```text
Restaurant System
    ↓
Records order
    ↓
Receives preparation status
    ↓
Uses status when determining cancellation eligibility
```

The business process and system model are related, but they are not the same thing.

---

# 4. From Business Activity to System Responsibility

Use this reasoning chain:

```text
Business Activity
        ↓
Who performs it?
        ↓
What is their responsibility?
        ↓
Does our system perform/support it?
        ↓
What exact responsibility belongs to our system?
```

Example:

```text
Business activity:
Customer places an order

Actor:
Customer

Customer responsibility:
Provide the order

System responsibility:
Record the submitted order
```

Do not say:

> "The system handles the order."

That is too broad.

Instead identify the specific responsibility.

---

# 5. System Responsibilities

A system responsibility describes **what the system must do**.

Examples:

```text
Record an order
Check whether required documents are present
Receive preparation status
Determine whether cancellation is allowed
Record enrollment status
Make current status available to the student
```

A good system responsibility should be:

- specific;
- connected to a business need;
- within the system boundary;
- supported by the known scenario;
- independent of a particular technical implementation.

---

# 6. Responsibility vs. Implementation

Do not confuse:

```text
System responsibility
```

with:

```text
Implementation
```

Example:

```text
Responsibility:
The system must make the current appointment status
available to the patient.
```

Possible implementation:

```text
Website
Mobile application
SMS
Email
API
```

The implementation describes **how**.

The responsibility describes **what**.

At this stage, focus on the responsibility.

---

# 7. System Boundary

The system boundary separates:

```text
OUR SYSTEM
```

from:

```text
OUTSIDE THE SYSTEM
```

For example:

```text
Customer
    ↓
[ OUTSIDE ]
    ↓
Restaurant System
    ↓
[ INSIDE ]
    ↓
Kitchen System
    ↓
[ OUTSIDE ]
```

The boundary is not determined by whether software exists.

An external system can still be software.

The question is:

> **Does this responsibility belong to our system?**

---

# 8. Information Crossing the Boundary

Our system often needs information produced outside it.

Example:

```text
Kitchen System
      ↓
Preparation Status
      ↓
SYSTEM BOUNDARY
      ↓
Restaurant System
      ↓
Uses Preparation Status
```

Remember:

> **Needing information does not mean owning the responsibility that produces it.**

A system can:

- receive information;
- store information;
- use information;
- produce information;

without owning every responsibility related to that information.

---

# 9. Responsibility vs. Information

These are different questions.

### Responsibility

> What must the system do?

### Information

> What must the system know in order to do it?

Example:

```text
Responsibility:
Determine whether cancellation is allowed.

Information needed:
Whether the order has been paid.
Whether preparation has started.
```

The information supports the responsibility.

It does not replace the responsibility.

---

# 10. Information Source vs. Information User

The system using information does not necessarily produce it.

Example:

```text
Kitchen System
    ↓
Updates preparation status
    ↓
Restaurant System
    ↓
Receives preparation status
    ↓
Uses it to determine cancellation eligibility
```

Separate:

```text
Producer
    ≠
User
```

Also:

```text
Producer
    ≠
Decision owner
```

---

# 11. Business Decision vs. System Responsibility

Do not automatically transfer a business decision to the system.

Example:

```text
System
    ↓
Checks whether required documents are present

Registrar
    ↓
Reviews application
    ↓
Approves / Rejects
```

Checking information is not automatically the same as making the business decision.

Before transferring a decision into the system, investigate:

- who currently owns the decision;
- what rules are used;
- what information is considered;
- what exceptions exist;
- who has authority;
- who remains accountable.

---

# 12. Requirements → System Responsibilities

A requirement describes what is needed.

A system responsibility describes what our system must do to support that requirement.

Example:

```text
Requirement:
Students must be able to see their enrollment status.

System responsibilities:
Record the enrollment status.
Make the current status available to students.
```

The responsibility should be derived from the requirement and business understanding.

Do not immediately jump to:

```text
Build a dashboard.
Create an API.
Send an SMS.
```

Those are implementation choices.

---

# 13. Modeling Information Flow

When information crosses the system boundary, ask:

```text
Who produces it?
        ↓
What information is produced?
        ↓
Does it cross our boundary?
        ↓
Who receives it?
        ↓
What does our system do with it?
```

Example:

```text
Kitchen System
    ↓
Preparation Status
    ↓
[ Boundary ]
    ↓
Restaurant System
    ↓
Uses status
    ↓
Determines cancellation eligibility
```

Do not invent the technical mechanism yet.

For example, do not assume:

- API;
- webhook;
- database;
- message queue;
- HTTP request.

Those belong to later solution design.

---

# 14. Unknowns Are Part of the Model

A good engineer does not fill gaps with assumptions.

Use:

> **We don't know whether...**

Examples:

```text
We don't know whether the payment status comes from
the payment system or another source.

We don't know whether preparation status can be changed
manually.

We don't know whether a cancellation can be overridden.

We don't know whether additional information is required
to determine cancellation eligibility.
```

Unknown information becomes an investigation item.

---

# 15. System Modeling Checklist

Before considering the system model complete, ask:

```text
□ What business activity are we supporting?

□ Who performs each business activity?

□ What responsibility does each actor own?

□ Which responsibilities belong to our system?

□ Which responsibilities remain outside?

□ What information does our system need?

□ Who produces that information?

□ Where does the information cross the boundary?

□ What does our system do with the information?

□ What business rules affect the responsibility?

□ What decisions remain with humans or external actors?

□ What do we still not know?

□ Have we avoided implementation details?
```

---

# 16. Topic 021 Mental Model

Keep this model:

```text
Business Activity
        ↓
Actor
        ↓
Responsibility
        ↓
Information
        ↓
Business Rule
        ↓
Requirement
        ↓
System Boundary
        ↓
System Responsibility
        ↓
Information Flow
        ↓
System Model
        ↓
Solution
```

The key transition is:

```text
"What happens in the business?"
             ↓
"What does OUR system actually need to do?"
```

---

# 17. Common Mistakes

## Mistake 1 — "The system handles everything"

Too broad.

Instead:

```text
Record order
Receive status
Check required information
Determine eligibility
Record decision
```

Identify each responsibility separately.

---

## Mistake 2 — "Software can do it, so it belongs inside"

Incorrect reasoning.

Use:

```text
Who owns the responsibility?
        ↓
What does the business currently do?
        ↓
Has the responsibility been assigned to our system?
```

---

## Mistake 3 — Confusing information with responsibility

```text
Needs preparation status
        ≠
Must update preparation status
```

---

## Mistake 4 — Confusing information source with information user

```text
Kitchen System
    → produces preparation status

Restaurant System
    → uses preparation status
```

---

## Mistake 5 — Jumping into implementation

Avoid:

```text
API
Database
Webhook
Framework
Class
Endpoint
UI
```

until the system responsibility is understood.

---

# 18. Final Principle

> **A system model should be derived from business understanding, not from technology preferences.**

The engineer's job is not:

> "What software can we build?"

The better question is:

> **"What does the business require our system to be responsible for, and what information must cross its boundary for it to perform those responsibilities?"**

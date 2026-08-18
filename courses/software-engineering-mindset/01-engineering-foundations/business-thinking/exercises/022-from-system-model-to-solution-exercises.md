# Topic 022 — From System Model to Solution — Exercises

## Roadmap B — Software Engineering Mindset

**Phase:** Phase 1 — Engineering Foundations  
**Module:** Module 1 — Business Thinking  
**Topic:** 022 — From System Model to Solution

## Exercise Rules

1. Separate known information from unknown information.
2. Do not invent requirements.
3. Do not jump directly to technology.
4. When asked for a solution, consider multiple options.
5. Explain **why**, not only **what**.
6. Keep these concepts separate:
   - responsibility
   - requirement
   - capability
   - solution
   - implementation
7. When information is insufficient, say:
   > **Needs investigation.**

---

# Exercise 022.01 — Responsibility or Solution?

Choose one:

```text
A. Business Activity
B. System Responsibility
C. Requirement / Capability
D. Solution
E. Implementation Detail
F. Unknown / Needs Investigation
```

### 1.
> "The system must determine whether an order is eligible for cancellation."

Type:
```text
________________________________
```

Why:
```text
________________________________
________________________________
```

### 2.
> "The system should retrieve preparation status from the kitchen system."

Type:
```text
________________________________
```

Why:
```text
________________________________
________________________________
```

### 3.
> "Use a REST API to retrieve preparation status."

Type:
```text
________________________________
```

Why:
```text
________________________________
________________________________
```

### 4.
> "The system must use current preparation status when evaluating cancellation eligibility."

Type:
```text
________________________________
```

Why:
```text
________________________________
________________________________
```

### 5.
> "Store preparation_status in a PostgreSQL database column."

Type:
```text
________________________________
```

Why:
```text
________________________________
________________________________
```

---

# Exercise 022.02 — Find the Premature Solution

Scenario:

> A restaurant wants the ordering system to determine whether an order can be cancelled. The decision depends on payment status and preparation status.

An engineer immediately says:

> "We should build a microservice with a PostgreSQL database and Kafka."

### 1. Did the engineer start from the system responsibility or from a solution?

```text
________________________________
```

Why?

```text
________________________________
________________________________
```

### 2. What does the scenario actually establish?

```text
Known:
1. ______________________________
2. ______________________________
3. ______________________________
```

### 3. What important information is still unknown?

```text
Unknown:
1. ______________________________
2. ______________________________
3. ______________________________
```

### 4. Why is choosing the architecture immediately premature?

```text
________________________________
________________________________
________________________________
```

---

# Exercise 022.03 — Responsibility → Capability

Scenario:

> A university Enrollment System determines whether a student can enroll. The decision requires confirmed payment and available seats.

### System Responsibility

> Determine whether the student is eligible to enroll.

### Required capabilities

```text
1. The system must ______________________________

2. The system must ______________________________

3. The system must ______________________________

4. The system must ______________________________
```

Do not name technologies yet.

---

# Exercise 022.04 — Generate Solution Options

Scenario:

> The Enrollment System needs current seat availability from the Registrar's Office.

Generate at least three solution options.

### Option A
```text
________________________________
```

### Option B
```text
________________________________
```

### Option C
```text
________________________________
```

For each option, explain how it supports the system responsibility.

---

# Exercise 022.05 — Compare Trade-offs

Use your options from 022.04.

| Option | Advantage | Disadvantage / Risk |
|---|---|---|
| A | __________________ | __________________ |
| B | __________________ | __________________ |
| C | __________________ | __________________ |

### Question

Which option would you choose based only on the current information?

```text
________________________________
```

Why?

```text
________________________________
________________________________
```

If there is not enough information:

```text
Answer:
Needs investigation.

Missing information:
________________________________
________________________________
```

---

# Exercise 022.06 — Known, Unknown, Assumption

Scenario:

> The Restaurant System needs preparation status from the Kitchen System. The scenario does not explain how the information is transferred.

### 1.
> "The Restaurant System needs preparation status."

```text
Known / Unknown / Assumption:
________________________________
```

### 2.
> "The Kitchen System produces preparation status."

```text
Known / Unknown / Assumption:
________________________________
```

### 3.
> "The Kitchen System sends preparation status through a REST API."

```text
Known / Unknown / Assumption:
________________________________
```

### 4.
> "The system needs a REST API."

```text
Known / Unknown / Assumption:
________________________________
```

### 5. What should the engineer do when the transfer mechanism is unknown?

```text
________________________________
________________________________
```

---

# Exercise 022.07 — Requirements vs. Solutions

### Pair 1

A.
> "The system must obtain current preparation status."

B.
> "The system should call the Kitchen API."

```text
Requirement / Capability:
________________________________

Solution:
________________________________
```

Why?

```text
________________________________
________________________________
```

### Pair 2

A.
> "The system must allow authorized staff to approve refunds."

B.
> "Build an approval screen with role-based access control."

```text
Requirement / Capability:
________________________________

Solution:
________________________________
```

Why?

```text
________________________________
________________________________
```

---

# Exercise 022.08 — Solution Choice Requires Constraints

Scenario:

> A hospital system needs to receive laboratory results. The results must be available to doctors before treatment decisions are made.

Options:

```text
A. Receive results immediately when the laboratory publishes them.
B. Synchronize results every 30 minutes.
C. Let doctors request the latest result when needed.
```

### 1. What need is common to all three?

```text
________________________________
________________________________
```

### 2. What important constraint or quality need appears?

```text
________________________________
________________________________
```

### 3. Which option appears most suitable based on the current scenario?

```text
________________________________
```

### 4. Why?

```text
________________________________
________________________________
```

### 5. What would you still investigate?

```text
1. ______________________________
2. ______________________________
3. ______________________________
```

---

# Exercise 022.09 — Do Not Invent Requirements

Scenario:

> A company wants a system that records customer orders.

An engineer says:

> "The system needs microservices because the company will eventually have millions of users."

### 1. Is "millions of users" established?

```text
Yes / No:
________________________________
```

### 2. Is microservices a requirement?

```text
Yes / No:
________________________________
```

### 3. What should the engineer do instead?

```text
________________________________
________________________________
________________________________
```

### 4. What evidence would be useful before an architectural decision?

```text
________________________________
________________________________
________________________________
```

---

# Exercise 022.10 — External Dependency

Scenario:

> The Restaurant System owns the responsibility of determining cancellation eligibility. Preparation status is produced by the Kitchen System.

The Kitchen System becomes temporarily unavailable.

### 1. What responsibility does the Restaurant System still own?

```text
________________________________
```

### 2. What dependency is unavailable?

```text
________________________________
```

### 3. Does this automatically transfer the cancellation responsibility to the Kitchen System?

```text
Yes / No:
________________________________
```

Why?

```text
________________________________
________________________________
```

### 4. What should an engineer investigate before deciding system behavior?

```text
1. ______________________________
2. ______________________________
3. ______________________________
4. ______________________________
```

---

# Exercise 022.11 — Solution Decision

Scenario:

> A university Enrollment System must determine whether a student is eligible to enroll. It needs payment confirmation and seat availability. Payment status is available immediately. Seat availability can either be received in real time or synchronized every 15 minutes.

## Option A — Real-time updates

Advantages:
```text
________________________________
________________________________
```

Disadvantages:
```text
________________________________
________________________________
```

## Option B — 15-minute synchronization

Advantages:
```text
________________________________
________________________________
```

Disadvantages:
```text
________________________________
________________________________
```

### Decision

```text
________________________________
```

### Reason

```text
________________________________
________________________________
________________________________
```

### What assumption are you making?

```text
________________________________
```

### What should you investigate to validate it?

```text
________________________________
________________________________
```

---

# Exercise 022.12 — Full Engineering Reasoning

Scenario:

> A pharmacy system must determine whether a prescription can be dispensed. The business rule requires a valid prescription and sufficient inventory. Prescription validity is provided by the prescribing system. Inventory status is maintained by the pharmacy inventory system.

The pharmacy system currently receives inventory information every hour.

A stakeholder says:

> "Let's just make the inventory update real-time."

Do not accept the proposed solution immediately.

### 1. System responsibility

```text
________________________________
```

### 2. Information needed

```text
1. ______________________________
2. ______________________________
```

### 3. Information producers

```text
Prescription validity:
________________________________

Inventory status:
________________________________
```

### 4. Current solution

```text
________________________________
```

### 5. Proposed solution

```text
________________________________
```

### 6. What business question must be answered before choosing?

```text
________________________________
________________________________
```

### 7. What could go wrong if hourly inventory is too stale?

```text
________________________________
________________________________
```

### 8. What trade-off might real-time updates introduce?

```text
________________________________
________________________________
```

### 9. What additional information should be investigated?

```text
1. ______________________________
2. ______________________________
3. ______________________________
```

### 10. Should the engineer immediately choose real-time updates?

```text
Yes / No:
________________________________
```

Why?

```text
________________________________
________________________________
```

---

# Exercise 022.13 — Final Integration

Complete:

```text
Business Need
      ↓
________________________________
      ↓
System Responsibility
      ↓
________________________________
      ↓
Required Information
      ↓
________________________________
      ↓
Constraints
      ↓
________________________________
      ↓
Solution Options
      ↓
________________________________
      ↓
Trade-offs
      ↓
________________________________
      ↓
Solution Decision
      ↓
________________________________
```

Then explain the chain:

```text
________________________________
________________________________
________________________________
________________________________
```

---

# Mastery Checkpoint — Topic 022

```text
[ ] I can distinguish system responsibility from solution.

[ ] I can identify premature technology decisions.

[ ] I can translate responsibilities into capabilities.

[ ] I can separate facts, unknowns, and assumptions.

[ ] I can identify constraints affecting solution choice.

[ ] I can generate multiple solution options.

[ ] I can compare options using trade-offs.

[ ] I can explain why a solution is appropriate.

[ ] I can avoid inventing requirements.

[ ] I can reason about external dependencies.

[ ] I can move from system model toward solution design.

[ ] I can explain my reasoning in clear sentences.
```

---

# Final Challenge

Explain:

> **"A good engineer does not start by asking what technology to use. The engineer first understands what the system must accomplish, what constraints exist, what options are possible, and why one option is more appropriate than another."**

Your explanation:

```text
________________________________
________________________________
________________________________
________________________________
```

# Mastery Principle

```text
Do not start with:
"What technology should we use?"

Start with:
"What must the system accomplish?"

Then:
"What does it depend on?"

Then:
"What constraints exist?"

Then:
"What options could satisfy the need?"

Then:
"What are the trade-offs?"

Finally:
"Why is this solution appropriate?"
```

**Understand → Model → Evaluate → Choose → Build**

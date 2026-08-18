# Topic 022 — From System Model to Solution

## Roadmap B — Software Engineering Mindset

**Phase:** Phase 1 — Engineering Foundations  
**Module:** Module 1 — Business Thinking  
**Topic:** 022 — From System Model to Solution

## Learning Objective

Learn how to move from a clear **system model** toward a possible **software solution** without jumping prematurely to technology, code, databases, APIs, or frameworks.

```text
Business Understanding
        ↓
System Model
        ↓
System Responsibilities
        ↓
Requirements / Capabilities
        ↓
Constraints
        ↓
Solution Options
        ↓
Trade-offs
        ↓
Solution Decision
        ↓
Technical Design
        ↓
Implementation
```

> **A solution should be derived from the system model, not invented before the problem is understood.**

## 1. Where Topic 022 Begins

Topic 021 answered:

> **What is the system responsible for?**

Topic 022 asks:

> **What solution could support those responsibilities?**

The transition is:

```text
System Responsibility
        ↓
What capability is needed?
        ↓
What solution options could provide it?
        ↓
What constraints apply?
        ↓
What trade-offs exist?
        ↓
Which option best fits?
```

## 2. System Responsibility vs. Solution

A system responsibility describes **what the system must do**.

A solution describes **how the system could support it**.

Example:

```text
Responsibility:
Determine whether an order is eligible for cancellation.

Possible solutions:
A. Evaluate the rule inside the ordering system.
B. Use a dedicated decision component.
C. Use an external rule service.
```

The responsibility stays the same while the possible solutions differ.

## 3. Requirements / Capabilities as the Bridge

Translate a responsibility into required behavior before choosing technology.

Example:

```text
Responsibility:
Determine cancellation eligibility.

Capabilities:
- receive a cancellation request
- obtain payment status
- obtain preparation status
- evaluate the cancellation rule
- communicate the decision
```

Then:

```text
Responsibility
      ↓
Required Behavior
      ↓
Required Capability
      ↓
Solution Options
```

## 4. Generate Multiple Solution Options

There is rarely only one possible solution.

If a system needs preparation status, possible approaches could include:

```text
Option A:
Kitchen system sends updates.

Option B:
Restaurant system requests status when needed.

Option C:
A shared integration service provides the status.
```

Do not immediately select one. First investigate:

- What does the business require?
- How current must the information be?
- How frequently is it needed?
- What systems already exist?
- Who owns the information?
- What happens when information is unavailable?
- What constraints apply?

## 5. Constraints Affect Solution Choice

A technically possible solution is not automatically the appropriate solution.

Consider:

```text
Business Need
+
Business Constraints
+
Technical Constraints
+
Operational Constraints
+
Existing Environment
        ↓
Solution Choice
```

Examples:

**Business**
- Must follow existing rules.
- Must preserve required approvals.
- Must support auditability.

**Technical**
- Must integrate with existing systems.
- Must work within the available environment.

**Operational**
- Failures must be recoverable.
- Staff must be able to operate the process.
- Important decisions may need traceability.

**Resources**
- Limited time.
- Limited budget.
- Existing systems may need to remain.

## 6. Trade-offs

Different solutions can satisfy the same need while creating different consequences.

Example:

```text
Real-time integration
Pros:
- More current information
- Faster decisions

Cons:
- Greater dependency on another system
- Integration failures can affect decisions
```

```text
Periodic synchronization
Pros:
- Less direct dependency
- Simpler interaction pattern

Cons:
- Information may become stale
- Decisions may use older information
```

The engineer evaluates the trade-offs against the actual business need.

## 7. Solution Selection

A strong engineering decision can be explained as:

```text
Requirement
     ↓
Constraints
     ↓
Possible Options
     ↓
Trade-offs
     ↓
Evaluation
     ↓
Decision
     ↓
Reason
```

The goal is not merely to name the chosen technology. The goal is to explain **why the selected option fits**.

## 8. Do Not Invent Requirements

Avoid:

```text
Engineer prefers technology X
        ↓
Invents requirement
        ↓
Uses technology X
```

Instead:

```text
Known business need
        ↓
Known responsibility
        ↓
Known constraints
        ↓
Known quality needs
        ↓
Evaluate solutions
```

Unknown information remains unknown until investigated.

## 9. Business/System Statement vs. Solution

Compare:

> **The system must obtain current preparation status.**

This describes a requirement/capability.

Versus:

> **The system should call the Kitchen API.**

This proposes a solution.

The first answers **what is needed**.

The second proposes **how to achieve it**.

## 10. Solution Does Not Mean Code Yet

Solution thinking can happen at several levels:

```text
Business/System Solution
        ↓
System Architecture
        ↓
Integration Design
        ↓
Technical Design
        ↓
Implementation
```

Topic 022 focuses on the reasoning transition from **system model to solution direction**. It does not require immediately writing code.

## 11. Known vs. Unknown vs. Assumption

Example:

```text
Known:
The Restaurant System needs preparation status.

Known:
Kitchen Staff owns the preparation-status update.

Unknown:
How the information reaches the Restaurant System.

Possible solution:
Use real-time integration.
```

The last statement is a **solution option**, not an established requirement.

## 12. Solution Evaluation Questions

Before selecting a solution, ask:

1. What responsibility must the solution support?
2. What information does it depend on?
3. Who owns that information?
4. What business rules must it respect?
5. What requirements/capabilities must it satisfy?
6. What constraints apply?
7. What solution options exist?
8. What are the advantages and disadvantages?
9. What happens when dependencies fail?
10. What assumptions are being made?
11. What still needs investigation?
12. Why is the selected option appropriate?

## 13. Mental Model

```text
Business Understanding
        ↓
System Model
        ↓
System Responsibilities
        ↓
Requirements / Capabilities
        ↓
Constraints
        ↓
Solution Options
        ↓
Trade-offs
        ↓
Solution Decision
        ↓
Technical Design
        ↓
Implementation
```

Remember:

```text
WHAT
 ↓
WHY
 ↓
CONSTRAINTS
 ↓
OPTIONS
 ↓
TRADE-OFFS
 ↓
DECISION
 ↓
HOW
```

## 14. Common Beginner Mistakes

### Mistake 1 — Choosing technology first

> "Let's use Java/Spring/PostgreSQL."

The engineer has not yet established what the solution needs.

### Mistake 2 — Treating a solution as the requirement

> "The system needs an API."

The underlying need may actually be:

> "The system must obtain current preparation status."

### Mistake 3 — Assuming familiarity means suitability

A familiar technology is not automatically the best solution.

### Mistake 4 — Ignoring external dependencies

Consider availability, timeliness, failure, ownership, consistency, and recovery.

### Mistake 5 — Inventing missing requirements

Investigate first instead of creating requirements to justify a preferred technology.

## 15. Connection to the Roadmap

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
        ↓
022 — From System Model to Solution
```

Topic 021 answered:

> **What is the system responsible for?**

Topic 022 asks:

> **What solution could support those responsibilities?**

## 16. Mastery Standard

Topic 022 is mastered when you can:

- distinguish responsibility from solution
- recognize premature technology decisions
- translate responsibilities into capabilities
- separate facts, unknowns, and assumptions
- identify constraints
- generate multiple solution options
- compare options using trade-offs
- explain why a solution was selected
- avoid inventing requirements
- reason about external dependencies
- move from system model toward solution design
- explain your reasoning clearly

## Final Principle

> **Do not ask "What technology should we use?" first.**
>
> Ask:
>
> **"What must the system accomplish, what constraints exist, what options could satisfy those needs, and why would we choose one option over another?"**

**Understand → Model → Evaluate → Choose → Build**

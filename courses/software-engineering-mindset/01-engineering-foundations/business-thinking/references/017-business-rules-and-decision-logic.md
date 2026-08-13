# 017 — Business Rules and Decision Logic

## Current Progress

```text
Roadmap B — Software Engineering Mindset
└── Phase 1 — Engineering Foundations
    └── Module 1 — Engineering Foundations
        └── Part A — Business Thinking
            ├── 014 — Stakeholder Goals and Concerns        ✅
            ├── 015 — Stakeholder Priorities and Trade-offs ✅
            ├── 016 — Exceptions and Edge Cases             ✅
            └── 017 — Business Rules and Decision Logic     🚧 CURRENT
```

**Status:** 🚧 In Progress  
**Previous Topic:** 016 — Exceptions and Edge Cases  
**Current Topic:** 017 — Business Rules and Decision Logic

---

# Objective

Learn how to identify, express, validate, and reason about **business rules** without immediately turning them into software requirements or solutions.

The goal is to understand:

- What the business requires
- What the business prohibits
- What the business allows
- What conditions affect business decisions
- How exceptions modify normal rules
- How to confirm a suspected rule with stakeholders
- How business rules differ from processes and software solutions

---

# Why This Topic Matters

Software often exists to enforce or support business rules.

If an engineer misunderstands the rule, the software may correctly implement the **wrong business behavior**.

For example:

> "Build a system that blocks expired prescriptions."

This is a **software solution**.

The underlying business rule might be:

> "An expired prescription must not be dispensed."

The engineer must understand the rule before deciding how software should enforce it.

---

# Core Mental Model

```text
Business Situation
        ↓
What decision needs to be made?
        ↓
What condition affects the decision?
        ↓
What does the business require,
allow, or prohibit?
        ↓
Business Rule
        ↓
Possible Process / System Behavior
        ↓
Possible Software Solution
```

Do not reverse this process by starting with a requested feature.

---

# 1. What Is a Business Rule?

A **business rule** is a policy, condition, restriction, or requirement that determines how a business operates or makes decisions.

A useful question is:

> **What must, may, or must not happen?**

### Examples

**Pharmacy**

> A prescription must be verified before medicine is released.

**University**

> A student must not enroll in a subject if the required prerequisite has not been completed.

**Restaurant**

> A customer may request an approved substitute when an ordered ingredient is unavailable.

**Hospital**

> A patient may only be reassigned to another doctor when the replacement doctor is qualified to handle the appointment.

These describe business behavior, not software features.

---

# 2. Business Rule vs. Software Solution

### Business Rule

Describes **what the business requires, allows, or prohibits**.

> Customers must be notified when their prescription is ready for pickup.

### Software Solution

Describes **one possible way software could support that rule**.

> Build a notification system that sends customers a message when their prescription is ready.

The solution may change.

The business rule may remain.

```text
Business Rule
     ↓
Possible Process
     ↓
Possible Software Solution
```

Never assume that a requested software feature is automatically the correct implementation of the business rule.

---

# 3. Business Rule vs. Process

A process describes **what happens**.

Example:

```text
Prescription received
        ↓
Prescription verified
        ↓
Medicine prepared
        ↓
Customer notified
        ↓
Customer picks up
```

A business rule describes **what governs those actions**.

Example:

> A prescription must be verified before medicine can be released.

Think:

```text
PROCESS
"What happens?"
        ↓
BUSINESS RULE
"What governs what happens?"
```

Both are important, but they answer different questions.

---

# 4. Three Useful Business Rule Forms

## MUST

Something is required.

> A payment **must be verified** before an order is confirmed.

Pattern:

```text
[Something] must [condition/action].
```

---

## MUST NOT

Something is prohibited.

> A student **must not enroll** in a course without completing its prerequisite.

Pattern:

```text
[Something] must not [condition/action].
```

---

## MAY / CAN

Something is permitted under a condition.

> A customer **may request a substitute** when an ordered ingredient is unavailable.

Pattern:

```text
[Something] may/can [action] when [condition].
```

These forms help make business rules precise and easier to discuss with stakeholders.

---

# 5. How to Discover a Business Rule

Do not ask:

> "What rule should I invent?"

Instead ask:

> **"What decision does the business need to make?"**

Then investigate.

```text
Situation
    ↓
Decision that needs to be made
    ↓
Condition affecting the decision
    ↓
Business policy
    ↓
Candidate Business Rule
    ↓
Confirm with stakeholder
```

### Example

A student wants to enroll in Advanced Java but has not completed the prerequisite.

Ask:

> What decision does the university need to make?

Possible decisions:

- Reject enrollment
- Allow enrollment
- Require approval
- Allow conditional enrollment

Then ask the registrar what the actual policy is.

If the registrar says:

> Students cannot enroll unless the prerequisite has been completed.

The business rule becomes:

> **A student must complete the required prerequisite before enrolling in the course.**

---

# 6. Candidate Rules vs. Confirmed Rules

An engineer may identify a **possible rule** from the situation.

That does not mean the rule is confirmed.

Example:

```text
Situation:
Customer does not pick up medicine.

Possible rule:
"Unclaimed prescriptions are cancelled after 7 days."
```

This is only a **candidate rule** until the pharmacy confirms:

- How long prescriptions are kept
- Whether they are cancelled
- Whether customers receive reminders
- Whether exceptions are allowed
- What happens to the prepared medicine

A strong engineer can say:

> "I don't have enough information to confirm the business rule yet."

That is better than inventing a policy.

---

# 7. Business Rules and Exceptions

A business rule may have exceptions.

Example:

> Students must not drop a course after the deadline.

Possible exception:

> An administrator may approve a late withdrawal under specific circumstances.

So:

```text
Normal Rule
    ↓
Student cannot drop after deadline
    ↓
Exception
    ↓
Administrator-approved special case
```

When discovering rules, always ask:

> **Are there exceptions to this rule?**

This prevents the engineer from turning a general policy into an overly rigid system requirement.

---

# 8. Business Rule Discovery Questions

Useful questions include:

### About requirements

- What must happen?
- What must not happen?
- What is allowed?
- Under what conditions?

### About decisions

- Who makes this decision?
- What information do they use?
- What conditions affect the decision?
- What happens if the condition is not met?

### About exceptions

- Are there exceptions?
- Who can approve an exception?
- What circumstances qualify?
- What happens after an exception is approved?

### About confirmation

- Is this an official business policy?
- Is this how the business currently operates?
- Is this documented anywhere?
- Does this rule apply to every case?

---

# 9. Important Distinctions

Keep these concepts separate:

| Concept | Main Question |
|---|---|
| Problem | What is going wrong? |
| Process | What happens? |
| Exception | What happened differently? |
| Cause | Why did it happen? |
| Business Rule | What governs the decision? |
| Requirement | What should the system support? |
| Solution | How might we solve it? |

Example:

```text
Problem:
Customers wait too long.

Process:
Prescription → verification → preparation → pickup.

Exception:
Customer does not pick up.

Business Rule:
Unclaimed prescriptions are handled according to the pharmacy's retention policy.

Requirement:
The system must track the prescription's pickup status.

Possible Solution:
Add prescription status tracking.
```

Do not collapse all of these into "the system needs a feature."

---

# 10. Reasoning and Sentence Construction

Use structured sentences when explaining your reasoning.

### Pattern 1 — Uncertainty

> "We do not yet have enough information to determine whether this is the actual business rule."

### Pattern 2 — Investigation

> "Before proposing a solution, I would investigate how the business currently handles this situation."

### Pattern 3 — Candidate rule

> "A possible business rule is ____, but this should be confirmed with the stakeholder."

### Pattern 4 — Avoiding assumptions

> "I would avoid assuming ____ because we have not yet confirmed ____."

### Pattern 5 — Decision logic

> "When ____, the business must determine whether ____."

These patterns help turn scattered thoughts into clear engineering reasoning.

---

# Mastery Principle

> **A business rule describes the business decision or policy. It is not the software that enforces it.**

Before proposing software:

```text
Understand the situation
        ↓
Identify the decision
        ↓
Identify the condition
        ↓
Discover the business policy
        ↓
Confirm the rule
        ↓
Identify system requirements
        ↓
Consider solutions
```

---

# Topic Completion Criteria

Topic 017 is considered complete when you can independently:

- Identify business rules from scenarios
- Distinguish rules from processes
- Distinguish rules from solutions
- Write rules using MUST / MUST NOT / MAY
- Identify conditions that affect decisions
- Recognize candidate vs. confirmed rules
- Identify exceptions to rules
- Ask stakeholders questions that confirm rules
- Explain your reasoning clearly

**Current status:** 🚧 In Progress

# Topic 014 — Stakeholder Goals and Concerns

## Objective

Learn how to understand what stakeholders actually want, what they are concerned about, and why they are making a particular request.

The goal is to avoid treating stakeholder requests as automatic requirements.

Instead, learn to investigate:

```text
Stakeholder
    ↓
Goal
    ↓
Concern
    ↓
Request
    ↓
Investigation
    ↓
Evidence
    ↓
Cause
    ↓
Root Cause
    ↓
Possible Change
    ↓
Measure Result
    ↓
Conclusion
```

---

## 1. Stakeholder Goal

A **goal** describes what a stakeholder wants to achieve.

Examples:

```text
Restaurant Owner
Goal → Complete orders faster

Kitchen Staff
Goal → Prepare food correctly while maintaining quality

Waiter
Goal → Serve customers promptly

Cashier
Goal → Process payments accurately

Customer
Goal → Receive the correct food within an acceptable time
```

A goal describes the desired outcome, not necessarily the solution.

---

## 2. Stakeholder Concern

A **concern** describes something that may prevent the stakeholder from achieving their goal.

Example:

```text
Goal:
Complete orders faster

Concern:
Customers may leave because orders take too long.
```

Another example:

```text
Goal:
Maintain food quality

Concern:
Increasing preparation speed may affect food quality.
```

Important:

> A concern is not automatically a confirmed fact.

It is something that should be investigated.

---

## 3. Goal vs Concern vs Expected Outcome

These concepts should be separated.

```text
Goal
↓
What the stakeholder wants to achieve

Concern
↓
What might prevent the goal

Expected Outcome
↓
What successful completion looks like
```

Example:

```text
Restaurant Owner

Goal:
Maintain profitable operations

Concern:
Customers may leave because of long waiting times

Expected Outcome:
Customers complete their orders and the restaurant retains revenue
```

---

## 4. Stakeholder Request

A stakeholder request describes what the stakeholder believes should be done.

Example:

> "I want a dashboard showing every cancelled order."

This is a **request**, not automatically a requirement.

The stakeholder may be asking for a dashboard because they have a deeper business concern.

We should investigate:

```text
Request
↓
Why?
↓
Goal
↓
Concern
↓
Business Problem
```

---

## 5. Request vs Goal

Example:

```text
Request:
"I want a dashboard showing cancelled orders."

Information Need:
"I want to know which orders are cancelled and how often."

Possible Goal:
"Understand the causes and frequency of cancellations."

Possible Business Concern:
"A high number of cancellations may be hurting the business."
```

The request is only the starting point.

---

## 6. Don't Automatically Accept Stakeholder Claims

Stakeholders may make statements based on their experience or assumptions.

Example:

> "We need to process orders faster."

This tells us the owner's concern, but it doesn't tell us:

- Where the delay happens
- Why the delay happens
- How often it happens
- What causes it
- Whether faster processing affects quality

Therefore:

```text
Stakeholder Statement
        ↓
Claim
        ↓
Investigation
        ↓
Evidence
        ↓
Conclusion
```

---

## 7. Stakeholder Conflicts

Different stakeholders may appear to have conflicting goals.

Example:

```text
Owner
Goal → Complete orders faster

Kitchen Manager
Goal → Prepare food correctly while maintaining quality

Waiter
Goal → Serve customers promptly
```

Possible conflict:

```text
Speed
  ⚔
Quality
```

However, we should not immediately assume that the goals are truly incompatible.

It is possible that:

```text
Fast
+
High Quality
+
Prompt Service
```

can all be achieved together.

We need evidence.

---

## 8. Investigating Stakeholder Conflicts

When stakeholders disagree, do not immediately choose one side.

Instead investigate:

```text
Conflicting Goals
        ↓
Understand Each Perspective
        ↓
Identify Constraints
        ↓
Observe Process
        ↓
Collect Evidence
        ↓
Determine Actual Trade-offs
        ↓
Decide
```

Useful questions include:

```text
How is the current process performed?

Where does the delay occur?

How often does the delay happen?

Which orders are most affected?

Does increasing speed actually affect quality?

What constraint is preventing the process from being faster?
```

---

## 9. Evidence vs Assumption

One of the most important lessons from this topic:

> A stakeholder's statement is not automatically evidence.

For example:

> "Making orders faster will sacrifice food quality."

This is a claim.

We investigate it.

Suppose we discover:

```text
Food quality tests:
No difference between individual and simultaneous preparation.

Customer complaints:
Mostly about waiting time.

Food quality complaints:
Very few.
```

The correct conclusion is:

> The current evidence does not support the claim that faster preparation will sacrifice food quality.

Do not overstate the evidence.

```text
No evidence supporting a claim
        ≠
Claim proven false
```

Use conclusions that match the strength of the evidence.

---

## 10. Historical Business Rules

Businesses often have rules that were created because of an old constraint.

Example:

```text
Old Grill
↓
Could handle only one order
↓
Batching rule introduced
```

Years later:

```text
New Grill
↓
Can handle multiple orders
```

But the old rule remains:

```text
Batching Rule
↓
Still practiced
```

This creates an important engineering question:

> Why does this rule still exist?

A historical rule should not automatically be considered necessary.

But we also should not immediately remove it.

Investigate:

```text
Why was the rule created?

What problem was it solving?

Does that problem still exist?

Does the rule provide any current benefit?

What happens if the rule changes?
```

---

## 11. Process Investigation Example

Restaurant scenario:

```text
Orders are delayed
        ↓
Investigate process
        ↓
Batch waiting discovered
        ↓
80% of orders experience batch waiting
        ↓
Investigate why batching exists
        ↓
Rule created years ago
        ↓
Old equipment could only handle one order
        ↓
Equipment was replaced
        ↓
New equipment can handle multiple orders
        ↓
Food quality is not affected by simultaneous preparation
        ↓
Waiting rule becomes a strong root-cause candidate
```

Important:

> We did not conclude that the rule was unnecessary simply because it was old.

We investigated the reason behind the rule and checked whether the original constraint still existed.

---

## 12. Root Cause Investigation

A stakeholder may report:

> "Customers are waiting too long."

This is a problem observation, not yet a root cause.

We investigate:

```text
Problem
↓
Orders are delayed
↓
Where is the delay?
↓
Batch waiting
↓
Why does batching happen?
↓
Historical rule
↓
Why was the rule created?
↓
Old equipment limitation
↓
Does the limitation still exist?
↓
No
```

This gives us a strong candidate for the root cause.

The engineer should still validate it.

---

## 13. Process Change Before Software

A major lesson from this topic:

> A business problem does not automatically require software.

Example:

```text
Problem:
Orders take too long.

Possible Cause:
Batch waiting.

Investigation:
Batching rule came from an old equipment limitation.

Current Situation:
New equipment can handle multiple batches.

Process Change:
Allow simultaneous preparation.

Measure Result:
Check whether order time and cancellations improve.
```

Only after understanding the process should we ask whether software is necessary.

---

## 14. Testing a Process Change

Suppose we temporarily change the process.

### Before

```text
Average order time → 38 minutes
Customer cancellations → 50/week
Food quality complaints → 4/week
```

### After

```text
Average order time → 27 minutes
Customer cancellations → 18/week
Food quality complaints → 4/week
```

The evidence shows:

```text
Order time:
38 → 27 minutes

Cancellations:
50 → 18/week

Food quality complaints:
4 → 4/week
```

This suggests:

- Order processing became faster.
- Cancellations decreased.
- Observed food-quality complaints did not increase.

Therefore:

> The evidence strongly supports the conclusion that the previous waiting process was contributing to the problem.

The process change can now be considered successful based on the observed measurements.

---

## 15. Information → Decision → Action → Outcome

Information is useful when it helps someone make a decision or take an action.

For example:

```text
Information
↓
35 cancellations caused by long waiting
↓
Decision
↓
Investigate kitchen waiting process
↓
Action
↓
Change batching process
↓
Outcome
↓
Reduced order time and cancellations
```

A dashboard or notification may provide information, but providing information does not automatically solve the underlying problem.

---

## 16. Important Engineering Mindset

Do not think:

```text
Stakeholder Request
↓
Build Software
```

Think:

```text
Stakeholder Request
↓
Why?
↓
Goal
↓
Concern
↓
Investigate
↓
Observe Process
↓
Collect Evidence
↓
Identify Cause
↓
Validate Root Cause
↓
Consider Process Changes
↓
Measure Results
↓
Then determine whether Software is needed
```

---

## 17. Key Questions to Ask Stakeholders

### About the Goal

```text
What are you trying to achieve?

What would success look like?

What outcome are you expecting?
```

### About the Concern

```text
What are you worried about?

What happens if this problem continues?

Who is affected?
```

### About a Request

```text
Why do you need this?

What decision will you make using this?

What information do you actually need?

What problem are you trying to solve?
```

### About a Business Rule

```text
Why does this rule exist?

Why was it originally introduced?

What problem was it solving?

Does that problem still exist?

Does the rule provide any current benefit?
```

### About a Process

```text
Where does the delay occur?

How often does it happen?

Which activities are involved?

Which orders are most affected?

What happens before and after the problem?
```

---

## 18. Core Mental Model

Use this mental model when talking to stakeholders:

```text
Stakeholder
    ↓
What do they want?
    ↓
Goal
    ↓
What are they worried about?
    ↓
Concern
    ↓
What are they asking for?
    ↓
Request
    ↓
Why do they want it?
    ↓
Investigation
    ↓
What is actually happening?
    ↓
Observation
    ↓
What evidence do we have?
    ↓
Evidence
    ↓
What is causing the problem?
    ↓
Cause / Root Cause
    ↓
What should change?
    ↓
Process Change / Possible Solution
    ↓
Did the change work?
    ↓
Measure Result
```

---

## 19. Key Takeaways

1. A stakeholder's **goal** describes what they want to achieve.
2. A stakeholder's **concern** describes what may prevent that goal.
3. A stakeholder's **request** is not automatically a requirement.
4. Stakeholder statements are often **claims that need investigation**.
5. Conflicting stakeholder goals should not be resolved through assumptions.
6. Investigate the actual process before deciding what should change.
7. Historical business rules should be questioned when their original constraints no longer exist.
8. Do not confuse **information needs** with actual business goals.
9. A dashboard or notification may provide information without solving the underlying problem.
10. Software is not automatically the solution to a business problem.
11. Match the strength of your conclusion to the strength of your evidence.
12. Test important process changes and measure the results.

---

## 20. Topic 014 Mastery Check

Before moving forward, I should be able to:

- [x] Identify stakeholder goals
- [x] Identify stakeholder concerns
- [x] Distinguish goals from requests
- [x] Identify possible stakeholder conflicts
- [x] Investigate stakeholder claims
- [x] Separate assumptions from evidence
- [x] Ask questions before proposing solutions
- [x] Investigate historical business rules
- [x] Identify likely causes and root causes
- [x] Understand that software is not automatically the solution
- [x] Test a process change
- [x] Use evidence to evaluate whether a change worked
- [x] Match conclusions to the strength of evidence

---

## Topic Status

**Topic 014 — Stakeholder Goals and Concerns**

Status: ✅ Completed

Next:

**Topic 015**

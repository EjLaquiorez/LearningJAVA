# Topic 015 — Stakeholder Priorities and Trade-offs

## Roadmap Position

- **Phase:** Phase 1 — Engineering Foundations
- **Module:** Module 1 — Engineering Foundations
- **Part:** Part A — Business Thinking
- **Topic:** 015 — Stakeholder Priorities and Trade-offs
- **Status:** 🟢 Ready to Begin

---

## Topic Objective

Learn how to identify stakeholder priorities and understand trade-offs when business goals compete for limited resources.

By the end of this topic, you should be able to:

- Identify what a stakeholder considers most important.
- Distinguish a priority from a general goal.
- Identify trade-offs between competing goals.
- Recognize limited resources and constraints.
- Understand that not every goal can be maximized simultaneously.
- Investigate business priorities before optimizing a software solution around them.

---

## Concept 1 — Not Everything Can Be First Priority

In real businesses, resources are limited.

Common constraints include:

- Money
- Time
- Staff
- Capacity
- Technology
- Attention

Stakeholders may want many things at the same time, but the business may not be able to maximize all of them.

For example, a restaurant owner may want:

- Faster service
- Lower costs
- Higher food quality
- More staff

These goals can compete with one another.

```text
Faster Service
       ↕
May require more staff

More Staff
       ↕
Higher labor cost

Higher Food Quality
       ↕
May require better ingredients

Better Ingredients
       ↕
Higher operating cost
```

This creates **trade-offs**.

---

## Priority vs. Trade-off

### Priority

A **priority** is something considered more important than other things.

Example:

> Patient safety is more important than reducing processing time.

### Trade-off

A **trade-off** occurs when achieving one goal affects another goal.

Example:

> Reducing processing time may require changing some checks, but changing checks could affect patient safety.

In simple terms:

```text
PRIORITY
"What matters more?"

TRADE-OFF
"What do we give up or risk
when we pursue something else?"
```

---

## Business Example

A delivery company says:

> "We want every package delivered as quickly as possible."

The manager then says:

> "We also need to keep delivery costs low."

There are now two competing goals:

```text
Goal A
Fast delivery
     ↕
     ↕ trade-off
     ↕
Goal B
Low delivery cost
```

The business may need to decide:

> Is speed more important than cost?

Or:

> Is there a minimum acceptable delivery speed while keeping costs under a certain limit?

That decision is a **business priority**, not something the software engineer should simply invent.

---

## Senior Engineer Mental Model

When stakeholders give you many requirements, do not automatically treat them as equally important.

Instead ask:

```text
Stakeholder Goals
       ↓
Which goals matter?
       ↓
Which matter MOST?
       ↓
What constraints exist?
       ↓
Where do goals conflict?
       ↓
What trade-offs are acceptable?
```

### Key Principle

> Engineers should understand business priorities before optimizing the system around them.

---

## Exercise Plan

The topic will be practiced through progressive exercises focused on:

1. Identifying priorities
2. Identifying trade-offs
3. Comparing competing stakeholder goals
4. Investigating constraints
5. Applying priorities to realistic business situations
6. Final validation

---

## Current Exercise

### Scenario 1

A restaurant owner tells you:

> "I want customers to receive their food within 10 minutes, but I also don't want to increase our kitchen staff because labor costs are already high."

Identify:

1. What is the owner's priority?
2. What is the trade-off?

Do not try to solve the problem yet.

---

## Topic Completion Criteria

Topic 015 is complete when you can independently:

- Identify a stakeholder's highest-priority outcome.
- Distinguish priorities from ordinary requests.
- Identify competing goals.
- Explain the trade-off between those goals.
- Recognize constraints affecting the decision.
- Avoid inventing business priorities yourself.
- Explain what evidence or clarification would be needed before making a decision.

---

## Notes

This topic builds directly on **Topic 014 — Stakeholder Goals and Concerns**.

Topic 014 taught:

```text
Request → Goal → Concern → Conflict → Evidence
```

Topic 015 extends that thinking:

```text
Goals
  ↓
Priorities
  ↓
Constraints
  ↓
Trade-offs
  ↓
Business decision
```

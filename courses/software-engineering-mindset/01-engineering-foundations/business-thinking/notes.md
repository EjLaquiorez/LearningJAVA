# Business Thinking Notes

## Problem vs Solution

Clients often propose solutions.

Engineers investigate problems before deciding whether the proposed solution is appropriate.

Always separate:

Problem → Why the business is struggling.

Solution → One possible way to solve it.

---

## Understanding the Business

Before discussing software, understand:

- What the business does
- How it operates
- Who performs the work
- What value it provides

Software should support the business, not define it.

---

## Engineering Information Map

Every business problem should be analyzed using the following framework:

1. Process
2. People
3. Data
4. Pain
5. Cause
6. Frequency
7. Impact
8. Constraints
9. Goal
10. Risks

This framework helps engineers identify missing information before making recommendations.

---

## Client Discovery

Professional engineers begin with discovery rather than design.

The typical discovery process is:

1. Understand the business
2. Understand the current workflow
3. Understand the business problem
4. Investigate possible causes
5. Identify constraints
6. Define success

Avoid discussing software until enough information has been gathered.

---

## Observation Before Questions

Observation helps engineers ask better questions.

Observe:

- Activities
- People
- Information
- Waiting
- Repetition
- Manual work
- Delays
- Decisions

Questions should be based on observations rather than assumptions.

---

## Cause-and-Effect Thinking

Business problems create chains of effects.

Example:

Late deliveries

↓

Customer complaints

↓

Negative reviews

↓

Lost customers

↓

Reduced revenue

Engineers investigate root causes rather than symptoms.

---

## Decomposition Thinking

Large processes become easier to understand by breaking them into smaller activities.

Example:

Withdraw Cash

↓

Insert Card

↓

Verify PIN

↓

Select Withdraw

↓

Enter Amount

↓

Verify Balance

↓

Dispense Cash

↓

Print Receipt

Each activity can then be analyzed individually.

---

## Bottleneck Thinking

A bottleneck is the slowest or most restrictive step in a process.

Improving non-bottlenecks usually has little impact on the overall workflow.

Identify bottlenecks using evidence rather than assumptions.

Collect information such as:

- Duration
- Queue length
- Capacity
- Staff availability
- Frequency

---

## Process Mapping

A process map visualizes how work moves from beginning to end.

A good process map answers:

- What happens?
- In what order?
- Who performs each activity?

Process maps should describe observable actions.

---

## Decision Points

Not every process follows one straight path.

Decision points create alternative flows.

Examples:

- Is the PIN correct?
- Is membership valid?
- Is payment successful?
- Is inventory available?

Decision points become conditional logic during software development.

---

## Happy Path and Alternative Paths

Every business process contains:

Happy Path

The normal successful flow.

Alternative Paths

Situations where conditions are not met.

Professional engineers model both.

---

## Multiple Decision Branches

Not every decision is Yes/No.

Some decisions contain multiple possible outcomes.

Example:

Transaction Type

- Withdraw
- Deposit
- Balance Inquiry
- Transfer

These become multiple branches within the process.
# 007 — Observation Before Questions

## Purpose

Learn to observe a business process before forming conclusions, making assumptions, or proposing solutions.

Observation allows software engineers to understand **what actually happens** rather than relying only on descriptions, opinions, or assumptions.

---

# Core Principle

> Observe what happens before deciding why it happens.

A person may describe a process based on memory or their interpretation of it.

The actual process may be different.

Use:

```text
Description
    ↓
Observation
    ↓
Facts
    ↓
Questions
    ↓
Investigation
    ↓
Understanding
```

---

# Why Observation Matters

Consider this statement:

> "The ordering system is slow."

This statement may be true, but it does not explain what is actually happening.

An engineer should investigate:

```text
Where is the delay?
        ↓
Who is waiting?
        ↓
What are they waiting for?
        ↓
Which activity is taking time?
        ↓
What happens before the delay?
        ↓
What happens after the delay?
```

Observation helps prevent premature conclusions.

---

# What to Observe

When observing a process, pay attention to the following.

---

## 1. Activities

Identify the actual work being performed.

Examples:

* Receive order
* Check information
* Enter information
* Verify payment
* Approve request
* Prepare product
* Send notification
* Update record

Ask:

> What is the person or system actually doing?

---

## 2. Sequence

Observe the order in which activities occur.

Example:

```text
Receive Order
      ↓
Verify Order
      ↓
Process Payment
      ↓
Prepare Order
      ↓
Complete Order
```

Do not assume the sequence.

Observe it.

---

## 3. Waiting

Look for time where work stops or someone must wait.

Examples:

* Customer waiting in a queue
* Employee waiting for approval
* System waiting for another service
* Department waiting for information
* Employee waiting for a manager

Waiting is often an important signal.

---

## 4. Repetition

Look for activities performed multiple times.

Examples:

```text
Enter Customer Information
        ↓
Copy Customer Information
        ↓
Enter Customer Information Again
```

This may indicate:

* Duplicate work
* Inefficient processes
* Missing integration
* Opportunities for improvement

Do not immediately conclude that automation is required.

First understand **why the repetition exists**.

---

## 5. Decisions

Identify where the process changes based on a condition.

Example:

```text
Check Payment
      ↓
Successful?
   ↙       ↘
 Yes        No
  ↓          ↓
Continue    Retry
```

Observe:

* Who makes the decision?
* What information is used?
* What rule determines the decision?
* What happens on each path?

---

## 6. Information Movement

Observe how information moves through the process.

Example:

```text
Customer
    │
    │ Order
    ▼
Cashier
    │
    │ Order Details
    ▼
Kitchen
```

Ask:

* Who creates the information?
* Who receives it?
* Who changes it?
* Who uses it?
* Where is it stored?

---

## 7. Errors

Observe where mistakes occur.

Examples:

* Incorrect data entry
* Missing information
* Wrong order
* Duplicate transaction
* Incorrect calculation
* Miscommunication

Do not immediately assume why the error happens.

Record the observed behavior first.

---

## 8. Exceptions

Normal processes are not the whole process.

Observe what happens when things go wrong.

Examples:

* Payment fails
* Customer provides incomplete information
* Product is unavailable
* Request is rejected
* System becomes unavailable
* Approval is denied

Exceptions often reveal important business rules.

---

## 9. Dependencies

Look for activities that depend on other people, systems, or information.

Example:

```text
Employee
   ↓
Needs Manager Approval
   ↓
Manager
   ↓
Approves Request
   ↓
Employee Continues
```

The dependency may explain why work waits.

---

## 10. Time

When possible, observe timing.

Examples:

* How long an activity takes
* How long customers wait
* How frequently an event occurs
* How often an error happens
* When demand increases

Time-based observations can help distinguish occasional problems from recurring patterns.

---

# Facts vs Hypotheses vs Investigations

One of the most important observation skills is separating what you **know** from what you **think**.

---

## Fact

A fact is something directly observed or reliably confirmed.

Example:

> Three customers were waiting before their orders were processed.

This is an observation.

---

## Hypothesis

A hypothesis is a possible explanation that has not yet been confirmed.

Example:

> The cashier may be the bottleneck.

This might be true, but it is not yet a fact.

---

## Investigation

An investigation is the next step used to test the hypothesis.

Example:

> Measure order-processing time during peak hours.

Use:

```text
FACT
  ↓
HYPOTHESIS
  ↓
INVESTIGATION
  ↓
Confirmed / Rejected
```

---

# Example — Restaurant

Suppose a restaurant appears slow during lunch.

## Observation

You observe:

```text
Customer arrives
      ↓
Customer waits
      ↓
Cashier takes order
      ↓
Cashier enters order
      ↓
Payment processed
      ↓
Kitchen receives order
```

Possible facts:

* Customers wait before ordering.
* One cashier takes the orders.
* The cashier manually enters the order.
* Payment occurs before kitchen processing.
* The kitchen receives the order after payment.

---

## Hypothesis

You might think:

> Manual order entry causes most of the waiting.

This is a hypothesis.

It should not immediately become a requirement.

---

## Investigation

Measure:

```text
Order Entry Time
Payment Time
Kitchen Preparation Time
Customer Waiting Time
```

Then compare the results.

The evidence may reveal that manual entry is actually fast, while payment processing is the real delay.

---

# Observation Before Questions

The relationship between observation and questioning is important.

Do not think:

```text
Questions → Answers → Done
```

Instead:

```text
Observe
   ↓
Identify Unknowns
   ↓
Ask Questions
   ↓
Investigate
   ↓
Observe Again
   ↓
Update Understanding
```

Questions should be informed by what you observe.

---

# Observation Checklist

When observing a process, record:

```text
Activities
People
Sequence
Waiting
Repetition
Decisions
Information
Errors
Exceptions
Dependencies
Time
```

A simple observation record can look like:

| Observation                     | Type          | Confidence        |
| ------------------------------- | ------------- | ----------------- |
| Customer waits before ordering  | Fact          | Directly observed |
| Cashier manually enters orders  | Fact          | Directly observed |
| Cashier causes the delay        | Hypothesis    | Not confirmed     |
| Measure cashier processing time | Investigation | Next step         |

---

# Avoid Premature Conclusions

## Mistake 1 — Assuming the cause

Seeing:

```text
Customer Waiting
```

does not prove:

```text
Cashier is the Cause
```

---

## Mistake 2 — Jumping to software

Seeing:

```text
Manual Work
```

does not automatically mean:

```text
Build Automation
```

First understand:

> Why is the work manual?

There may be a business rule, legal requirement, or operational reason.

---

## Mistake 3 — Treating one event as a pattern

One slow transaction does not prove the entire process is slow.

Look for:

* Frequency
* Repetition
* Conditions
* Patterns

---

## Mistake 4 — Ignoring exceptions

The normal path may be simple:

```text
Request
  ↓
Approval
  ↓
Complete
```

But the exception path may reveal critical requirements:

```text
Request
  ↓
Approval?
 ↙       ↘
Yes       No
 ↓         ↓
Complete  Reject
```

---

# Observation Questions

After observing, ask questions such as:

### Process

* What exactly happened?
* What happened before this?
* What happened after this?

### People

* Who performed this activity?
* Who was waiting?
* Who made the decision?

### Information

* What information was used?
* Where did it come from?
* Where did it go?

### Problem

* Where did the process slow down?
* Where did an error occur?
* How frequently does this happen?

### Cause

* What could explain this behavior?
* What evidence supports that explanation?
* What still needs to be investigated?

---

# Observation Framework

Use:

```text
OBSERVE
   ↓
RECORD FACTS
   ↓
SEPARATE ASSUMPTIONS
   ↓
IDENTIFY UNKNOWNs
   ↓
ASK QUESTIONS
   ↓
TEST HYPOTHESES
   ↓
UPDATE UNDERSTANDING
```

---

# Mental Model

```text
What did I actually observe?
            ↓
What do I know?
            ↓
What am I assuming?
            ↓
What do I still not know?
            ↓
What should I investigate?
```

This prevents assumptions from silently becoming "facts."

---

# Reusable Rule

> Observe the work before deciding what the problem is.

A strong software engineer separates:

```text
FACTS
   ↓
HYPOTHESES
   ↓
INVESTIGATIONS
```

This discipline helps prevent premature conclusions and leads to better questions, better requirements, and better system understanding.

---

# Key Takeaway

Observation is not passive.

It is an engineering activity used to build an accurate model of how work actually happens.

```text
Observe
   ↓
Understand
   ↓
Question
   ↓
Investigate
   ↓
Validate
   ↓
Model
   ↓
Design
```

> **See what happens before deciding why it happens.**

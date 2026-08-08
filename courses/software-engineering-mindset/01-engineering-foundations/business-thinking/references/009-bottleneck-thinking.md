# 009 — Bottleneck Thinking

## Purpose

Learn to identify the part of a process that limits the overall performance of the system.

A bottleneck is the activity, resource, or constraint that restricts how much work the entire process can complete.

---

# Core Principle

> The performance of the whole process is often limited by its bottleneck.

A process may contain many steps, but one step may have significantly less capacity than the others.

```text id="j7t8pa"
Step A
Capacity: 100/hour
      ↓
Step B
Capacity: 100/hour
      ↓
Step C
Capacity: 30/hour   ← Bottleneck
      ↓
Step D
Capacity: 100/hour
```

Even though the other steps can process 100 items per hour, the overall process cannot consistently exceed approximately 30 items per hour through Step C.

---

# What Is a Bottleneck?

A bottleneck is a part of a process that restricts the flow of work.

It may be caused by:

* Limited staff
* Limited equipment
* Slow processing
* Approval requirements
* Limited system capacity
* Limited workspace
* Waiting for another department
* Manual work
* External dependencies
* Business rules

A bottleneck is not simply a step that feels slow.

It is a constraint that **limits the overall flow of the process**.

---

# Example — Restaurant

Consider a restaurant during lunch:

```text id="8r2jgr"
Customer Orders
      ↓
Cashier
Capacity: 40 orders/hour
      ↓
Kitchen
Capacity: 80 orders/hour
      ↓
Packing
Capacity: 70 orders/hour
      ↓
Delivery
Capacity: 60 orders/hour
```

The cashier can process only 40 orders per hour.

Therefore:

```text id="4d8vws"
Overall Flow ≈ 40 orders/hour
```

The kitchen having capacity for 80 orders does not increase the restaurant's order intake if only 40 orders can pass through the cashier.

---

# Bottleneck vs Slow Step

These concepts are related but not identical.

A step may be slow without limiting the entire process.

Example:

```text id="jyqj0e"
Step A: 100/hour
Step B: 80/hour
Step C: 60/hour
Step D: 50/hour
```

Step D has the lowest capacity and is therefore the likely bottleneck.

But another process might look like:

```text id="r1efj0"
Step A: 100/hour
Step B: 40/hour
Step C: 100/hour
```

Step B is clearly limiting the flow.

The important question is not:

> Which step feels slow?

The better question is:

> Which step limits the overall throughput?

---

# Throughput

**Throughput** is the amount of work a process successfully completes within a given period.

Examples:

* Orders per hour
* Applications per day
* Payments per minute
* Customers served per hour
* Products manufactured per day

Example:

```text id="v0m5tq"
100 orders arrive/hour
        ↓
40 orders processed/hour
        ↓
Process throughput = 40 orders/hour
```

The difference may create a queue.

```text id="0e8qvl"
Arrival Rate > Processing Capacity
          ↓
        Queue
          ↓
      Waiting Time
```

---

# Queue Formation

A bottleneck often becomes visible through queues.

Example:

```text id="r2knwz"
Customers Arrive
      ↓
      ↓
      ↓
Long Queue
      ↓
Cashier
      ↓
Kitchen
```

If customers continually accumulate before one process step, that step may be the bottleneck.

However, a queue alone does not prove the cause.

Investigate.

---

# Bottleneck Indicators

Look for:

## 1. Queue buildup

Work accumulates before a particular step.

```text id="plc3q4"
Work → → → → → [BOTTLENECK] → → Work
          ↑
       Queue
```

---

## 2. High utilization

A resource may be continuously busy.

Examples:

* One employee constantly handling requests
* One machine operating continuously
* One server receiving most of the workload

High utilization can be a signal, but it is not automatically proof of a bottleneck.

---

## 3. Long waiting times

People or work items spend significant time waiting before a specific step.

---

## 4. Work accumulation

Unprocessed work continues to grow.

Examples:

* Pending applications
* Unprocessed orders
* Support tickets
* Approval requests
* Payment transactions

---

## 5. Downstream idle time

A bottleneck can cause later resources to wait for work.

Example:

```text id="h0r6z2"
Cashier
   ↓
Slow Processing
   ↓
Kitchen waits
   ↓
Packing waits
```

The problem may appear downstream even though the actual constraint is upstream.

---

# Bottleneck Investigation

Do not immediately conclude:

> "This employee is too slow."

Instead investigate:

```text id="v5q3za"
Where does work accumulate?
        ↓
What step processes the accumulated work?
        ↓
What is its capacity?
        ↓
How much demand reaches it?
        ↓
Why is its capacity limited?
```

---

# Capacity vs Demand

A useful comparison is:

```text
Demand
  vs
Capacity
```

Example:

```text id="c8x5sy"
Incoming Orders
= 80/hour

Cashier Capacity
= 40/hour

Result:
40 orders/hour exceed available capacity
```

This creates accumulation.

---

# Example — Hospital Registration

Suppose a hospital registration process is:

```text id="f1x9qh"
Patient Arrives
      ↓
Registration
      ↓
Doctor Consultation
      ↓
Payment
      ↓
Pharmacy
```

Capacity:

```text
Registration: 20 patients/hour
Doctor:       15 patients/hour
Payment:      30 patients/hour
Pharmacy:     25 patients/hour
```

The doctor has the lowest capacity.

If patients arrive at a rate higher than 15 per hour, a queue may form before consultation.

```text id="n3e0xn"
Registration
     ↓
Doctor
     ↓
Queue
     ↓
Payment
```

The doctor may be the bottleneck.

But further investigation is required to understand **why**.

---

# Bottleneck Causes

A bottleneck may result from:

### People

* Too few employees
* Limited expertise
* Excessive workload
* Required approval

### Process

* Too many steps
* Repeated work
* Unnecessary verification
* Manual processing

### Information

* Missing information
* Incorrect information
* Waiting for another department
* Duplicate data entry

### Technology

* Slow system
* Limited capacity
* External service dependency
* Integration delay

### Business Rules

* Mandatory approval
* Compliance requirements
* Authorization limits
* Sequential processing requirements

---

# Bottleneck vs Root Cause

A bottleneck is not necessarily the root cause.

Example:

```text id="6v8qps"
Customers Wait
      ↓
Cashier Queue
      ↓
Cashier Bottleneck
      ↓
Why?
      ↓
Cashier manually enters customer information
      ↓
Why?
      ↓
Existing process requires duplicate entry
```

The cashier may be the bottleneck, but the underlying cause may be the process design.

Therefore:

```text
Bottleneck
   ≠
Root Cause
```

Both should be investigated.

---

# The Bottleneck Chain

Use:

```text id="nq7c3d"
Observed Delay
      ↓
Where does work accumulate?
      ↓
Which step limits flow?
      ↓
Why is its capacity limited?
      ↓
What causes the limitation?
      ↓
What impact does it create?
```

This prevents the engineer from stopping at the first visible problem.

---

# Improving a Bottleneck

Once a bottleneck is confirmed, investigate ways to improve its capacity.

Possible approaches include:

* Remove unnecessary work
* Reduce processing time
* Eliminate duplicate entry
* Improve workflow
* Add capacity
* Reassign responsibilities
* Automate appropriate tasks
* Change scheduling
* Improve information availability

But do not assume:

> Automation = solution.

First understand the actual constraint.

---

# The Non-Bottleneck Problem

One of the most important lessons is:

> Improving a non-bottleneck may not improve the overall system.

Example:

```text id="gjq5mm"
Step A
Capacity: 100/hour
      ↓
Step B
Capacity: 30/hour ← Bottleneck
      ↓
Step C
Capacity: 100/hour
```

Suppose Step A is improved from:

```text
100/hour → 150/hour
```

The process is still limited by:

```text
Step B = 30/hour
```

Therefore, overall throughput may remain approximately:

```text
30/hour
```

---

# Bottleneck Shift

After improving a bottleneck, another bottleneck may appear.

Example:

```text id="xxz1em"
Before:

A: 100/hour
B: 30/hour ← Bottleneck
C: 100/hour
```

Improve B:

```text
After:

A: 100/hour
B: 80/hour
C: 100/hour
```

Now B is no longer the constraint.

If another step has lower capacity, that step may become the new bottleneck.

Therefore:

```text
Improve Bottleneck
       ↓
Measure Again
       ↓
Find New Constraint
       ↓
Repeat
```

---

# Bottleneck Investigation Framework

Use these questions:

## Flow

* Where does work accumulate?
* Where do people wait?
* Where does work slow down?

## Capacity

* How much work can this step process?
* How much work arrives?
* Is demand greater than capacity?

## Time

* How long does the activity take?
* Is processing time consistent?
* Does it change during peak periods?

## Frequency

* How often does the problem occur?
* Does it happen only during certain times?

## People

* Who performs the activity?
* Is there enough capacity?
* Does the process depend on one person?

## Dependencies

* Is this step waiting for another person?
* Is it waiting for information?
* Is it dependent on another system?

## Cause

* Why is capacity limited?
* Is the limitation caused by the process, people, information, technology, or business rules?

---

# Bottleneck Analysis Example

Suppose a coffee shop receives:

```text
60 orders/hour
```

But the cashier can process:

```text
35 orders/hour
```

The process looks like:

```text
60 Orders/hour
      ↓
Cashier
35/hour
      ↓
Kitchen
70/hour
      ↓
Pickup
60/hour
```

The cashier is the likely bottleneck.

The engineer should then investigate:

```text
Why can the cashier process only 35 orders/hour?
```

Possible causes:

```text
Manual order entry
      ↓
Payment processing
      ↓
Customer questions
      ↓
Menu complexity
```

Each must be investigated rather than assumed.

---

# Common Mistakes

## 1. Assuming the slowest-looking activity is the bottleneck

A slow activity is not automatically the system bottleneck.

Measure its effect on overall flow.

---

## 2. Blaming a person

Avoid:

> "The cashier is slow."

Instead:

> "Order processing capacity at the cashier step is limiting throughput."

The second statement focuses on the system rather than blaming an individual.

---

## 3. Automating without understanding the constraint

Do not assume:

```text
Slow Process
    ↓
Automation
```

Instead:

```text
Slow Process
    ↓
Investigate Constraint
    ↓
Understand Cause
    ↓
Evaluate Solutions
```

---

## 4. Optimizing everything

Not every slow step needs improvement.

Focus first on the constraint that limits overall performance.

---

## 5. Ignoring changing conditions

A process may have different bottlenecks at different times.

Example:

```text
Normal Hours
Cashier = 60/hour

Peak Hours
Cashier = 40/hour
```

Bottleneck analysis should consider:

* Time of day
* Demand
* Staffing
* Seasonal patterns
* Special events

---

# Mental Model

```text
Observe the Process
        ↓
Measure Flow
        ↓
Identify Accumulation
        ↓
Find Limiting Step
        ↓
Investigate Constraint
        ↓
Understand Cause
        ↓
Improve Appropriate Constraint
        ↓
Measure Again
```

---

# Reusable Framework

When investigating a potential bottleneck:

```text
1. Where does work accumulate?
        ↓
2. Where do people or systems wait?
        ↓
3. Which step limits throughput?
        ↓
4. What is its capacity?
        ↓
5. What is the incoming demand?
        ↓
6. Why is capacity limited?
        ↓
7. What is the impact?
        ↓
8. What could improve the constraint?
        ↓
9. Did the bottleneck move?
```

---

# Key Takeaway

> Improving a non-bottleneck does not necessarily improve the overall process.

The engineer's goal is not simply to make individual steps faster.

The goal is to understand **what limits the entire system**.

```text
Process
   ↓
Flow
   ↓
Constraint
   ↓
Bottleneck
   ↓
Cause
   ↓
Improvement
   ↓
Measure Again
```

A bottleneck is therefore not just a slow step.

It is a **constraint on the overall flow of the system**.

# Exercise 009 — Bottleneck Thinking

## Objective

Practice identifying the part of a process that limits the overall speed or capacity of the system.

The goal is to understand that:

> The slowest or most constrained part of a process can determine the performance of the whole process.

You will learn to investigate:

- Processing time
- Queue length
- Capacity
- Staff availability
- Frequency
- Time of day
- Work arriving at a process step
- Work leaving a process step

---

# Core Principle

Do not assume:

```text
Something is slow
        ↓
That must be the bottleneck
```

Instead:

```text
Observe the Process
        ↓
Measure / Compare Steps
        ↓
Identify Constraints
        ↓
Find the Bottleneck
        ↓
Understand Its Impact
        ↓
Investigate Improvement
```

---

# Exercise 1 — What Is a Bottleneck?

In your own words, explain:

> What is a bottleneck?

```text
________________________________________
________________________________________
________________________________________
```

Complete the sentence:

> A bottleneck is the process step that ________________________________.

---

# Exercise 2 — Identify the Slowest Step

Consider this process:

```text
Step A — 2 minutes
Step B — 3 minutes
Step C — 10 minutes
Step D — 2 minutes
```

### Which step takes the longest?

```text
________________________________________
```

### Is it automatically the bottleneck?

```text
YES / NO
```

Why?

```text
________________________________________
________________________________________
```

What additional information would you want?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 3 — Processing Time

A bakery has this process:

| Step | Processing Time |
|---|---:|
| Take order | 1 minute |
| Prepare ingredients | 2 minutes |
| Bake | 15 minutes |
| Package | 2 minutes |
| Payment | 1 minute |

### Which step has the longest processing time?

```text
________________________________________
```

### Why might this step restrict throughput?

```text
________________________________________
________________________________________
```

### What should you investigate before deciding it is the bottleneck?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 4 — Queue Length

Observe:

```text
Cashier A
Queue: 2 customers

Cashier B
Queue: 12 customers

Cashier C
Queue: 3 customers
```

### Which queue is largest?

```text
________________________________________
```

### What might this indicate?

```text
________________________________________
```

### Does a long queue automatically prove that the cashier is the bottleneck?

```text
YES / NO
```

Explain:

```text
________________________________________
________________________________________
```

---

# Exercise 5 — Capacity

A restaurant has:

```text
Order-taking capacity: 30 orders/hour
Kitchen capacity:       20 orders/hour
Payment capacity:       40 orders/hour
Pickup capacity:        25 orders/hour
```

### Which step has the lowest capacity?

```text
________________________________________
```

### What is the likely bottleneck?

```text
________________________________________
```

### What happens if 30 orders/hour arrive?

```text
________________________________________
________________________________________
```

### What happens if 15 orders/hour arrive?

```text
________________________________________
________________________________________
```

---

# Exercise 6 — Bottleneck vs Non-Bottleneck

Consider:

```text
Order Taking
Capacity: 50/hour
        ↓
Kitchen
Capacity: 20/hour
        ↓
Payment
Capacity: 40/hour
        ↓
Pickup
Capacity: 30/hour
```

### Which step is the bottleneck?

```text
________________________________________
```

### What is the system's approximate maximum throughput?

```text
________________________________________
```

### If order-taking capacity improves from 50/hour to 70/hour, what happens to the system?

```text
________________________________________
```

### Why?

```text
________________________________________
________________________________________
```

Core principle:

> Improving a non-bottleneck may produce little or no improvement in total system throughput.

---

# Exercise 7 — Bottleneck Shift

Consider:

```text
Before improvement:

Step A → 50/hour
Step B → 20/hour
Step C → 40/hour

Bottleneck = Step B
```

Step B is improved:

```text
Step A → 50/hour
Step B → 60/hour
Step C → 40/hour
```

### What is the new bottleneck?

```text
________________________________________
```

### What happened?

```text
________________________________________
```

### What lesson does this demonstrate?

```text
________________________________________
________________________________________
```

---

# Exercise 8 — Staff Availability

A pharmacy has:

```text
Prescription Intake:
2 employees

Prescription Verification:
1 pharmacist

Payment:
2 employees
```

During normal hours:

```text
Intake:          30 prescriptions/hour
Verification:    12 prescriptions/hour
Payment:         25 prescriptions/hour
```

### Which step is most constrained?

```text
________________________________________
```

### Why might staff availability matter?

```text
________________________________________
```

### What would you investigate?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 9 — Time of Day

A coffee shop records:

| Time | Orders/Hour | Average Wait |
|---|---:|---:|
| 8:00 | 20 | 3 min |
| 9:00 | 25 | 4 min |
| 10:00 | 30 | 5 min |
| 11:00 | 55 | 14 min |
| 12:00 | 65 | 20 min |
| 13:00 | 25 | 5 min |

### During which period is the problem most severe?

```text
________________________________________
```

### What changed during this period?

```text
________________________________________
```

### What would you investigate?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Why is time of day important?

```text
________________________________________
________________________________________
```

---

# Exercise 10 — Arrival Rate vs Capacity

A restaurant kitchen can process:

```text
40 orders/hour
```

During lunch:

```text
Orders arriving = 55/hour
```

### What happens?

```text
________________________________________
________________________________________
```

### What happens to the queue over time?

```text
________________________________________
```

### Why?

```text
________________________________________
________________________________________
```

Now assume:

```text
Orders arriving = 30/hour
Kitchen capacity = 40/hour
```

### What happens?

```text
________________________________________
```

---

# Exercise 11 — Bottleneck Investigation

A business says:

> "Our customers wait too long."

You observe:

```text
Step A — Customer registration
Step B — Document verification
Step C — Manager approval
Step D — Payment
Step E — Receipt
```

Write what you would investigate for each step.

### Step A

```text
Processing time:
________________________________________

Queue:
________________________________________

Capacity:
________________________________________
```

### Step B

```text
Processing time:
________________________________________

Queue:
________________________________________

Capacity:
________________________________________
```

### Step C

```text
Processing time:
________________________________________

Queue:
________________________________________

Capacity:
________________________________________
```

### Step D

```text
Processing time:
________________________________________

Queue:
________________________________________

Capacity:
________________________________________
```

### Step E

```text
Processing time:
________________________________________

Queue:
________________________________________

Capacity:
________________________________________
```

---

# Exercise 12 — Find the Bottleneck from Data

A university enrollment process has:

| Step | Capacity / Hour | Average Queue |
|---|---:|---:|
| Student Check-in | 40 | 2 |
| Document Review | 15 | 18 |
| Course Validation | 20 | 9 |
| Payment | 30 | 4 |
| Confirmation | 25 | 2 |

### Which step appears to be the bottleneck?

```text
________________________________________
```

### What evidence supports your answer?

```text
1. _____________________________________

2. _____________________________________
```

### What additional evidence would you collect?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 13 — Bottleneck vs Symptom

A restaurant has a long queue at checkout.

The manager says:

> "The checkout counter is the bottleneck."

You observe:

```text
Checkout processing time: 1 minute
Kitchen preparation time: 12 minutes
Customers wait 10 minutes before food is ready
Checkout queue: 8 minutes
```

### Is checkout definitely the bottleneck?

```text
YES / NO
```

### What appears to be a larger constraint?

```text
________________________________________
```

### What additional information is needed?

```text
________________________________________
```

Important:

> A visible queue can be a symptom of another constraint in the system.

---

# Exercise 14 — Bottleneck and Process Flow

Consider:

```text
Orders
  ↓
Order Taking
40/hour
  ↓
Kitchen
20/hour
  ↓
Packaging
30/hour
  ↓
Pickup
25/hour
```

### Identify the bottleneck.

```text
________________________________________
```

### What happens to orders arriving above 20/hour?

```text
________________________________________
```

### Where would you expect queue buildup?

```text
________________________________________
```

### If kitchen capacity increases to 35/hour, what should you investigate next?

```text
________________________________________
```

### Why?

```text
________________________________________
________________________________________
```

---

# Exercise 15 — Improvement Decision

A company has:

```text
Step A: 50/hour
Step B: 20/hour
Step C: 35/hour
Step D: 30/hour
```

Management proposes:

> "Let's make Step A twice as fast."

### Should this be the first improvement?

```text
YES / NO
```

### Why?

```text
________________________________________
________________________________________
```

What would you investigate first?

```text
________________________________________
```

Now assume Step B improves from:

```text
20/hour → 45/hour
```

What is the new limiting step?

```text
________________________________________
```

---

# Exercise 16 — Case Study: Coffee Shop

## Scenario

A coffee shop receives this complaint:

> "Customers are waiting too long."

Observed data:

| Step | Capacity |
|---|---:|
| Ordering | 50/hour |
| Payment | 45/hour |
| Drink Preparation | 25/hour |
| Pickup | 35/hour |

During peak time:

```text
Orders arriving = 40/hour
```

### 1. What is the bottleneck?

```text
________________________________________
```

### 2. Is the system currently receiving more orders than the bottleneck can handle?

```text
YES / NO
```

### 3. What happens if demand remains at 40/hour?

```text
________________________________________
________________________________________
```

### 4. What should you measure?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### 5. What possible causes might limit drink preparation?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### 6. What improvement would you investigate first?

```text
________________________________________
```

Explain:

```text
________________________________________
________________________________________
```

---

# Exercise 17 — Case Study: University Enrollment

## Scenario

During enrollment:

```text
Student check-in       = 40/hour
Document verification  = 15/hour
Course validation      = 20/hour
Payment                = 30/hour
Confirmation           = 25/hour
```

Student arrival rate:

```text
25 students/hour
```

### 1. Identify the bottleneck.

```text
________________________________________
```

### 2. What is the system's approximate maximum throughput?

```text
________________________________________
```

### 3. What happens because students arrive at 25/hour?

```text
________________________________________
________________________________________
```

### 4. Where would you expect queues to grow?

```text
________________________________________
```

### 5. What information would you collect before proposing a solution?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

---

# Exercise 18 — Final Challenge

## Scenario — Restaurant Order Process

A restaurant has this workflow:

```text
Customer
   ↓
Order Taking
   ↓
Payment
   ↓
Kitchen
   ↓
Food Packaging
   ↓
Pickup
```

Observed data:

| Step | Average Processing Time | Capacity |
|---|---:|---:|
| Order Taking | 2 min | 30/hour |
| Payment | 1 min | 60/hour |
| Kitchen | 8 min | 15/hour |
| Packaging | 3 min | 20/hour |
| Pickup | 2 min | 30/hour |

During lunch:

```text
Demand = 22 orders/hour
```

### Part 1 — Identify the bottleneck.

```text
________________________________________
```

### Part 2 — What is the system's limiting capacity?

```text
________________________________________
```

### Part 3 — Can the system sustainably process 22 orders/hour?

```text
YES / NO
```

Explain:

```text
________________________________________
________________________________________
```

### Part 4 — Where should queue buildup occur?

```text
________________________________________
```

### Part 5 — Management proposes:

> "Let's make payment faster."

Should this be the first priority?

```text
YES / NO
```

Why?

```text
________________________________________
________________________________________
```

### Part 6 — Management instead improves the kitchen:

```text
Kitchen capacity:
15/hour → 25/hour
```

Now review:

```text
Order Taking = 30/hour
Payment      = 60/hour
Kitchen      = 25/hour
Packaging    = 20/hour
Pickup       = 30/hour
```

### What is the new bottleneck?

```text
________________________________________
```

### What lesson does this demonstrate?

```text
________________________________________
________________________________________
```

---

# Exercise 19 — Build Your Own Bottleneck Analysis

Choose a real or fictional business process.

### Process

```text
________________________________________
```

### Process Steps

```text
Step 1:
________________________________________

Step 2:
________________________________________

Step 3:
________________________________________

Step 4:
________________________________________

Step 5:
________________________________________
```

### Processing Time

```text
Step 1: _________________________________

Step 2: _________________________________

Step 3: _________________________________

Step 4: _________________________________

Step 5: _________________________________
```

### Capacity

```text
Step 1: _________________________________

Step 2: _________________________________

Step 3: _________________________________

Step 4: _________________________________

Step 5: _________________________________
```

### Queue

```text
Step 1: _________________________________

Step 2: _________________________________

Step 3: _________________________________

Step 4: _________________________________

Step 5: _________________________________
```

### Likely Bottleneck

```text
________________________________________
```

### Evidence

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### What would you investigate next?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 20 — Bottleneck Investigation Summary

Complete the following for one process.

### Business Problem

```text
________________________________________
```

### Process

```text
________________________________________
________________________________________
```

### Suspected Bottleneck

```text
________________________________________
```

### Evidence

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Possible Cause of Bottleneck

```text
________________________________________
```

### Evidence Needed to Confirm Cause

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Expected Business Impact

```text
________________________________________
________________________________________
```

### Proposed Investigation

```text
________________________________________
________________________________________
```

### Proposed Improvement

Do not assume the improvement is correct. Explain what you would test.

```text
________________________________________
________________________________________
```

---

# Mastery Check

You are ready to move forward when you can consistently:

- Explain what a bottleneck is.
- Distinguish a bottleneck from a merely slow activity.
- Compare processing times.
- Compare capacities.
- Observe queue buildup.
- Consider staff availability.
- Consider time-of-day effects.
- Compare arrival rate with processing capacity.
- Identify the likely limiting step.
- Explain why improving a non-bottleneck may not improve total throughput.
- Recognize that a bottleneck can move after an improvement.
- Identify what evidence is needed before declaring a bottleneck.
- Investigate the causes of a bottleneck instead of treating the symptom.
- Connect bottleneck analysis to business impact.

---

# Final Mental Model

```text
                 BUSINESS PROCESS
                        │
                        ▼
                  OBSERVE FLOW
                        │
             ┌──────────┼──────────┐
             ▼          ▼          ▼
        PROCESSING    QUEUES     CAPACITY
           TIME         │          │
             │          │          │
             └──────────┼──────────┘
                        ▼
                  COMPARE STEPS
                        │
                        ▼
                    BOTTLENECK
                        │
                        ▼
                  INVESTIGATE
                        │
                        ▼
                  FIND CAUSE
                        │
                        ▼
                TEST IMPROVEMENT
                        │
                        ▼
             CHECK NEW BOTTLENECK
```

---

# Reflection

### I previously thought a bottleneck was:

```text
________________________________________
```

### Now I understand that a bottleneck is:

```text
________________________________________
________________________________________
```

### The evidence I would use to identify a bottleneck is:

```text
________________________________________
________________________________________
```

### Improving a non-bottleneck may fail because:

```text
________________________________________
________________________________________
```

### The most important lesson I learned is:

```text
________________________________________
________________________________________
```

---

# Guiding Principle

> **Find the constraint that limits the whole process before trying to optimize individual steps.**

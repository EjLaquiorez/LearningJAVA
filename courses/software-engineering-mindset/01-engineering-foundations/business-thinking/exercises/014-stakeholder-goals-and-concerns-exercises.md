# Exercise 014 — Stakeholder Goals and Concerns

## Objective

Practice identifying:

- Stakeholders
- Stakeholder goals
- Stakeholder concerns
- Expected outcomes
- Conflicting goals
- Stakeholder requests
- Business needs behind requests

The goal is to understand what stakeholders actually want and why before turning their statements into system requirements.

---

# Exercise 1 — Restaurant Stakeholders

Consider the following stakeholders:

```text
Customer
Waiter
Kitchen Staff
Cashier
Restaurant Owner
```

For each stakeholder, identify:

- Goal
- Concern
- Expected outcome

Use this format:

```text
Stakeholder:

Goal:

Concern:

Expected Outcome:
```

---

# Exercise 2 — Identify the Goal

A restaurant owner says:

> "I want orders to be completed faster."

### Question 1

What is the owner's goal?

### Question 2

What concern might be behind that goal?

### Question 3

What would you investigate before deciding how to make orders faster?

Do not propose a technical solution yet.

---

# Exercise 3 — Different Perspectives

A restaurant has a slow lunch process.

The stakeholders say:

### Customer

> "I want my food faster."

### Kitchen Staff

> "We have too many orders at the same time."

### Waiter

> "The kitchen doesn't tell me when orders are ready."

### Owner

> "We're losing customers because of the delays."

Answer:

### Question 1

What is the goal of each stakeholder?

### Question 2

What is each stakeholder concerned about?

### Question 3

Are these concerns related?

Explain how.

---

# Exercise 4 — Conflicting Goals

Imagine:

```text
Customer:
"I want my order prepared immediately."

Kitchen Staff:
"We need enough time to prepare the food correctly."
```

### Question 1

What does the customer want?

### Question 2

What does the kitchen staff want?

### Question 3

Why might these goals conflict?

### Question 4

Should the engineer immediately choose one side?

Why or why not?

### Question 5

What would you investigate?

---

# Exercise 5 — Stakeholder Statement

The owner says:

> "I want a dashboard showing every cancelled order."

Do not immediately treat this as a requirement.

Answer:

### Question 1

What is the owner's stated request?

### Question 2

What might be the owner's actual goal?

### Question 3

What concern might be behind the request?

### Question 4

What questions would you ask the owner?

Give at least 3.

---

# Exercise 6 — Goal vs Solution

Consider these statements:

```text
A. "I want a notification whenever an order is cancelled."

B. "I want to reduce cancelled orders."

C. "I want to know why orders are being cancelled."

D. "I want a dashboard."
```

Classify each as:

```text
Goal
Concern
Request
Possible Solution
```

Explain your reasoning.

---

# Exercise 7 — Stakeholder Conflict

Imagine a university enrollment system.

The Registrar says:

> "Every enrollment should be manually reviewed."

The Student says:

> "I should be enrolled immediately."

The University Administration says:

> "Enrollment should be completed quickly during peak periods."

### Question 1

What is the Registrar's goal?

### Question 2

What is the Student's goal?

### Question 3

What is the University's goal?

### Question 4

What concerns might each stakeholder have?

### Question 5

Where do their goals conflict?

### Question 6

What would you investigate before deciding how the enrollment process should work?

---

# Exercise 8 — Don't Assume

A stakeholder says:

> "The system is too slow."

Do not immediately assume this means:

```text
The software is slow.
```

Investigate.

### Question 1

What does "slow" mean to the stakeholder?

### Question 2

Which part of the process feels slow?

### Question 3

When does it happen?

### Question 4

How often does it happen?

### Question 5

Who experiences the problem?

### Question 6

What business impact does the delay create?

---

# Exercise 9 — Stakeholder Goal Map

Create a goal map for the restaurant.

Use:

```text
Stakeholder
    ↓
Goal
    ↓
Concern
    ↓
Expected Outcome
```

Analyze:

```text
Customer
Waiter
Kitchen Staff
Cashier
Restaurant Owner
```

Then look for relationships between their goals.

---

# Exercise 10 — Investigation Challenge

A restaurant owner says:

> "I want the kitchen to process more orders during lunch."

You investigate and discover:

```text
Lunch orders:
100

Orders completed:
70

Cancelled orders:
20

Remaining orders:
10
```

The kitchen staff says:

> "We are already working as fast as we can."

The waiter says:

> "The kitchen receives orders in large batches."

The owner says:

> "We need more staff."

### Question 1

What is the owner's goal?

### Question 2

What is the kitchen staff's concern?

### Question 3

What is the waiter's observation?

### Question 4

Is "hire more staff" already a confirmed solution?

Why or why not?

### Question 5

What would you investigate next?

Give at least 5 questions.

---

# Exercise 11 — Goal, Concern, or Request?

For each statement, identify whether it is primarily a **Goal**, **Concern**, or **Request**.

### Statement A

> "I want customers to complete payment faster."

### Statement B

> "I'm worried that customers are abandoning their orders."

### Statement C

> "I want the system to send an SMS."

### Statement D

> "I need accurate enrollment records."

### Statement E

> "I'm concerned that invalid students are being enrolled."

Explain your reasoning for each.

---

# Exercise 12 — Multiple Stakeholders, One Process

Analyze a university enrollment process.

Participants:

```text
Student
Professor
Registrar
Finance Department
University Administration
```

Create a table:

```text
Stakeholder | Goal | Concern | Expected Outcome
```

Then answer:

### Question 1

Which stakeholders have goals related to speed?

### Question 2

Which stakeholders have goals related to accuracy?

### Question 3

Which stakeholders might have conflicting priorities?

### Question 4

What would you investigate before deciding how the enrollment process should work?

---

# Exercise 13 — Stakeholder Request vs Underlying Goal

A restaurant owner says:

> "I want a dashboard that shows cancelled orders in real time."

Answer:

### Question 1

What is the stakeholder request?

### Question 2

What might the owner's goal be?

### Question 3

What concern might be behind the request?

### Question 4

Give at least 5 questions you would ask before deciding whether a real-time dashboard is actually necessary.

---

# Exercise 14 — Investigation Challenge

Suppose you discover:

```text
50 cancelled orders this week.

35 were cancelled because customers waited
more than 30 minutes.

10 were cancelled because the food was incorrect.

5 were cancelled for other reasons.
```

### Question 1

What appears to be the largest cause?

### Question 2

What stakeholder concern does this evidence support?

### Question 3

Would you immediately build the requested dashboard?

Why or why not?

### Question 4

What would you investigate next?

Think in terms of:

```text
Observation
    ↓
Possible Explanation
    ↓
Investigation
    ↓
Evidence
    ↓
Conclusion
```

---

# Exercise 15 — Stakeholder Conflict Investigation

Imagine:

```text
Customer:
"I want my food immediately."

Kitchen Staff:
"We need enough time to prepare it correctly."

Owner:
"I want orders completed quickly."

Waiter:
"I need to know when food is ready."
```

### Question 1

Identify each stakeholder's goal.

### Question 2

Identify each stakeholder's concern.

### Question 3

Which goals conflict?

### Question 4

Which goals support each other?

### Question 5

What information would you investigate before proposing a solution?

---

# Reflection

After completing the exercises, answer:

### 1. What is the difference between a stakeholder's goal and concern?

### 2. Why can two stakeholders have different goals?

### 3. Why can legitimate stakeholder goals conflict?

### 4. Why shouldn't engineers immediately choose one stakeholder's preference?

### 5. Why should an engineer investigate the reason behind a stakeholder request?

### 6. Can a stakeholder's requested solution fail to address their actual goal?

Give an example.

---

# Engineering Principle

A stakeholder does not always describe the business need directly.

They may describe:

```text
What they want
```

instead of:

```text
Why they want it
```

Therefore:

```text
Stakeholder Statement
        ↓
Goal
        ↓
Concern
        ↓
Business Impact
        ↓
Investigation
        ↓
Requirement
```

The engineer's responsibility is to understand the stakeholder's perspective before turning their request into a system requirement.

---

# Key Takeaway

Do not only ask:

> "Who is the stakeholder?"

Also ask:

> "What does this stakeholder want?"

> "What are they concerned about?"

> "What outcome are they expecting?"

> "Could their goal conflict with another stakeholder's goal?"

> "What evidence do we need before deciding what the system should do?"

This is how engineers move from simply identifying stakeholders to understanding stakeholder needs.

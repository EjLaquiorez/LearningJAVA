# Topic 014 — Stakeholder Goals and Concerns

## Objective

Learn how to identify what different stakeholders want from a business process or system.

The goal is not simply to list stakeholders.

The goal is to understand:

- What each stakeholder wants
- What each stakeholder is concerned about
- What outcome they expect
- What may conflict with another stakeholder
- Why different stakeholders may have different priorities

---

# Why This Matters

Different stakeholders can look at the same system from completely different perspectives.

For example:

```text
Student
↓
Wants fast enrollment
```

```text
Registrar
↓
Wants accurate and verified enrollment
```

```text
Finance Department
↓
Wants payment and account information to be correct
```

```text
University Administration
↓
Wants accurate enrollment reports
```

They are all connected to the same business process.

However, they do not necessarily want the same thing.

An engineer needs to understand these differences before deciding what the system should do.

---

# Mental Model

Do not stop at:

```text
Stakeholder
```

Go one level deeper:

```text
Stakeholder
    ↓
Goal
    ↓
Concern
    ↓
Expected Outcome
```

For example:

```text
Registrar
    ↓
Goal:
Accurate enrollment
    ↓
Concern:
Students being enrolled without verification
    ↓
Expected Outcome:
Only valid enrollments are approved
```

---

# Goal

A **goal** is what a stakeholder wants to achieve.

Examples:

```text
Student
→ Enroll successfully

Registrar
→ Maintain accurate enrollment records

Restaurant Owner
→ Reduce cancelled orders

Cashier
→ Process payments correctly
```

A goal describes the desired outcome.

---

# Concern

A **concern** is something the stakeholder is worried about or wants to prevent.

Examples:

```text
Student
→ Concern: Enrollment takes too long

Registrar
→ Concern: Invalid students being enrolled

Restaurant Owner
→ Concern: Too many cancelled orders

Cashier
→ Concern: Incorrect payment records
```

---

# Goal vs Concern

Do not confuse the two.

### Goal

```text
What do they want?
```

### Concern

```text
What are they worried about?
```

Example:

```text
Stakeholder: Restaurant Owner

Goal:
Reduce cancelled orders

Concern:
Customers are waiting too long
```

---

# Stakeholder Perspective

Different stakeholders may observe the same process differently.

Consider:

```text
Restaurant Order
        ↓
Kitchen
        ↓
Customer
```

The customer may think:

```text
"My food is taking too long."
```

The kitchen staff may think:

```text
"We have too many orders."
```

The owner may think:

```text
"We are losing customers."
```

The engineer must understand all three perspectives.

---

# Stakeholder Goals Can Conflict

Two stakeholders can have legitimate but conflicting goals.

Example:

```text
Registrar
↓
Wants every enrollment manually verified
```

```text
Student
↓
Wants immediate enrollment
```

Both goals are reasonable from their perspective.

The engineer should not immediately decide:

```text
Registrar is correct
```

or:

```text
Student is correct
```

Instead:

```text
Understand both goals
        ↓
Understand their concerns
        ↓
Understand the business rules
        ↓
Investigate the process
        ↓
Determine the actual requirement
```

---

# Stakeholder Goal Map

A simple way to analyze stakeholders is:

```text
Stakeholder
    ↓
Goal
    ↓
Concern
    ↓
Impact
```

Example:

```text
Restaurant Owner
    ↓
Goal:
Reduce cancelled orders
    ↓
Concern:
Customers wait too long
    ↓
Impact:
Lost revenue and unhappy customers
```

---

# Example — University Enrollment

Consider these stakeholders:

```text
Student
Registrar
Professor
Finance Department
University Administration
```

Analyze them individually.

### Student

```text
Goal:
Enroll in subjects successfully

Concern:
Enrollment takes too long or fails

Expected Outcome:
Successful enrollment
```

### Registrar

```text
Goal:
Maintain accurate enrollment

Concern:
Invalid or incorrect enrollment

Expected Outcome:
Verified enrollment records
```

### Professor

```text
Goal:
Know which students are enrolled

Concern:
Incorrect student enrollment information

Expected Outcome:
Accurate class lists
```

### Finance Department

```text
Goal:
Maintain correct student financial information

Concern:
Students being enrolled with unresolved financial issues

Expected Outcome:
Correct financial status
```

### University Administration

```text
Goal:
Monitor enrollment performance

Concern:
Incorrect or incomplete enrollment information

Expected Outcome:
Reliable enrollment information
```

---

# Exercise 1 — Restaurant

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

Ask:

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

The engineer's responsibility is to understand the stakeholder's perspective **before turning their request into a system requirement**.

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

This is how engineers move from simply identifying stakeholders to **understanding stakeholder needs**.

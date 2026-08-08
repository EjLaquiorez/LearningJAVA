# 003 — Learning to Ask Better Questions

## Purpose

Learn how to identify missing information and ask questions that improve understanding of a business, process, or problem.

The goal is not to ask the most questions.

The goal is to ask the **right questions**.

---

# Core Principle

> Good questions come from recognizing what you do not yet understand.

A software engineer constantly works with incomplete information.

Instead of guessing, the engineer identifies what is unknown and investigates it.

```text
Known Information
        ↓
Identify Unknowns
        ↓
Determine What Matters
        ↓
Ask Targeted Questions
        ↓
Receive Information
        ↓
Update Understanding
        ↓
Identify New Unknowns
        ↓
Repeat
```

---

# Why Questions Matter

A software engineer rarely receives a complete description of a system.

A client might say:

> "Orders are taking too long."

This statement tells us there is a problem, but it does not tell us enough to understand it.

We still do not know:

* Where the delay occurs
* How long the delay is
* Who is involved
* When it happens
* What customers are waiting for
* What happens before the delay
* What happens after the delay
* Why the delay occurs
* How frequently it happens
* What impact it has

Questions help turn vague statements into usable information.

---

# Unknown Information

Before asking a question, identify what you do not know.

Example:

```text
Known:
Customers are waiting too long.

Unknown:
Where are they waiting?
```

Then:

```text
Known:
Customers wait before receiving their order.

Unknown:
What causes the waiting?
```

Then:

```text
Known:
Orders take a long time to process.

Unknown:
Which process step takes the most time?
```

The investigation becomes progressively more specific.

---

# Question Categories

Different questions reveal different types of information.

---

## 1. Process Questions

Used to understand what happens.

Examples:

* What happens first?
* What happens next?
* What happens after approval?
* When is this step completed?
* What happens before this activity?

Example:

> What happens after the cashier records the order?

---

## 2. People Questions

Used to understand responsibility.

Examples:

* Who performs this activity?
* Who approves it?
* Who receives the result?
* Who handles failures?
* Who makes the decision?

Example:

> Who verifies the customer's information?

---

## 3. Information Questions

Used to understand data and information movement.

Examples:

* What information is required?
* Where does it come from?
* Who records it?
* Who uses it?
* Where is it stored?
* What happens if information is missing?

Example:

> What information does the kitchen need before preparing the order?

---

## 4. Decision Questions

Used to understand business rules.

Examples:

* What determines whether this is approved?
* What causes rejection?
* Who makes the decision?
* What conditions must be satisfied?
* What happens when the condition is not met?

Example:

> What determines whether a payment can be accepted?

---

## 5. Problem Questions

Used to understand what is going wrong.

Examples:

* Where does the process slow down?
* Where do errors occur?
* What goes wrong?
* How often does it happen?
* Who is affected?

Example:

> At which step do most order errors occur?

---

## 6. Cause Questions

Used to investigate why something happens.

Examples:

* Why does this happen?
* What causes the delay?
* What happens immediately before the problem?
* Does the problem occur under specific conditions?
* What makes the problem worse?

Example:

> Why does the order-processing time increase during lunch?

---

## 7. Impact Questions

Used to understand the consequences of a problem.

Examples:

* What happens when this fails?
* Who is affected?
* How many transactions are affected?
* What does the delay cost?
* Does this prevent other work?

Example:

> What happens to the kitchen when an order is recorded incorrectly?

---

## 8. Goal Questions

Used to understand the desired outcome.

Examples:

* What should improve?
* What does success look like?
* What should be faster?
* What should be more accurate?
* What outcome does the business want?

Example:

> What would a successful order process look like?

---

# The Question Ladder

A useful investigation often moves from broad understanding toward specific causes.

```text
What happens?
      ↓
Who does it?
      ↓
What information is used?
      ↓
Where does the problem occur?
      ↓
Why does it happen?
      ↓
What is the impact?
      ↓
What should improve?
```

Do not always jump directly to:

> "Why?"

First understand **what is actually happening**.

---

# Example — Customer Waiting

### Initial Statement

> "Customers are waiting too long."

This is not enough information to design a solution.

Start investigating.

### Question 1

> Where are customers waiting?

Suppose the answer is:

> They wait before their orders are taken.

### Question 2

> Who takes the orders?

Answer:

> One cashier.

### Question 3

> When does the waiting become worse?

Answer:

> During lunch.

### Question 4

> Why can one cashier not process the orders fast enough?

Answer:

> The cashier manually enters every order.

### Question 5

> How long does manual entry take?

Now we are moving toward measurable information.

The investigation might reveal:

```text
Customers arrive
      ↓
Queue forms
      ↓
One cashier takes orders
      ↓
Cashier manually enters order
      ↓
Order processing takes time
      ↓
Queue increases
```

The original statement:

> "Customers are waiting too long."

has now become a much clearer process problem.

---

# Weak vs Strong Questions

## Weak

> Can you explain the whole system?

This is broad and may produce unfocused information.

## Strong

> Who receives the order after the cashier records it?

This targets a specific unknown in the process.

---

## Weak

> Why is the system slow?

This assumes the system itself is the cause.

## Strong

> Which step takes the most time?

This investigates the process without assuming the cause.

---

## Weak

> Should we automate this?

This jumps toward a solution.

## Strong

> Why is this activity currently performed manually?

This investigates the current process first.

---

# Question Quality Test

Before asking a question, check four things.

## 1. Is the information unknown?

If you already know the answer, the question may be unnecessary.

---

## 2. Does the answer matter?

The answer should help understand something important.

For example:

```text
Process
People
Information
Problem
Cause
Goal
Constraint
```

---

## 3. Is the question specific?

Prefer:

> Who approves the request?

over:

> Can you explain the approval process?

when you specifically need to know the responsible person.

---

## 4. Does the answer reduce uncertainty?

A useful question should make the mental model clearer.

```text
Before Question
       ↓
High Uncertainty
       ↓
Question
       ↓
Information
       ↓
Lower Uncertainty
```

---

# Investigation Loop

Questioning is not a one-time activity.

Use an iterative loop:

```text
Observe
   ↓
Identify Unknown
   ↓
Ask Question
   ↓
Receive Answer
   ↓
Update Mental Model
   ↓
Find New Unknown
   ↓
Ask Next Question
   ↓
Repeat
```

Every answer may reveal another question.

---

# Questions Should Follow the Process

Instead of asking unrelated questions, follow the flow of the business.

Example:

```text
Customer Places Order
        ↓
Who receives it?
        ↓
Employee Records Order
        ↓
What information is recorded?
        ↓
Order Sent to Kitchen
        ↓
How does the kitchen receive it?
        ↓
Kitchen Prepares Order
        ↓
What happens if an item is unavailable?
```

The process itself guides the investigation.

---

# Avoid Leading Questions

A leading question assumes an answer before the investigation is complete.

Example:

> "The cashier is causing the delay, right?"

This assumes the cashier is the cause.

A better question:

> "Where does the delay occur?"

Then investigate the evidence.

---

# Avoid Solution-Driven Questions

Do not begin with:

> "Would a mobile app solve this?"

That assumes a mobile app is appropriate.

Instead:

> "What makes the current process difficult?"

Then:

```text
Problem
   ↓
Cause
   ↓
Goal
   ↓
Possible Solutions
```

---

# Question Sequence

A useful sequence for investigating an unfamiliar problem is:

```text
1. What is happening?
        ↓
2. Who is involved?
        ↓
3. What happens before and after?
        ↓
4. What information is involved?
        ↓
5. Where is the problem?
        ↓
6. How often does it happen?
        ↓
7. Why might it happen?
        ↓
8. What is the impact?
        ↓
9. What should improve?
        ↓
10. What constraints exist?
```

This sequence helps prevent premature conclusions.

---

# Example — Pharmacy

Suppose a pharmacist says:

> "Prescription processing takes too long."

Instead of immediately proposing software, investigate.

### Process

> What happens when a prescription is received?

### People

> Who checks the prescription?

### Information

> What information must be verified?

### Problem

> At which step does processing slow down?

### Frequency

> How often does the delay occur?

### Cause

> What causes the delay?

### Impact

> What happens to customers when processing is delayed?

### Goal

> What should the pharmacy be able to do faster?

### Constraint

> What existing procedures or regulations must remain unchanged?

Now the engineer has information from which requirements can be developed.

---

# Mental Model

```text
Do Not Guess
     ↓
Identify What You Don't Know
     ↓
Ask a Focused Question
     ↓
Get Evidence
     ↓
Update Your Understanding
     ↓
Investigate Again
```

---

# Reusable Framework

When investigating a business problem, use:

```text
PROCESS
What happens?

PEOPLE
Who does it?

INFORMATION
What information is involved?

PROBLEM
What is going wrong?

CAUSE
Why might it be happening?

IMPACT
What happens because of it?

GOAL
What should improve?

CONSTRAINT
What limits the possible changes?
```

---

# Key Takeaway

> Do not ask questions simply to collect information. Ask questions to reduce uncertainty.

A strong software engineer develops the habit of thinking:

```text
What do I know?
        ↓
What do I not know?
        ↓
What information matters?
        ↓
What question will reveal it?
```

The quality of your questions directly affects the quality of your understanding.

And the quality of your understanding affects the quality of the software you eventually build.

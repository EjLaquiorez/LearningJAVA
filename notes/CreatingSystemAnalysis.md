# 🧠 Software Analysis Cheat Sheet

## Think Like a Software Engineer Before Writing Code

> **Rule #1:** Don't think about Java first.
>
> Think about the **problem** before thinking about the **solution**.

---

# The Software Engineer Workflow

```text
Problem Analysis
        ↓
Algorithm Design
        ↓
Implementation (Java)
        ↓
Testing
```

Never skip straight to Java.

---

# 1. Goal

## Ask Yourself

> **What is this feature trying to accomplish?**

The goal should describe **the purpose**, not the implementation.

### Sentence Starters

* Allow the user to...
* Enable the user to...
* Let the system...
* Manage...
* Record...
* Validate...
* Process...
* Create...

### Examples

✅ Allow the user to create an account.

✅ Enable customers to book movie tickets.

✅ Process an online payment.

❌ Create a loop.

❌ Create an array.

❌ Use Scanner.

Those are implementation details.

---

# 2. Inputs

## Ask Yourself

> **What information does the system need?**

### Sentence Starters

* User enters...
* User selects...
* User uploads...
* Customer provides...
* System receives...

### Examples

✅ Username

✅ Password

✅ Email Address

✅ Uploaded Video

✅ Deposit Amount

---

# 3. Outputs

## Ask Yourself

> **What should happen after the system processes the input?**

### Sentence Starters

* Display...
* Generate...
* Save...
* Update...
* Send...
* Create...

### Examples

✅ Display Login Successful

✅ Display Error Message

✅ Update Account Balance

✅ Save User Information

---

# 4. Rules

## Ask Yourself

> **If I owned this business, what policies would I enforce?**

Rules are **business requirements**.

They describe what **must always be true**.

### Sentence Starters

* Must...
* Cannot...
* Should...
* At least...
* No more than...
* Only...

### Examples

Password must contain at least one uppercase letter.

Username must be unique.

Withdrawal amount cannot exceed the account balance.

Video must be in MP4 format.

File size must not exceed 10 MB.

Only registered users can log in.

---

# 5. Edge Cases

## Ask Yourself

> **How can this feature fail?**

OR

> **What unusual situations could happen?**

Edge cases test whether your system behaves correctly under unexpected or boundary conditions.

---

## Category 1 — User Mistakes

Questions

* What if the user forgets something?
* What if they type the wrong thing?

Examples

* Empty username
* Empty password
* Letters entered instead of numbers
* Negative values
* Invalid email format

---

## Category 2 — Unexpected User Actions

Questions

* What if the user does something unusual?

Examples

* Clicks Submit twice
* Refreshes the page
* Uploads the same file twice
* Cancels midway
* Closes the application

---

## Category 3 — Boundary Cases

Questions

> What happens at the minimum or maximum limits?

Examples

* Password exactly 8 characters
* File exactly 10 MB
* Balance exactly ₱0
* Withdrawal equals remaining balance
* Username at maximum allowed length

These are some of the most commonly forgotten test cases.

---

## Category 4 — System Failures

Questions

> What if the system fails instead of the user?

Examples

* Internet disconnected
* Database unavailable
* Server timeout
* Storage full
* Payment gateway unavailable

---

# Rule vs Edge Case

## Rules

Business policies.

Example

```text
Withdrawal amount cannot exceed the account balance.
```

---

## Edge Case

Specific situations that test the rule.

Examples

```text
User withdraws exactly the account balance.

User withdraws more than the account balance.

User enters 0.

User enters a negative amount.
```

---

# Things That DO NOT Belong in Analysis

Don't write things like:

```text
Create an array

Create Scanner

Use a loop

score++

Create variable

Use if statement

Use switch statement
```

These belong to the **algorithm** or **Java implementation**, not the analysis.

---

# The Software Engineer Analysis Checklist

Before writing any algorithm, answer these questions.

## Goal

> What is the feature trying to accomplish?

---

## Inputs

> What information is required?

---

## Outputs

> What should happen if everything succeeds?

---

## Rules

> What business policies must always be true?

---

## Edge Cases

> What mistakes could users make?

> What unusual situations could happen?

> What happens at the minimum and maximum limits?

> What if the system itself fails?

---

# Three Personas Technique

When thinking of Edge Cases, imagine three different users.

## 😊 Normal User

"What would a typical user do?"

---

## 😅 Careless User

"What mistakes might they make?"

Examples

* Forget password
* Leave fields empty
* Enter the wrong file type

---

## 😈 Mischievous User

"How might they try to break the system?"

Examples

* Upload a 100 GB file
* Click Submit 20 times
* Enter extremely long text
* Try invalid characters

---

# Remember This

```text
Goal
↓
Why does this feature exist?

Inputs
↓
What information do I need?

Outputs
↓
What should happen?

Rules
↓
What business policies must always be true?

Edge Cases
↓
What can go wrong?
```

---

# Golden Rule

> **Don't ask "How do I code this?"**

Instead ask:

> **"What problem am I solving?"**

A well-understood problem leads to a simple algorithm.

A simple algorithm leads to clean code.

Great software starts with great analysis.

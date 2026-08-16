# Exercise 020 — Information the System Needs

## Purpose

These exercises train the ability to identify the information required by a responsibility without immediately designing a technical solution.

The exercises progress from simple identification to full business analysis.

---

# Exercise 020.1 — Responsibility → Information

For each responsibility, identify the information the responsible actor/system would need.

### Q1

Responsibility:

> "The restaurant system determines whether an order can be cancelled."

Identify at least 2 pieces of information that may be needed.

```text
Q1:

Responsibility:

Information needed:
1.
2.

Why:
```

Do not design database fields.

---

### Q2

Responsibility:

> "The enrollment system checks whether all required documents have been submitted."

Identify at least 2 pieces of information that may be needed.

```text
Q2:

Information needed:
1.
2.

Why:
```

---

### Q3

Responsibility:

> "The hospital system determines whether a selected doctor is available."

```text
Q3:

Information needed:
1.
2.

Why:
```

---

# Exercise 020.2 — Information vs. Solution

Classify each statement as:

- A. Business Information
- B. Solution / Implementation

Explain why.

### Q1

> "The system needs to know the current preparation status of the order."

### Q2

> "Create an `order_status` column in the database."

### Q3

> "The system needs the customer's current enrollment status."

### Q4

> "Store enrollment status in PostgreSQL."

Use:

```text
Q1:
Classification:
Why:
```

---

# Exercise 020.3 — Where Does the Information Come From?

Scenario:

```text
Customer
   ↓
Restaurant System
   ↓
Kitchen System
   ↓
Kitchen Staff
```

The restaurant system needs to know whether the food is ready.

### Q1

What information does the restaurant system need?

### Q2

Who produces that information?

### Q3

Is the source inside or outside our system?

### Q4

Does the restaurant system own the responsibility of preparing the food?

Explain.

---

# Exercise 020.4 — Information Crossing the Boundary

Scenario:

```text
Restaurant System
       ↓
Payment Request
       ↓
Bank Payment System
       ↓
Payment Result
       ↓
Restaurant System
```

The restaurant system needs to know whether payment succeeded.

Answer:

```text
Q1:
What information crosses the system boundary?

Q2:
Who produces that information?

Q3:
Which system owns the payment-processing responsibility?

Q4:
What is our system responsible for doing with the result?
```

Do not propose APIs or database tables.

---

# Exercise 020.5 — Don't Invent Information

Scenario:

> "The registrar reviews a student's enrollment application and decides whether the student should be approved."

A student says:

> "The registrar must use the student's GPA, age, and home address."

You do not know whether these are actually used.

### Q1

Should you accept these as confirmed information requirements?

### Q2

What should you say instead?

Use:

```text
Q1:
Yes / No:

Why:

Q2:
We need to investigate...
```

---

# Exercise 020.6 — Information Needed vs. Information Available

Scenario:

> "The hospital system should check whether the selected doctor is available."

We know:

```text
Responsibility:
Check doctor availability
```

But we do not know where availability information comes from.

### Q1

What information does the system need?

### Q2

What do we know about the source of that information?

### Q3

What do we still need to investigate?

Use:

```text
Q1:

Q2:

Q3:
```

---

# Exercise 020.7 — Missing Information

Scenario:

> "The system should automatically determine whether an order can be cancelled."

You know only that statement.

### Q1

Give at least 3 pieces of information that might be relevant.

### Q2

Which of those are confirmed by the scenario?

### Q3

What should the engineer do with the unconfirmed information?

Important:

Do not turn your guesses into business rules.

---

# Exercise 020.8 — Information Source vs. Responsibility Owner

Scenario:

```text
Kitchen Staff
   ↓
Prepares food
   ↓
Kitchen System
   ↓
Updates status to Ready
   ↓
Restaurant System
   ↓
Displays status
   ↓
Customer
```

Answer:

### Q1

Who owns the responsibility of preparing the food?

### Q2

Who produces the "Ready" status?

### Q3

Who receives the status?

### Q4

Who displays the status?

### Q5

Does receiving information mean that the restaurant system owns the responsibility that produced it?

Explain.

---

# Exercise 020.9 — Full Scenario

## University Enrollment

Scenario:

```text
Student
   ↓
Submits application
   ↓
Enrollment System
   ↓
Checks required documents
   ↓
Registrar
   ↓
Reviews application
   ↓
Approves / Rejects
   ↓
Enrollment System
   ↓
Records status
   ↓
Student
   ↓
Views status
```

### Q1

What information does the enrollment system need to check whether required documents have been submitted?

### Q2

Who provides that information?

### Q3

What information does the registrar need to review the application?

### Q4

Which information is confirmed by the scenario?

### Q5

Which information still needs investigation?

### Q6

Does the enrollment system automatically own the information simply because it uses it?

Why?

---

# Exercise 020.10 — Final Mastery Challenge

## Scenario — Restaurant Order Cancellation

A restaurant currently handles cancellation requests like this:

```text
Customer
   ↓
Requests cancellation
   ↓
Restaurant Staff
   ↓
Checks order status
   ↓
Restaurant Staff
   ↓
Determines whether cancellation is allowed
   ↓
Restaurant System
   ↓
Records cancellation decision
```

The owner says:

> "We want the system to determine whether the order is eligible for cancellation. It needs to know whether the order has been paid and whether preparation has started."

---

## Q1 — Identify the Responsibility

What responsibility is being transferred to the system?

```text
Q1:

Current owner:

Proposed owner:

Responsibility:
```

---

## Q2 — Identify Required Information

What information does the system explicitly need according to the scenario?

```text
Q2:

1.
2.
```

Do not add information that was not stated.

---

## Q3 — Identify Information Sources

For each piece of information, ask:

> Where does it come from?

```text
Q3:

Information:
Source:
Inside / Outside:

Information:
Source:
Inside / Outside:
```

If the source is unknown, say:

> "Needs investigation."

---

## Q4 — Separate Information From Implementation

Which is the better engineering statement?

### A

> "The system needs to know whether preparation has started."

### B

> "Create a `preparation_started` Boolean field in the database."

Answer:

```text
Q4:

Better statement:

Why:
```

---

## Q5 — Identify Unknowns

Give at least 4 things we still need to investigate.

Think about:

- Who records payment status?
- Who determines when preparation starts?
- What counts as preparation started?
- Are there exceptions?
- Can staff override the cancellation decision?
- What happens if information is delayed?
- What happens if payment information conflicts?

Use:

```text
Q5:

1. We don't know whether...
2. We don't know whether...
3. We don't know whether...
4. We don't know whether...
```

---

# Final Reasoning Challenge

Complete the chain:

```text
Responsibility
      ↓
What information is needed?
      ↓
Who provides it?
      ↓
Where does it come from?
      ↓
Does it cross our system boundary?
      ↓
What does our system do with it?
      ↓
What remains unknown?
```

Then finish:

> **"Before designing how the system will store or receive information, I need to understand..."**

---

# What This Topic Evaluates

This topic is not mainly testing whether you can list data.

It evaluates whether you can reason about:

```text
Responsibility
      ↓
Information needed
      ↓
Information source
      ↓
Ownership
      ↓
System boundary
      ↓
Information flow
      ↓
Unknowns
      ↓
Investigation
```

The major mistake to avoid is:

```text
"I think the system needs X"
        ↓
"Therefore X must be a database field."
```

Instead:

```text
"What does the responsibility depend on?"
        ↓
"What information represents that?"
        ↓
"Who produces it?"
        ↓
"Where does it come from?"
        ↓
"What do we actually know?"
        ↓
"What must we investigate?"
```

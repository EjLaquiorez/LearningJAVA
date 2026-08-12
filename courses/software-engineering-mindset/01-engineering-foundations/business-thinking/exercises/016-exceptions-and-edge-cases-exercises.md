# Topic 016 — Exceptions and Edge Cases — Exercises

## Roadmap Position

- **Phase:** Phase 1 — Engineering Foundations
- **Module:** Module 1 — Engineering Foundations
- **Part:** Part A — Business Thinking
- **Topic:** 016 — Exceptions and Edge Cases
- **Exercise Status:** 🟢 Not Started

---

# Exercise Objective

Practice identifying situations where a normal business process does not proceed as expected.

For each exercise, think in this order:

```text
Normal Flow
    ↓
What can go differently?
    ↓
Exception / Edge Case
    ↓
What happens?
    ↓
Business Response
    ↓
Possible Business Rule
```

Do not jump directly to software solutions.

---

# Exercise 001 — Identify the Normal Flow

### Scenario

A pharmacy receives a prescription.

```text
Prescription received
↓
Prescription checked
↓
Medicine prepared
↓
Customer notified
↓
Customer picks up medicine
```

### Questions

1. What is the normal flow?
2. At which point could an exception occur?
3. Give one possible exception.
4. What question would you ask the pharmacy about that exception?

### Goal

Learn to distinguish the expected path from situations that require different handling.

---

# Exercise 002 — Missing Information

### Scenario

A university enrollment process requires:

- Student ID
- Selected course
- Completed prerequisites
- Payment information

A student submits an enrollment request but has not completed the required prerequisite.

### Questions

1. What is the normal expectation?
2. What is the exception?
3. Can enrollment continue?
4. What should you ask the registrar about what happens next?

### Goal

Recognize missing or invalid conditions that interrupt a normal process.

---

# Exercise 003 — Cancellation

### Scenario

A restaurant customer places an order.

The kitchen starts preparing the food.

The customer then asks to cancel the order.

### Questions

1. What is the normal flow?
2. What changed?
3. What exception occurred?
4. What questions should you ask the restaurant?
5. What business rule might this reveal?

### Goal

Understand that a process can change after it has already started.

---

# Exercise 004 — Unavailable Resource

### Scenario

A customer orders a meal.

The kitchen discovers that one of the required ingredients is unavailable.

### Questions

1. What was supposed to happen?
2. What exception occurred?
3. What possible business responses could exist?
4. Which response should the engineer choose?
5. What should the engineer ask the business first?

### Goal

Learn not to invent business behavior when a resource becomes unavailable.

---

# Exercise 005 — Failed Payment

### Scenario

An online store receives an order.

The customer attempts to pay.

The payment fails.

### Questions

1. What is the normal flow?
2. What exception occurred?
3. Should the order automatically become confirmed?
4. What information would you need from the business?
5. What possible states might the order have?

### Goal

Recognize that a failed step may change the state of the business process.

---

# Exercise 006 — Duplicate Action

### Scenario

A customer clicks the "Pay" button twice because the first click appears not to respond.

### Questions

1. What could happen?
2. Is this a normal or exceptional situation?
3. What business risk could exist?
4. What should you investigate before deciding how the system should behave?
5. What business rule might be needed?

### Goal

Recognize duplicate actions as an important edge case.

---

# Exercise 007 — Timing Exception

### Scenario

A university allows students to drop a course until Friday at 5:00 PM.

A student attempts to drop the course on Saturday.

### Questions

1. What is the normal rule?
2. What exception occurred?
3. What should you ask the university?
4. What could happen if the deadline is treated incorrectly?
5. What business rule can you identify?

### Goal

Understand how deadlines create business rules and exceptions.

---

# Exercise 008 — Unexpected Volume

### Scenario

A restaurant normally receives 50 lunch orders.

On one Friday, it receives 200 orders within a short period.

### Questions

1. What changed from the normal situation?
2. Is this an exception or an edge case?
3. What parts of the process could be affected?
4. What evidence would you collect?
5. What questions would you ask the restaurant?

### Goal

Recognize that a process may work normally under normal volume but fail under unusual load.

---

# Exercise 009 — Exception Reveals a Business Rule

### Scenario

A pharmacy prepares a prescription.

The customer does not pick it up.

The pharmacy manager says:

> "We keep prepared prescriptions for a limited period."

### Questions

1. What is the normal flow?
2. What exception occurred?
3. What rule did the exception reveal?
4. What additional questions should you ask?
5. Why is this information important before building software?

### Goal

Learn how exceptions reveal hidden business rules.

---

# Exercise 010 — Full Exception Analysis

### Scenario

A school enrollment system normally works like this:

```text
Student submits enrollment
        ↓
Registrar checks requirements
        ↓
Payment is verified
        ↓
Enrollment is approved
        ↓
Student receives confirmation
```

But several situations occur:

- Student has not completed a prerequisite.
- Payment fails.
- Student submits the enrollment twice.
- Student changes the selected course after payment.
- Enrollment is submitted after the deadline.

### Your Task

Analyze the situation.

For each exception:

1. Identify the affected step.
2. Explain why it is an exception.
3. Identify what the business needs to decide.
4. Identify what information should be investigated.
5. Identify a possible business rule.

Then answer:

6. Which exception would you investigate first, and why?
7. What should an engineer avoid assuming?
8. Why should the normal flow not be the only thing modeled?

### Goal

Combine the exception-thinking skills into one realistic business process.

---

# Final Validation Exercise

## Scenario

A pharmacy normally follows:

```text
Prescription received
        ↓
Prescription checked
        ↓
Medicine prepared
        ↓
Prescription marked ready
        ↓
Customer notified
        ↓
Customer picks up medicine
```

The pharmacy reports these situations:

- The prescription contains incomplete information.
- The medicine is unavailable.
- Two staff members begin preparing the same prescription.
- The customer does not pick up the medicine.
- The customer arrives before the prescription is ready.
- The customer requests cancellation after preparation has started.

### Your Task

Analyze the process independently.

Identify:

1. The normal flow
2. Each exception
3. What could happen because of each exception
4. What questions should be asked
5. What the pharmacy needs to decide
6. Which situations may reveal business rules
7. What evidence should be collected
8. What an engineer should avoid assuming
9. Which exceptions are most important to understand first
10. Why exceptions matter when modeling a business process

### Mastery Requirement

You should be able to explain:

> **What normally happens, what can interrupt the normal process, how the business responds, and which business rules can be discovered from those exceptions.**

---

# Exercise Progress Tracker

```text
Exercise 001 — Identify the Normal Flow          ⬜
Exercise 002 — Missing Information               ⬜
Exercise 003 — Cancellation                      ⬜
Exercise 004 — Unavailable Resource              ⬜
Exercise 005 — Failed Payment                    ⬜
Exercise 006 — Duplicate Action                  ⬜
Exercise 007 — Timing Exception                  ⬜
Exercise 008 — Unexpected Volume                 ⬜
Exercise 009 — Exception Reveals a Business Rule ⬜
Exercise 010 — Full Exception Analysis           ⬜
Final Validation                                 ⬜
```

## Completion Criteria

Topic 016 is complete when the student can independently:

- Describe the normal flow of a business process.
- Identify meaningful exceptions.
- Identify edge cases.
- Distinguish exceptions from normal flow.
- Ask what happens when a process cannot continue normally.
- Investigate the business response instead of inventing one.
- Recognize that exceptions can reveal business rules.
- Identify information needed to understand exception handling.
- Explain why exception handling matters before designing software.

---

## Key Mental Model

```text
NORMAL FLOW
    ↓
What should normally happen?
    ↓
EXCEPTION
    ↓
What could prevent that?
    ↓
CONSEQUENCE
    ↓
What happens if it occurs?
    ↓
BUSINESS RESPONSE
    ↓
How does the business handle it?
    ↓
BUSINESS RULE
    ↓
What rule did we discover?
```

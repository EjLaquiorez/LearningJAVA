# 017 — Business Rules and Decision Logic — Exercises

## Current Progress

```text
Topic 017 — Business Rules and Decision Logic
Exercises: 001–010
Status: 🚧 Not Started
```

---

# Exercise 001 — Identify the Rule

### Scenario

A pharmacy receives a prescription.

The pharmacist checks it and discovers that the prescription is expired.

The customer asks:

> "Can you still give me the medicine?"

The pharmacist says:

> "No. We cannot dispense an expired prescription."

### Questions

1. What is the situation?
2. What decision must the pharmacy make?
3. What condition affects the decision?
4. What is the business rule?
5. Is "build a system that blocks expired prescriptions" a business rule or a software solution?
6. Rewrite the business rule using **must not**.

---

# Exercise 002 — Rule vs. Process

### Scenario

A restaurant receives an order.

The kitchen checks the order, prepares the food, and serves it to the customer.

The restaurant has a policy that orders must be paid before food is released to the customer.

### Questions

1. What is the process?
2. What is the business rule?
3. What action does the business rule control?
4. What could happen if the rule is violated?
5. Write the rule using **must**.

---

# Exercise 003 — Rule vs. Solution

### Scenario

A pharmacy manager says:

> "Customers should know when their prescriptions are ready."

A stakeholder requests:

> "Build a notification system."

### Questions

1. What is the business need?
2. What is the requested solution?
3. What possible business rule could exist?
4. Why is the notification system not automatically the business rule?
5. What would you ask the pharmacy before accepting the notification system as the correct solution?

---

# Exercise 004 — MUST / MUST NOT / MAY

For each situation, identify whether the rule should use **MUST**, **MUST NOT**, or **MAY/CAN**.

### A

A student cannot enroll in Advanced Java without completing the prerequisite.

### B

A customer can request an approved substitute when an ingredient is unavailable.

### C

A payment needs to be verified before an order becomes confirmed.

### Questions

1. Classify each rule.
2. Rewrite each one as a clear business rule.

---

# Exercise 005 — Discover the Rule

### Scenario

A customer attempts to return a product 45 days after purchase.

The store normally accepts returns within 30 days.

### Questions

1. What is the normal rule?
2. What exception occurred?
3. What decision does the store need to make?
4. What questions would you ask the store?
5. What candidate business rule might exist?
6. What exceptions to that rule would you investigate?

---

# Exercise 006 — Candidate vs. Confirmed Rule

### Scenario

A pharmacy has many unclaimed prescriptions.

You suspect:

> "Prescriptions are cancelled after seven days."

### Questions

1. Is this a confirmed business rule?
2. Why or why not?
3. What evidence would you look for?
4. Who would you ask?
5. What questions would confirm the rule?
6. What would you avoid assuming?

---

# Exercise 007 — Rules With Conditions

### Scenario

A university normally allows students to drop a course until Friday at 5 PM.

However, the registrar says:

> "Students with documented exceptional circumstances may request a late withdrawal."

### Questions

1. What is the normal business rule?
2. What condition creates an exception?
3. Who appears to have authority over the exception?
4. What additional questions would you ask?
5. Write the rule using a condition.
6. Why is "all late withdrawals must be rejected" too simplistic?

---

# Exercise 008 — Conflicting Rules

### Scenario

A restaurant has two policies:

- Customers should receive their food as quickly as possible.
- Food must be prepared according to required quality and safety procedures.

During peak hours, following every preparation step increases waiting time.

### Questions

1. What rules are involved?
2. Where could the rules create tension?
3. What information would you need before changing either rule?
4. Which rule should be changed, if any?
5. Who should help determine the appropriate policy?
6. What should an engineer avoid assuming?

---

# Exercise 009 — Extract Rules From a Process

### Scenario

A hospital appointment process is:

```text
Patient requests appointment
        ↓
Reception checks doctor availability
        ↓
Appointment scheduled
        ↓
Patient arrives
        ↓
Doctor sees patient
```

The hospital explains:

> "A patient may only be scheduled with a doctor who is available for the requested appointment time."

### Questions

1. What is the process?
2. What is the business rule?
3. What condition affects the rule?
4. What could happen if the rule is violated?
5. What system behavior might eventually be needed?
6. Explain why the system behavior is not itself the business rule.

---

# Exercise 010 — Full Business Rule Analysis

### Scenario

A university allows students to enroll in courses.

Normally:

```text
Student selects course
        ↓
System checks prerequisites
        ↓
Prerequisites satisfied
        ↓
Enrollment allowed
```

An instructor tells the registrar:

> "Students who have not completed the prerequisite should never be allowed to enroll."

However, the department chair says:

> "Students with equivalent experience may sometimes be allowed to enroll."

### Questions

1. What is the normal process?
2. What is the general business rule?
3. What exception exists?
4. What condition determines whether the exception applies?
5. Who appears to have authority over the exception?
6. What questions would you ask?
7. What evidence or documentation would you need?
8. Write a candidate business rule.
9. What part of the rule still needs confirmation?
10. What software solution would you avoid proposing immediately?
11. Why?

---

# Final Validation — Independent Analysis

### Scenario

A hospital allows patients to schedule specialist appointments.

The normal policy is that a patient must have an appropriate referral before scheduling.

A patient without a referral requests an appointment.

The receptionist says:

> "We usually reject the request, but emergency cases sometimes follow a different process."

Analyze:

1. Normal process
2. Business rule
3. Exception
4. Condition
5. Stakeholders
6. Possible consequences
7. Evidence to investigate
8. Questions to ask
9. Candidate business rule
10. Possible exception rule
11. What must be confirmed
12. What software solution should NOT be proposed immediately

### Final sentence challenge

Complete:

> **"Before proposing software, I would first..."**

Write one clear engineering sentence.

---

# Exercise Completion Standard

Do not move on merely because you can produce an answer.

You should be able to explain:

```text
Situation
    ↓
Decision
    ↓
Condition
    ↓
Business Policy
    ↓
Business Rule
    ↓
Exception
    ↓
Confirmed Requirement
    ↓
Possible Solution
```

**Goal:** Understand the rule before implementing the rule.

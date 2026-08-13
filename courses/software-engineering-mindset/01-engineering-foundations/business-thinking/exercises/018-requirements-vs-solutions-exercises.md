# Topic 018 — Requirements vs. Solutions — Exercises

## Current Roadmap Position

```text
Roadmap B — Software Engineering Mindset
│
├── Phase 1 — Engineering Foundations
│   └── Module 1 — Business Thinking
│       └── Part A
│           ├── Topic 014 — Stakeholder Goals & Concerns ✅
│           ├── Topic 015 — Stakeholder Priorities & Trade-offs ✅
│           ├── Topic 016 — Exceptions & Edge Cases ✅
│           ├── Topic 017 — Business Rules & Decision Logic ✅ MASTERED
│           └── Topic 018 — Requirements vs. Solutions 🚧 CURRENT
```

## Exercise Objective

Practice distinguishing:

```text
Business Problem / Need
        ↓
Business Requirement
        ↓
Possible Solution
```

The goal is to avoid treating a stakeholder's requested software solution as the requirement itself.

---

# Exercise 001 — Requirement or Solution?

For each statement, identify whether it is primarily a **Business Requirement/Need** or a **Solution**.

### A

> "Customers must know when their prescription is ready."

### B

> "Build an SMS notification system."

### C

> "Students must be prevented from enrolling in courses when they do not satisfy the required prerequisites."

### D

> "Add a prerequisite validation feature to the enrollment system."

### E

> "Restaurant customers should spend less time waiting to place an order."

### F

> "Build a mobile ordering application."

For each:

```text
A — Requirement or Solution?
Why?

B — Requirement or Solution?
Why?

C — Requirement or Solution?
Why?

D — Requirement or Solution?
Why?

E — Requirement or Solution?
Why?

F — Requirement or Solution?
Why?
```

---

# Exercise 002 — Find the Need Behind the Request

### Scenario

A pharmacy owner says:

> "I want an SMS notification system."

Answer:

1. What is the requested solution?
2. What possible business problem might be behind the request?
3. What possible business need could exist?
4. What questions would you ask before accepting the requested solution?
5. What would you avoid assuming?

---

# Exercise 003 — Rewrite the Solution as a Requirement

Rewrite each solution request into a statement describing the underlying business need.

### A

> "Build a mobile ordering app."

### B

> "Add a dashboard showing the patient queue."

### C

> "Send customers a notification when their prescription is ready."

### D

> "Add automatic prerequisite checking to the enrollment system."

For each:

```text
Solution:
...

Possible requirement:
...

Why is the second statement a requirement rather than a solution?
...
```

---

# Exercise 004 — The Requested Solution May Not Solve the Problem

### Scenario

A restaurant owner says:

> "We need a mobile ordering system because customers are waiting too long during lunch."

Answer:

1. What is the requested solution?
2. What is the stated problem?
3. What evidence would you investigate?
4. What other causes could explain the long waiting time?
5. What would you investigate inside the kitchen?
6. What would you avoid assuming?
7. What possible requirement might emerge after investigation?

---

# Exercise 005 — Requirement, Goal, or Solution?

Classify each statement as primarily a:

- **Goal**
- **Requirement**
- **Solution**

### A

> "Reduce customer waiting time."

### B

> "Customers must be informed when their prescriptions are ready."

### C

> "Build an SMS notification system."

### D

> "Reduce the amount of time nurses spend entering patient information."

### E

> "The system should allow nurses to enter patient information once."

### F

> "Build a centralized patient information form."

Explain your reasoning for each.

---

# Exercise 006 — Stakeholder Request Analysis

### Scenario

A school administrator says:

> "We need a student progress dashboard."

Answer:

1. Who is the stakeholder?
2. What is the requested solution?
3. What problem might the administrator be trying to solve?
4. What business need might exist?
5. What questions would you ask?
6. What information would the dashboard actually need to provide?
7. What would you avoid assuming?
8. What alternative solutions might exist?

---

# Exercise 007 — Requirement vs. Implementation Detail

### Scenario

A manager says:

> "The system must have a red button labeled 'URGENT' so staff can identify emergency orders."

Answer:

1. What part is the business need?
2. What part is the proposed solution or implementation?
3. Rewrite the statement as a business requirement.
4. What questions would you ask?
5. Why shouldn't the exact button design automatically become a requirement?

---

# Exercise 008 — Validate the Requested Solution

### Scenario

A pharmacy manager says:

> "Customers wait too long for prescriptions. We need a notification system."

Answer:

1. What is the stated problem?
2. What is the requested solution?
3. What evidence would you collect?
4. What parts of the prescription process would you investigate?
5. What alternative causes could exist?
6. What requirement might exist independently of the notification system?
7. What would make you decide that a notification system is actually appropriate?

---

# Exercise 009 — Requirements and Constraints

### Scenario

A restaurant wants faster service.

The owner wants to keep labor costs low.

The kitchen manager says the current staff cannot handle the lunch workload.

Answer:

1. What is the business goal?
2. What is the possible requirement?
3. What is the constraint?
4. What solution has been requested, if any?
5. What evidence would you investigate?
6. What alternative solutions might exist?
7. What trade-off exists?
8. What would you avoid assuming?

---

# Exercise 010 — Do Nothing as an Option

### Scenario

A company requests:

> "Build an automated reminder system because employees sometimes forget to complete a daily task."

Answer:

1. What is the requested solution?
2. What is the underlying problem?
3. What business need might exist?
4. What evidence would you investigate?
5. What other causes might explain the missed tasks?
6. What alternative solutions could exist?
7. What would happen if the company did nothing?
8. When might automation actually be appropriate?

---

# Exercise 011 — Full Requirement Discovery

### Scenario

A university registrar says:

> "We need an online enrollment system that automatically checks prerequisites."

Current process:

```text
Student submits enrollment request
        ↓
Registrar reviews student record
        ↓
Registrar checks prerequisites
        ↓
Registrar approves or rejects enrollment
```

Answer:

1. What is the stakeholder's requested solution?
2. What problem is the current process experiencing?
3. What business need exists?
4. What business rule might be involved?
5. What evidence would you investigate?
6. What requirements might exist independently of the requested system?
7. What constraints might exist?
8. What alternative solutions could be considered?
9. What questions would you ask the registrar?
10. What would you avoid deciding immediately?

---

# Exercise 012 — Solution Neutrality

For each statement, rewrite it so that it describes the **business need without specifying a particular technology or implementation**.

### A

> "Build an SMS notification system."

### B

> "Create a mobile app for customers."

### C

> "Add a dashboard for managers."

### D

> "Use AI to automatically classify support requests."

### E

> "Add a barcode scanner to speed up inventory."

For each:

```text
Original solution:
...

Solution-neutral requirement:
...

Reasoning:
...
```

---

# Exercise 013 — Candidate Requirement vs. Confirmed Requirement

### Scenario

A pharmacy staff member says:

> "Customers need to be notified immediately when prescriptions are ready."

Answer:

1. Is this automatically a confirmed requirement?
2. Why or why not?
3. What would you investigate?
4. Who would you ask?
5. What evidence would you collect?
6. What questions would help clarify the requirement?
7. What parts of the statement may still be ambiguous?
8. Rewrite it as a candidate requirement.

---

# Exercise 014 — Conflicting Requirements

### Scenario

A hospital wants:

> "Patients should receive faster appointment scheduling."

The compliance department says:

> "Every appointment must follow the required verification process."

Answer:

1. What are the competing needs?
2. What possible requirements exist?
3. What constraint exists?
4. Where could a trade-off occur?
5. What evidence would you collect?
6. What questions would you ask?
7. What would you avoid assuming?
8. What possible solutions could satisfy both needs?

---

# Exercise 015 — Alternative Solutions

### Scenario

A restaurant says:

> "Customers wait too long to order during lunch. Build a mobile ordering system."

Answer:

1. What is the problem?
2. What is the requested solution?
3. What business requirement might exist?
4. What evidence would you collect?
5. List at least **three possible solutions**.
6. What advantages or disadvantages could each solution have?
7. What would determine which solution is appropriate?
8. Why shouldn't the requested mobile system automatically be selected?

---

# Exercise 016 — Full Case Study

### Scenario

A pharmacy owner says:

> "We need a notification system because customers keep waiting too long for prescriptions."

The pharmacy manager says:

> "The real problem is that prescriptions take too long to prepare because staff are overloaded during peak hours."

Staff say:

> "Some prescriptions are complicated and take longer than others."

Customers say:

> "We don't know whether our prescription is ready, so we keep waiting."

Answer:

1. Who are the stakeholders?
2. What is the owner's requested solution?
3. What problems have been identified?
4. What business goals exist?
5. What possible requirements exist?
6. What business rules might affect the process?
7. What evidence would you collect?
8. What questions would you ask?
9. What constraints exist?
10. What possible solutions could address the different problems?
11. Would a notification system necessarily solve the preparation bottleneck?
12. What solution would you avoid selecting immediately?
13. What would you need to confirm before recommending a solution?

---

# Final Validation — Exercise 017

## Case Study: University Enrollment

A university registrar says:

> "We need a new enrollment system."

Current situation:

- Students wait a long time during enrollment.
- Registrar staff manually check prerequisites.
- Some students have approved exceptions.
- Finance must verify payments.
- Students sometimes submit incomplete enrollment requests.
- The registrar believes automation will make enrollment faster.

Answer without immediately proposing software features.

### 1. What is the stakeholder's request?

### 2. What is the underlying business problem?

### 3. What business goals exist?

### 4. What business requirements might exist?

### 5. What business rules might exist?

### 6. What exceptions might exist?

### 7. What constraints exist?

### 8. What evidence would you investigate?

### 9. What questions would you ask the university?

### 10. What assumptions should you avoid?

### 11. What alternative solutions might exist?

### 12. What would you need to confirm before recommending a solution?

### 13. What software solution would you avoid proposing immediately?

### 14. Why?

---

# Final Sentence Challenge

Complete:

> **"Before proposing software, I would first..."**

Your answer should summarize the mindset of Topic 018.

---

# Topic 018 Mastery Checklist

You should be able to:

- [ ] Distinguish a business need from a solution.
- [ ] Identify when a stakeholder is proposing a solution rather than stating a requirement.
- [ ] Ask why a requested solution is needed.
- [ ] Identify the underlying business problem.
- [ ] Rewrite solution requests into solution-neutral requirements.
- [ ] Identify goals and constraints.
- [ ] Identify business rules that affect a requirement.
- [ ] Investigate evidence before accepting a requirement.
- [ ] Identify alternative solutions.
- [ ] Avoid committing to a solution too early.
- [ ] Explain why a solution is not automatically a requirement.
- [ ] Explain your reasoning in clear sentences.

---

# Status

**Topic:** 018 — Requirements vs. Solutions  
**Exercises:** 001–017  
**Status:** 🚧 In Progress  
**Mastery Requirement:** Complete the exercises and pass Final Validation.

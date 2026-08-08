# Exercise 004 — Engineering Information Map

## Objective

Practice investigating a business problem using a structured information map.

The goal is to avoid investigating a problem from only one perspective.

Instead, examine:

```text
Process
People
Data
Pain
Cause
Frequency
Impact
Constraints
Goal
Risks
```

---

# Core Principle

> Good engineering decisions require enough relevant information.

When a problem is reported, do not immediately search for a solution.

Build an information map first:

```text
                    PROBLEM
                       │
       ┌───────────────┼───────────────┐
       ▼               ▼               ▼
    PROCESS          PEOPLE           DATA
       │               │               │
       └───────────────┼───────────────┘
                       ▼
                     PAIN
                       │
                       ▼
                     CAUSE
                       │
              ┌────────┴────────┐
              ▼                 ▼
          FREQUENCY           IMPACT
              │                 │
              └────────┬────────┘
                       ▼
                  CONSTRAINTS
                       │
                       ▼
                      GOAL
                       │
                       ▼
                     RISKS
```

---

# Exercise 1 — Identify the Information Categories

Match each question to the correct information category.

Categories:

```text
Process
People
Data
Pain
Cause
Frequency
Impact
Constraints
Goal
Risks
```

| Question | Category |
|---|---|
| How does the work currently happen? | |
| Who performs the activity? | |
| What information is recorded? | |
| What is frustrating or difficult? | |
| Why might the problem be happening? | |
| How often does it happen? | |
| What happens because of the problem? | |
| What limits possible changes? | |
| What outcome does the business want? | |
| What could go wrong if the process changes? | |

---

# Exercise 2 — Build an Information Map

## Scenario

A restaurant manager says:

> "Customers are waiting too long for their orders during lunch."

Do not propose a solution yet.

Complete the information map.

### Process

How does the ordering and food preparation process currently work?

```text
________________________________________
________________________________________
```

### People

Who participates in the process?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Data

What information is created or used?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Pain

What is the visible problem or difficulty?

```text
________________________________________
________________________________________
```

### Cause

What possible causes should be investigated?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Frequency

How often does the problem occur?

```text
________________________________________
```

### Impact

What happens because of the problem?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Constraints

What might limit possible changes?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Goal

What outcome might the restaurant want?

```text
________________________________________
________________________________________
```

### Risks

What could go wrong if the process is changed?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 3 — Facts vs Assumptions

Using the restaurant scenario, separate facts from assumptions.

### Facts

Information directly provided or observed:

```text
1. _____________________________________

2. _____________________________________
```

### Assumptions

Things you might believe but have not verified:

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Investigations

What would you need to investigate?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

Core principle:

> An assumption should not silently become a requirement.

---

# Exercise 4 — Process Investigation

For the restaurant scenario, map the current process.

```text
Customer arrives
       ↓
________________________________________
       ↓
________________________________________
       ↓
________________________________________
       ↓
________________________________________
       ↓
________________________________________
       ↓
Customer receives order
```

Now identify:

### Where could waiting occur?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Where could information be lost or misunderstood?

```text
1. _____________________________________

2. _____________________________________
```

### Where could an error occur?

```text
1. _____________________________________

2. _____________________________________
```

---

# Exercise 5 — People Investigation

Identify the participants in the restaurant process.

| Participant | Responsibility | Problem They Might Experience |
|---|---|---|
| Customer | | |
| Server | | |
| Kitchen Staff | | |
| Manager | | |

Then answer:

### Who experiences the problem directly?

```text
________________________________________
```

### Who is responsible for the process?

```text
________________________________________
```

### Who may be affected without directly performing the work?

```text
________________________________________
```

---

# Exercise 6 — Data Investigation

Identify information moving through the restaurant process.

### Order Data

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Customer Data

```text
1. _____________________________________

2. _____________________________________
```

### Payment Data

```text
1. _____________________________________

2. _____________________________________
```

### Status Information

```text
1. _____________________________________

2. _____________________________________
```

Now answer:

### What happens if important information is missing?

```text
________________________________________
________________________________________
```

### What happens if information is incorrect?

```text
________________________________________
________________________________________
```

---

# Exercise 7 — Cause Investigation

The restaurant reports:

> "Orders take too long."

Do not assume the cause.

List at least five possible causes.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

For each possible cause, write evidence you would want.

| Possible Cause | Evidence Needed |
|---|---|
| | |
| | |
| | |
| | |
| | |

---

# Exercise 8 — Frequency and Impact

Suppose the manager says:

> "This problem happens a lot."

That statement is not precise enough.

### Frequency Questions

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Impact Questions

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

Then explain:

### Why should an engineer understand frequency?

```text
________________________________________
________________________________________
```

### Why should an engineer understand impact?

```text
________________________________________
________________________________________
```

---

# Exercise 9 — Constraints

The restaurant wants to improve lunch service.

Identify possible constraints.

### People Constraints

```text
________________________________________
```

### Time Constraints

```text
________________________________________
```

### Financial Constraints

```text
________________________________________
```

### Physical Constraints

```text
________________________________________
```

### Business Constraints

```text
________________________________________
```

### Technical Constraints

```text
________________________________________
```

Now answer:

> Why should constraints be understood before recommending a solution?

```text
________________________________________
________________________________________
```

---

# Exercise 10 — Goal

The manager says:

> "We need to make lunch service faster."

This is a useful direction but still vague.

Ask questions that clarify the goal.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

Then complete:

### Current State

```text
________________________________________
```

### Desired State

```text
________________________________________
```

### How We Could Measure Improvement

```text
________________________________________
________________________________________
```

---

# Exercise 11 — Risks

Suppose someone proposes changing the ordering process.

Identify possible risks.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

Then answer:

### Which risk concerns the customer?

```text
________________________________________
```

### Which risk concerns employees?

```text
________________________________________
```

### Which risk concerns the business?

```text
________________________________________
```

---

# Exercise 12 — Complete Engineering Information Map

Choose one business problem.

Examples:

```text
Customers wait too long
Orders are entered incorrectly
Inventory is frequently unavailable
Invoices take too long
Employees repeat the same work
```

### Problem

```text
________________________________________
```

Complete the map:

| Category | What We Know | What We Need to Investigate |
|---|---|---|
| Process | | |
| People | | |
| Data | | |
| Pain | | |
| Cause | | |
| Frequency | | |
| Impact | | |
| Constraints | | |
| Goal | | |
| Risks | | |

---

# Exercise 13 — Prioritize Missing Information

Review your completed information map.

Choose the five unknowns that would have the greatest effect on understanding the problem.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

For each one, explain why it matters.

```text
1. _____________________________________
   Why: _________________________________

2. _____________________________________
   Why: _________________________________

3. _____________________________________
   Why: _________________________________

4. _____________________________________
   Why: _________________________________

5. _____________________________________
   Why: _________________________________
```

---

# Exercise 14 — Final Challenge

## Scenario — Pharmacy

A pharmacy owner says:

> "Our employees spend too much time handling prescription orders. We need a new system."

You are not allowed to design the system yet.

Build an Engineering Information Map.

### Process

```text
What happens from receiving a prescription
to completing the order?

________________________________________
________________________________________
________________________________________
```

### People

```text
Who participates?

1. _____________________________________
2. _____________________________________
3. _____________________________________
4. _____________________________________
```

### Data

```text
What information is involved?

1. _____________________________________
2. _____________________________________
3. _____________________________________
4. _____________________________________
```

### Pain

```text
What is the reported difficulty?

________________________________________
```

### Cause

```text
What possible causes should be investigated?

1. _____________________________________
2. _____________________________________
3. _____________________________________
4. _____________________________________
```

### Frequency

```text
How often does the problem happen?

________________________________________
```

### Impact

```text
What happens because of the problem?

1. _____________________________________
2. _____________________________________
3. _____________________________________
```

### Constraints

```text
What might limit possible changes?

1. _____________________________________
2. _____________________________________
3. _____________________________________
```

### Goal

```text
What outcome does the pharmacy want?

________________________________________
________________________________________
```

### Risks

```text
What could go wrong if the process changes?

1. _____________________________________
2. _____________________________________
3. _____________________________________
```

---

# Exercise 15 — Engineer's Summary

Using everything you discovered, write a short engineering summary.

### Current Process

```text
________________________________________
________________________________________
________________________________________
```

### Main Pain

```text
________________________________________
________________________________________
```

### Important Unknowns

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Possible Causes

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Desired Goal

```text
________________________________________
________________________________________
```

### Constraints

```text
________________________________________
________________________________________
```

### Risks

```text
________________________________________
________________________________________
```

### Should We Design Software Yet?

```text
YES / NO
```

Explain:

```text
________________________________________
________________________________________
```

---

# Mastery Check

You are ready to move forward when you can consistently:

- Use all major information categories to investigate a problem.
- Describe the current process.
- Identify the people involved.
- Identify important information and data.
- Describe the visible pain.
- Separate possible causes from confirmed causes.
- Investigate frequency.
- Understand business impact.
- Identify constraints.
- Clarify the desired goal.
- Identify risks.
- Distinguish facts from assumptions.
- Identify which missing information matters most.
- Build a structured engineering view before proposing software.

---

# Final Mental Model

```text
                 BUSINESS PROBLEM
                        │
                        ▼
              ENGINEERING INFORMATION
                        │
        ┌───────────────┼───────────────┐
        ▼               ▼               ▼
     PROCESS          PEOPLE           DATA
        │               │               │
        └───────────────┼───────────────┘
                        ▼
                       PAIN
                        │
                        ▼
                      CAUSE
                        │
                 ┌──────┴──────┐
                 ▼             ▼
             FREQUENCY       IMPACT
                 │             │
                 └──────┬──────┘
                        ▼
                   CONSTRAINTS
                        │
                        ▼
                       GOAL
                        │
                        ▼
                      RISKS
                        │
                        ▼
                 BETTER UNDERSTANDING
                        │
                        ▼
                 BETTER ENGINEERING
                    DECISIONS
```

---

# Reflection

### The category I usually forget to investigate is:

```text
________________________________________
```

### The most important missing information in my case study was:

```text
________________________________________
```

### One assumption I need to be careful about is:

```text
________________________________________
```

### Before proposing software, I should understand:

```text
________________________________________
________________________________________
```

---

# Guiding Principle

> **Do not investigate only the problem. Investigate the entire context around the problem.**

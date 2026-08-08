# Exercise 013 — Stakeholders vs Users

````markdown
# Exercise 013 — Stakeholders vs Users

## Objective

Practice identifying the difference between **users** and **stakeholders** in a business process.

The goal is to understand that:

- Not every stakeholder is a system user.
- Not every user is the only person who matters.
- A person can be both a user and a stakeholder.
- Different stakeholders can have different goals and concerns.
- Understanding who is affected by a system is essential before designing it.

---

# Core Principle

> A user interacts with the system. A stakeholder has an interest in, is affected by, or can influence the system or business process.

Use this mental model:

```text
                    SYSTEM / PROCESS
                           │
          ┌────────────────┼────────────────┐
          │                │                │
          ▼                ▼                ▼
        USERS        OTHER STAKEHOLDERS   EXTERNAL PARTIES
          │                │                │
          ▼                ▼                ▼
     Use system       Affected by       Interact with
                      outcomes          business
````

Remember:

```text
User ⊂ Stakeholder
```

A user is often a stakeholder, but a stakeholder does not necessarily use the system.

---

# Exercise 1 — User or Stakeholder?

Classify each person as:

* **User**
* **Stakeholder**
* **Both**
* **Neither**

Consider an online shopping system.

| Person                            | Classification |
| --------------------------------- | -------------- |
| Customer placing an order         |                |
| Warehouse employee                |                |
| Company owner                     |                |
| Delivery driver                   |                |
| Finance manager                   |                |
| Software developer                |                |
| Customer who receives the package |                |
| Government regulator              |                |

Explain one of your answers:

```text
________________________________________
________________________________________
```

---

# Exercise 2 — Identify the Users

Consider:

```text
University Enrollment System
```

Possible people:

```text
Student
Professor
Registrar
University President
IT Administrator
Finance Officer
Government Education Agency
```

Which people directly interact with the enrollment system?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

Why are they users?

```text
________________________________________
________________________________________
```

---

# Exercise 3 — Identify the Stakeholders

Using the same university enrollment system:

```text
Student
Professor
Registrar
University President
IT Administrator
Finance Officer
Government Education Agency
```

Identify everyone who could reasonably be considered a stakeholder.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________

7. _____________________________________
```

Why might someone be a stakeholder without using the system?

```text
________________________________________
________________________________________
```

---

# Exercise 4 — User vs Stakeholder

Consider:

```text
ATM System
```

Participants:

```text
Bank Customer
Bank Teller
Bank Manager
Bank Owner
ATM Technician
Bank Regulator
Security Officer
```

Complete the table.

| Participant      | Uses ATM System? | Stakeholder? | Why? |
| ---------------- | ---------------- | ------------ | ---- |
| Bank Customer    |                  |              |      |
| Bank Teller      |                  |              |      |
| Bank Manager     |                  |              |      |
| Bank Owner       |                  |              |      |
| ATM Technician   |                  |              |      |
| Bank Regulator   |                  |              |      |
| Security Officer |                  |              |      |

---

# Exercise 5 — Can a Stakeholder Be a Non-User?

Scenario:

> A company introduces a payroll system. Employees receive their salaries through the system, but employees never directly log into it. Payroll employees operate the system.

### Who are the users?

```text
________________________________________
```

### Who are the stakeholders?

```text
________________________________________
```

### Are employees stakeholders?

```text
YES / NO
```

Why?

```text
________________________________________
________________________________________
```

Core lesson:

> Someone can be affected by a system even if they never directly interact with it.

---

# Exercise 6 — Can Someone Be Both?

Consider:

```text
Restaurant Ordering System
```

Participants:

```text
Customer
Cashier
Kitchen Staff
Restaurant Manager
Restaurant Owner
Supplier
Delivery Driver
```

Identify who may be both a user and a stakeholder.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

Explain why:

```text
________________________________________
________________________________________
```

---

# Exercise 7 — Stakeholder Discovery

Scenario:

> A hospital wants to introduce a new appointment management system.

Start with:

```text
Patient
Doctor
Receptionist
```

Now ask:

> Who else might be affected?

List additional stakeholders.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

For each one, explain why they matter.

```text
Stakeholder:
________________________________________

Why:
________________________________________
```

```text
Stakeholder:
________________________________________

Why:
________________________________________
```

---

# Exercise 8 — Stakeholder Discovery Through the Process

Consider this process:

```text
Patient requests appointment
        ↓
Receptionist records appointment
        ↓
Doctor sees appointment schedule
        ↓
Patient visits hospital
        ↓
Doctor provides consultation
        ↓
Hospital records consultation
        ↓
Patient receives bill
```

Identify the stakeholders involved.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________
```

Which of these are direct users?

```text
________________________________________
```

Which may not directly use the appointment system?

```text
________________________________________
```

---

# Exercise 9 — Stakeholder vs Role

Consider:

```text
"Manager"
```

Is "manager" automatically a stakeholder?

```text
YES / NO
```

Explain.

```text
________________________________________
________________________________________
```

Now consider:

```text
"Finance Manager"
```

What additional information would you want to know?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

Core principle:

> A job title alone does not tell you what someone's relationship to a system is.

---

# Exercise 10 — Identify the Stakeholder's Relationship

For each participant, identify their relationship to the system.

Possible relationships:

```text
Uses
Owns
Manages
Funds
Depends on
Provides information
Receives information
Regulates
Maintains
Is affected by
```

Scenario:

```text
Online Banking System
```

| Participant          | Relationship |
| -------------------- | ------------ |
| Customer             |              |
| Bank Teller          |              |
| Bank Manager         |              |
| Bank Owner           |              |
| IT Administrator     |              |
| Security Team        |              |
| Government Regulator |              |

---

# Exercise 11 — Stakeholder Mapping

Scenario:

> A supermarket wants to introduce an inventory management system.

Identify at least:

### Direct Users

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Internal Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### External Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

Why should external stakeholders be considered?

```text
________________________________________
________________________________________
```

---

# Exercise 12 — Stakeholder Impact

Scenario:

> A warehouse system is replaced with a new automated system.

Participants:

```text
Warehouse Employees
Warehouse Manager
Company Owner
Customers
Delivery Company
IT Team
```

For each participant, identify the possible impact.

| Stakeholder         | Possible Impact |
| ------------------- | --------------- |
| Warehouse Employees |                 |
| Warehouse Manager   |                 |
| Company Owner       |                 |
| Customers           |                 |
| Delivery Company    |                 |
| IT Team             |                 |

Which stakeholder might experience the biggest change?

```text
________________________________________
```

Why?

```text
________________________________________
________________________________________
```

---

# Exercise 13 — Stakeholder Goals

Scenario:

```text
Restaurant Ordering System
```

Participants:

```text
Customer
Cashier
Kitchen Staff
Restaurant Manager
Restaurant Owner
```

Identify one possible goal for each.

| Stakeholder        | Possible Goal |
| ------------------ | ------------- |
| Customer           |               |
| Cashier            |               |
| Kitchen Staff      |               |
| Restaurant Manager |               |
| Restaurant Owner   |               |

Do all stakeholders necessarily have the same goal?

```text
YES / NO
```

Explain.

```text
________________________________________
________________________________________
```

---

# Exercise 14 — Stakeholder Concerns

Consider:

> A company wants to introduce an automated employee scheduling system.

Stakeholders:

```text
Employees
Managers
HR Department
Company Owner
IT Department
```

What might each stakeholder be concerned about?

| Stakeholder   | Concern |
| ------------- | ------- |
| Employees     |         |
| Managers      |         |
| HR Department |         |
| Company Owner |         |
| IT Department |         |

Which concerns could conflict?

```text
________________________________________
________________________________________
```

---

# Exercise 15 — Different Stakeholders, Different Priorities

Scenario:

> A restaurant wants to reduce order processing time.

Stakeholders:

```text
Customer
Cashier
Kitchen Staff
Manager
Owner
```

Possible priorities:

```text
Speed
Accuracy
Cost
Customer satisfaction
Staff workload
Profit
```

Assign likely priorities.

| Stakeholder   | Main Priority |
| ------------- | ------------- |
| Customer      |               |
| Cashier       |               |
| Kitchen Staff |               |
| Manager       |               |
| Owner         |               |

Can two stakeholders want different things?

```text
YES / NO
```

Give an example:

```text
________________________________________
________________________________________
```

---

# Exercise 16 — Stakeholder Conflict

Scenario:

> A restaurant owner wants to reduce labor costs by reducing the number of cashiers.

Cashiers are concerned that:

> "Customers will have to wait longer."

Customers are concerned that:

> "Ordering will become slower."

### Identify the stakeholders.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### What does the owner want?

```text
________________________________________
```

### What do cashiers want?

```text
________________________________________
```

### What do customers want?

```text
________________________________________
```

### What conflict exists?

```text
________________________________________
________________________________________
```

Do not immediately propose a software solution.

First understand the competing goals.

---

# Exercise 17 — Stakeholder Influence

Consider:

```text
University Enrollment System
```

Participants:

```text
Students
Professors
Registrar
University Management
IT Department
Government Education Agency
```

Which stakeholders may have the most influence over system decisions?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

Why?

```text
________________________________________
________________________________________
```

Does influence always mean the person is a user?

```text
YES / NO
```

Explain:

```text
________________________________________
```

---

# Exercise 18 — Stakeholder Information Needs

Scenario:

> A supermarket introduces an inventory system.

Identify what information each stakeholder may need.

### Store Employee

```text
________________________________________
```

### Store Manager

```text
________________________________________
```

### Supplier

```text
________________________________________
```

### Owner

```text
________________________________________
```

### Finance Department

```text
________________________________________
```

Why might different stakeholders need different information?

```text
________________________________________
________________________________________
```

---

# Exercise 19 — Stakeholder Discovery Interview

Imagine you are meeting the owner of a business.

You ask:

> "Who uses this process?"

The owner says:

> "Only my employees."

Is that enough information?

```text
YES / NO
```

What would you investigate next?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

Why?

```text
________________________________________
________________________________________
```

---

# Exercise 20 — Stakeholder Questions

You are investigating a new business system.

Create questions for discovering stakeholders.

### Question 1 — Users

```text
________________________________________
```

### Question 2 — Decision Makers

```text
________________________________________
```

### Question 3 — People Affected

```text
________________________________________
```

### Question 4 — External Parties

```text
________________________________________
```

### Question 5 — Owners

```text
________________________________________
```

### Question 6 — Regulators

```text
________________________________________
```

---

# Exercise 21 — Case Study: Pharmacy

Scenario:

> A pharmacy wants to introduce a prescription management system.

Process:

```text
Customer
   ↓
Pharmacist
   ↓
Prescription System
   ↓
Inventory
   ↓
Payment
   ↓
Customer
```

Identify:

### Users

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Internal Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### External Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Who may be affected without using the system?

```text
________________________________________
________________________________________
```

---

# Exercise 22 — Case Study: Online Store

Scenario:

> An online store wants to replace its existing order management system.

Participants:

```text
Customer
Sales Employee
Warehouse Employee
Warehouse Manager
Company Owner
Finance Department
Payment Provider
Delivery Company
IT Department
```

Classify each participant.

| Participant        | User | Stakeholder | Both |
| ------------------ | ---: | ----------: | ---: |
| Customer           |      |             |      |
| Sales Employee     |      |             |      |
| Warehouse Employee |      |             |      |
| Warehouse Manager  |      |             |      |
| Company Owner      |      |             |      |
| Finance Department |      |             |      |
| Payment Provider   |      |             |      |
| Delivery Company   |      |             |      |
| IT Department      |      |             |      |

Which stakeholder would you interview first?

```text
________________________________________
```

Why?

```text
________________________________________
________________________________________
```

---

# Exercise 23 — Case Study: ATM System

Scenario:

> A bank wants to replace its ATM software.

Participants:

```text
Bank Customer
Bank Teller
Bank Manager
Bank Owner
ATM Technician
Security Team
Bank Regulator
Payment Network
```

Identify:

### Users

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________

7. _____________________________________

8. _____________________________________
```

### Who is both a user and stakeholder?

```text
________________________________________
```

### Who may be a stakeholder without directly using the ATM software?

```text
________________________________________
________________________________________
```

---

# Exercise 24 — Stakeholder Map

Choose one business process.

Examples:

```text
Restaurant ordering
ATM withdrawal
University enrollment
Pharmacy prescription
Online shopping
Car repair
Hotel booking
```

### Business Process

```text
________________________________________
```

### Direct Users

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Internal Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### External Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### People Affected by the Outcome

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 25 — Stakeholder Analysis

For your chosen process, complete:

| Stakeholder | Role | Uses System? | Goal | Concern | Impact |
| ----------- | ---- | ------------ | ---- | ------- | ------ |
|             |      |              |      |         |        |
|             |      |              |      |         |        |
|             |      |              |      |         |        |
|             |      |              |      |         |        |
|             |      |              |      |         |        |

Review your table.

Ask:

```text
Who uses the system?

Who does not use it?

Who is affected?

Who makes decisions?

Who provides information?

Who receives information?

Who can influence the process?

Who could be harmed by a poor solution?
```

---

# Exercise 26 — Final Challenge

## Scenario — Hospital Appointment System

A hospital wants to build a new appointment management system.

Current process:

```text
Patient calls hospital
        ↓
Receptionist records appointment
        ↓
Doctor views schedule
        ↓
Patient visits hospital
        ↓
Doctor provides consultation
        ↓
Hospital records consultation
        ↓
Billing department creates bill
        ↓
Patient receives bill
        ↓
Hospital management reviews reports
```

Potential participants:

```text
Patient
Receptionist
Doctor
Nurse
Billing Department
Hospital Manager
Hospital Owner
IT Department
Insurance Company
Government Health Agency
```

### Part 1 — Identify Users

Who directly uses the appointment management system?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Part 2 — Identify Stakeholders

Who is affected by or has an interest in the system?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________

7. _____________________________________

8. _____________________________________
```

### Part 3 — Identify Both

Which participants are likely to be both users and stakeholders?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Part 4 — Non-Users

Which stakeholders may not directly use the appointment system?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

Why do they still matter?

```text
________________________________________
________________________________________
```

### Part 5 — Goals

Identify one goal for each:

```text
Patient:
________________________________________

Receptionist:
________________________________________

Doctor:
________________________________________

Billing Department:
________________________________________

Hospital Manager:
________________________________________

Insurance Company:
________________________________________
```

### Part 6 — Concerns

Identify one possible concern for each:

```text
Patient:
________________________________________

Receptionist:
________________________________________

Doctor:
________________________________________

Billing Department:
________________________________________

Hospital Manager:
________________________________________

Insurance Company:
________________________________________
```

### Part 7 — Conflicting Goals

Identify at least one possible conflict.

```text
Stakeholder A:
________________________________________

Goal:
________________________________________

Stakeholder B:
________________________________________

Goal:
________________________________________

Conflict:
________________________________________
________________________________________
```

### Part 8 — Investigation

What would you need to investigate before designing the system?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________
```

---

# Exercise 27 — Build Your Own Stakeholder Analysis

Choose an unfamiliar business.

### Business

```text
________________________________________
```

### Process

```text
________________________________________
```

### Users

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

### Non-User Stakeholders

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Decision Makers

```text
1. _____________________________________

2. _____________________________________
```

### People Affected

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### External Parties

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 28 — Stakeholder Review

Review your stakeholder analysis.

| Question                                            | Yes / No |
| --------------------------------------------------- | -------- |
| Did I identify direct users?                        |          |
| Did I identify non-user stakeholders?               |          |
| Did I identify decision makers?                     |          |
| Did I identify owners or managers?                  |          |
| Did I identify external parties?                    |          |
| Did I identify people affected by the process?      |          |
| Did I identify stakeholder goals?                   |          |
| Did I identify stakeholder concerns?                |          |
| Did I identify possible conflicts?                  |          |
| Did I avoid assuming everyone wants the same thing? |          |

### Who might I have missed?

```text
________________________________________
```

### What evidence would help confirm my stakeholder list?

```text
________________________________________
________________________________________
```

---

# Mastery Check

You are ready to move forward when you can consistently:

* Define a user.
* Define a stakeholder.
* Explain the difference between users and stakeholders.
* Identify direct system users.
* Identify stakeholders who do not directly use the system.
* Identify internal stakeholders.
* Identify external stakeholders.
* Identify decision makers.
* Identify people affected by the system.
* Identify stakeholder goals.
* Identify stakeholder concerns.
* Identify conflicting stakeholder goals.
* Identify stakeholder influence.
* Avoid assuming that a job title explains someone's role.
* Build a stakeholder map for an unfamiliar business.

---

# Final Mental Model

```text
                         BUSINESS
                            │
                            ▼
                         PROCESS
                            │
              ┌─────────────┼─────────────┐
              │             │             │
              ▼             ▼             ▼
            USERS       STAKEHOLDERS   EXTERNAL PARTIES
              │             │             │
              │             │             │
              ▼             ▼             ▼
          INTERACT       AFFECTED BY    INTERACT WITH
          WITH SYSTEM    OUTCOMES       BUSINESS
              │             │             │
              └─────────────┼─────────────┘
                            ▼
                       GOALS & CONCERNS
                            │
                            ▼
                     POSSIBLE CONFLICTS
                            │
                            ▼
                       INVESTIGATION
                            │
                            ▼
                    BETTER UNDERSTANDING
```

---

# Reflection

### Before this exercise, I thought a stakeholder was:

```text
________________________________________
```

### Now I understand a stakeholder as:

```text
________________________________________
________________________________________
```

### The difference between a user and stakeholder is:

```text
________________________________________
________________________________________
```

### One important non-user stakeholder in my chosen process is:

```text
________________________________________
```

### They matter because:

```text
________________________________________
________________________________________
```

### One stakeholder conflict I discovered is:

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

> **Do not ask only "Who uses the system?" Ask "Who is involved, who is affected, who makes decisions, who depends on the outcome, and who can influence the process?"**



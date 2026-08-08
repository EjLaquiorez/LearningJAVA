# 📍 Current Learning Location

```text
Phase 6
└── Stakeholder Understanding
    └── 🚧 Topic 013 — Stakeholders vs Users ← CURRENT
```

We have completed **Phase 5 — Modeling Responsibilities**:

```text
Phase 5
└── Modeling Responsibilities
    ├── 011 — Swimlane Thinking ✅
    └── 012 — Information Flow ✅
```

Now we move to **Topic 013 — Stakeholders vs Users**.

---

# Topic 013 — Stakeholders vs Users

## Objective

Learn to distinguish between:

* **Users**
* **Stakeholders**

and understand why not everyone affected by a system is necessarily a user of that system.

The goal is to stop thinking:

> "The user is the only person we need to understand."

Instead, we will learn to see the wider business environment around the software.

---

# 1. Start With a Simple Example

Imagine we are building a **restaurant ordering system**.

People involved might include:

```text
Customer
Waiter
Cashier
Kitchen Staff
Restaurant Manager
Restaurant Owner
Accountant
System Administrator
```

At first glance, you might think:

> "All of these people are users."

But that may not be true.

Some may directly interact with the software.

Others may never touch the software but are still affected by it.

That is the distinction we need to learn.

---

# 2. What Is a User?

A **user** is someone who directly interacts with a system.

For example:

```text
Waiter
   ↓
Restaurant System
```

The waiter might:

* Create an order
* View an order
* Update an order
* Check order status

Therefore:

```text
Waiter = User
```

because the waiter directly interacts with the system.

Another example:

```text
Cashier
   ↓
Payment System
```

The cashier directly processes payments through the system.

Therefore:

```text
Cashier = User
```

---

# 3. What Is a Stakeholder?

A **stakeholder** is someone who is affected by the business process, system, or project, or has an interest in its outcome.

A stakeholder does **not** necessarily use the software.

For example:

```text
Restaurant Owner
```

The owner may never log into the ordering system.

But the owner cares about:

* Sales
* Costs
* Customer satisfaction
* Operational efficiency
* Business performance

Therefore:

```text
Restaurant Owner = Stakeholder
```

even if:

```text
Restaurant Owner ≠ User
```

---

# 4. The Important Relationship

A useful mental model is:

```text
Stakeholders
┌─────────────────────────────┐
│                             │
│   Users                     │
│   ┌─────────────────────┐   │
│   │ People who directly │   │
│   │ use the system      │   │
│   └─────────────────────┘   │
│                             │
│   Other affected people     │
│                             │
└─────────────────────────────┘
```

In other words:

> **Users can be stakeholders, but not every stakeholder is a user.**

This is one of the most important ideas in this topic.

---

# 5. Restaurant Example

Let's analyze our restaurant.

## Customer

The customer may:

```text
View menu
Place order
Pay
Receive receipt
```

If the restaurant system allows the customer to perform these actions:

```text
Customer = User
```

The customer is also affected by the system:

```text
Customer = Stakeholder
```

Therefore:

```text
Customer
├── User
└── Stakeholder
```

---

## Waiter

The waiter may:

```text
Receive orders
Update order status
View table information
```

Therefore:

```text
Waiter
├── User
└── Stakeholder
```

---

## Restaurant Owner

The owner may not use the ordering system directly.

But they care about:

```text
Sales
Costs
Customer satisfaction
Business performance
```

Therefore:

```text
Owner
└── Stakeholder
```

They may or may not be a user.

---

# 6. Why Does This Matter?

Because different people care about different things.

Imagine the waiter says:

> "The system should make taking orders faster."

The owner says:

> "The system should reduce operational costs."

The accountant says:

> "The system must provide accurate financial records."

The customer says:

> "Ordering should be easy."

All of these concerns may be valid.

But they are different.

```text
Waiter
   ↓
Operational efficiency

Owner
   ↓
Business performance

Accountant
   ↓
Financial accuracy

Customer
   ↓
Ease of ordering
```

If we only talk to the person using the software, we may miss important business requirements.

---

# 7. User Perspective vs Stakeholder Perspective

Consider an ATM system.

A customer uses the ATM:

```text
Customer
   ↓
ATM
```

The customer wants:

```text
Fast withdrawal
Easy interaction
Correct balance
Successful transaction
```

But who else might care about the ATM?

```text
Bank
Security Team
Operations Team
Regulators
```

They may not all directly use the ATM.

Yet they have concerns.

For example:

```text
Bank
   ↓
Financial accuracy

Security Team
   ↓
Fraud prevention

Operations Team
   ↓
ATM availability

Regulator
   ↓
Compliance
```

Therefore:

> The person interacting with the system is only one part of the bigger picture.

---

# 8. A Stakeholder Does Not Need a Login

This is a common mistake.

You might think:

```text
Has login?
    ↓
User
```

and:

```text
No login?
    ↓
Not important
```

That is incorrect.

A stakeholder may never log into the software.

For example:

```text
Business Owner
```

may receive a monthly report.

They don't need to use the system directly to be affected by it.

The system may still determine:

```text
Revenue
Costs
Reports
Performance
```

Therefore they are still a stakeholder.

---

# 9. Stakeholders Can Exist Outside the Organization

Stakeholders aren't necessarily employees.

Consider a payment system.

```text
Customer
Payment System
Bank
Restaurant
```

Potential stakeholders include:

```text
Customer
Restaurant Owner
Bank
Payment Provider
Regulator
```

Some of these may be external organizations.

This means we should ask:

> Who is affected by this process?

not simply:

> Who works here?

---

# 10. Stakeholders and the Business Process

This connects directly with our previous topics.

Previously we learned:

```text
Process
   ↓
Participants
   ↓
Responsibilities
```

Now we expand our thinking:

```text
Business Process
       ↓
Participants
       ↓
Responsibilities
       ↓
Users
       ↓
Stakeholders
```

But remember:

**Participant**, **User**, and **Stakeholder** are not automatically the same thing.

---

# 11. Participant vs User vs Stakeholder

Let's separate them.

## Participant

Someone or something involved in the process.

Example:

```text
Bank
```

The bank may participate in a payment process.

---

## User

Someone who directly interacts with the software.

Example:

```text
Cashier
   ↓
Payment System
```

The cashier is a user.

---

## Stakeholder

Someone affected by or interested in the outcome.

Example:

```text
Restaurant Owner
```

The owner may not directly use the payment system but cares about the results.

---

# 12. They Can Overlap

One person can belong to multiple categories.

Example:

```text
Restaurant Manager
```

They may:

```text
Use the system
```

and:

```text
Care about business performance
```

Therefore:

```text
Manager
├── Participant
├── User
└── Stakeholder
```

But another person may only be:

```text
Owner
└── Stakeholder
```

And an external system might be:

```text
Bank
└── Participant
```

depending on the context and how we define the business/system boundary.

The important lesson:

> Do not automatically assign the same label to everyone.

Analyze their actual relationship to the process and system.

---

# 13. Why Engineers Need Stakeholder Thinking

Suppose we build a payroll system.

The employee says:

> "I want to see my salary."

That is one perspective.

But who else matters?

```text
Employee
HR
Payroll Staff
Manager
Finance
Company Owner
Government / Tax Authority
```

Each may have different concerns.

```text
Employee
   ↓
Correct salary

HR
   ↓
Employee records

Payroll
   ↓
Accurate processing

Finance
   ↓
Financial reporting

Government
   ↓
Tax compliance
```

If we only design for the employee, the system may fail to satisfy the broader business.

---

# 14. Stakeholder Goals

A stakeholder is not just a name on a list.

We need to understand:

> What does this stakeholder care about?

For example:

```text
Restaurant Owner
```

Possible goal:

```text
Increase restaurant profitability
```

Possible concern:

```text
Too much operational waste
```

Possible impact:

```text
Poor order management reduces revenue
```

So stakeholder analysis begins to connect:

```text
Stakeholder
    ↓
Goal
    ↓
Concern
    ↓
Business Impact
```

---

# 15. Stakeholder Goals Can Conflict

This is extremely important.

Different stakeholders can want different things.

Example:

```text
Customer
    ↓
Fast service

Waiter
    ↓
Simple workflow

Manager
    ↓
Detailed tracking

Owner
    ↓
Lower operating costs
```

These goals may conflict.

For example:

```text
More tracking
     ↓
More information entered
     ↓
More work for waiter
```

The manager may like the additional information.

The waiter may dislike the additional work.

This is why engineering is not simply:

> "Ask the user what they want."

We need to understand the different interests involved.

---

# 16. Do Not Assume the Loudest Person Is the Only Stakeholder

Suppose a manager tells the development team:

> "We need a new ordering system."

The engineer should not immediately design the system around the manager's expectations.

Instead ask:

```text
Who will use it?
Who will be affected?
Who owns the process?
Who makes decisions?
Who depends on the results?
Who has concerns?
```

This creates a broader understanding.

---

# 17. Stakeholder Discovery Questions

When entering an unfamiliar business, ask:

### Identify

```text
Who is involved in this process?
```

### Usage

```text
Who directly uses the system?
```

### Impact

```text
Who is affected by the system?
```

### Goals

```text
What does each stakeholder want to achieve?
```

### Concerns

```text
What is each stakeholder worried about?
```

### Decisions

```text
Who makes decisions about this process?
```

### Dependencies

```text
Who depends on the output of this process?
```

---

# 18. Example — University Enrollment

Imagine a university enrollment system.

Participants may include:

```text
Student
Registrar
Professor
Finance Department
University
Payment Provider
```

Now classify them.

### Student

```text
Uses the enrollment system
Affected by enrollment
```

Therefore:

```text
Student
├── User
└── Stakeholder
```

### Registrar

```text
Uses the system
Manages enrollment
```

Therefore:

```text
Registrar
├── User
└── Stakeholder
```

### University Administration

They may not directly perform enrollment transactions.

But they care about:

```text
Enrollment numbers
Student records
Operational efficiency
```

Therefore:

```text
University Administration
└── Stakeholder
```

### Payment Provider

The payment provider may interact with the system through an integration.

Depending on our system boundary, it may be considered an external participant and stakeholder.

The important part is to investigate the actual relationship rather than blindly assigning labels.

---

# 19. Stakeholder Map

A simple stakeholder analysis can begin with:

```text
Stakeholder
    ↓
Relationship
    ↓
Goal
    ↓
Concern
```

Example:

```text
Restaurant Owner
    ↓
Owns the business
    ↓
Increase profitability
    ↓
Concerned about costs
```

Another:

```text
Waiter
    ↓
Uses ordering system
    ↓
Process orders quickly
    ↓
Concerned about complicated workflow
```

Another:

```text
Customer
    ↓
Places orders
    ↓
Receive food quickly
    ↓
Concerned about delays
```

---

# 20. Important Engineering Principle

Do not define the system only from the perspective of its users.

Think:

```text
                    BUSINESS
                       │
          ┌────────────┼────────────┐
          ▼            ▼            ▼
        Users      Stakeholders   External Parties
          │            │            │
          └────────────┼────────────┘
                       ▼
                 Business Goals
                       │
                       ▼
                  Requirements
```

The software exists inside a larger business environment.

---

# 21. Your First Exercise

## Scenario — Restaurant Ordering System

A restaurant wants to build an ordering system.

The system will allow:

```text
Customer
    ↓
Place order

Waiter
    ↓
View and manage orders

Kitchen
    ↓
View orders and update preparation status

Cashier
    ↓
Process payment

Restaurant Owner
    ↓
View sales reports
```

Potential people involved:

```text
Customer
Waiter
Kitchen Staff
Cashier
Restaurant Owner
```

---

## Question 1

Which of these people are **users**?

Don't answer based on their job title.

Use the definition:

> A user directly interacts with the system.

List your answer and explain **why** for each person.

---

## Question 2

Which of these people are **stakeholders**?

Remember:

> A stakeholder is affected by or has an interest in the system or business process.

Again, explain why.

---

## Question 3

Can someone be both a user and a stakeholder?

Give an example from the restaurant.

---

## Question 4

Can someone be a stakeholder without being a user?

Give an example from the restaurant.

---

## Question 5

Imagine the restaurant owner says:

> "I don't use the ordering system. Why do I need to be involved?"

How would you explain why the owner is still a stakeholder?

---

## Question 6

The waiter says:

> "The system should be very fast."

The owner says:

> "The system should provide detailed reports."

Are these the same requirement?

Explain why or why not.

---

# Learning Rule

Do not try to memorize the definitions.

Think about the relationships.

For every person, ask:

```text
Do they directly use the system?
        ↓
User?

Are they affected by the system
or interested in its outcome?
        ↓
Stakeholder?
```

Then ask:

```text
What do they want?
What are they concerned about?
```

---

# Core Mental Model

Remember:

```text
USER
↓
Directly interacts with the system
```

```text
STAKEHOLDER
↓
Affected by or interested in the outcome
```

And:

```text
User
  ∩
Stakeholder
```

is completely possible.

The key engineering skill is **understanding each person's relationship to the business and system**, rather than simply labeling everyone as a "user."

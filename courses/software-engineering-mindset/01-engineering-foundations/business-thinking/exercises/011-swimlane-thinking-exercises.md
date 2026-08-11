# Exercise 011 — Swimlane Thinking

## Objective

Practice separating a business process by **who is responsible for each activity**.

The goal is to understand:

- Who performs an activity
- Where responsibility changes
- Which activities belong to people
- Which activities belong to systems
- How participants communicate
- Where handoffs occur

---

# Core Principle

> Every activity in a business process should have a clear responsibility.

Instead of only mapping:

```text
Order
  ↓
Payment
  ↓
Preparation
  ↓
Delivery
```

Ask:

```text
Who takes the order?
Who processes the payment?
Who prepares the order?
Who delivers it?
```

A swimlane model separates the process by participant:

```text
Customer       Employee       System
   │              │             │
   │ Place Order  │             │
   ├─────────────►│             │
   │              │ Record Order│
   │              ├────────────►│
   │              │             │ Validate
   │              │◄────────────┤
   │              │ Prepare     │
   │◄─────────────┤             │
```

---

# Exercise 1 — Identify the Actor

For each activity, identify who should perform it.

| Activity | Responsible Actor |
|---|---|
| Place order | |
| Verify payment | |
| Prepare food | |
| Deliver food | |
| Receive food | |

Possible actors:

```text
Customer
Cashier
Kitchen Staff
Payment System
Delivery Staff
```

---

# Exercise 2 — Customer vs Employee

Consider:

```text
Customer enters restaurant
Customer chooses food
Customer places order
Employee records order
Employee sends order to kitchen
Kitchen prepares food
Customer receives food
Customer pays
Employee provides receipt
```

Separate the activities.

### Customer

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Employee

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Kitchen

```text
1. _____________________________________
```

---

# Exercise 3 — Build Basic Swimlanes

Use this process:

```text
Customer places order
Cashier records order
Kitchen receives order
Kitchen prepares food
Cashier receives completion status
Customer receives food
```

Create three lanes:

```text
CUSTOMER
--------------------------------
________________________________
________________________________
________________________________


CASHIER
--------------------------------
________________________________
________________________________
________________________________


KITCHEN
--------------------------------
________________________________
________________________________
________________________________
```

Then connect the handoffs:

```text
Customer → Cashier:
________________________________________

Cashier → Kitchen:
________________________________________

Kitchen → Cashier:
________________________________________

Cashier → Customer:
________________________________________
```

---

# Exercise 4 — Identify Responsibility Handoffs

Consider:

```text
Customer
   ↓
Cashier
   ↓
Kitchen
   ↓
Cashier
   ↓
Customer
```

### Where does responsibility change?

```text
Handoff 1:
________________________________________

Handoff 2:
________________________________________

Handoff 3:
________________________________________

Handoff 4:
________________________________________
```

### Why are handoffs important?

```text
________________________________________
________________________________________
```

---

# Exercise 5 — Human vs System

Consider:

```text
Customer enters payment
        ↓
Payment System validates payment
        ↓
Bank authorizes transaction
        ↓
Payment System returns result
        ↓
Employee confirms order
```

Identify the responsible participant.

| Activity | Human / System | Participant |
|---|---|---|
| Enter payment | | |
| Validate payment | | |
| Authorize transaction | | |
| Return payment result | | |
| Confirm order | | |

---

# Exercise 6 — Information at Handoffs

Consider:

```text
Customer
   ↓
Cashier
   ↓
Kitchen
```

### Customer → Cashier

What information is passed?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### Cashier → Kitchen

What information is passed?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### What could go wrong at either handoff?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 7 — Swimlane: Online Payment

Participants:

```text
Customer
Application
Payment System
Bank
```

Process:

```text
Customer submits payment
Application sends payment request
Payment System validates request
Payment System asks bank for authorization
Bank returns authorization
Payment System returns result
Application confirms order
Customer receives confirmation
```

Assign every activity.

| Activity | Participant |
|---|---|
| Submit payment | |
| Send payment request | |
| Validate request | |
| Request authorization | |
| Return authorization | |
| Return payment result | |
| Confirm order | |
| Receive confirmation | |

---

# Exercise 8 — Create a Swimlane Flow

Using Exercise 7, create a text-based swimlane.

```text
CUSTOMER
--------------------------------
________________________________
                         │
                         ▼

APPLICATION
--------------------------------
________________________________
                         │
                         ▼

PAYMENT SYSTEM
--------------------------------
________________________________
                         │
                         ▼

BANK
--------------------------------
________________________________
```

Now add the return flow:

```text
BANK
   │
   │ ____________________________
   ▼
PAYMENT SYSTEM
   │
   │ ____________________________
   ▼
APPLICATION
   │
   │ ____________________________
   ▼
CUSTOMER
```

---

# Exercise 9 — Responsibility vs Ownership

Consider:

```text
Customer submits application
Employee reviews application
Manager approves application
System records approval
Employee informs customer
```

### Who performs each activity?

```text
Submit:
________________________________________

Review:
________________________________________

Approve:
________________________________________

Record:
________________________________________

Inform:
________________________________________
```

### Who owns the final business decision?

```text
________________________________________
```

Important:

> The person who performs an activity is not always the person who owns the decision.

---

# Exercise 10 — Swimlane With Decision

Consider:

```text
Customer submits return
        ↓
Employee reviews return
        ↓
Is return eligible?
      /       \
    YES        NO
     ↓          ↓
Manager       Employee
approves      rejects
     ↓          ↓
Refund        Inform customer
```

Create lanes:

```text
CUSTOMER
--------------------------------
________________________________


EMPLOYEE
--------------------------------
________________________________
________________________________
________________________________


MANAGER
--------------------------------
________________________________
```

### Where is the decision?

```text
________________________________________
```

### Who makes the decision?

```text
________________________________________
```

### Who performs the resulting activities?

```text
YES path:
________________________________________

NO path:
________________________________________
```

---

# Exercise 11 — Swimlane With External Organization

Scenario:

> A customer purchases a product using a bank payment.

Participants:

```text
Customer
Store
Payment Provider
Bank
```

Map the responsibilities.

| Activity | Participant |
|---|---|
| Select product | |
| Submit payment | |
| Create payment request | |
| Process payment | |
| Authorize funds | |
| Return payment result | |
| Confirm order | |
| Receive product | |

### Identify external participants.

```text
________________________________________
```

### Why is the bank outside the store's responsibility?

```text
________________________________________
```

---

# Exercise 12 — Identify Responsibility Gaps

Consider:

```text
Customer places order
        ↓
Order is prepared
        ↓
Payment is processed
        ↓
Order is delivered
```

No participants are specified.

### Identify the likely responsible participant for each step.

```text
Place order:
________________________________________

Prepare order:
________________________________________

Process payment:
________________________________________

Deliver order:
________________________________________
```

### Why is the original process incomplete?

```text
________________________________________
________________________________________
```

---

# Exercise 13 — Identify Impossible Responsibility

Consider:

```text
Customer
   ↓
"Customer verifies bank authorization"
   ↓
"Bank prepares restaurant order"
   ↓
"Restaurant approves customer's bank account"
```

Identify what appears incorrect.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

Correct the responsibilities:

```text
Customer:
________________________________________

Bank:
________________________________________

Restaurant:
________________________________________
```

---

# Exercise 14 — Case Study: University Enrollment

Participants:

```text
Student
Enrollment Staff
University System
Registrar
Payment Provider
```

Process:

```text
Student selects course
Student submits enrollment
Staff checks student information
System checks prerequisites
Registrar approves enrollment
Student pays
Payment Provider processes payment
System records payment
Student receives confirmation
```

Assign responsibilities:

| Activity | Participant |
|---|---|
| Select course | |
| Submit enrollment | |
| Check information | |
| Check prerequisites | |
| Approve enrollment | |
| Pay | |
| Process payment | |
| Record payment | |
| Receive confirmation | |

### Identify the handoffs.

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

---

# Exercise 15 — Case Study: Pharmacy

Participants:

```text
Customer
Pharmacist
Cashier
Inventory System
Supplier
```

Scenario:

```text
Customer provides prescription
Pharmacist reviews prescription
Pharmacist checks medicine availability
Inventory System provides stock information
Pharmacist prepares medicine
Customer pays
Cashier processes payment
Customer receives medicine
```

Create the responsibility map.

```text
CUSTOMER
--------------------------------
1. _____________________________________
2. _____________________________________
3. _____________________________________


PHARMACIST
--------------------------------
1. _____________________________________
2. _____________________________________
3. _____________________________________


CASHIER
--------------------------------
1. _____________________________________


INVENTORY SYSTEM
--------------------------------
1. _____________________________________


SUPPLIER
--------------------------------
1. _____________________________________
```

### Which participant is not directly involved in the normal flow?

```text
________________________________________
```

When might that participant become involved?

```text
________________________________________
```

---

# Exercise 16 — Responsibility and Business Rules

Scenario:

> Only a manager can approve a refund above ₱10,000.

Process:

```text
Customer requests refund
        ↓
Employee reviews request
        ↓
Refund amount > ₱10,000?
      /             \
    NO               YES
     ↓                ↓
Employee approves   Manager approves
```

### Who is responsible for each step?

```text
Customer:
________________________________________

Employee:
________________________________________

Manager:
________________________________________
```

### Why should the manager not be shown as responsible for every refund?

```text
________________________________________
________________________________________
```

---

# Exercise 17 — Handoff Investigation

Consider:

```text
Customer
   ↓
Sales Employee
   ↓
Warehouse
   ↓
Delivery Staff
   ↓
Customer
```

The business reports:

> "Orders are sometimes delivered incorrectly."

Investigate the handoffs.

### Customer → Sales Employee

What could go wrong?

```text
________________________________________
```

### Sales Employee → Warehouse

What could go wrong?

```text
________________________________________
```

### Warehouse → Delivery Staff

What could go wrong?

```text
________________________________________
```

### Delivery Staff → Customer

What could go wrong?

```text
________________________________________
```

### Which handoff would you investigate first?

```text
________________________________________
```

Why?

```text
________________________________________
```

---

# Exercise 18 — Build Your Own Swimlane

Choose a process:

```text
Restaurant ordering
ATM withdrawal
University enrollment
Online shopping
Pharmacy prescription
Car repair
Hotel booking
```

### Process

```text
________________________________________
```

### Participants

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Participant 1

```text
________________________________________
________________________________________
```

### Participant 2

```text
________________________________________
________________________________________
```

### Participant 3

```text
________________________________________
________________________________________
```

### Participant 4

```text
________________________________________
________________________________________
```

### Handoffs

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

### Information exchanged

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 19 — Final Challenge

## Scenario — Online Store Order

Participants:

```text
Customer
Online Store
Payment Provider
Bank
Warehouse
Delivery Company
```

Normal flow:

```text
Customer places order
        ↓
Online Store records order
        ↓
Payment Provider processes payment
        ↓
Bank authorizes payment
        ↓
Online Store confirms order
        ↓
Warehouse prepares package
        ↓
Delivery Company receives package
        ↓
Customer receives package
```

### Part 1 — Assign Responsibility

| Activity | Participant |
|---|---|
| Place order | |
| Record order | |
| Process payment | |
| Authorize payment | |
| Confirm order | |
| Prepare package | |
| Deliver package | |
| Receive package | |

### Part 2 — Identify Handoffs

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________
```

### Part 3 — Identify Information

What moves from:

#### Customer → Online Store

```text
________________________________________
```

#### Online Store → Payment Provider

```text
________________________________________
```

#### Payment Provider → Bank

```text
________________________________________
```

#### Online Store → Warehouse

```text
________________________________________
```

#### Warehouse → Delivery Company

```text
________________________________________
```

### Part 4 — Failure Responsibility

What happens if:

```text
Payment fails:
________________________________________

Bank is unavailable:
________________________________________

Warehouse cannot find the item:
________________________________________

Delivery fails:
________________________________________
```

### Part 5 — System Boundary

Which participants are external to the online store?

```text
________________________________________
```

---

# Exercise 20 — Swimlane Review

Review a swimlane you created.

| Question | Yes / No |
|---|---|
| Does every activity have an owner? | |
| Are participants clearly identified? | |
| Are handoffs visible? | |
| Is information exchanged visible? | |
| Are external participants identified? | |
| Are decisions assigned to someone? | |
| Are failure responsibilities clear? | |
| Are system activities separated from human activities? | |

### What is missing?

```text
________________________________________
```

### What should be corrected?

```text
________________________________________
```

---

# Mastery Check

You are ready to move forward when you can consistently:

- Identify who performs each activity.
- Separate customers, employees, departments, and systems.
- Distinguish human activities from system activities.
- Identify responsibility handoffs.
- Identify information exchanged at handoffs.
- Identify external organizations.
- Assign decisions to responsible participants.
- Identify responsibility gaps.
- Recognize when ownership differs from execution.
- Analyze failures at participant boundaries.
- Create a clear swimlane representation of a business process.

---

# Final Mental Model

```text
              BUSINESS PROCESS
                     │
                     ▼
          ┌──────────┼──────────┐
          ▼          ▼          ▼
       CUSTOMER    EMPLOYEE    SYSTEM
          │          │          │
          │ Activity │ Activity │
          └─────┬────┴────┬─────┘
                │         │
                ▼         ▼
             HANDOFF   HANDOFF
                │         │
                ▼         ▼
             INFORMATION
                │
                ▼
          NEXT PARTICIPANT
                │
                ▼
             DECISION
                │
                ▼
          NEXT RESPONSIBILITY
```

---

# Reflection

### Before this exercise, I thought responsibility meant:

```text
________________________________________
```

### Now I understand that responsibility means:

```text
________________________________________
________________________________________
```

### The most important handoff in my process is:

```text
________________________________________
```

### A responsibility gap means:

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

> **When mapping a process, always ask: Who performs this activity, who receives the result, and what information crosses the handoff?**

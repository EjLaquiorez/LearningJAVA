# Swimlane Diagrams

## Objective

Learn to model business processes while clearly showing who or what performs each activity.

---

## Core Idea

A normal process map answers:

> What happens?

A swimlane diagram answers:

> What happens, and who performs it?

---

## Participants

Swimlanes can represent:

- Customers
- Employees
- Departments
- Internal systems
- External systems
- Third-party services

---

## Example

```text
CUSTOMER
──────────────
Place Order
      ↓

RESTAURANT
──────────────
Receive Order
      ↓
Prepare Food
      ↓

DELIVERY RIDER
──────────────
Pick Up Food
      ↓
Deliver Food
      ↓

CUSTOMER
──────────────
Receive Food
```

---

# Responsibility

Activities should be assigned to the participant that actually performs them.

Example:

```text
CUSTOMER
Enter PIN
```

```text
ATM
Validate PIN
```

```text
BANK
Check Account Balance
```

Do not combine these responsibilities simply because they are part of the same business activity.

---

# Decision Points in Swimlanes

A decision can occur inside a participant's responsibility.

Example:

```text
BANK
──────────────
Check Balance
      ↓
Are Funds Sufficient?
     /       \
   YES        NO
    ↓          ↓
Approve      Reject
```

The resulting paths may continue into other participants.

---

# External Participants

External systems can also have their own swimlanes.

Example:

```text
CUSTOMER
     ↓
PAYMENT SYSTEM
     ↓
BANK
```

The bank may be outside the company's organization but still participate in the process.

---

# Information Flow

When responsibility moves between participants, information or objects may move with it.

Example:

```text
CUSTOMER
    │
    │ Order
    ▼
RESTAURANT
```

Another example:

```text
BANK
    │
    │ Payment Result
    ▼
PAYMENT SYSTEM
```

---

# Engineering Questions

When creating a swimlane diagram, ask:

- Who performs this action?
- What information is being sent?
- Who receives the information?
- What decisions can occur?
- What happens if the decision fails?
- Does the process loop?
- Is an external system involved?

---

# Important Principle

A swimlane diagram is not primarily a software design.

It is a model of **responsibility within a process**.

Software may eventually implement parts of the process, but the business process should be understood first.
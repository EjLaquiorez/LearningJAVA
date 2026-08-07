# Process Mapping

## Objective

Understand how work flows through a business before designing software.

Process mapping helps engineers understand:

- What happens
- In what order it happens
- Who performs each activity
- Where decisions occur
- What happens when the normal process changes

---

## Process Map

A process map represents a workflow from beginning to end.

Example:

```text
Customer places order
        ↓
Restaurant receives order
        ↓
Restaurant prepares food
        ↓
Delivery rider picks up food
        ↓
Customer receives food
```

The goal is to understand the real business process before discussing software.

---

# Process Decomposition

Complex processes can be broken into smaller activities.

Example:

```text
Prepare Food
    ↓
Check Order
    ↓
Gather Ingredients
    ↓
Prepare Food
    ↓
Package Food
```

Decomposition helps engineers investigate each part of a process independently.

---

# Decision Points

Real processes are rarely completely linear.

A decision point changes the path depending on a condition.

Example:

```text
Is payment successful?

       /       \
     YES        NO
      ↓          ↓
Continue       Retry
```

Decision points should represent questions or conditions.

Examples:

- Is the PIN correct?
- Is the membership valid?
- Are the ingredients available?
- Is payment successful?
- Is the customer reachable?

---

# Alternative Paths

The normal process is not the only possible process.

Example:

```text
Payment

   ↓

Successful?
   /    \
 YES     NO
  ↓       ↓
Order    Retry
```

Engineers should model both successful and unsuccessful paths.

---

# Loops

Some processes repeat an activity until a condition changes.

Example:

```text
Choose Payment Method
        ↓
Process Payment
        ↓
Successful?
    /       \
  YES        NO
   ↓          ↓
Continue   Choose Again
              ↓
              └──────→ Choose Payment Method
```

Loops are important because real business processes often allow retries.

---

# Swimlane Diagrams

A swimlane diagram adds responsibility to a process.

A normal process asks:

> What happens?

A swimlane asks:

> What happens, and who performs it?

Example:

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

Every activity should belong to the participant that actually performs it.

Examples:

```text
Customer enters PIN
```

belongs to:

```text
Customer
```

while:

```text
ATM validates PIN
```

belongs to:

```text
ATM
```

and:

```text
Bank checks account balance
```

belongs to:

```text
Bank
```

Do not assign activities based on assumptions.

Ask:

> Who actually performs this action?

---

# Participants

A process can involve different types of participants:

- Customers
- Employees
- Managers
- Internal systems
- External systems
- Banks
- Payment providers
- Suppliers

These participants can interact with one another.

---

# Information Flow

Processes do not only move people or physical objects.

They also move information.

Example:

```text
Customer
   │
   │ Order
   ▼
Restaurant
```

The order is information being transferred between participants.

Another example:

```text
Payment System
      │
      │ Payment Result
      ▼
Restaurant
```

The payment result is information that affects the next business activity.

---

# External Participants

Some participants are outside the main business.

Example:

```text
Customer
    ↓
Payment System
    ↓
Bank
```

The bank is not part of the restaurant's internal operation, but it participates in the payment process.

Engineers must understand these external dependencies because they can affect the workflow.

---

# Example — Restaurant Payment

Participants:

```text
Customer
Payment System
Bank
Restaurant
```

Possible flow:

```text
CUSTOMER
──────────────
Choose Payment
      ↓
Confirm Payment
      ↓

PAYMENT SYSTEM
──────────────
Send Payment Request
      ↓

BANK
──────────────
Verify Transaction
      ↓
Check Available Funds
      ↓

Are Funds Sufficient?
       /        \
     YES         NO
      ↓           ↓
Approve        Reject
      ↓           ↓

PAYMENT SYSTEM
──────────────
Receive Result
      ↓
Notify Customer
```

---

# Successful Payment

```text
Bank
  ↓
Approve Payment
  ↓
Payment System
  ↓
Confirm Payment
  ↓
Customer
  ↓
Continue Checkout
  ↓
Restaurant
  ↓
Receive Order
```

---

# Failed Payment

```text
Bank
  ↓
Reject Payment
  ↓
Payment System
  ↓
Notify Customer
  ↓
Customer
  ↓
Choose Another Payment Method
  ↓
Try Again
  ↓
Payment System
```

This creates a loop.

---

# Data Flow Questions

When participants interact, ask:

> What information is being transferred?

Examples:

```text
Customer → Payment System

- Customer information
- Payment amount
- Selected payment method
- Payment details
```

```text
Payment System → Bank

- Payment request
- Transaction amount
- Relevant payment/account information
```

```text
Bank → Payment System

- Approval or rejection
- Transaction result
- Transaction reference
```

```text
Payment System → Customer

- Payment status
- Transaction reference
- Receipt information
```

```text
Payment System → Restaurant

- Payment confirmation
- Order information
- Transaction reference
```

The exact information depends on the real business and system.

Do not assume data that has not been verified.

---

# Engineering Questions

When analyzing a process, ask:

1. What happens?
2. Who performs it?
3. What information is involved?
4. What decision can occur?
5. What happens if the decision is NO?
6. Can the process repeat?
7. What external participants are involved?
8. What information moves between participants?
9. What happens if an external participant fails?
10. Where does the process end?

---

# Core Mental Model

```text
Process
   ↓
Decompose
   ↓
Identify Participants
   ↓
Assign Responsibilities
   ↓
Identify Decisions
   ↓
Model Alternative Paths
   ↓
Identify Loops
   ↓
Identify Information Flow
   ↓
Investigate Unknowns
```

This allows engineers to understand a business process before designing software.
# 012 — Information Flow

## Objective

Learn to identify and reason about the information that moves through a business process.

The goal is to understand:

- What information is needed
- Who provides it
- Who receives it
- Why the receiver needs it
- What action the information enables
- What information is produced afterward
- What information is uncertain and requires investigation

---

# 1. What Is Information Flow?

A business process is not only about activities.

We also need to understand the information moving between those activities and participants.

A useful model is:

```text
Source
   ↓
Information
   ↓
Receiver
   ↓
Why does the receiver need it?
   ↓
What action does it enable?
```

For example:

```text
Customer
   |
   | Order information
   ↓
Waiter
```

The important question is not simply:

> "What information exists?"

Instead ask:

> "Who needs this information, and why?"

---

# 2. Information Enables Activities

Information is often an input to an activity.

Example:

```text
Customer
   |
   | Order details
   ↓
Waiter
   |
   ↓
Process order
```

The waiter needs the order details to understand what the customer requested.

Another example:

```text
Waiter
   |
   | Order details
   ↓
Kitchen
   |
   ↓
Prepare food
```

The kitchen needs the order information to know what food to prepare and in what quantity.

The relationship is:

```text
Information
     ↓
Activity
     ↓
Result
```

---

# 3. Information Can Enable Decisions

Information does not only support activities.

It can also allow a participant to decide what happens next.

Example:

```text
Kitchen
   |
   | Order status: READY
   ↓
Waiter
   |
   ↓
Decides food can be served
```

The information is useful because it enables the next action.

A useful mental model is:

```text
Information
     ↓
Understanding / Decision
     ↓
Action
```

---

# 4. Information Can Produce New Information

Information can be used to create or update other information.

Example:

```text
Customer
   |
   | Payment information
   ↓
Cashier
   |
   ↓
Process payment
   |
   | Payment status
   ↓
Customer
```

The original information:

```text
Payment information
```

is used during the activity.

The process then produces:

```text
Payment status
```

The important idea is that information can change as the process progresses.

---

# 5. Information Can Represent State

Business processes often track the state of something.

For example:

```text
Order
   ↓
Received
   ↓
Preparing
   ↓
Ready
   ↓
Delivered
```

The order itself may remain the same business object, while its status changes.

This can be represented as:

```text
Order
   ↓
Status: Received
   ↓
Status: Preparing
   ↓
Status: Ready
   ↓
Status: Delivered
```

The process therefore changes the information associated with the business activity.

---

# 6. Information Flow Between Participants

Information commonly moves between different participants.

Example:

```text
Customer
   |
   | Order information
   ↓
Waiter
   |
   | Order information
   ↓
Kitchen
   |
   | Order status
   ↓
Waiter
```

This shows that information can move in different directions.

It does not always follow a simple one-way path.

For example:

```text
Customer
   ↓
Waiter
   ↓
Kitchen
   ↓
Waiter
   ↓
Customer
```

Information can return to a previous participant when that participant needs new information to continue the process.

---

# 7. Information Handoffs

A handoff occurs when information moves from one participant to another.

Example:

```text
Waiter
   |
   | Order information
   ↓
Kitchen
```

The handoff should be analyzed by asking:

- What information is being transferred?
- Who provides it?
- Who receives it?
- Why does the receiver need it?
- What activity will the receiver perform?
- Is any information missing?
- Is the information confirmed or assumed?

This connects information flow with swimlane thinking.

---

# 8. Information Flow vs Physical Flow

A business process can contain both physical flow and information flow.

## Physical Flow

Something physical moves.

Example:

```text
Kitchen
   |
   | Food
   ↓
Waiter
```

The food is physically transferred.

## Information Flow

Information about something moves.

Example:

```text
Kitchen
   |
   | Order status: READY
   ↓
Waiter
```

The waiter receives information about the state of the order.

The distinction is:

```text
Physical Flow
    ↓
Something physically moves

Information Flow
    ↓
Information about the business process moves
```

Both can exist in the same process.

---

# 9. Information Flow Is Not Data Modeling

At this stage, the goal is not to design the software.

We are not yet deciding:

```text
Database tables
Classes
APIs
JSON
Microservices
```

Instead, we are trying to understand the business.

The progression is:

```text
Business
   ↓
Process
   ↓
Participants
   ↓
Responsibilities
   ↓
Information
   ↓
Information Flow
```

Software design comes later.

---

# 10. Facts vs Assumptions

Engineers must avoid inventing information that the business has not confirmed.

Suppose we know:

> "The cashier processes the customer's payment."

We know:

```text
Customer
   |
   | Payment
   ↓
Cashier
```

But we may not know:

- Which payment methods are accepted
- Whether receipts are provided
- Whether credit is allowed
- What payment information is required
- Whether there are restrictions on certain payment methods

These should not automatically become facts.

Instead:

```text
Known
   ↓
Unknown
   ↓
Investigation
   ↓
Confirmed information
```

---

# 11. Questions Are Part of Information Analysis

When information is uncertain, ask questions instead of making assumptions.

For example:

```text
Unknown:
What payment methods are accepted?
```

Investigation question:

> What payment methods does the cashier accept?

Another:

> Does the business provide receipts after payment?

Another:

> Are there restrictions or special rules for certain payment methods?

The purpose is to discover the actual business process.

---

# 12. Information Flow and Business Responsibilities

Swimlane thinking answers:

> Who does what?

Information flow adds:

> What information do they need to do it?

Together:

```text
Participant
    ↓
Responsibility
    ↓
Information Needed
    ↓
Activity
    ↓
Result
    ↓
Information Produced
```

Example:

```text
Customer
    |
    | Order information
    ↓
Waiter
    |
    | Uses order information
    ↓
Kitchen
    |
    | Prepares food
    ↓
Order status: READY
    |
    ↓
Waiter
```

This gives us a much clearer understanding of the business process.

---

# 13. Information Flow and Decisions

Business decisions depend on information.

Example:

```text
Student submits enrollment request
             ↓
     Check requirements
             ↓
      Requirements met?
          /       \
        YES       NO
         ↓         ↓
      Approve    Reject
```

The important engineering question is:

> What information is required to make the decision?

We should identify:

- Information used by the decision
- Information required to verify the condition
- Result of the decision
- Information communicated after the decision

The mental model is:

```text
Information
     ↓
Decision
     ↓
Result
     ↓
Next activity
```

---

# 14. A Complete Information Flow Model

A useful way to analyze a business process is:

```text
Source
    ↓
Information
    ↓
Receiver
    ↓
Purpose
    ↓
Activity / Decision
    ↓
Result
    ↓
New Information
    ↓
Next Participant
```

Example:

```text
Customer
    |
    | Order details
    ↓
Waiter
    |
    | Uses order details
    ↓
Kitchen
    |
    | Order status: READY
    ↓
Waiter
    |
    | Serves food
    ↓
Customer
    |
    | Payment information
    ↓
Cashier
    |
    | Payment status
    ↓
Customer
```

This combines:

```text
Process
    +
Responsibilities
    +
Information
    +
Decisions
    +
Information Flow
```

---

# 15. Engineering Principles

## Principle 1 — Ask Who Needs the Information

Do not simply list information.

Ask:

> Who needs this information?

---

## Principle 2 — Ask Why They Need It

Information should be connected to a responsibility or activity.

```text
Information
    ↓
Why is it needed?
    ↓
What does it enable?
```

---

## Principle 3 — Do Not Invent Information

If something is not confirmed:

```text
Unknown
```

not:

```text
Assumed fact
```

Investigate first.

---

## Principle 4 — Distinguish Physical Flow From Information Flow

A business process may contain:

```text
Physical Flow
    +
Information Flow
```

They are related but not the same.

---

## Principle 5 — Information Can Change

Information can be:

```text
Created
   ↓
Used
   ↓
Verified
   ↓
Changed
   ↓
Passed to another participant
```

---

## Principle 6 — Information Can Enable Decisions

When a process contains a decision, ask:

> What information allows this decision to happen?

---

# 16. Engineering Mental Model

When analyzing information flow, think:

```text
WHO
 ↓
DOES WHAT
 ↓
USING WHAT INFORMATION
 ↓
PRODUCES WHAT RESULT
 ↓
WHAT INFORMATION CHANGES
 ↓
WHO NEEDS IT NEXT
```

This helps an engineer understand the business before thinking about software.

---

# 17. Connection to Previous Topics

Information Flow builds directly on the previous topics.

```text
Process Mapping
    ↓
What happens?
```

```text
Bottleneck Thinking
    ↓
Where does the process become restricted?
```

```text
Swimlane Thinking
    ↓
Who does what?
```

```text
Information Flow
    ↓
What information moves between them?
```

Together:

```text
Business Process
       ↓
Activities
       ↓
Participants
       ↓
Responsibilities
       ↓
Handoffs
       ↓
Information Flow
       ↓
Decisions
       ↓
Results
```

This creates a much more complete picture of how a business operates.

---

# 18. Key Questions to Reuse

When analyzing any business process, ask:

### Information

- What information is provided?
- What information is received?
- What information is produced?
- What information changes?

### Responsibility

- Who needs the information?
- Why do they need it?
- What activity does it enable?

### Handoffs

- Who provides the information?
- Who receives it?
- What happens after the handoff?

### Decisions

- What information is required?
- What decision does it support?
- What result does the decision produce?

### Uncertainty

- What do we know?
- What do we not know?
- What should we investigate?

---

# Summary

Information Flow teaches us to look beyond the visible activities of a business process.

Instead of only seeing:

```text
Customer
   ↓
Waiter
   ↓
Kitchen
   ↓
Customer
```

we learn to see:

```text
Customer
   |
   | Order information
   ↓
Waiter
   |
   | Order information
   ↓
Kitchen
   |
   | Order status
   ↓
Waiter
   |
   | Food / service
   ↓
Customer
```

The engineer asks:

> **Who provides the information?**

> **Who receives it?**

> **Why is it needed?**

> **What action or decision does it enable?**

> **What information is produced afterward?**

> **What is known, what is assumed, and what still needs investigation?**

This is the foundation for understanding how information moves through real business systems before translating that understanding into software.

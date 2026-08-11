# Exercise 010 — Process Mapping

## Objective

Practice representing a business process from beginning to end.

The goal is to make a workflow visible so that you can understand:

- Sequential activities
- Decision points
- Happy paths
- Alternative paths
- Failure paths
- Loops
- Participants
- Information movement

---

# Core Principle

> A process map should make it possible to see what happens, what happens next, and what happens when something goes wrong.

Use this mental model:

```text
Start
  ↓
Activity
  ↓
Decision?
 /     \
YES     NO
 ↓       ↓
Next    Alternative
  \     /
   ↓   ↓
  Continue
     ↓
    End
```

---

# Exercise 1 — What Is a Process Map?

In your own words, explain:

> What is a process map?

```text
________________________________________
________________________________________
________________________________________
```

Why is a process map useful to a software engineer?

```text
________________________________________
________________________________________
```

---

# Exercise 2 — Sequence the Activities

Put these activities into a logical order for a simple restaurant order:

```text
Receive food
Place order
Pay
Prepare food
Customer enters
```

Correct sequence:

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________
```

Now represent it:

```text
________________________________________
        ↓
________________________________________
        ↓
________________________________________
        ↓
________________________________________
        ↓
________________________________________
```

---

# Exercise 3 — Identify Start and End

Consider:

```text
Customer submits application
        ↓
Employee reviews application
        ↓
Application is approved
        ↓
Account is created
```

### What starts the process?

```text
________________________________________
```

### What ends the process?

```text
________________________________________
```

### Who starts the process?

```text
________________________________________
```

### What event indicates completion?

```text
________________________________________
```

---

# Exercise 4 — Add a Decision

Consider:

```text
Customer places order
        ↓
Check inventory
        ↓
Prepare order
        ↓
Deliver order
```

There is a missing decision.

Add:

```text
Is the item available?
```

Create the process:

```text
Customer places order
        ↓
Check inventory
        ↓
     Is item
    available?
      /   \
    YES    NO
     ↓      ↓
________   __________
     ↓
___________
     ↓
___________
```

### What happens when the answer is NO?

```text
________________________________________
```

---

# Exercise 5 — Happy Path

The **happy path** is the normal successful flow.

Example:

```text
Customer orders
      ↓
Payment succeeds
      ↓
Order accepted
      ↓
Food prepared
      ↓
Food delivered
      ↓
Order completed
```

Create a happy-path process for:

> ATM withdrawal

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________
```

Now represent it:

```text
________________________________________
        ↓
________________________________________
        ↓
________________________________________
        ↓
________________________________________
        ↓
________________________________________
```

---

# Exercise 6 — Alternative Path

A process does not always follow one path.

Consider:

```text
Customer places order
        ↓
Check inventory
        ↓
Is item available?
       / \
     YES  NO
      ↓    ↓
Prepare  Offer alternative
order    product
```

### What is the main path?

```text
________________________________________
```

### What is the alternative path?

```text
________________________________________
```

### Why is the alternative path important?

```text
________________________________________
________________________________________
```

---

# Exercise 7 — Failure Path

Consider:

```text
Customer pays
      ↓
Payment processing
      ↓
Payment successful?
      /       \
    YES        NO
     ↓          ↓
Complete     Payment failed
order
```

### What is the failure path?

```text
________________________________________
```

### What should happen after payment failure?

```text
________________________________________
```

### What information might the business need?

```text
________________________________________
```

---

# Exercise 8 — Process With Multiple Decisions

Create a process for:

> Buying a product online.

The process must include:

- Product selection
- Inventory check
- Payment
- Order confirmation

And at least two decisions.

Use:

```text
START
  ↓
________________________________________
  ↓
________________________________________
  ↓
Is product available?
    /       \
  YES        NO
   ↓          ↓
_______     _______
   ↓
________________________________________
   ↓
Payment successful?
    /       \
  YES        NO
   ↓          ↓
_______     _______
   ↓
________________________________________
   ↓
END
```

---

# Exercise 9 — Loop Thinking

Some processes repeat activities.

Consider:

```text
Enter PIN
   ↓
PIN correct?
  /      \
YES       NO
 ↓         ↓
Continue  Try again
            ↓
         Enter PIN
```

### What activity repeats?

```text
________________________________________
```

### What causes the loop?

```text
________________________________________
```

### When does the loop stop?

```text
________________________________________
```

Now add a maximum of three attempts.

```text
Attempt 1
   ↓
PIN correct?
  /      \
YES       NO
 ↓         ↓
END     Attempt 2
           ↓
       PIN correct?
        /      \
      YES       NO
       ↓         ↓
      END     Attempt 3
                 ↓
             PIN correct?
              /      \
            YES       NO
             ↓         ↓
            END      Lock account
```

What happens after the third failed attempt?

```text
________________________________________
```

---

# Exercise 10 — Identify Missing Paths

Consider:

```text
Customer submits payment
        ↓
Payment system processes payment
        ↓
Payment successful
        ↓
Order confirmed
```

What paths are missing?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

Possible examples:

```text
Payment rejected
Payment timeout
Payment system unavailable
```

Create an improved process:

```text
Customer submits payment
        ↓
Payment system processes payment
        ↓
       Decision
      /    |     \
   Success Failed Timeout
      ↓      ↓       ↓
     ____   ____    ____
       \      |      /
        \     |     /
             ↓
          Next Step
```

---

# Exercise 11 — Process Mapping From Observation

Use the observation:

```text
Customer enters bakery
Customer waits
Employee becomes available
Customer places order
Employee records order
Employee prepares order
Customer pays
Employee gives order
Customer leaves
```

Create a process map:

```text
START
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
________________________________________
  ↓
________________________________________
  ↓
________________________________________
  ↓
END
```

Now identify:

### Waiting

```text
________________________________________
```

### Manual activities

```text
________________________________________
```

### Participants

```text
________________________________________
```

---

# Exercise 12 — Process Map With Business Rules

Consider a bank withdrawal:

```text
Customer inserts card
        ↓
Enter PIN
        ↓
Verify PIN
        ↓
Select withdrawal
        ↓
Enter amount
        ↓
Check balance
        ↓
Dispense cash
```

Add these business rules:

```text
PIN must be correct.

Withdrawal cannot exceed available balance.

ATM must have enough cash.
```

Create the process map:

```text
START
  ↓
Insert card
  ↓
Enter PIN
  ↓
PIN correct?
 /        \
YES        NO
 ↓          ↓
_____      _____
 ↓
Enter amount
 ↓
Balance sufficient?
 /          \
YES          NO
 ↓            ↓
_____        _____
 ↓
ATM has enough cash?
 /          \
YES          NO
 ↓            ↓
_____        _____
 ↓
END
```

---

# Exercise 13 — Alternative vs Failure Path

Classify each path.

| Scenario | Alternative or Failure? |
|---|---|
| Customer chooses another product because the first is unavailable | |
| Payment is rejected | |
| Customer selects delivery instead of pickup | |
| Required document is missing | |
| Customer chooses another payment method | |
| External payment service is unavailable | |

Explain one of your answers:

```text
________________________________________
________________________________________
```

Important:

> The distinction depends on the business context. Not every non-happy path is necessarily a technical failure.

---

# Exercise 14 — Process Map With Participants

Create a process map for:

> Customer pays for an online order.

Participants:

```text
Customer
Application
Payment System
Bank
```

Represent the flow:

```text
Customer
    │
    │
    ▼
Application
    │
    │
    ▼
Payment System
    │
    │
    ▼
Bank
```

Now add the information exchanged.

```text
Customer → Application:
________________________________________

Application → Payment System:
________________________________________

Payment System → Bank:
________________________________________

Bank → Payment System:
________________________________________

Payment System → Application:
________________________________________

Application → Customer:
________________________________________
```

---

# Exercise 15 — Process Map With Failure Paths

Extend the online payment process.

Normal path:

```text
Customer
   ↓
Application
   ↓
Payment System
   ↓
Bank
   ↓
Payment Approved
   ↓
Order Confirmed
```

Add:

- Insufficient balance
- Invalid payment information
- Bank unavailable
- Payment timeout

Create the alternative/failure paths:

```text
Payment request
       ↓
Payment System
       ↓
      Bank
       ↓
     Result
   /    |     |      \
Approved Declined Timeout Unavailable
   ↓       ↓       ↓        ↓
 _____    _____   _____    _____
```

---

# Exercise 16 — Process Mapping a Business Problem

## Scenario

A restaurant says:

> "Orders are often delayed."

Do not propose software.

First create the current process.

Possible activities:

```text
Customer orders
Order is recorded
Order is sent to kitchen
Kitchen reviews order
Food is prepared
Food is packaged
Food is delivered
```

Create your process map:

```text
START
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
________________________________________
  ↓
________________________________________
  ↓
END
```

Now identify:

### Where could a delay occur?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

### What evidence would you need?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________
```

---

# Exercise 17 — Find the Missing Decision

Consider:

```text
Customer submits application
        ↓
Employee reviews application
        ↓
Account created
        ↓
Customer receives confirmation
```

Something important is missing.

### What decision should exist?

```text
________________________________________
```

### Create the improved process:

```text
Customer submits application
        ↓
Employee reviews application
        ↓
Application approved?
      /       \
    YES        NO
     ↓          ↓
________       ________
     ↓
Account created
     ↓
Confirmation
```

What happens when the application is rejected?

```text
________________________________________
```

---

# Exercise 18 — Find the Missing End

Consider:

```text
Customer submits return request
        ↓
Employee reviews request
        ↓
Return approved?
      /      \
    YES       NO
     ↓         ↓
Receive item   ?
```

### What is missing from the NO path?

```text
________________________________________
```

### What should happen after receiving the returned item?

```text
________________________________________
```

Complete the process:

```text
Customer submits return request
        ↓
Employee reviews request
        ↓
Return approved?
     /       \
   YES        NO
    ↓          ↓
Receive item  __________
    ↓
Inspect item
    ↓
Item acceptable?
     /       \
   YES        NO
    ↓          ↓
Refund       __________
```

---

# Exercise 19 — Complete a Real Process

Choose one real-world process:

```text
Ordering food
Buying groceries
Booking a hotel
Applying for a job
Returning a product
Opening a bank account
Enrolling in school
Paying a bill
```

### Process

```text
________________________________________
```

### Start

```text
________________________________________
```

### Main Flow

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________

5. _____________________________________

6. _____________________________________

7. _____________________________________
```

### Decisions

```text
1. _____________________________________

2. _____________________________________
```

### Alternative Paths

```text
1. _____________________________________

2. _____________________________________
```

### Failure Paths

```text
1. _____________________________________

2. _____________________________________
```

### Loops

```text
1. _____________________________________
```

### End

```text
________________________________________
```

---

# Exercise 20 — Final Challenge

## Scenario — University Enrollment

A student wants to enroll in a course.

Known process:

```text
Student selects course
        ↓
System checks prerequisites
        ↓
Student submits enrollment
        ↓
University reviews enrollment
        ↓
Payment
        ↓
Enrollment confirmed
```

Your task is to create a complete process map.

The process must include:

- Start
- Main flow
- At least two decisions
- Alternative path
- Failure path
- At least one loop
- End

### Your Process Map

```text
START
  ↓
________________________________________
  ↓
________________________________________
  ↓
Decision:
________________________________________
 /                              \
YES                              NO
 ↓                                ↓
________________                 ________________
 ↓
________________________________________
 ↓
Decision:
________________________________________
 /                              \
YES                              NO
 ↓                                ↓
________________                 ________________
 ↓
________________________________________
 ↓
Payment
 ↓
Payment successful?
 /              \
YES              NO
 ↓                ↓
________         ________________
 ↓
Enrollment confirmed
 ↓
END
```

### Loop

Where could the process repeat?

```text
________________________________________
```

### Alternative Path

```text
________________________________________
```

### Failure Path

```text
________________________________________
```

### What information is required?

```text
1. _____________________________________

2. _____________________________________

3. _____________________________________

4. _____________________________________
```

---

# Exercise 21 — Process Map Review

Review a process map you created.

Check each item.

| Question | Yes / No |
|---|---|
| Is there a clear start? | |
| Is there a clear end? | |
| Are the activities ordered? | |
| Are decisions visible? | |
| Are alternative paths visible? | |
| Are failure paths visible? | |
| Are loops visible? | |
| Are participants identifiable? | |
| Is information movement understandable? | |
| Are unnecessary details removed? | |

### What is missing?

```text
________________________________________
```

### What should be improved?

```text
________________________________________
```

---

# Exercise 22 — From Process Map to Investigation

Take this process:

```text
Customer
   ↓
Place Order
   ↓
Order Recorded
   ↓
Kitchen Receives Order
   ↓
Prepare Food
   ↓
Package Food
   ↓
Deliver Food
```

The business says:

> "Delivery is too slow."

### Do not immediately change the delivery step.

Investigate the whole process.

For each step, ask:

```text
How long does it take?
Who performs it?
What information is needed?
Can it wait?
Can it fail?
Can it repeat?
```

Complete:

| Step | Time | Person | Waiting? | Failure? | Repetition? |
|---|---|---|---|---|---|
| Place Order | | | | | |
| Order Recorded | | | | | |
| Kitchen Receives Order | | | | | |
| Prepare Food | | | | | |
| Package Food | | | | | |
| Deliver Food | | | | | |

### What would you investigate first?

```text
________________________________________
```

Why?

```text
________________________________________
________________________________________
```

---

# Mastery Check

You are ready to move forward when you can consistently:

- Define a process from start to end.
- Order activities correctly.
- Identify the starting event.
- Identify the ending condition.
- Represent sequential activities.
- Identify decision points.
- Represent yes/no branches.
- Identify happy paths.
- Identify alternative paths.
- Identify failure paths.
- Represent loops.
- Identify missing steps.
- Identify missing paths.
- Connect participants to process activities.
- Track information between participants.
- Use process maps to investigate business problems.
- Review a process map for completeness.

---

# Final Mental Model

```text
                         START
                           │
                           ▼
                        ACTIVITY
                           │
                           ▼
                        ACTIVITY
                           │
                           ▼
                       DECISION?
                     /           \
                   YES            NO
                    │              │
                    ▼              ▼
                MAIN PATH     ALTERNATIVE
                    │              │
                    ▼              ▼
                 ACTIVITY      ACTIVITY
                    │              │
                    └──────┬───────┘
                           ▼
                      DECISION?
                       /     \
                     YES      NO
                      │        │
                      ▼        ▼
                    LOOP     FAILURE
                      │        │
                      └────┬───┘
                           ▼
                          END
```

---

# Reflection

### Before this exercise, I thought process mapping was:

```text
________________________________________
________________________________________
```

### Now I understand that process mapping helps me:

```text
________________________________________
________________________________________
```

### The most important process element is:

```text
________________________________________
```

### The part I find hardest to map is:

```text
________________________________________
```

### I know a process map is incomplete when:

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

> **Map what actually happens from beginning to end, including decisions, alternatives, failures, and repetition.**

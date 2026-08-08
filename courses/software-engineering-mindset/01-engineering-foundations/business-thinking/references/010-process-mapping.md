# 010 — Process Mapping

## Purpose

Learn to represent a business process clearly from beginning to end.

Process mapping helps software engineers make workflows visible so they can understand:

* What happens
* Who performs each activity
* What happens next
* Where decisions occur
* Where processes can fail
* Where alternative paths exist
* Where processes repeat

---

# Core Principle

> If you cannot describe the process clearly, you probably do not understand it yet.

A process map is not simply a diagram.

It is a **model of how work actually happens**.

---

# What Is a Process?

A process is a sequence of activities that transforms something from one state to another.

Example:

```text id="s4q9ml"
Customer Places Order
        ↓
Order Recorded
        ↓
Payment Processed
        ↓
Order Prepared
        ↓
Order Completed
```

The process has:

```text
Start
  ↓
Activities
  ↓
Decisions
  ↓
Possible Paths
  ↓
Completion
```

---

# Why Process Mapping Matters

A written description can hide important details.

For example:

> "The employee processes the customer's request."

This is too vague.

A process map forces us to ask:

```text id="9q3xgk"
Receive Request
      ↓
Check Information
      ↓
Information Complete?
   ↙            ↘
 Yes             No
  ↓               ↓
Verify Request   Request Missing Info
  ↓
Approve Request
      ↓
Complete
```

Now the process is easier to reason about.

---

# Basic Process Structure

A basic process can be represented as:

```text id="p9e9tz"
START
  ↓
ACTIVITY
  ↓
ACTIVITY
  ↓
DECISION
 ↙     ↘
YES     NO
 ↓       ↓
PATH A  PATH B
  ↘     ↙
   ↓
  END
```

---

# Process Components

## 1. Start

The start identifies what triggers the process.

Examples:

* Customer places an order
* Employee submits a request
* Customer starts an application
* Payment is initiated
* Manager creates an approval request

Ask:

> What causes this process to begin?

---

## 2. Activity

An activity is work performed by a person, department, or system.

Examples:

* Receive order
* Verify information
* Calculate amount
* Record payment
* Approve request
* Prepare product
* Send notification

Use clear action-oriented names.

Prefer:

```text
Verify Payment
```

over:

```text
Payment
```

The first describes an activity.

---

## 3. Decision

A decision is a point where the process can follow different paths.

Example:

```text id="1h2frf"
Payment Successful?
      ↙       ↘
    Yes        No
     ↓          ↓
 Continue      Retry
```

A decision should represent a condition that determines what happens next.

---

## 4. Happy Path

The happy path represents the normal successful flow.

Example:

```text id="2e5n4j"
Start
  ↓
Receive Order
  ↓
Check Availability
  ↓
Process Payment
  ↓
Prepare Order
  ↓
Deliver Order
  ↓
Complete
```

The happy path is useful, but it is not enough by itself.

---

# Alternative Paths

An alternative path occurs when a condition causes the process to take a different route.

Example:

```text id="8h3wcl"
Check Availability
       ↓
Available?
    ↙      ↘
  Yes       No
   ↓         ↓
Continue   Offer Alternative
```

The alternative path is still part of the real process.

---

# Failure Paths

A failure path describes what happens when something cannot proceed normally.

Example:

```text id="l5j7k2"
Process Payment
       ↓
Successful?
    ↙       ↘
  Yes        No
   ↓          ↓
Continue     Retry
```

If the retry also fails:

```text id="j1x6s2"
Payment Failed
      ↓
Retry
      ↓
Successful?
   ↙       ↘
 Yes        No
  ↓          ↓
Continue   Cancel
```

Failure behavior is important because software must often support what happens when the normal path breaks.

---

# Loops

A loop occurs when the process repeats an activity.

Example:

```text id="n6f4z7"
Enter PIN
   ↓
PIN Correct?
  ↙       ↘
 No       Yes
 ↓         ↓
Retry     Continue
 ↓
Attempts Remaining?
  ↙          ↘
Yes           No
 ↓             ↓
Enter PIN    Block Card
```

The process repeats until a condition is satisfied or the process is terminated.

---

# Process Mapping Questions

Use these questions when creating a process map.

## Beginning

* What triggers the process?
* What is the starting condition?

## Activities

* What happens first?
* What happens next?
* What work is performed?

## People

* Who performs each activity?
* Does responsibility change between steps?

## Decisions

* Where can the process change direction?
* What condition determines the next step?

## Alternative Paths

* What happens when the normal condition is not satisfied?

## Failure Paths

* What can go wrong?
* What happens when it fails?

## Loops

* Can the process repeat?
* What causes the repetition?
* What causes the loop to stop?

## Completion

* What does successful completion mean?
* What condition marks the end?

---

# Process Mapping Method

Use this sequence when building a process map.

```text id="2os5t5"
1. Identify the trigger
        ↓
2. Identify the end condition
        ↓
3. List major activities
        ↓
4. Put activities in sequence
        ↓
5. Identify decisions
        ↓
6. Add alternative paths
        ↓
7. Add failure paths
        ↓
8. Add loops
        ↓
9. Identify responsibilities
        ↓
10. Validate the process
```

---

# Example — Customer Payment

Consider a simple payment process.

```text id="y2l3wq"
Customer Submits Payment
          ↓
Validate Payment Information
          ↓
Send Payment Request
          ↓
Payment Successful?
       ↙          ↘
     Yes           No
      ↓             ↓
Record Payment    Retry
      ↓             ↓
Issue Receipt    Successful?
      ↓           ↙       ↘
   Complete      Yes       No
                  ↓         ↓
               Continue   Cancel
```

The map makes several things visible:

* The starting point
* Validation
* Payment processing
* Success path
* Failure path
* Retry behavior
* Completion

---

# Example — University Enrollment

A simplified enrollment process might look like:

```text id="qzqf67"
Student Submits Enrollment
          ↓
Verify Student Information
          ↓
Information Complete?
      ↙          ↘
    Yes           No
     ↓             ↓
Check Eligibility  Request Missing Info
     ↓
Eligible?
   ↙       ↘
 Yes        No
  ↓          ↓
Register    Reject Enrollment
 Courses
  ↓
Calculate Fees
  ↓
Payment Complete?
   ↙       ↘
 Yes        No
  ↓          ↓
Confirm    Payment Issue
Enrollment
```

This reveals that enrollment is not simply:

```text
Student → Enroll
```

It contains:

* Validation
* Decisions
* Alternative paths
* Failure handling
* Information requirements

---

# Process Map Validation

After creating a process map, review it.

Ask:

### Start

* Does the process have a clear starting point?

### Sequence

* Does every activity have a logical next step?

### Decisions

* Are important decisions represented?

### Alternatives

* Are alternative paths represented?

### Failures

* What happens when something fails?

### Loops

* Can the process repeat?
* Is the loop visible?

### Responsibilities

* Is it clear who performs the activity?

### End

* Is successful completion clear?

---

# Common Mistakes

## 1. Mapping only the happy path

Weak:

```text id="c3y7x2"
Order
 ↓
Payment
 ↓
Complete
```

Better:

```text id="9a3m4p"
Order
 ↓
Check Availability
 ↓
Available?
 ↙       ↘
Yes       No
 ↓         ↓
Payment   Alternative
 ↓
Payment Successful?
 ↙              ↘
Yes              No
 ↓                ↓
Complete         Retry
```

Real processes contain exceptions.

---

## 2. Using vague activities

Avoid:

```text
Order
Payment
Customer
System
```

Prefer:

```text
Receive Order
Validate Payment
Prepare Order
Issue Receipt
```

Activities should describe actions.

---

## 3. Ignoring responsibility

A process map should eventually answer:

> Who performs this activity?

For example:

```text
Customer
   ↓
Submit Order

Cashier
   ↓
Verify Order

Payment System
   ↓
Process Payment

Kitchen
   ↓
Prepare Order
```

This becomes especially important when the process involves multiple participants.

---

## 4. Ignoring failure behavior

Do not assume:

```text
Payment → Success
```

Ask:

```text
What if payment fails?
```

Failure behavior is part of the process.

---

## 5. Making the map too detailed too early

Start with the major activities.

```text id="11v4d4"
Receive Order
      ↓
Process Payment
      ↓
Prepare Order
      ↓
Complete Order
```

Then decompose individual activities when more detail is needed.

Process mapping should support understanding, not create unnecessary complexity.

---

# Process Mapping and Decomposition

Process mapping and decomposition work together.

Start with:

```text id="0w4o7g"
Process Order
```

Then decompose:

```text id="yr0w7n"
Process Order
      ↓
Receive Order
      ↓
Validate Order
      ↓
Calculate Total
      ↓
Process Payment
      ↓
Send to Kitchen
```

Then individual activities can be investigated further if necessary.

---

# Process Mapping and Observation

Process maps should represent reality.

Use:

```text id="3s3bfl"
Observe
   ↓
Understand
   ↓
Map
   ↓
Validate
   ↓
Correct
```

Do not create a process map based entirely on assumptions.

If the map does not match what actually happens, investigate the difference.

---

# Process Mapping and Questions

A process map also reveals what you still do not know.

Example:

```text id="q9ukqf"
Receive Order
      ↓
Validate Order
      ↓
?
      ↓
Prepare Order
```

The `?` represents an unknown.

This gives you a focused question:

> What happens between validation and preparation?

Therefore:

```text
Process Mapping
      ↓
Unknowns Become Visible
      ↓
Better Questions
      ↓
Better Understanding
```

---

# Mental Model

```text id="x2c9yc"
Understand the Process
        ↓
Identify Activities
        ↓
Order the Activities
        ↓
Identify Decisions
        ↓
Add Alternative Paths
        ↓
Add Failure Paths
        ↓
Add Loops
        ↓
Identify Responsibilities
        ↓
Validate Against Reality
```

---

# Reusable Framework

When mapping a business process, identify:

```text
START
  ↓
ACTIVITY
  ↓
ACTIVITY
  ↓
DECISION
 ↙     ↘
YES     NO
 ↓       ↓
PATH A  PATH B
  ↘     ↙
   ↓
LOOP?
 ↙   ↘
YES   NO
 ↓     ↓
REPEAT END
```

Then ask:

```text
Who performs each activity?
What information is needed?
What can go wrong?
What happens when it fails?
What happens next?
```

---

# Key Takeaway

> A process map is a model of how work actually happens.

The goal is not to create a beautiful diagram.

The goal is to make the process understandable enough to reason about:

```text
What happens?
      ↓
Who does it?
      ↓
What information is involved?
      ↓
What decisions occur?
      ↓
What can go wrong?
      ↓
What happens next?
      ↓
How does the process end?
```

Once a process is clearly understood, it becomes much easier to identify problems, requirements, responsibilities, and potential software boundaries.

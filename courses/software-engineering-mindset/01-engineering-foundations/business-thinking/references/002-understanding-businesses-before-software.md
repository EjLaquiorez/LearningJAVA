# 002 — Understanding Businesses Before Software

## Purpose

Learn how to understand a business before designing or writing software.

Software does not exist in isolation. It is created to support real people, real processes, real information, and real business goals.

Therefore, software engineers must understand the business context before deciding what the software should do.

---

## Core Principle

> Do not design the software until you understand the work the software is supposed to support.

The engineering mindset is:

```text
Business
    ↓
People
    ↓
Activities
    ↓
Process
    ↓
Information
    ↓
Problems
    ↓
Goals
    ↓
Requirements
    ↓
Software
```

---

# 1. Understand the Business

Before thinking about software, understand what the business actually does.

Ask:

* What does the business provide?
* Who are its customers?
* What value does it provide?
* What are its main activities?
* How does the business make money?
* What activities are critical to its operation?

You do not need to understand every detail immediately.

Start by understanding the **big picture**.

---

# 2. Understand the People

Businesses are operated by people.

Identify the people involved in the process.

Examples:

* Customers
* Employees
* Managers
* Owners
* Departments
* Suppliers
* Banks
* Delivery companies
* External service providers

Ask:

> Who is involved in this work?

Then determine what each participant actually does.

---

## Example

For a restaurant:

```text
Customer
    ↓
Places Order

Cashier
    ↓
Records Order

Kitchen Staff
    ↓
Prepares Food

Server
    ↓
Delivers Food

Manager
    ↓
Handles Exceptions
```

The important point is not simply knowing the names of the participants.

You need to understand their **responsibilities**.

---

# 3. Understand the Activities

Identify the actual work being performed.

Examples:

* Receive order
* Verify information
* Record information
* Calculate amount
* Approve request
* Prepare product
* Process payment
* Deliver product
* Update records

Activities describe what people and systems actually do.

---

# 4. Understand the Process

Activities are connected together to form a process.

For example:

```text
Customer Places Order
        ↓
Employee Records Order
        ↓
Order Sent to Kitchen
        ↓
Kitchen Prepares Order
        ↓
Order Served
        ↓
Customer Pays
        ↓
Transaction Completed
```

Do not only ask:

> "What does the system need to do?"

First ask:

> "What does the business currently do?"

---

# 5. Understand the Information

Every business process uses information.

Identify:

* What information is created?
* What information is received?
* Who records it?
* Who uses it?
* Where is it stored?
* Where does it change?
* Who needs the result?

Example:

```text
Customer
    │
    │ Order
    ▼
Cashier
    │
    │ Order Details
    ▼
Kitchen
    │
    │ Completed Order
    ▼
Customer
```

The information moving between participants is part of the business process.

---

# 6. Understand the Problems

After understanding the process, investigate where problems occur.

Look for:

* Delays
* Errors
* Repetition
* Manual work
* Missing information
* Communication problems
* Bottlenecks
* Unnecessary steps
* Duplicate work
* Failed transactions
* Business risks

Example:

```text
Customer
    ↓
Places Order
    ↓
Cashier
    ↓
Long Queue
    ↓
Customer Waits
```

The problem is not necessarily:

> "The restaurant needs an ordering application."

The problem may be:

> Customers experience long waiting times because order-taking capacity is insufficient during peak hours.

That distinction matters.

---

# 7. Understand the Goals

A business process exists for a reason.

Identify what the business wants to achieve.

Examples:

* Reduce waiting time
* Reduce errors
* Process more orders
* Improve visibility
* Reduce operating cost
* Improve customer experience
* Increase accuracy
* Reduce manual work

Ask:

> What does the business want to improve?

---

# 8. Understand Constraints

Not every possible solution is practical.

Identify constraints such as:

* Budget
* Time
* Regulations
* Existing systems
* Staff capabilities
* Hardware
* Infrastructure
* Security requirements
* Business policies

Example:

```text
Possible Solution
        ↓
Budget Constraint
        ↓
Cannot afford expensive hardware
        ↓
Consider another approach
```

Constraints are part of understanding the business.

---

# Business Before Screens

One common mistake is starting with the user interface.

For example:

```text
Login Page
Dashboard
Order Page
Payment Page
Report Page
```

These are software representations.

They do not explain how the business actually operates.

Instead, start with:

```text
Customer Wants to Order
        ↓
Restaurant Accepts Order
        ↓
Kitchen Prepares Order
        ↓
Restaurant Completes Order
        ↓
Customer Pays
```

Only after understanding the business process should you ask:

> What software, if any, should support this process?

---

# Example — Restaurant

Suppose a restaurant wants an ordering system.

Do not immediately design:

```text
Login
  ↓
Menu
  ↓
Cart
  ↓
Checkout
```

First investigate:

### People

```text
Customer
Cashier
Kitchen Staff
Server
Manager
```

### Activities

```text
Customer chooses food
        ↓
Customer places order
        ↓
Cashier records order
        ↓
Payment processed
        ↓
Kitchen receives order
        ↓
Food prepared
        ↓
Food served
```

### Information

```text
Customer
    ↓
Order
    ↓
Cashier
    ↓
Order Details
    ↓
Kitchen
    ↓
Prepared Items
```

### Problems

Possible problems may include:

* Long queues
* Incorrect orders
* Slow order entry
* Missing order information
* Poor communication between cashier and kitchen

### Goal

The business may want:

> Faster and more accurate order processing.

Only now should software solutions be considered.

---

# Business Understanding Framework

Use this framework when entering an unfamiliar business:

```text
BUSINESS
   ↓
Who are we serving?
What value do we provide?

   ↓

PEOPLE
   ↓
Who performs the work?
Who receives the result?
Who makes decisions?

   ↓

ACTIVITIES
   ↓
What work is performed?

   ↓

PROCESS
   ↓
How are the activities connected?

   ↓

INFORMATION
   ↓
What information moves through the process?

   ↓

PROBLEMS
   ↓
Where does the process struggle?

   ↓

GOALS
   ↓
What should improve?

   ↓

CONSTRAINTS
   ↓
What limits possible solutions?

   ↓

REQUIREMENTS
   ↓
What must the system support?

   ↓

SOFTWARE
```

---

# Engineering Questions

When investigating an unfamiliar business, start with these questions.

## Business

* What does the business do?
* Who are its customers?
* What value does it provide?
* What is its main business activity?

## People

* Who performs the work?
* Who receives the result?
* Who makes decisions?
* Who handles exceptions?

## Activities

* What work is performed?
* What happens repeatedly?
* What activities require approval?

## Process

* What happens first?
* What happens next?
* Where are decisions made?
* What happens when something fails?

## Information

* What information is required?
* Where does it come from?
* Who records it?
* Who uses it?
* Where does it go?

## Problems

* Where does work slow down?
* Where do errors occur?
* What work is repetitive?
* Where is information missing?
* What causes frustration or cost?

## Goals

* What should improve?
* What does success look like?
* What outcome does the business want?

## Constraints

* What cannot change?
* What systems already exist?
* What regulations apply?
* What budget or time limitations exist?

---

# Common Mistakes

## 1. Starting with the software

Thinking:

```text
"What application should we build?"
```

before understanding:

```text
"What does the business actually do?"
```

---

## 2. Starting with screens

Screens are only one representation of a system.

Do not confuse:

```text
UI
```

with:

```text
Business Process
```

---

## 3. Focusing only on users

A system may affect people who never directly use it.

For example:

```text
Customer
    ↓
Employee
    ↓
Internal System
    ↓
Bank
    ↓
Manager
```

Understanding the entire process is more important than focusing only on the person clicking the interface.

---

## 4. Ignoring manual work

Manual processes often reveal important business rules.

For example:

> "The employee checks the customer's account before approving the request."

This may reveal an important business rule that the future software must support.

---

## 5. Assuming the current process is correct

Understanding the current process does not mean accepting it as ideal.

First understand:

```text
What happens today?
```

Then investigate:

```text
Why does it happen this way?
```

Then determine:

```text
What should change?
```

---

# Mental Model

```text
Understand the Business
        ↓
Understand the People
        ↓
Understand the Activities
        ↓
Understand the Process
        ↓
Understand the Information
        ↓
Understand the Problems
        ↓
Understand the Goals
        ↓
Understand the Constraints
        ↓
Define Requirements
        ↓
Design Software
```

---

# Reusable Rule

> Software engineers do not simply build software. They build software that supports real-world work.

Before designing a system, understand:

```text
Who?
What?
How?
Why?
When?
Where?
Information?
Problems?
Goals?
Constraints?
```

Then—and only then—start thinking about the software.

Exercise 021.4 — Information Needed by the System

Now we're connecting Topic 020 — Information Thinking directly to Topic 021.

You've already learned:

A responsibility tells us what the system must do.

Now we ask:

What information does the system need in order to perform that responsibility?

Scenario

A restaurant system must determine whether an order is eligible for cancellation.

The known business rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

We can represent that as:

Cancellation request
        ↓
Restaurant System
        ↓
Is order unpaid?
        ↓
Has preparation NOT started?
        ↓
Determine eligibility

The system therefore needs information about the order.

Q1 — Identify the Information

What information does the system need?

Give me at least two.

Use:

Q1:


1.
2.
🧠 Think carefully

Don't give me implementation details such as:

❌ payment_status column
❌ order database
❌ API
❌ cancellation table

We're asking:

What does the system need to know?

Think back to Topic 020.

The business rule says:

Unpaid
AND
Preparation has not started

Therefore, what facts must the system know to evaluate that rule?

Your turn — Q1 only.

Q2

For each piece of information, identify whether we know where it comes from.

Q2:

Information: Payment status
Source: Needs investigation
Known / Unknown: Unknown

Why:
The scenario does not state who produces or provides the payment
status, so we need to investigate its source.


Information: Preparation status
Source: Needs investigation
Known / Unknown: Unknown

Why:
The scenario does not state who produces or updates the preparation
status, so we need to investigate its source.



Information: Preparation status
Source:
Known / Unknown:


Why



Q3:

System responsibility:
Determine whether the order is eligible for cancellation.

Information needed:
1. Payment status
2. Preparation status

How does the information support the responsibility?

The payment status tells the system whether the order is paid or
unpaid, while the preparation status tells the system whether food
preparation has started. The system uses both pieces of information
to determine whether the order satisfies the cancellation rule.

🎯 Exercise 021.4 — Q4: Information Crossing the System Boundary

Now we connect three things you've already learned:

Topic 019
System Boundary
        ↓
Topic 020
Information + Information Source
        ↓
Topic 021
System Responsibility

Our scenario:

Restaurant System
        ↓
Needs:
Payment status
Preparation status
        ↓
Determine cancellation eligibility

But we already established something important:

Payment status
→ source unknown


Preparation status
→ source unknown

So we cannot invent the source.

Q4 — Boundary Analysis

For each piece of information, answer:

Q4:

1. Information:
Payment status

Source:
Unknown / Needs investigation

Inside / Outside our system:
Unknown / Needs investigation

Why:
The scenario tells us that the Restaurant System needs the payment
status, but it does not tell us who produces or provides that
information. Therefore, we cannot yet determine whether its source
is inside or outside our system.


2. Information:
Preparation status

Source:
Unknown / Needs investigation

Inside / Outside our system:
Unknown / Needs investigation

Why:
The scenario tells us that the Restaurant System needs the
preparation status, but it does not tell us who produces or updates
that information. Therefore, we cannot yet determine whether its
source is inside or outside our system.
⚠️ Important

There's a subtle distinction here.

We know:

The Restaurant System needs the information.

But that does not mean:

The information is produced inside the Restaurant System.

For example:

External Source
      ↓
Payment status
      ↓
Restaurant System

The information could cross the boundary into our system.

But right now, we don't know whether that's actually the case.

So your answer should preserve the uncertainty.

Think like this:
What information does our system need?
        ↓
Who produces it?
        ↓
Do we know?
   ↙          ↘
 YES          NO
 ↓             ↓
Classify       Needs
source         investigation

Take Q4 only.
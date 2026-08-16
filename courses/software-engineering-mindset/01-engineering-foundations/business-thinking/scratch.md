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
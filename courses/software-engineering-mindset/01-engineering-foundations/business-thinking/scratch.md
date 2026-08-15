Exercise 019.6 — Requirements → System Responsibility

Now we're going to connect Topic 018 and Topic 019.

You already learned:

Requirement: What the system/business needs to accomplish.

Now we ask:

What responsibility does that requirement give to the system?

Scenario

Requirement:

"Customers must be able to see whether their payment was successful."

We know from 019.5:

Customer
   ↓
Restaurant System
   ↓
Bank Payment System
Q1

What responsibility does this requirement give to the restaurant system?

Use: 

Q1:
System responsibility: The system must provide the customer with the result of their payment, indicating whether it was successful.

Why: The system needs to make the payment result available to the customer so they can know whether the payment succeeded.
Don't say:

"Build a payment screen."

Think about what the system must actually be responsible for doing.

Q2

Now let's make this slightly harder.

Requirement:

"Customers must be able to know when their payment has failed."

The bank payment system is responsible for processing the payment and returning the result.

Your task:
Q2
System responsibility: The system must provide the customer with the payment result, including when the payment has failed.

Why: The customer needs to know the outcome of the payment.

Don't say:

"Send an SMS."

Don't say:

"Show a red error message."

Those are solutions.

Identify the system responsibility first.


Q3 — Responsibility vs. Actor

Now let's test whether you can separate the customer's responsibility from the system's responsibility.

Requirement:

"Customers must be able to cancel an unpaid order before preparation begins."

Scenario:

Customer
   ↓
Restaurant System
   ↓
Order

Question:

Q3:
Customer's responsibility: Decide to cancel the unpaid order and request cancellation.

Restaurant system's responsibility: Process the cancellation request and update the order according to the cancellation conditions.

Why are they different? The customer owns the decision to cancel, while the system is responsible for processing the customer's decision and updating the order.

Think carefully.

The customer performs an action, while the system may be responsible for processing that action.
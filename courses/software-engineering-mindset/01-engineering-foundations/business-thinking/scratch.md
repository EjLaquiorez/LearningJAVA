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
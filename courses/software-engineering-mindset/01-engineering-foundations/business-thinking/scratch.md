🎯 Exercise 021.1 — Business Activity → System Responsibility

We're going to start very slowly.

Scenario

A restaurant has this process:

Customer
   ↓
Places order
   ↓
Restaurant System
   ↓
Records order
   ↓
Kitchen Staff
   ↓
Prepares food

Your job is not to model the entire process yet.

We're going to isolate one responsibility.

Q1

Answer these:

Q1:

Business activity:
Place an order

Who performs the business activity:
Customer

What is their responsibility:
Place the order

What is the system responsible for:
Record the order

Why are the business activity and system responsibility different?
The customer is responsible for placing the order, while the
restaurant system is responsible for recording the order. They
are different responsibilities because they are performed by
different actors and represent different actions in the business
process.
⚠️ Important

Don't answer:

"The system handles the order."

That's too broad.

We want to identify the exact responsibility.

Think:

Customer
   ↓
Places order
   ↓
What does the customer actually do?

Then:

Restaurant System
   ↓
Records order
   ↓
What exactly is the system responsible for?
Your turn: Q1 only.

Q2 — Why Is "Handles the Order" Too Broad?

We have these known responsibilities:

Restaurant System
   ↓
Records order


Restaurant System
   ↓
Receives preparation status


Customer
   ↓
Views order status

Someone says:

"The restaurant system handles the order."

Your task

Explain why that statement is not precise enough for our system model.

Use:

Q2:

Why is "handles the order" too broad?

"Handles the order" is too broad because it does not identify
what specific responsibility the system performs.

What problem does this create when we're trying to understand
the system's responsibilities?

We cannot clearly determine what the system actually owns.
"Handles" could mean recording the order, receiving information,
updating information, making decisions, or other activities.

How should we describe the responsibilities instead?

We should describe each responsibility separately and precisely
so that different responsibilities are not hidden behind one
vague phrase.
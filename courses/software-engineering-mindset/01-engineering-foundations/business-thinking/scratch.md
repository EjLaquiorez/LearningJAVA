Scenario

A restaurant has this requirement:

"Customers must be able to cancel an unpaid order before food preparation begins."

We already identified:

Customer responsibility

Decide to cancel the order and request cancellation.

But now let's focus specifically on our system.

Q1 — Identify the System Responsibility

What must the restaurant system be responsible for?

Use:

Q1:
System responsibility:
The system must process the customer's cancellation request for an eligible order and update the order accordingly.

Why: The system needs to determine whether the cancellation request can be processed based on the order's current state, then update the order if the cancellation is allowed.
Don't answer with a solution.

Avoid:

"Build a cancel button."

That's an implementation choice.

Instead ask:

What does the system actually need to do?

Think about:

Customer
   ↓
Requests cancellation
   ↓
Restaurant System
   ↓
?

What happens inside the system after receiving that request?

Q2 — Identify the Business Conditions

The requirement says:

"unpaid order"

and

"before food preparation begins."

What information does the system therefore need to know before it can process the cancellation?

Give me at least 2.

Q2:
1. If order is unpaid
2. If the cancellation is done before food preparation begins

Don't design the database.

Just identify the business information/state the system needs.

Q3 — Requirement vs. Solution

Which one is a requirement and which one is a solution?

A 

"The system must process cancellation requests for eligible orders."

B 
"Add a cancel button to the customer's order screen."

Answer:

A:
Requirement or Solution? requirement
Why? It describes the responsibility the system must fulfill without specifying how that responsibility should be implemented.


B:
Requirement or Solution? solution

Why? It specifies a particular interface mechanism—a cancel button—for allowing the customer to initiate the cancellation.

This is a direct connection back to Topic 018.
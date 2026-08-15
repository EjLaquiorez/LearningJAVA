Exercise 019.7 — Ambiguous System Boundary

Now we're going to deliberately make the boundary less obvious.

Scenario

A restaurant uses:

Customer
    ↓
Restaurant App
    ↓
Restaurant System
    ↓
Kitchen System
    ↓
Kitchen Staff

The restaurant owner tells you:

"When the kitchen starts preparing an order, its status changes to Preparing in the restaurant app."

You don't know exactly how the systems communicate.

Q1 — Identify the responsibility

Who is responsible for actually starting preparation of the food?

Q1:
Actor: kitchen staff


Responsibility:
Preparing the food

Inside or outside our system: 
Outside


Why: Kitchen staff the responsible for preparing the food
Q2 — Identify the status update

Who is responsible for changing the order status to Preparing?

Possible answers:

Kitchen Staff
Kitchen System
Restaurant System
Needs More Information
Q2:
Actor: Kitchen System


Responsibility: Changing the order status to 'preparing'


Inside or outside our system: outside


Why: It's the kitchen system's responsible not OUR system. 

Don't assume the restaurant app itself changes the status.

Q3 — Identify the information flow

We know the customer eventually sees:

Preparing

in the restaurant app.

But we don't know how that information gets there.

What do we know?

And what do we not know yet?

Use:

Q3:


What we know:
1. Kitchen staff prepares the food
2. Kitchen system updates the status
3. Restaurant app displays the status


What we don't know:
1. How the status information get to the Restaurant app
2. How the restaurant system records/updates orders inside the system
3. Who are the external system involved on every process
Q4 — Engineering judgment

The owner says:

"Just make the restaurant app update the status when the kitchen starts cooking."

Would you immediately implement that?

Answer:

Q4:
Yes / No:
No. Before implementing the proposed solution, we need to understand how the kitchen system, restaurant system, and restaurant app currently interact, which system owns the order status, and how the status information reaches the customer. Otherwise, we may build a solution based on assumptions about responsibilities and system boundaries.
Why:

Think back to Topic 018:

A stakeholder's proposed solution is not automatically the requirement.

And Topic 019:

A business activity is not automatically our system's responsibility.

Your goal here is to combine both ideas:

Business activity
       ↓
Who performs it?
       ↓
What system records it?
       ↓
Which system owns that responsibility?
       ↓
What does OUR system need to do?
       ↓
Only then → solution

Start with Q1.

Q5 — Boundary Decision

Now let's make the scenario more difficult.

The restaurant owner explains:

"The kitchen system is provided by another company. Our restaurant system receives the kitchen's order-status updates and stores them. The restaurant app gets the status from our restaurant system."

Now we have additional information.

Consider this statement:

"Our restaurant system receives the Preparing status from the external kitchen system and stores it against the order."

Answer:

Q5:
Classification: Inside


Who is responsible: restaurant system


What is the responsibility:receiving and storing the order-status update


Why: The responsibility is inside our system because the restaurant system owns the responsibility of receiving the status sent by the external kitchen system and storing that status against the order. The kitchen system remains responsible for producing the status update.

There are three systems now:

Kitchen System
     ↓
Restaurant System
     ↓
Restaurant App

The question is specifically about our restaurant system.

Don't classify the statement based on the external kitchen system being mentioned. Focus on what our system actually does.
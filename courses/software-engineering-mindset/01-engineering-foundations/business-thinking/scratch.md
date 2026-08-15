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
Actor:


Responsibility:


Inside or outside our system:


Why:
Q2 — Identify the status update

Who is responsible for changing the order status to Preparing?

Possible answers:

Kitchen Staff
Kitchen System
Restaurant System
Needs More Information
Q2:
Actor:


Responsibility:


Inside or outside our system:


Why:

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
1.
2.


What we don't know:
1.
2.
3.
Q4 — Engineering judgment

The owner says:

"Just make the restaurant app update the status when the kitchen starts cooking."

Would you immediately implement that?

Answer:

Q4:
Yes / No:


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
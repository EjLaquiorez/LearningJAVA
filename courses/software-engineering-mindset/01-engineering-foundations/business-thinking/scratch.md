Exercise 019.7 — Final Challenge

Now we're going to combine everything you've learned so far.

Scenario

A restaurant has this process:

Customer
   ↓
Restaurant App
   ↓
Restaurant System
   ↓
Kitchen System
   ↓
Kitchen Staff

The restaurant owner explains:

"Customers place orders through our app. The restaurant system sends the order to the external kitchen system. Kitchen staff prepares the food. When preparation starts, the kitchen system changes the order status to Preparing. When the food is ready, the kitchen system changes the status to Ready. Our restaurant system receives those status updates and stores them. The restaurant app then shows the current status to customers."

Q1 — Separate the Responsibilities

Break the scenario into individual responsibilities.

Use:

Q1:


1.
Actor: Customer
Responsibility: place orders
Inside / Outside: Outside


2.
Actor: Restaurant app
Responsibility: Display order status
Inside / Outside: Inside


3.
Actor: Restaurant System
Responsibility: Sends order to the kitchen system, Receive order-status updates,Store status updates
Inside / Outside: Inside


4.
Actor: Kitchen System
Responsibility: Receives the order from Restaurant system,Changes/update order status,
Inside / Outside: Outside


5.
Actor: Kitchen staff
Responsibility: Prepares food
Inside / Outside: outside


6.
Actor:
Responsibility:
Inside / Outside:

There are more than six possible activities, so you don't have to stop exactly at six.

Important

Don't group everything into:

"Restaurant system handles the order."

Break it down.

For example:

Customer
→ places order


Restaurant System
→ sends order


Kitchen System
→ receives/processes order

Each is a different responsibility.

Q2 — Identify Our System Boundary

From the scenario, identify what belongs inside our system.

Q2:


Inside our system:
1. Restaurant app
2. Restaurant system
3.


Outside our system:
1. Customer
2. Kitchen staff
3. Kitchen system
4.

Think carefully about:

Customer
Restaurant App
Restaurant System
Kitchen System
Kitchen Staff
Q3 — Identify What We Still Don't Know

Even though we have a lot of information, there are still things we don't know.

Give me at least three.

Q3:

1. We don't know whether the customer can cancel an order after been placed.
2. We don't know whether the restaurant app receives the real-time order status update.
3. We don't know whether what happens if the kitchen staff rejects the order?

Examples of the type of thinking I'm looking for:

"We don't know whether..."

Don't invent facts.

Q4 — Requirement vs. Responsibility vs. Solution

Consider:

"Customers must be able to see the current status of their order."

Identify:

Requirement:
Customer need visibility into the current state of the order from placement.


System responsibility:
receive status update
store status update
send order details
send status information for the app to display


Possible solution:
Create a notification
SMS, email, chat

Remember:

Requirement
"What is needed?"


        ↓


System responsibility
"What must our system do?"


        ↓


Solution
"How could we implement it?"
Q5 — Engineering Judgment

The owner says:

"We should replace the kitchen system because it's causing the status updates to be delayed."

Would you immediately recommend replacing it?

Q5:
Yes / No:
No, it might not be the kitchen system's problem.


Why:

Think about everything you've learned.

You should be asking:

What do we actually know?
        ↓
What is the observation?
        ↓
What is the suspected cause?
        ↓
Do we have evidence?
        ↓
What responsibility belongs to which system?
        ↓
Only then...
        ↓
Should we change or replace something?
🧠 Final Thinking Challenge

Before answering, remember the entire Topic 019 mental model:

Business Activity
        ↓
Who performs it?
        ↓
What is their responsibility?
        ↓
Does our system perform it?
        ↓
If not, who does?
        ↓
Does another external system perform it?
        ↓
What does OUR system actually own?
        ↓
What information crosses the boundary?
        ↓
What do we still need to investigate?

Take Q1 first. Don't rush through all five.
Exercise 019.7 — Final Question

Now let's test the complete boundary.

The restaurant owner says:

"The kitchen system sends us Preparing and Ready statuses. Our restaurant system stores those statuses and the restaurant app shows them to customers."

Consider this statement:

"The restaurant app shows customers that their order is ready."

Q6:

Who is responsible:
Restaurant App

What is the responsibility:
Displaying the order status to customers

Inside or outside our system:
Inside

Why:
The restaurant app is part of our system and is responsible for
displaying the order status to customers.
Be careful with this distinction:
Kitchen System
      ↓
Produces "Ready"
      ↓
Restaurant System
      ↓
Stores "Ready"
      ↓
Restaurant App
      ↓
Shows "Ready"
      ↓
Customer

Don't confuse:

producing the status
storing the status
displaying the status

They may belong to different responsibilities and actors.

Give me your reasoning, not just the classification.
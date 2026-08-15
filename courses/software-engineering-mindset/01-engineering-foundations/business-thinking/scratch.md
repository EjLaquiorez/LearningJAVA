Next — Exercise 019.5: Actor vs. System

This next exercise will address a distinction that caused some of your earlier mistakes:

An actor can interact with the system without becoming part of the system.

And:

An external system can perform software-based work without becoming part of our system.

We'll use a payment example because it connects directly to your Q7/Q8 experience.

Scenario
Customer
   ↓
Restaurant System
   ↓
Bank Payment System
   ↓
Payment Result
   ↓
Restaurant System
Q1

"The customer enters their payment details into the restaurant system."

Classify it and explain:

Q1:
Who is the actor: Customer


What is the actor responsible for: Entering the payment details


Is the responsibility inside or outside our system: Outside


Why: It's the customer who is responsible for entering the payment

Focus on who performs the activity, not merely where the information is entered.


🎯 Q2

Now let's move one step forward.

"The restaurant system sends the payment request to the bank payment system."

Use:

Q2:
Who is the actor: Restaurant system


What is the actor responsible for: sends the payment request to the bank system.


Is the responsibility inside or outside our system: inside


Why: The responsible sending the payment request to the bank system is the restaurant system
Pay attention to the difference between Q1 and Q2.

Q1:

Customer enters payment details.

Q2:

Restaurant system sends payment request.

The actor has changed.

Don't classify Q2 based on the fact that the bank system is external. Identify who performs the specific activity in this sentence.

Q3

Now let's give the bank system a responsibility.

"The bank payment system validates the payment details and processes the payment."

Use:

Q3:
Who is the actor: bank payment system


What is the actor responsible for: validates the payment details and process the payment


Is the responsibility inside or outside our system: outside


Why: bank payment system is external and not inside our system
Be careful

The bank's system is definitely software.

But ask yourself:

Is it our software?

And then identify exactly what responsibility it performs.

Q4

Now let's bring the result back into our system.

"The restaurant system receives the payment result from the bank payment system and records whether the payment was successful."

Use:

Q4:
Who is the actor: restaurant system


What is the actor responsible for: receiving the payment result and records whether the payment was succesful


Is the responsibility inside or outside our system: Inside


Why: it is the restaurant system who performs the action which is receiving and recording the payment result
Pay close attention

The bank is sending the result, but the sentence describes what the restaurant system does with the result.

Don't let the presence of the external bank system make you classify the whole statement as outside.
🎯 Your Turn — Exercise 019.1

Let's start with the first exercise from your new exercise MD.

For each statement, classify it as:

A. Inside the System
B. Outside the System
C. Needs More Information

And most importantly:

Explain why.

Q1

"A restaurant waiter physically brings the prepared food to the customer's table."

Use this format:

Q1:
Classification: outside the system


Why: Because waiter "physically" brings the prepared food to the customer's table.


Who is responsible: waiter


Does the software need to perform this responsibility: No, 

Don't rush.

The goal isn't just to answer Outside.

I want you to practice the reasoning:

Activity → Actor → Responsibility → System boundary.

🎯 Q2

Now let's make it slightly harder.

"The restaurant system records that an order has been marked as served."

Use the same format:

Q2:
Classification: Inside the system


Why: The statement says system records has been marked as served


Who is responsible: the restaurant system


Does the software need to perform this responsibility: Yes

This time, pay attention to the difference between performing the business activity and recording information about the activity.

🎯 Q3

Now let's introduce human decision-making.

"A registrar reviews a student's submitted documents and decides whether the requirements are satisfied."

Use the same format:

Q3:
Classification: Outside the system


Why: A registrar is the one resposible on deciding whether the requirements are satisfied.


Who is responsible: Registrar
 

Does the software need to perform this responsibility: No

Pay special attention to the word "decides."

Don't automatically assume that because software could perform something, it should own that responsibility.

🎯 Q4

Now we're going back to the university example, but we're changing who performs the activity.

"The enrollment system stores the student's enrollment status."

Use the same format:

Q4:
Classification: inside the system


Why:  Enrollment system is the one who retains the records


Who is responsible:Enrollment system


Does the software need to perform this responsibility: Yes

Think carefully about the difference between:

Q3: The registrar makes the decision.

Q4: The system stores the result of that decision.

Don't combine the two responsibilities.

🎯 Q5

Now let's introduce something different: the customer themselves.

"A customer decides whether they want to purchase an item."

Use:

Q5:
Classification: outside the system


Why: Customer decides


Who is responsible: Customer


Does the software need to perform this responsibility: No

Be careful here.

The question isn't whether the software could help the customer decide.

The question is:

Who owns the actual decision? 


🎯 Q6

Now we're going to test whether you can recognize a business rule being executed by the system.

"The system calculates the total price of an order based on defined business rules."

Use:

Q6:
Classification: inside the system


Why: system calculates the total price


Who is responsible: The system


Does the software need to perform this responsibility: Yes
Think carefully

There are two clues:

"The system calculates..."

and

"based on defined business rules."

Don't just classify it as inside because it says "system."

Explain what responsibility the system is actually performing.

Q7:

Classification:
Outside the System

Why:
The payment processing is performed by the bank's external
payment system, which is outside the boundary of the system
we are analyzing.

Who is responsible:
The bank's external payment system

Does our software need to perform this responsibility:
No

Our system may:
Send the payment request
Receive the payment result
Record the result

Q8:

Classification:
Inside the System

Why:
The external payment system is outside our system boundary,
but our application is responsible for recording the result
returned by that external system.

Who is responsible:
Our application

Does the software need to perform this responsibility:
Yes
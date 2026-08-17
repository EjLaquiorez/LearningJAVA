🎯 Exercise 021.10 — Final Integration: Responsibility, Information, and Decision

We're continuing Topic 021.

This is the next exercise after 021.9. We're going to stop looking at each concept in isolation and make you reason through a complete business situation.

So far you've learned:

Business Activity
        ↓
Responsibility
        ↓
Responsibility Owner
        ↓
Information Needed
        ↓
Information Producer
        ↓
Information User
        ↓
Dependency
        ↓
Decision
        ↓
Decision Readiness
Scenario

A customer requests cancellation of an order.

The Restaurant System is responsible for:

Determining whether the order is eligible for cancellation.

The business rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

The Restaurant System needs:

1. Payment status
2. Preparation status

The known responsibilities are:

Kitchen Staff
→ Updates preparation status


Restaurant System
→ Determines cancellation eligibility

Current information:

Payment status:
Unpaid


Preparation status:
Unknown
Q1 — Build the Complete Reasoning Chain

What business activity triggered the system's responsibility?

Customer requests cancellation of an order.


Who performs that business activity?

Customer.


What responsibility does the Restaurant System perform?

Determining whether the order is eligible for cancellation.


Who owns that responsibility?

Restaurant System.


What information does the Restaurant System need?

1. Payment status
2. Preparation status


Who produces the preparation status?

Kitchen Staff.


Who uses the preparation status?

Restaurant System.


Why does the Restaurant System depend on the preparation status?

The Restaurant System needs the preparation status to determine
whether the order satisfies the cancellation rule.


Is the Restaurant System currently decision-ready?

Yes / No:
No.

Why?

The preparation status is unknown, so the Restaurant System does not
have all the reliable information required to evaluate the
cancellation rule.


Does the Kitchen Staff own the cancellation decision?

Yes / No:
No.

Why?

The Restaurant System owns the responsibility of determining
cancellation eligibility. The Kitchen Staff only owns the
responsibility of updating preparation status.


Does the Restaurant System need to produce preparation status
because it uses it?

Yes / No:
No.

Why?

Producing preparation status and using preparation status are
different responsibilities. The Kitchen Staff produces/updates the
status, while the Restaurant System uses it to determine
cancellation eligibility.
🧠 Your reasoning target

This time, don't answer each question as an isolated fact.

Try to see the whole chain:

Customer
   ↓
Requests cancellation
   ↓
Restaurant System
   ↓
Determines cancellation eligibility
   ↓
Requires:
   ├── Payment status
   └── Preparation status
             ↑
             │
        Kitchen Staff
             │
       Updates status

Then ask:

Can the Restaurant System perform its responsibility with the information currently available?

That's the engineering question we're training.

Important

Don't invent what the system should technically do when preparation status is unknown.

At this stage:

Unknown information
        ↓
Identify dependency
        ↓
Identify impact
        ↓
Investigate business expectation
        ↓
Only later → define behavior

Answer Q1 only.

🎯 Exercise 021.10 — Q3: Ambiguous Responsibility vs. Information

Now we're going to make the classification harder.

This time, some statements contain both an actor and an action, while others describe what the system does with information.

Your goal is not just to identify the label. You must explain what makes it that type.

Scenario

Same restaurant cancellation process:

Customer
→ requests cancellation


Restaurant System
→ determines cancellation eligibility


Kitchen Staff
→ updates preparation status


Restaurant System
→ uses preparation status and payment status


Business rule:
Order can be cancelled only if unpaid
and preparation has not started.
Q3

For each statement, identify the best classification and explain why.

1.

"The customer provides the order number when requesting cancellation."

Type:

________________________________

Why:

________________________________
________________________________
2.

"The Restaurant System receives the cancellation request."

Type:

________________________________

Why:

________________________________
________________________________
3.

"The order number identifies which order the customer wants to cancel."

Type:

________________________________

Why:

________________________________
________________________________
4.

"The Restaurant System checks the payment status."

Type:

________________________________

Why:

________________________________
________________________________
5.

"Payment status = Unpaid."

Type:

________________________________

Why:

________________________________
________________________________
6.

"Kitchen Staff updates the preparation status after preparation begins."

Type:

________________________________

Why:

________________________________
________________________________
7.

"Cancellation is allowed only when payment status is unpaid and preparation has not started."

Type:

________________________________

Why:

________________________________
________________________________
🧠 The difficult part

Pay attention to the difference between:

"The Restaurant System checks payment status."

and:

"Payment status = Unpaid."

The first describes something the system does.

The second describes information/value.

Likewise:

"Kitchen Staff updates preparation status."

describes an actor performing a responsibility.

while:

"Preparation status = Not started."

describes information.

Use this mental test:

ACTION
→ What is someone/something doing?


FACT
→ What information/state do we know?


CONDITION
→ What must be true?


RESPONSIBILITY
→ What must this actor/system be responsible for doing?

And remember: if a statement could reasonably fit more than one category, explain why you chose the best classification rather than forcing a label.

Answer all 7.

🎯 Exercise 021.10 — Q5: Responsibility vs. Information User

This is the distinction we're focusing on now:

System Responsibility ≠ Information User

They can appear together in the same statement, which is why this can be confusing.

Choices
A. Business Activity
B. System Responsibility
C. Information
D. Information Producer
E. Information User
F. Business Rule

For each statement, choose one and explain why.

1.

"The Restaurant System determines whether the order can be cancelled."

Type:

________________________________

Why:

________________________________
________________________________
2.

"The Restaurant System uses payment status to evaluate cancellation eligibility."

Type:

________________________________

Why:

________________________________
________________________________
3.

"The Restaurant System uses preparation status."

Type:

________________________________

Why:

________________________________
________________________________
4.

"The Restaurant System determines cancellation eligibility using payment status and preparation status."

Type:

________________________________

Why:

________________________________
________________________________
5.

Now compare these two statements:

A. "The Restaurant System uses preparation status."

B. "The Restaurant System determines whether cancellation is allowed."

Are they describing the same responsibility?

Yes / No:
________________________________

Why?

________________________________
________________________________
6. Final reasoning question

Complete this sentence:

The Restaurant System is an information user because __________, but its system responsibility is __________.

________________________________
________________________________
🧠 Hint

If you're stuck between B and E, ask:

System Responsibility

What must the system accomplish?

Example:

Determine whether cancellation is allowed
Information User

What information is the system using?

Example:

Uses preparation status

So you can have:

Restaurant System
       │
       ├── Information User
       │      ↓
       │   Uses preparation status
       │
       └── System Responsibility
              ↓
          Determines cancellation eligibility

The same system can be both, but those labels describe different aspects of what it is doing.

Answer Q1–Q6.

🎯 Exercise 021.10 — Q6: Decompose the Statement

This is the next step.

You've now learned that one sentence can contain multiple concepts. Instead of forcing the entire sentence into one category, we're going to break the sentence apart.

Choices
A. Business Activity
B. System Responsibility
C. Information
D. Information Producer
E. Information User
F. Business Rule
Statement

"The Restaurant System determines cancellation eligibility using payment status and preparation status provided by the Kitchen Staff."

Don't classify the entire sentence yet.

Break it into its individual parts.

1. "The Restaurant System determines cancellation eligibility."

What concept is this?

Type:
A / B / C / D / E / F


Why:
________________________________
________________________________
2. "Payment status and preparation status."

What concept is this?

Type:
A / B / C / D / E / F


Why:
________________________________
________________________________
3. "Kitchen Staff provides preparation status."

What concept is this?

Type:
A / B / C / D / E / F


Why:
________________________________
________________________________
4. Now connect the three parts.

Complete this:

Kitchen Staff
     ↓
________________________
     ↓
Restaurant System
     ↓
________________________
5. Final reasoning

Are "using information" and "owning the responsibility" the same thing?

Yes / No:
________________________


Why:
________________________________
________________________________
🧠 The mental model

This is what I want you to start seeing:

WHO PRODUCES?
Kitchen Staff
       ↓
Preparation Status
       ↓
WHO USES?
Restaurant System
       ↓
WHAT DOES IT USE IT FOR?
Determine cancellation eligibility

Notice how we can describe three different relationships without confusing them:

Producer
   ↓
Information
   ↓
User
   ↓
Responsibility / Decision

Answer all 5.
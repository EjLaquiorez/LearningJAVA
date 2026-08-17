🎯 Exercise 021.10 — Q5: Dependency vs. Responsibility

You've correctly built the flow:

Kitchen Staff
      ↓
updates
      ↓
Preparation Status
      ↓
Restaurant System
      ↓
determines
      ↓
Cancellation Eligibility

Now we're going to test whether you can distinguish depending on information from owning the decision.

Choose ONE where applicable
A. Business Activity
B. System Responsibility
C. Information
D. Information Producer
E. Information User
F. Business Rule
5.1

"The Restaurant System cannot evaluate cancellation eligibility without preparation status."

What is the main concept being described?

Type:
________________________________


Why:
________________________________
________________________________

💡 Hint:

Ask:

Is this describing who produces information, what information is needed, or what the system must accomplish?

5.2

"The Kitchen Staff is responsible for updating preparation status."

What is the main concept?

Type:
________________________________


Why:
________________________________
________________________________
5.3

"The Restaurant System depends on the Kitchen Staff for preparation-status information."

What is the main concept?

Type:
________________________________


Why:
________________________________
________________________________

⚠️ Be careful here.

The statement does not say:

"Kitchen Staff decides whether cancellation is allowed."

It says the Restaurant System depends on them for information.

5.4

"The Kitchen Staff owns the responsibility of determining whether an order can be cancelled."

Is this statement consistent with our scenario?

Yes / No:
________________________________


Why:
________________________________
________________________________
5.5 — Final reasoning

Complete this:

The Restaurant System depends on the Kitchen Staff for __________, but the Restaurant System still owns __________.

________________________________
🧠 Core distinction

Keep these separate:

Kitchen Staff
    │
    └── owns → preparation-status update
                    │
                    ↓
              information
                    │
                    ↓
Restaurant System
    │
    ├── depends on → preparation status
    │
    └── owns → cancellation decision

The key question is:

"Who owns the final responsibility?"

Not:

"Who provides the information needed to perform it?"

Answer 5.1–5.5.
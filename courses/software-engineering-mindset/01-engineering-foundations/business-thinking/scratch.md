🎯 Exercise 021.9 — Responsibility vs. Dependency vs. Decision Ownership

We're continuing Topic 021.

This exercise targets one of the most important distinctions you've been practicing:

Responsibility ownership
        ≠
Information dependency
        ≠
Decision ownership
Scenario

The Restaurant System is responsible for:

Determining whether an order is eligible for cancellation.

The business rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

The system needs:

Payment status
Preparation status

We know:

Kitchen Staff
→ Updates preparation status

The Restaurant System:

→ Uses preparation status
→ Uses payment status
→ Determines cancellation eligibility
Q1 — Identify the Three Different Relationships

Complete:

Q1:


Who owns the responsibility of updating preparation status?
________________________________




Who owns the responsibility of determining whether cancellation
is allowed?
________________________________




Who does the Restaurant System depend on for preparation status?
________________________________




Does depending on the Kitchen Staff mean the Kitchen Staff owns
the cancellation decision?


Yes / No:


Why?
________________________________




Does the Restaurant System owning the cancellation decision mean
it must produce the preparation status itself?


Yes / No:


Why?
________________________________
🧠 Use this mental model
Kitchen Staff
    │
    └── Responsibility:
        Update preparation status
              │
              ↓
        Preparation status
              │
              │ dependency
              ↓
Restaurant System
    │
    └── Responsibility:
        Determine cancellation eligibility

Notice:

Kitchen Staff owns one responsibility.

Restaurant System owns another responsibility.

The Restaurant System depends on information produced by the Kitchen Staff, but that dependency does not transfer responsibility ownership.

Likewise, the Restaurant System uses preparation status, but using information does not mean it must produce that information.

⚠️ Don't overthink this one

We're not asking you to decide:

how the systems communicate
what API should exist
what database stores the status
what happens when the status is unavailable

Stay at the responsibility and information level.

Answer Q1 only.
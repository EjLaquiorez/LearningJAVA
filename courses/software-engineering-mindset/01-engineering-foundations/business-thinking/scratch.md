🎯 Exercise 021.6 — Responsibility Ownership vs. Information Ownership

We're continuing Topic 021.

You now understand:

Business activity
      ↓
Responsibility
      ↓
Information needed
      ↓
Information source
      ↓
System responsibility

This exercise focuses on a subtle but important distinction:

Who uses information is not necessarily the same as who owns the responsibility for producing it.

Scenario

A restaurant system determines whether an order can be cancelled.

The rule is:

An order can be cancelled only if it is unpaid and preparation has not started.

The Restaurant System needs:

Payment status
Preparation status

We know:

Restaurant System
    ↓
Uses payment status
Uses preparation status
    ↓
Determines cancellation eligibility

But the sources of those statuses are not yet established.

Q1 — Identify the Responsibility

Complete:

Q1:


Business responsibility:
________________________________




Who currently owns this responsibility?
________________________________




What information is needed to perform this responsibility?


1. ______________________________
2. ______________________________




Who uses this information?
________________________________
🧠 Important

Don't answer:

"The Restaurant System owns everything because it uses the information."

Instead ask:

What exactly is the responsibility?
        ↓
Who owns THAT responsibility?

For example:

Determine cancellation eligibility
        ↓
Restaurant System

That doesn't tell us who owns:

Produce payment status
Produce preparation status

Those are separate responsibilities.

Your turn — Q1 only.
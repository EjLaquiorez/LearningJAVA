continue
🎯 Exercise 021.4 — Q5: From Information to System Model

This is the synthesis question for the exercise.

So far you've identified:

System responsibility
Restaurant System
        ↓
Determine whether the order is eligible for cancellation
Information needed
Payment status
Preparation status
Current knowledge about sources
Payment status
→ source unknown


Preparation status
→ source unknown

Now we want to connect all of these into one reasoning chain.

Q5 — Construct the System Model

Complete:

Q5:

Business rule:
An order can be cancelled only if it is unpaid and preparation
has not started.


System responsibility:
Determine whether the order is eligible for cancellation.


Information needed:
1. Payment status
2. Preparation status


Information sources:
1. Payment status → source unknown / needs investigation
2. Preparation status → source unknown / needs investigation


What the system does with the information:
The system uses the payment status and preparation status to
evaluate whether the order satisfies the cancellation rule and
determine whether cancellation is allowed.


What still needs investigation:
The source of the payment status and the source of the
preparation status.
🧠 Think through the chain

Use this mental model:

Business Rule
      ↓
What must the system determine?
      ↓
System Responsibility
      ↓
What information does it need?
      ↓
Where does that information come from?
      ↓
Do we know the sources?
      ↓
If not → investigate

For example, don't jump straight to:

"The system should call the payment API and kitchen API."

That's a solution.

We're still at:

Business understanding
        ↓
System responsibility
        ↓
Information
        ↓
Information sources
        ↓
Unknowns
⚠️ One important distinction

Your answer should not invent the information sources.

We currently know:

Payment status → unknown source
Preparation status → unknown source

So it's perfectly valid for your model to say:

Information source: Needs investigation.

That's actually the correct engineering answer when the evidence isn't available.

Your turn — Q5 only.
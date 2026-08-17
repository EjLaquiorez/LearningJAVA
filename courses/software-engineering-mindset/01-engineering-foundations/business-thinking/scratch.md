🎯 Exercise 021.8 — Information Dependencies and Decision Readiness

We're continuing Topic 021.

You've now learned to identify:

Responsibility
↓
Information needed
↓
Information source
↓
Information user
↓
Information state
↓
Decision

Now we're going to focus on an important engineering question:

Does the system have enough reliable information to perform its responsibility?

Scenario

The Restaurant System is responsible for:

Determining whether an order is eligible for cancellation.

Business rule:

An order can be cancelled only if it is unpaid and preparation has not started.

Required information:

Payment status
Preparation status

Current situation:

Payment status:
Unpaid


Preparation status:
Not started
Q1 — Is the Decision Ready?

Answer:

Q1:

Does the Restaurant System have all the information it needs
to evaluate the cancellation rule?

Yes / No:
Yes.

What required information is available?
1. Payment status = Unpaid
2. Preparation status = Not started

What required information is missing?
None.

Is any information conflicting?
No.

Can the system confidently evaluate the business rule?

Yes.

Why?
Both required pieces of information are available and consistent.
The order is unpaid and preparation has not started, so the system
has enough information to evaluate the cancellation rule.

What does "decision-ready" mean in this scenario?
Decision-ready means that the system has all the required information,
the information is sufficiently reliable and non-conflicting, and
therefore has enough information to evaluate the business rule and
make the required decision.
🧠 Think in this order

Don't start with:

"Can the system cancel?"

Start with:

What decision must the system make?
        ↓
What information does that decision require?
        ↓
Do we have all required information?
        ↓
Is the information reliable?
        ↓
Can the rule be evaluated?

For this scenario, you should distinguish:

Information exists
        ≠
Information is sufficient
        ≠
Information is conflicting

Here, the information is:

Payment status = Unpaid
Preparation status = Not started

But don't simply copy that into the answer. Explain why those facts make the system ready—or not ready—to evaluate the decision.

Your turn — Q1 only.

🎯 Exercise 021.8 — Q2: Missing Information and Decision Readiness

Now let's change only the information state.

Scenario

The Restaurant System is still responsible for:

Determining whether an order is eligible for cancellation.

The rule remains:

An order can be cancelled only if it is unpaid and preparation has not started.

But now the system receives:

Payment status:
Unpaid


Preparation status:
Unknown
Q2

Answer:

Q2:

Does the Restaurant System have all the information it needs
to evaluate the cancellation rule?

Yes / No:
No.

What required information is available?
Payment status = Unpaid.

What required information is unavailable?
Preparation status.

Is the available information conflicting?
No. The available payment status is not conflicting. The issue is
that the preparation status is missing.

Can the system confidently determine that cancellation is allowed?

Yes / No:
No.

Why?
Because the preparation status is unknown, and the business rule
requires knowing that preparation has not started.

Is the system decision-ready?

Yes / No:
No.

Why?
The system is missing the preparation status required to evaluate
the cancellation rule.

What information or business clarification is needed before the
decision can be confidently made?
We need the preparation status. If the preparation status cannot be
provided, we need to investigate what the business expects the
system to do when that required information is unavailable.
🧠 Use the same reasoning sequence
1. What decision must be made?
        ↓
2. What information is required?
        ↓
3. What information do we actually have?
        ↓
4. Is anything missing?
        ↓
5. Is anything conflicting?
        ↓
6. Can the business rule be evaluated?
        ↓
7. Is the system decision-ready?

Be careful with this distinction:

Payment status = Unpaid
Preparation status = Unknown

Unknown is not the same as "not started."

Don't decide the system's behavior yet. First identify whether it has enough evidence to make the decision.

Answer Q2 only.

Q2:

Does the Restaurant System have all the information it needs
to evaluate the cancellation rule?

Yes / No:
No.

What required information is available?
Payment status = Unpaid.

What required information is unavailable?
Preparation status.

Is the available information conflicting?
No. The available payment status is not conflicting. The issue is
that the preparation status is missing.

Can the system confidently determine that cancellation is allowed?

Yes / No:
No.

Why?
Because the preparation status is unknown, and the business rule
requires knowing that preparation has not started.

Is the system decision-ready?

Yes / No:
No.

Why?
The system is missing the preparation status required to evaluate
the cancellation rule.

What information or business clarification is needed before the
decision can be confidently made?
We need the preparation status. If the preparation status cannot be
provided, we need to investigate what the business expects the
system to do when that required information is unavailable.

🎯 Exercise 021.8 — Q3: Conflicting Information and Decision Readiness

Now we make the situation harder.

Scenario

The Restaurant System is responsible for:

Determining whether an order is eligible for cancellation.

Business rule:

An order can be cancelled only if it is unpaid and preparation has not started.

The system receives:

Payment status:
Unpaid

But preparation information comes from two sources:

Kitchen Staff:
Preparation has started


Another source:
Preparation has NOT started

So the system has two conflicting values for the same required information.

Q3

Answer:

Q3:

Does the Restaurant System have all the information it needs
to evaluate the cancellation rule?

Yes / No:
No.

Why:
Although both required information categories are present, the
preparation status is conflicting. Therefore, the system does not
have a single reliable value that it can use to confidently
evaluate the rule.


What required information is available?
1. Payment status = Unpaid
2. Preparation status = Available, but conflicting


What required information is conflicting?
Preparation status.


Is any required information missing?
No. The required information is present, but the preparation status
contains conflicting values.


Can the system confidently determine that cancellation is allowed?

Yes / No:
No.

Why:
The preparation status has conflicting values, so the system cannot
determine whether preparation has actually started or not.


Is the system decision-ready?

Yes / No:
No.

Why:
The system does not have a reliable, non-conflicting preparation
status with which to evaluate the cancellation rule.


What needs to be investigated before the system can confidently
make the cancellation decision?
Why the preparation status conflicts, which source is authoritative,
and what the business expects the system to do when the sources
disagree.
🧠 Be precise

There is an important difference between:

UNKNOWN
Preparation status = ?

and:

CONFLICTING
Preparation status = Started
Preparation status = Not started

In this scenario, the information exists, so don't call it simply "missing."

The problem is:

We don't know which information is authoritative/correct.

Think through:

Payment status
      ↓
Unpaid ✅


Preparation status
      ↓
Started ❌
      OR
Not started ❓
      ↓
Conflict
      ↓
Can the rule be confidently evaluated?

Don't invent a conflict-resolution rule such as:

"Always trust the Kitchen Staff."

That would be a business/system assumption unless the scenario establishes it.

Answer Q3 only.

🎯 Exercise 021.8 — Q4: Decision Readiness vs. System Responsibility

Now we separate two ideas that can easily get mixed together:

"The system cannot make a decision yet."

does not mean:

"The system is not responsible for making the decision."

Scenario

The Restaurant System is responsible for:

Determining whether an order is eligible for cancellation.

Required information:

Payment status
Preparation status

Current situation:

Payment status
→ Unpaid ✅


Preparation status
→ Unknown ❓
Q4

Answer:

Q4:

What is the Restaurant System's responsibility?

Determining whether an order is eligible for cancellation.


Does the Restaurant System still own this responsibility
when preparation status is unknown?

Yes.

Why?

The Restaurant System still owns the cancellation decision
responsibility. The missing preparation status only prevents the
system from confidently completing that responsibility; it does
not transfer ownership of the responsibility to another actor.


Does the missing preparation status transfer the
cancellation decision responsibility to the Kitchen Staff?

No.

Why?

The Kitchen Staff is responsible for updating the preparation
status. That does not make the Kitchen Staff responsible for
determining whether cancellation is allowed.


What is the Restaurant System missing?

Preparation status.


What responsibility does the Kitchen Staff have?

Updating the preparation status.


What responsibility does the Restaurant System have?

Determining whether the order is eligible for cancellation.


Are "not having enough information" and "not owning
the responsibility" the same thing?

No.

Why?

Not having enough information means the system lacks information
required to perform its responsibility. Not owning the responsibility
means another actor or system is responsible for performing that
responsibility. Missing information does not automatically change
responsibility ownership.
🧠 The trap

Be careful here:

Preparation status is unknown
        ↓
Restaurant System cannot confidently evaluate rule

That does NOT automatically mean:

Restaurant System
        ↓
no longer responsible

And it also does NOT mean:

Kitchen Staff
        ↓
now responsible for cancellation decision

We need to keep these separate:

KITCHEN STAFF
→ Updates preparation status


RESTAURANT SYSTEM
→ Determines cancellation eligibility

The system may be blocked by missing information while still owning the decision responsibility.

Answer Q4 only.

🏁 Exercise 021.8 — Q5: Final Responsibility & Dependency Challenge

This is the final question of Exercise 021.8.

We've now separated four concepts:

RESPONSIBILITY
What must the system/actor do?


INFORMATION
What facts are needed?


SOURCE
Who produces/updates those facts?


DECISION READINESS
Does the system have enough reliable information to perform the responsibility?
Scenario

The Restaurant System owns this responsibility:

Determine whether an order is eligible for cancellation.

Business rule:

An order can be cancelled only if it is unpaid and preparation has not started.

Required information:

1. Payment status
2. Preparation status

Current situation:

Payment status:
Unpaid


Preparation status:
Unknown

We know:

Kitchen Staff
→ Updates preparation status
Q5 — Build the Complete Model

Complete this without changing the scenario:

Business responsibility:
Determine whether an order is eligible for cancellation.

Responsibility owner:
Restaurant System

Information needed:
1. Payment status
2. Preparation status

Information source:

Payment status:
Unpaid

Preparation status:
Unknown

Which responsibility belongs to the Kitchen Staff?
Updates preparation status.

Which responsibility belongs to the Restaurant System?
Determines whether an order is eligible for cancellation.

Is the Restaurant System currently decision-ready?

Yes / No:
No.

Why?
The preparation status is unknown, so the Restaurant System does not
have all the reliable information required to evaluate the
cancellation rule.

Does the missing preparation status change who owns the cancellation
decision?

Yes / No:
No.

Why?
The Restaurant System still owns the responsibility of determining
whether cancellation is allowed. Missing information prevents it
from confidently completing that responsibility but does not
transfer ownership to another actor.

What is the dependency between the Kitchen Staff and the Restaurant
System?

The Restaurant System depends on the preparation status produced by
the Kitchen Staff because it needs that information to perform its
cancellation-decision responsibility.

What should an engineer investigate before defining system behavior
for the missing preparation status?

The engineer should investigate why the preparation status is
unavailable, how it is normally produced or provided, what the
business expects when it is unavailable, whether cancellation is
allowed in that situation, and whether there are exceptions or
alternative sources of the information.
🧠 Final reasoning challenge

Try to explain this in your own words:

The Restaurant System owns the cancellation decision, but it depends on information produced by another responsibility.

Don't just repeat the sentence.

Explain why this is possible.

Your reasoning should connect:

Kitchen Staff
    ↓
Produces/updates information
    ↓
Preparation status
    ↓
Dependency
    ↓
Restaurant System
    ↓
Uses information
    ↓
Cancellation decision
One important constraint

Don't invent:

a new business rule
a new system responsibility
a technical solution
who owns payment status
what the system should do when preparation status is unavailable

If something is unknown, mark it as unknown and identify what needs investigation.

Answer Q5 only.
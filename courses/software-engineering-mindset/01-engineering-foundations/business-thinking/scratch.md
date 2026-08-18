🎯 Topic 021 — Mastery Review Challenge

You've passed the guided exercise. Now we test whether you can transfer the reasoning to a new scenario.

This time, forget the restaurant example.

New Scenario: University Enrollment

A student requests enrollment in a course.

The Enrollment System is responsible for:

Determining whether the student is eligible to enroll.

The university has a rule:

A student may enroll only if tuition payment is confirmed and the course still has available seats.

The Enrollment System needs:

1. Payment status
2. Seat availability

The Finance Office updates payment status.

The Registrar's Office updates seat availability.

Current situation:

Payment status:
Confirmed


Seat availability:
Unknown
Q1 — Responsibility Ownership

Who owns the responsibility of determining whether the student is eligible to enroll?

Choose one:

A. Student
B. Finance Office
C. Registrar's Office
D. Enrollment System

Your answer:

Type:
________________________________


Why:
________________________________
________________________________
Q2 — Information

Which are the required pieces of information?

Choose all that apply:

A. Payment status
B. Seat availability
C. Student's favorite subject
D. Course instructor's name

Your answer:

________________________________

Why?

________________________________
________________________________
Q3 — Information Producers
3.1

Who produces/updates payment status?

A. Student
B. Finance Office
C. Registrar's Office
D. Enrollment System

Your answer:

________________________________

Why?

________________________________
________________________________
3.2

Who produces/updates seat availability?

A. Student
B. Finance Office
C. Registrar's Office
D. Enrollment System

Your answer:

________________________________

Why?

________________________________
________________________________
Q4 — Information User

Who uses payment status and seat availability to determine enrollment eligibility?

Choose one:

A. Student
B. Finance Office
C. Registrar's Office
D. Enrollment System

Your answer:

________________________________

Why?

________________________________
________________________________
Q5 — Dependency

The Enrollment System depends on the Registrar's Office for seat availability.

Does this mean the Registrar's Office owns the responsibility of deciding whether the student is eligible to enroll?

Yes / No:
________________________________

Why?

________________________________
________________________________
Q6 — Decision Readiness

The current information is:

Payment status = Confirmed
Seat availability = Unknown

Can the Enrollment System confidently determine that the student is eligible to enroll?

Yes / No:
________________________________

Why?

________________________________
________________________________
Q7 — Responsibility Transfer

Because seat availability is unknown, does the enrollment decision responsibility transfer to the Registrar's Office?

Yes / No:
________________________________

Why?

________________________________
________________________________
Q8 — Build the Model

Complete the flow:

Student
   ↓
requests enrollment
   ↓
Enrollment System
   ↓
needs
   ↓
1. ______________________
2. ______________________
   ↓
Payment status produced by
   ↓
_________________________
   
Seat availability produced by
   ↓
_________________________
   ↓
Enrollment System uses the information to
   ↓
_________________________
   ↓
Current decision readiness:
_________________________
🧠 Q9 — Most Important Question

Explain this relationship in your own words:

Finance Office → Payment Status → Enrollment System → Enrollment Decision

Your answer:

________________________________
________________________________
________________________________
🔥 Q10 — Transfer Test

Now forget the labels.

Answer this question naturally:

If the Registrar's Office produces seat availability, why doesn't that make the Registrar's Office responsible for deciding whether the student is eligible to enroll?

________________________________
________________________________
________________________________
Your goal

Don't try to make your sentences perfect.

I want to see whether you can reason:

Who produces?
      ↓
What information?
      ↓
Who uses it?
      ↓
What responsibility?
      ↓
Who owns that responsibility?
      ↓
Does missing information affect readiness?
      ↓
Does it transfer responsibility?

Q1 — Responsibility Ownership
1. Who owns the responsibility of determining whether the student is eligible to enroll?

Answer:

D. Enrollment System

Why:

The Enrollment System owns the responsibility of determining whether the student is eligible to enroll.

2. Who owns the responsibility of updating seat availability?

Answer:

C. Registrar's Office

Why:

The Registrar's Office owns the responsibility of updating seat availability.

Q2 — Information
3. Which information does the Enrollment System need?

Answer:

A. Payment status
B. Seat availability

Why:

Payment status and seat availability are the required information the Enrollment System needs to determine whether the student satisfies the enrollment rule.

4. Which information is currently unknown?

Answer:

B. Seat availability

Why:

Payment status is confirmed, but seat availability is unknown. Therefore, one required piece of information is still unavailable.

Q3 — Information Producers
5. Who produces/updates payment status?

Answer:

B. Finance Office

Why:

The Finance Office is the information producer because it is responsible for updating the payment status.

6. Who produces/updates seat availability?

Answer:

C. Registrar's Office

Why:

The Registrar's Office is the information producer because it is responsible for updating seat availability.

Q4 — Information User
7. Who uses payment status and seat availability to determine enrollment eligibility?

Answer:

D. Enrollment System

Why:

The Enrollment System is the information user because it uses payment status and seat availability to determine whether the student is eligible to enroll.

Q5 — Dependency
8. Does the Enrollment System depending on the Registrar's Office for seat availability mean the Registrar's Office owns the enrollment decision?

Answer:

No.

Why:

The Registrar's Office is responsible for updating seat availability, while the Enrollment System is responsible for determining whether the student is eligible to enroll. Producing required information does not make the producer responsible for the final decision.

Q6 — Decision Readiness
9. Can the Enrollment System confidently determine that the student is eligible to enroll?

Answer:

No.

Why:

The Enrollment System is not decision-ready because seat availability is required by the enrollment rule but is currently unknown.

Q7 — Responsibility Transfer
10. Does the unknown seat availability transfer the enrollment decision responsibility to the Registrar's Office?

Answer:

No.

Why:

The Registrar's Office still owns the responsibility of updating seat availability, while the Enrollment System still owns the responsibility of determining enrollment eligibility. Missing information prevents the Enrollment System from confidently making the decision, but it does not transfer ownership of that decision.

Q8 — Complete Model
Student
   ↓
requests enrollment
   ↓
Enrollment System
   ↓
needs
   ↓
1. Payment status
2. Seat availability
   ↓
Payment status produced/updated by
   ↓
Finance Office


Seat availability produced/updated by
   ↓
Registrar's Office
   ↓
Enrollment System uses the information to
   ↓
Determine whether the student is eligible to enroll
   ↓
Current decision readiness:
Not ready — seat availability is unknown
Q9 — Finance Office → Payment Status → Enrollment System → Enrollment Decision

Improved answer:

The Finance Office updates the payment status. The Enrollment System uses that payment-status information, together with seat availability, to determine whether the student is eligible to enroll.

Why this version is better

Your original answer said:

"then pass it down to the enrollment system."

We removed that because the scenario doesn't tell us how the information is transferred.

We know:

Finance Office
→ updates Payment Status


Enrollment System
→ uses Payment Status
→ determines Enrollment Eligibility

But we don't yet know the technical mechanism of how the information gets from one to the other.

That's an important engineering habit:

Don't invent details that the scenario hasn't established.

Q10 — Why doesn't producing seat availability make the Registrar's Office responsible for enrollment eligibility?

Improved answer:

The Registrar's Office owns the responsibility of updating seat availability, while the Enrollment System owns the responsibility of determining enrollment eligibility. Producing the information and making the enrollment decision are different responsibilities, so producing the information does not make the Registrar's Office responsible for the final decision.

🧠 The Core Model You Should Keep

This is the main reasoning pattern you successfully demonstrated:

INFORMATION PRODUCER
        ↓
produces / updates
        ↓
INFORMATION
        ↓
used by
        ↓
INFORMATION USER
        ↓
performs
        ↓
SYSTEM RESPONSIBILITY
        ↓
leads to
        ↓
DECISION

And the critical distinction:

Information Producer
        ≠
Information User
        ≠
Responsibility Owner

Also:

Dependency
        ≠
Responsibility Ownership

and:

Missing Information
        ≠
Responsibility Transfer

These are the ideas you should be able to reproduce even when the domain changes.
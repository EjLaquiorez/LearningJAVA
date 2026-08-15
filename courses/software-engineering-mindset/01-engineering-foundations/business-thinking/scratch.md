🎯 Exercise 019.9 — Defending the System Boundary

This exercise changes the skill slightly.

So far, you've mostly answered:

"Is this inside or outside?"

Now I want you to practice the harder question:

"Why?"

In real engineering work, another person may disagree with your boundary.

For example:

"Why can't the enrollment system approve the student?"

You need to defend your reasoning using responsibility ownership, not just say:

"Because it's outside."

Scenario

Consider this university enrollment process:

Student
   ↓
Submits application
   ↓
Enrollment System
   ↓
Checks whether required documents are present
   ↓
Registrar
   ↓
Reviews application
   ↓
Approves / Rejects
   ↓
Enrollment System
   ↓
Records decision
   ↓
Student
   ↓
Views enrollment status

The university's project manager says:

"Since the enrollment system already checks the student's documents, I think the system should also decide whether the student gets approved."

Q1 — Defend the Boundary

Is the project manager's conclusion justified?

Answer:

Q1:
Yes / No:


Why:

Don't simply say:

"No, because the registrar makes the decision."

Explain why the two responsibilities are different.

Think:

Checking documents
        ↓
What is being checked?

versus:

Approving/rejecting
        ↓
What is being decided?
Q2 — Identify the Responsibility Owner

Consider this statement:

"Determine whether the student satisfies the enrollment requirements."

Who currently owns this responsibility?

Q2:
Actor:


Responsibility:


Inside / Outside:


Why:

Be careful.

Don't answer based on whether software could perform it.

Answer based on the scenario.

Q3 — What Would Need to Change?

Suppose the university eventually decides:

"We want the system to automatically determine whether an application satisfies the enrollment requirements."

What would change?

Complete:

Current:


Registrar
    ↓
Determines whether requirements are satisfied




Proposed:


System
    ↓
?




What changed:

Then answer:

Would this automatically mean the system should also approve or reject the student?

Why or why not?

Q4 — Boundary Defense

The registrar says:

"I don't want the system making the enrollment decision. I want it to check the documents and give me the information I need to make the decision."

Is this a valid system boundary?

Q4:
Yes / No:


Why:

Then separate the responsibilities:

System:
1.
2.


Registrar:
1.
2.
Q5 — Final Reasoning Challenge

A developer says:

"The system can check whether all documents are complete, so we can just code the approval rules too."

Give the developer a professional engineering response.

Start with:

"We shouldn't assume that yet because..."

Then explain what you would investigate before deciding whether the approval decision belongs inside the system.

🧠 Your mental model for this exercise

Don't think:

Can software do it?
        ↓
Put it inside

Think:

Who owns the responsibility?
        ↓
What exactly is the responsibility?
        ↓
What evidence do we have?
        ↓
Has the business decided to assign it to the system?
        ↓
What does that change?
        ↓
What remains outside?

Start with Q1 only. Don't answer all five at once.
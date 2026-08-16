# Topic 020 — Information the System Needs

## Roadmap B — Software Engineering Mindset

### Purpose

Topic 020 builds directly on Topic 019 — Inside vs. Outside System.

In Topic 019, we learned to ask:

> Who performs this responsibility?

Now we move to the next question:

> What information does the responsible actor or system need in order to perform that responsibility?

The goal is to understand information from a **business and engineering perspective before thinking about implementation**.

---

# 1. Why Information Matters

A system cannot reliably perform a responsibility if it does not have the information required to perform that responsibility.

Consider:

```text
Customer
   ↓
Requests cancellation
   ↓
Restaurant System
   ↓
???
```

If the system is responsible for determining whether the cancellation is allowed, it may need information such as:

```text
Order status
Payment status
Preparation status
Cancellation rules
```

We should not immediately think:

> "Create database fields for these."

First ask:

> "What information does the responsibility depend on?"

---

# 2. Responsibility → Information

A useful mental model is:

```text
Responsibility
      ↓
What must be determined?
      ↓
What information is needed?
      ↓
Where does that information come from?
      ↓
Can our system access it?
      ↓
What is still unknown?
```

Example:

```text
Responsibility:
Determine whether an order can be cancelled

        ↓

Information needed:
Order status
Payment status
Preparation status

        ↓

Sources:
Restaurant system
Kitchen system
Customer

        ↓

System boundary:
Which information is inside?
Which crosses the boundary?
```

---

# 3. Information Is Not the Same as a Solution

Suppose someone says:

> "We need a database table containing order status."

That is already moving toward implementation.

Instead, ask:

> "What information about the order is needed?"

The answer may be:

> "The current preparation state of the order."

Only after understanding the business information should implementation be considered.

---

# 4. Information vs. Data Storage

These are different levels of thinking.

### Business level

```text
The system needs to know whether the order is being prepared.
```

### Information level

```text
Order preparation status
```

### Implementation level

```text
Store preparation_status in a database column.
```

Topic 020 focuses primarily on the first two levels.

Do not jump immediately to:

- database tables
- columns
- APIs
- classes
- frameworks
- programming languages

---

# 5. Information Required for a Decision

Many system responsibilities involve decisions.

Example:

```text
Responsibility:
Determine whether an enrollment application is complete.
```

The system may need information about:

```text
Required documents
Submitted documents
Document status
Application status
```

But we should not assume these are the actual requirements.

Instead:

> We would need to investigate what information the business actually uses to determine completeness.

This preserves the engineering habit:

```text
Known
  ↓
Unknown
  ↓
Investigation
  ↓
Requirement
```

---

# 6. Information Sources

Information can come from different actors or systems.

For example:

```text
Customer
   ↓
Provides payment details

Restaurant System
   ↓
Stores order information

Kitchen System
   ↓
Provides preparation status

Bank System
   ↓
Provides payment result
```

Our system may depend on information that is owned or produced elsewhere.

Therefore ask:

> Who provides this information?

and:

> Who owns the responsibility for producing it?

---

# 7. Information Crossing the System Boundary

This connects directly to Topic 019.

Example:

```text
Kitchen System
      ↓
Preparation status
      ↓
Restaurant System
```

The kitchen system is outside our system.

The restaurant system receives information from it.

Therefore:

```text
External responsibility:
Kitchen System determines/updates preparation status

Information crossing boundary:
Preparation status

Our responsibility:
Receive and use the status
```

The fact that our system uses information does not mean our system owns the responsibility that produced it.

---

# 8. Information vs. Actor vs. Responsibility

Keep these concepts separate.

### Actor

Who performs an activity?

```text
Registrar
```

### Responsibility

What does the actor do?

```text
Approve or reject enrollment
```

### Information

What information is involved?

```text
Enrollment application
Student documents
Enrollment status
```

A single responsibility can require several pieces of information.

---

# 9. Information vs. Assumption

Suppose we say:

> "The system needs the student's birth certificate."

That may be an assumption unless the scenario establishes it.

A better engineering statement is:

> "We need to determine which documents are required for enrollment."

Then investigate.

This follows the rule:

```text
Don't invent facts.
```

---

# 10. Information Needed vs. Information Available

These are different.

The business may require:

```text
Current doctor availability
```

But our system may not currently have access to it.

Therefore:

```text
Information needed
        ↓
Doctor availability

Information available to our system
        ↓
Unknown
```

This leads to another important question:

> Where does the information come from?

---

# 11. Information Flow Mental Model

Use this model throughout Topic 020:

```text
Responsibility
      ↓
What information is needed?
      ↓
Who provides it?
      ↓
Where is it produced?
      ↓
Does it cross our system boundary?
      ↓
Does our system need to store/use/forward it?
      ↓
What do we still need to investigate?
```

---

# 12. Example — University Enrollment

Consider:

```text
Student
   ↓
Submits application
   ↓
Enrollment System
   ↓
Checks required documents
   ↓
Registrar
   ↓
Reviews application
   ↓
Approves / Rejects
```

### System responsibility

```text
Check whether required documents have been submitted.
```

### Information the system may need

```text
Required documents
Submitted documents
Application identity
Document status
```

But remember:

> These are information categories to investigate, not confirmed implementation requirements.

### Registrar responsibility

```text
Review application
Approve / Reject
```

The registrar may need different information:

```text
Student application
Documents
Prerequisites
Exceptions
Other enrollment information
```

We should investigate what information the registrar actually uses.

---

# 13. Example — Restaurant Cancellation

Responsibility:

```text
Process cancellation request
```

Potential information:

```text
Order status
Payment status
Preparation status
Customer identity
Cancellation eligibility
```

But we should not assume every item is required.

Instead:

```text
What does the business rule depend on?
        ↓
What information represents those conditions?
        ↓
Where does that information come from?
```

---

# 14. Core Questions for Topic 020

When analyzing a system responsibility, ask:

1. **What information does this responsibility depend on?**
2. **Who produces or provides that information?**
3. **Is that information inside or outside our system?**
4. **Does our system already have the information?**
5. **What happens if the information is missing, outdated, or conflicting?**
6. **What do we still need to investigate?**

---

# 15. Common Mistakes

## Mistake 1 — Jumping to database design

Bad:

> "We need a customer table."

Better:

> "We need customer information to identify the person making the request."

## Mistake 2 — Assuming information exists

Bad:

> "The system already knows the doctor's availability."

Better:

> "The system needs the doctor's availability information; we need to determine where that information comes from."

## Mistake 3 — Confusing information ownership with system ownership

Bad:

> "The restaurant system uses kitchen status, so the restaurant system owns preparation status."

Better:

> "The kitchen system produces the preparation status; the restaurant system receives and uses it."

## Mistake 4 — Inventing business rules

Bad:

> "Orders can always be cancelled before 5 minutes."

Better:

> "We need to investigate the actual cancellation rules."

---

# 16. Topic 020 Mental Model

```text
Responsibility
      ↓
Information needed
      ↓
Information source
      ↓
System boundary
      ↓
Information flow
      ↓
Missing / uncertain information
      ↓
Investigation
```

This extends our previous model:

```text
Business Activity
      ↓
Actor
      ↓
Responsibility
      ↓
Current Owner
      ↓
System Boundary
      ↓
Information Needed
      ↓
Information Source
      ↓
Information Flow
      ↓
Unknowns
      ↓
Engineering Judgment
```

---

# 17. Connection to Previous Topics

### Topic 018

```text
Requirement
      ↓
Solution
```

We learned not to confuse what is needed with how it is implemented.

### Topic 019

```text
Activity
      ↓
Actor
      ↓
Responsibility
      ↓
System Boundary
```

We learned who owns each responsibility.

### Topic 020

```text
Responsibility
      ↓
Information
      ↓
Source
      ↓
Flow
```

We now ask what information is required for that responsibility.

---

# Topic 020 Goal

By the end of this topic, you should be able to look at a responsibility and reason:

> "What information does this responsibility depend on?"

Then:

> "Where does that information come from?"

Then:

> "Does that information belong to our system or cross the boundary?"

And finally:

> "What do I still need to investigate before designing the solution?"

---

# Mastery Rule

Do not think:

```text
What database fields should I create?
```

Think:

```text
What does the business/system need to know?
        ↓
Why does it need to know it?
        ↓
Who provides that information?
        ↓
Where does it come from?
        ↓
What crosses the boundary?
        ↓
What remains unknown?
```

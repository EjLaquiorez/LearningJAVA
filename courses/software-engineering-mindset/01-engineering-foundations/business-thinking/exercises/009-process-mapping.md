# Exercise 008 — Process Mapping and Swimlane Thinking

## Objective

Practice analyzing business processes by combining:

- Process decomposition
- Decision points
- Alternative paths
- Loops
- Responsibilities
- External participants
- Information flow

---

# Exercise 1 — Library

Model the process of borrowing a book.

Identify:

- Customer activities
- Librarian activities
- Membership decision
- Successful path
- Failed path

---

# Exercise 2 — ATM

Model an ATM withdrawal process.

Identify:

- Customer actions
- ATM actions
- Banking system actions
- PIN verification
- Transaction selection
- Balance verification
- Successful withdrawal
- Failed withdrawal
- Additional transaction loop

---

# Exercise 3 — Restaurant

Model an online food ordering process.

Participants:

```text
Customer
Restaurant
Delivery Rider
```

Identify:

- Customer actions
- Restaurant actions
- Delivery actions
- Order information
- Food transfer
- Decision points
- Failed delivery path

---

# Exercise 4 — Payment

Add an external payment process.

Participants:

```text
Customer
Payment System
Bank
Restaurant
```

Model:

```text
Customer
    ↓
Payment System
    ↓
Bank
```

Then identify:

### Successful Payment

What happens when the bank approves the transaction?

### Failed Payment

What happens when the bank rejects the transaction?

Include the retry loop.

---

# Exercise 5 — Information Flow

Identify what information moves between participants.

Analyze:

```text
Customer → Payment System

Payment System → Bank

Bank → Payment System

Payment System → Customer

Payment System → Restaurant
```

Do not assume unnecessary information.

Only identify information that is actually needed for the business process.

---

# Reflection

After completing the exercises, answer:

### 1. What is the difference between a process map and a swimlane diagram?

### 2. Why is responsibility important when analyzing a business process?

### 3. Why should engineers model failure paths?

### 4. Why are loops important?

### 5. What information moves between participants?

### 6. What information was uncertain and would require further investigation?

---

# Engineering Principle

A process is not simply:

```text
A → B → C
```

A realistic process may contain:

```text
Activities
    +
Decisions
    +
Alternative Paths
    +
Loops
    +
Multiple Participants
    +
Information Flow
```

The engineer's job is to understand these relationships before designing the software.
# Exercise 012 — Information Flow

## Objective

Practice identifying what information moves through a business process.

Focus on:

- What information is produced
- Who receives it
- Who uses it
- When it changes
- What is missing or uncertain
- What decisions depend on it

---

## Engineering Principle

A process is not complete until you understand the information that supports it.

Information defines:

- What action is possible
- Who can make decisions
- When a step can proceed
- When a problem should be investigated

---

# Practice Scenarios

## Exercise 1 — Restaurant

Analyze the information flow for a restaurant order.

Process:

```text
Customer
    ↓
Waiter takes order
    ↓
Kitchen prepares food
    ↓
Waiter serves food
    ↓
Cashier processes payment
    ↓
Customer leaves
```

Identify:

- What information the customer provides
- What the waiter needs to pass to the kitchen
- What information is required to serve the food correctly
- What information the cashier needs to complete payment
- What the customer receives after payment

---

## Exercise 2 — Bakery

Analyze the information flow for a bakery pickup.

Process:

```text
Customer
    ↓
Cashier takes order
    ↓
Kitchen prepares order
    ↓
Food is packed
    ↓
Customer receives order
```

Identify:

- What the customer tells the cashier
- What the cashier records or communicates
- What the kitchen needs to prepare the order
- What information is required for packing
- What information the customer receives when the order is complete

---

## Exercise 3 — University Enrollment

Analyze the information flow in university admissions.

Process:

```text
Student submits enrollment request
    ↓
Registrar checks student information
    ↓
Department reviews requirements
    ↓
Enrollment is approved or rejected
    ↓
Registrar communicates result
    ↓
Student receives result
```

Identify:

- What information the student provides to the registrar
- What information the registrar shares with the department
- What information the department returns to the registrar
- What information the student receives in the result

---

## Exercise 4 — Payment

Analyze the information flow in a payment process.

Process:

```text
Customer
    ↓
Payment system
    ↓
Bank
    ↓
Payment system
    ↓
Merchant
```

Identify:

- What information the customer provides first
- What the payment system passes to the bank
- What the bank returns to the payment system
- What the merchant receives to confirm the order
- What the customer receives after the payment outcome

---

## Exercise 5 — Information Changes

Consider this process:

```text
Customer places order
    ↓
Restaurant receives order
    ↓
Kitchen prepares order
    ↓
Order is ready
    ↓
Order is delivered
```

Identify how the information changes at each step.

For example:

- Order details
- Order status
- Preparation status
- Delivery status

Explain why each change matters.

---

## Reflection

After completing the exercises, answer:

1. What information is needed to move each process forward?
2. Where does information change meaning?
3. Which handoff is most likely to fail due to missing information?
4. Why is information flow as important as activity flow?
5. What would you investigate when information is uncertain?

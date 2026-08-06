# Restaurant Case Study

## Objective

Learn how a restaurant operates by understanding its people, workflows, data, and business rules before designing software.

---

# Business Overview

A restaurant prepares and serves meals to customers. Unlike a coffee shop, restaurants often involve table management, waitstaff, kitchen operations, reservations, and multiple stages of order fulfillment.

A successful restaurant must coordinate many people simultaneously while ensuring customers receive the correct food on time.

---

# Main Goal

The restaurant aims to:

- Serve quality food.
- Provide excellent customer service.
- Manage tables efficiently.
- Reduce waiting time.
- Track inventory.
- Increase customer satisfaction and profit.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Customer | Orders meals |
| Waiter/Waitress | Takes orders and serves food |
| Chef | Prepares meals |
| Cashier | Processes payments |
| Restaurant Manager | Oversees operations |
| Supplier | Delivers ingredients |
| Kitchen Staff | Assists food preparation |

---

# Business Workflow

## Opening

1. Restaurant opens.
2. Kitchen prepares ingredients.
3. Dining area is cleaned.
4. Tables are arranged.
5. Cash register is prepared.

---

## Customer Service

1. Customer arrives.
2. Customer is assigned a table.
3. Waiter provides the menu.
4. Customer places an order.
5. Waiter records the order.
6. Kitchen receives the order.
7. Chef prepares the food.
8. Waiter serves the meal.
9. Customer requests the bill.
10. Cashier processes payment.
11. Customer leaves.
12. Table becomes available.

---

## Closing

1. Count inventory.
2. Record daily sales.
3. Clean restaurant.
4. Lock inventory storage.
5. Close cash register.

---

# Information Used

## Customer Information

- Reservation Name
- Contact Number
- Number of Guests

---

## Menu Information

- Meal Name
- Category
- Price
- Preparation Time

---

## Table Information

- Table Number
- Capacity
- Availability

---

## Order Information

- Order Number
- Ordered Items
- Quantity
- Status
- Assigned Table

---

## Payment Information

- Total Amount
- Payment Method
- Receipt Number

---

# Business Rules

- A table cannot have two active customer groups.
- Every order belongs to one table.
- Food preparation begins only after order confirmation.
- Orders cannot be modified after cooking starts without manager approval.
- Every completed meal must be billed.
- Ingredients decrease after food preparation.

---

# Problems Without Software

## Table Management

Employees may accidentally assign occupied tables.

---

## Kitchen Communication

Paper orders may be lost or delayed.

---

## Billing Errors

Manual calculations may produce incorrect bills.

---

## Inventory Issues

Ingredients may unexpectedly run out during service.

---

## Reporting

Daily sales reports take time to prepare manually.

---

# Possible Software Solutions

## Restaurant POS

- Order entry
- Billing
- Receipts
- Payment tracking

---

## Kitchen Display System (KDS)

Displays incoming orders directly to chefs.

---

## Table Management System

Tracks:

- Occupied tables
- Available tables
- Reserved tables

---

## Reservation System

Allows customers to:

- Reserve tables
- Receive confirmations
- Cancel reservations

---

## Inventory Management

Tracks:

- Ingredients
- Usage
- Restocking
- Supplier orders

---

# Data Relationships

```
Customer
    |
Reservation
    |
Table
    |
Order
    |
Menu Item
    |
Ingredients
```

---

# Future Features

- QR Code Menu
- Online Reservations
- Food Delivery Integration
- Customer Reviews
- Digital Waitlist
- AI Demand Forecasting

---

# Reflection Questions

1. Why is table management important?
2. What happens if kitchen orders are delayed?
3. Which information changes most frequently?
4. Which actor depends most on software?
5. What could happen if billing is inaccurate?

---

# Software Engineering Lessons

This case study introduces:

- Workflow Management
- State Transitions
- Reservation Systems
- Queue Management
- Transaction Processing
- Inventory Systems
- Multi-user Coordination

---

# Glossary

**Reservation**
Booking a table before arrival.

**Kitchen Display System**
A digital screen showing food orders.

**POS**
Point of Sale system used for billing.

**Workflow**
The sequence of activities performed by a business.

**Inventory**
The available ingredients and supplies.

---

# Summary

Restaurants involve multiple departments working together—front-of-house, kitchen, inventory, and billing. Software helps coordinate these activities, reduce delays, and improve the customer experience.
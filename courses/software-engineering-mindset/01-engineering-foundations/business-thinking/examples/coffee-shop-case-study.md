# Coffee Shop Case Study

## Objective

Understand how a coffee shop operates and identify business processes that software can improve.

---

# Business Overview

A coffee shop serves beverages, snacks, and light meals to customers. Unlike a bakery, many products are prepared only after an order is placed.

A coffee shop must handle customer queues, customized drinks, inventory, payments, and order preparation efficiently.

---

# Main Goal

The coffee shop aims to:

- Serve customers quickly.
- Prepare drinks accurately.
- Maintain ingredient inventory.
- Increase customer satisfaction.
- Improve sales.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Customer | Places drink orders |
| Cashier | Accepts payment |
| Barista | Prepares beverages |
| Manager | Oversees operations |
| Supplier | Delivers coffee beans, milk, and supplies |
| Cleaner | Maintains cleanliness |

---

# Business Workflow

## Opening

1. Open the shop.
2. Prepare coffee machines.
3. Check ingredient inventory.
4. Prepare cash register.

---

## Ordering

1. Customer enters.
2. Customer places an order.
3. Customer chooses drink size.
4. Customer selects customizations.
5. Cashier records the order.
6. Payment is received.

---

## Drink Preparation

1. Order appears on the barista screen.
2. Barista prepares the drink.
3. Drink quality is checked.
4. Customer name is called.
5. Customer receives the order.

---

## Closing

1. Count inventory.
2. Generate sales report.
3. Clean equipment.
4. Close cash register.

---

# Information Used

## Menu

- Coffee
- Latte
- Cappuccino
- Espresso
- Mocha
- Tea
- Pastries

---

## Drink Customizations

- Small / Medium / Large
- Hot / Iced
- Whole Milk
- Oat Milk
- Soy Milk
- Extra Shot
- Less Sugar
- No Sugar

---

## Ingredient Inventory

- Coffee Beans
- Milk
- Syrup
- Ice
- Cups
- Lids

---

## Customer Information

Optional:

- Name
- Loyalty Points
- Contact Number

---

## Sales Information

- Drink Sold
- Quantity
- Date
- Time
- Payment Method

---

# Business Rules

- Every order receives a unique order number.
- Customized drinks must match customer requests.
- Ingredients automatically decrease after each order.
- Orders are prepared in sequence.
- Loyalty points are awarded after payment.

---

# Problems Without Software

## Long Queues

Orders may become disorganized.

---

## Wrong Drinks

Employees may forget customer customizations.

---

## Inventory Issues

Milk or coffee beans may unexpectedly run out.

---

## Reporting Problems

Managers manually count daily sales.

---

## Customer Experience

Returning customers cannot earn loyalty rewards efficiently.

---

# Possible Software Solutions

## POS System

Handles:

- Orders
- Payments
- Receipts

---

## Kitchen Display System

Displays drink orders to baristas in real time.

---

## Inventory System

Tracks:

- Coffee beans
- Milk
- Syrups
- Cups

Automatically warns when supplies are low.

---

## Loyalty System

Allows customers to:

- Earn points
- Redeem rewards
- View purchase history

---

## Analytics Dashboard

Shows:

- Peak business hours
- Best-selling drinks
- Average order value
- Daily revenue

---

# Data Relationships

```
Customer
    |
Places Order
    |
    v
Order
    |
Contains
    |
    v
Drink
    |
Uses
    |
    v
Ingredients
```

---

# Future Features

- Mobile ordering
- QR code payments
- Self-service kiosks
- Delivery integration
- Personalized drink recommendations
- AI demand forecasting

---

# Reflection Questions

1. Which process is repeated for every customer?
2. What information changes after every sale?
3. Which actor depends most on accurate software?
4. What happens if inventory is incorrect?
5. Which tasks should be automated first?

---

# Software Engineering Lessons

This case study introduces:

- Queue Management
- Order Processing
- Inventory Tracking
- Customer Loyalty Systems
- Real-Time Communication
- Business Workflows
- Transaction Processing

---

# Glossary

**Barista**
An employee who prepares coffee beverages.

**Customization**
Changes requested by the customer, such as drink size or milk type.

**Inventory**
Available ingredients and supplies.

**Order Queue**
The sequence in which orders are prepared.

**Loyalty Program**
A reward system for returning customers.

---

# Summary

A coffee shop is a fast-paced business where speed and accuracy are essential. Software helps coordinate customers, cashiers, baristas, inventory, and payments to ensure every order is prepared correctly and efficiently. Understanding these interactions allows software engineers to design systems that improve both business operations and customer experience.
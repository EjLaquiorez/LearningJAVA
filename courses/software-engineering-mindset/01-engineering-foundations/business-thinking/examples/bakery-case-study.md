# Bakery Case Study

## Objective

Learn how a bakery operates as a business before thinking about software. The goal is to identify the people, processes, information, and problems that software can help solve.

---

# Business Overview

A bakery produces and sells baked goods such as bread, cakes, cookies, pastries, and beverages. Some products are made daily while others are custom-made based on customer orders.

A bakery must balance production with customer demand. Producing too much results in waste, while producing too little results in lost sales.

---

# Main Goal

The bakery wants to:

- Produce fresh products every day.
- Sell products efficiently.
- Reduce food waste.
- Maintain enough inventory.
- Provide excellent customer service.
- Increase profit.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Customer | Purchases bakery products |
| Cashier | Processes payments and sales |
| Baker | Produces baked goods |
| Manager | Oversees daily operations |
| Supplier | Delivers ingredients |
| Delivery Rider (optional) | Delivers customer orders |

---

# Business Workflow

## Opening

1. Bakery opens.
2. Baker checks ingredient inventory.
3. Ingredients are prepared.
4. Products are baked.
5. Finished products are displayed.

---

## Selling

1. Customer enters.
2. Customer chooses products.
3. Cashier scans or records items.
4. Total amount is calculated.
5. Customer pays.
6. Receipt is printed.
7. Inventory decreases.

---

## Restocking

1. Manager checks remaining ingredients.
2. Low-stock ingredients are identified.
3. Supplier receives purchase order.
4. Supplier delivers ingredients.
5. Inventory is updated.

---

## Closing

1. Count remaining products.
2. Record unsold items.
3. Count cash.
4. Generate daily sales report.

---

# Information Used

## Product Information

- Product Name
- Category
- Selling Price
- Cost
- Shelf Life

Example

| Product | Price |
|----------|------:|
| Bread | ₱40 |
| Croissant | ₱70 |
| Chocolate Cake | ₱850 |

---

## Ingredient Information

- Flour
- Sugar
- Butter
- Eggs
- Milk
- Chocolate

---

## Inventory Information

- Ingredient Name
- Quantity
- Unit
- Reorder Level

Example

| Ingredient | Remaining |
|------------|----------:|
| Flour | 20 kg |
| Eggs | 80 pcs |
| Butter | 5 kg |

---

## Customer Information

- Name (optional)
- Contact Number
- Custom Cake Orders

---

## Sales Information

- Date
- Products Sold
- Quantity
- Total Amount
- Payment Method

---

# Business Rules

- Bread must be baked every morning.
- Products cannot be sold after expiration.
- Custom cakes require advance payment.
- Inventory must never become negative.
- Every sale must generate a receipt.
- Ingredient deliveries must be verified.

---

# Problems Without Software

## Inventory Problems

Employees may forget to record ingredient usage.

Result:

- Missing inventory
- Unexpected shortages

---

## Sales Problems

Manual calculations may produce incorrect totals.

Result:

- Incorrect receipts
- Customer complaints

---

## Production Problems

The bakery may produce too much or too little.

Result:

- Food waste
- Lost sales

---

## Reporting Problems

Managers manually compute sales.

Result:

- Slow reporting
- Human error

---

# Possible Software Solutions

## Point of Sale (POS)

Allows:

- Faster checkout
- Automatic receipts
- Sales recording

---

## Inventory System

Tracks:

- Ingredients
- Finished products
- Low stock alerts

---

## Production Planner

Suggests:

- How much bread to bake
- Expected daily demand

---

## Reporting Dashboard

Shows:

- Daily sales
- Weekly sales
- Best-selling products
- Profit estimates

---

# Data Relationships

```
Supplier
    |
    v
Ingredients
    |
    v
Bakery Products
    |
    v
Sales
    |
    v
Customer
```

---

# Future Features

- Online ordering
- Delivery tracking
- Loyalty rewards
- Mobile payments
- Sales forecasting
- AI demand prediction

---

# Reflection Questions

1. Which activities happen every day?
2. Which information changes most often?
3. What tasks could be automated?
4. Which actor uses software the most?
5. What happens if inventory is inaccurate?

---

# Software Engineering Lessons

This case study teaches:

- Inventory Management
- CRUD Operations
- Sales Transactions
- Reporting
- Business Rules
- Workflow Analysis
- Data Relationships

---

# Glossary

**Inventory**
The available stock of ingredients or products.

**Point of Sale (POS)**
Software used to process customer purchases.

**Sales Report**
A summary of products sold within a period.

**Supplier**
A business that provides ingredients.

**Workflow**
The sequence of activities in a business.

---

# Summary

A bakery is more than simply selling bread. It involves inventory management, production planning, sales, purchasing, reporting, and customer service. Before designing software, a software engineer must understand how these processes work together and identify where technology can improve efficiency.
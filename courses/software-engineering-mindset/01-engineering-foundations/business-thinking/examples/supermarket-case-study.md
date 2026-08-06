# Supermarket Case Study

## Objective

Understand how a supermarket manages products, inventory, suppliers, customers, and sales before designing software solutions.

---

# Business Overview

A supermarket sells thousands of products across multiple categories, including groceries, beverages, household items, and personal care products.

Unlike smaller stores, supermarkets process hundreds or even thousands of transactions daily while continuously updating inventory and managing supplier deliveries.

---

# Main Goal

The supermarket aims to:

- Sell products efficiently.
- Maintain accurate inventory.
- Reduce stock shortages.
- Improve customer satisfaction.
- Maximize profit.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Customer | Purchases products |
| Cashier | Processes sales |
| Stock Clerk | Restocks shelves |
| Store Manager | Oversees operations |
| Supplier | Delivers products |
| Warehouse Staff | Stores incoming inventory |

---

# Business Workflow

## Receiving Inventory

1. Supplier delivers products.
2. Warehouse staff verifies delivery.
3. Inventory is updated.
4. Products are placed in storage.

---

## Shelf Restocking

1. Stock clerk checks shelves.
2. Low-stock items are restocked.
3. Inventory updates automatically.

---

## Customer Purchase

1. Customer selects products.
2. Customer proceeds to checkout.
3. Cashier scans barcodes.
4. Total amount is calculated.
5. Customer pays.
6. Receipt is printed.
7. Inventory decreases.

---

## Closing

1. Generate sales reports.
2. Count cash.
3. Review inventory levels.
4. Schedule supplier orders.

---

# Information Used

## Product Information

- Product Name
- Barcode
- Category
- Selling Price
- Supplier

---

## Inventory Information

- Quantity
- Warehouse Location
- Shelf Location
- Reorder Level

---

## Sales Information

- Date
- Time
- Cashier
- Purchased Products
- Total Amount

---

## Supplier Information

- Company Name
- Contact Information
- Delivery Schedule

---

## Customer Information (Optional)

- Loyalty Card
- Membership Number
- Reward Points

---

# Business Rules

- Every product must have a barcode.
- Inventory decreases immediately after purchase.
- Products cannot have negative stock.
- Expired products cannot be sold.
- Supplier deliveries must be verified before inventory updates.
- Promotional discounts apply only during active periods.

---

# Problems Without Software

## Inventory Errors

Products may appear available even when shelves are empty.

---

## Checkout Delays

Manual calculations slow customer service.

---

## Pricing Mistakes

Employees may charge incorrect prices.

---

## Supplier Management

Late deliveries become difficult to monitor.

---

## Reporting

Managers spend hours preparing daily reports.

---

# Possible Software Solutions

## Point of Sale (POS)

Handles:

- Barcode scanning
- Receipts
- Discounts
- Payments

---

## Inventory Management System

Tracks:

- Product quantity
- Shelf stock
- Warehouse stock
- Reorder alerts

---

## Supplier Management System

Tracks:

- Purchase orders
- Deliveries
- Supplier performance

---

## Loyalty Program

Allows customers to:

- Earn points
- Redeem rewards
- Receive personalized discounts

---

## Analytics Dashboard

Displays:

- Daily revenue
- Top-selling products
- Slow-moving inventory
- Profit reports

---

# Data Relationships

```
Supplier
      |
Products
      |
Inventory
      |
Sales
      |
Customer
```

---

# Future Features

- Self-checkout kiosks
- Mobile shopping app
- Smart shopping carts
- AI inventory forecasting
- Electronic shelf labels
- Personalized promotions

---

# Reflection Questions

1. Why is barcode scanning important?
2. What happens when inventory is inaccurate?
3. Which actor relies most on inventory data?
4. Why should supplier deliveries be verified?
5. Which reports would help managers make better decisions?

---

# Software Engineering Lessons

This case study introduces:

- High-Volume Transactions
- Barcode Systems
- Inventory Management
- Supplier Management
- Reporting & Analytics
- Customer Loyalty Systems
- Business Intelligence

---

# Glossary

**Barcode**
A machine-readable code used to identify products.

**POS (Point of Sale)**
A system used to process customer purchases.

**Reorder Level**
The minimum inventory level before new stock is ordered.

**Warehouse**
A storage facility for inventory.

**Loyalty Program**
A rewards system for repeat customers.

---

# Summary

A supermarket depends on accurate inventory, efficient checkout, and reliable supplier management. Software connects these processes, enabling faster transactions, better stock control, and improved decision-making through analytics.
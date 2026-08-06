# Pharmacy Case Study

## Objective

Understand how a pharmacy operates and identify the business processes that software can support while maintaining accuracy and patient safety.

---

# Business Overview

A pharmacy stores, manages, and dispenses medicines to customers. Some medicines require prescriptions, while others can be purchased directly.

Because medicines affect people's health, pharmacies require accurate inventory management, expiration tracking, and proper documentation.

---

# Main Goal

The pharmacy aims to:

- Dispense correct medicines.
- Maintain accurate inventory.
- Track expiration dates.
- Serve customers efficiently.
- Comply with healthcare regulations.
- Prevent medication errors.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Customer | Purchases medicine |
| Pharmacist | Reviews prescriptions and dispenses medicine |
| Pharmacy Assistant | Assists customers |
| Cashier | Processes payments |
| Manager | Oversees pharmacy operations |
| Supplier | Delivers medicines |

---

# Business Workflow

## Opening

1. Open pharmacy.
2. Check medicine inventory.
3. Verify refrigerated medicines.
4. Prepare cash register.

---

## Prescription Purchase

1. Customer presents prescription.
2. Pharmacist verifies prescription.
3. Medicine availability is checked.
4. Medicine is prepared.
5. Customer receives instructions.
6. Cashier processes payment.
7. Inventory updates automatically.

---

## Over-the-Counter Purchase

1. Customer selects medicine.
2. Pharmacist provides advice if needed.
3. Cashier records sale.
4. Inventory decreases.

---

## Inventory Management

1. Check expiration dates.
2. Remove expired medicines.
3. Reorder low-stock medicines.
4. Receive supplier deliveries.
5. Update inventory.

---

# Information Used

## Medicine Information

- Medicine Name
- Generic Name
- Brand
- Category
- Dosage
- Selling Price

---

## Inventory Information

- Quantity
- Batch Number
- Expiration Date
- Supplier

---

## Prescription Information

- Doctor Name
- Patient Name
- Prescription Date
- Medicine
- Dosage
- Instructions

---

## Customer Information

- Name
- Contact Number
- Purchase History

---

# Business Rules

- Prescription medicines require a valid prescription.
- Expired medicines cannot be sold.
- Inventory must update after every sale.
- Controlled medicines require additional documentation.
- Batch numbers must be recorded.

---

# Problems Without Software

## Expired Medicines

Employees may overlook expiration dates.

---

## Inventory Errors

Medicine shortages may occur unexpectedly.

---

## Prescription Mistakes

Manual records increase the risk of dispensing incorrect medicine.

---

## Reporting

Managers spend significant time counting inventory manually.

---

## Customer History

Previous purchases are difficult to track.

---

# Possible Software Solutions

## Pharmacy POS

Processes:

- Sales
- Receipts
- Payments

---

## Prescription Management

Stores:

- Prescriptions
- Patient history
- Medicine instructions

---

## Inventory System

Tracks:

- Medicine quantity
- Batch numbers
- Expiration dates
- Supplier deliveries

---

## Alert System

Automatically notifies staff when:

- Medicines are expiring.
- Inventory is low.
- Controlled medicine limits are reached.

---

## Reporting Dashboard

Displays:

- Daily sales
- Inventory status
- Expiring medicines
- Best-selling medicines

---

# Data Relationships

```
Supplier
    |
Medicine
    |
Inventory
    |
Prescription
    |
Customer
```

---

# Future Features

- Online prescription submission
- SMS refill reminders
- Barcode scanning
- Electronic health record integration
- Mobile pharmacy application
- AI inventory forecasting

---

# Reflection Questions

1. Why is inventory accuracy critical?
2. Why should expired medicines never be sold?
3. Which actor has the greatest responsibility?
4. How does software improve patient safety?
5. What business rules are essential in a pharmacy?

---

# Software Engineering Lessons

This case study introduces:

- Regulatory Compliance
- Inventory Management
- Batch Tracking
- Expiration Monitoring
- Business Validation Rules
- Data Integrity
- Customer Records

---

# Glossary

**Prescription**
A doctor's authorization for specific medicine.

**Batch Number**
An identifier assigned to a manufactured group of medicines.

**Expiration Date**
The last safe date a medicine may be used.

**Controlled Medicine**
Medication requiring strict legal regulation.

**Inventory**
The available stock of medicines.

---

# Summary

A pharmacy prioritizes accuracy, safety, and compliance. Software plays a critical role in ensuring medicines are dispensed correctly, inventory remains accurate, and healthcare regulations are followed.
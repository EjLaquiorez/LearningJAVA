# Car Repair Shop Case Study

## Objective

Learn how a car repair shop operates by understanding its business processes, people, information, and rules before designing software.

---

# Business Overview

A car repair shop diagnoses, repairs, and maintains customer vehicles. Unlike retail businesses that sell products immediately, repair shops provide services that may span several hours or days.

Every repair job must be tracked from the customer's arrival until the vehicle is returned.

---

# Main Goal

The repair shop aims to:

- Diagnose vehicle problems accurately.
- Complete repairs efficiently.
- Track repair history.
- Manage spare parts inventory.
- Keep customers informed.
- Increase customer satisfaction.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Customer | Brings vehicle for service |
| Service Advisor | Receives customers and creates work orders |
| Mechanic | Diagnoses and repairs vehicles |
| Parts Manager | Manages spare parts inventory |
| Cashier | Processes payments |
| Shop Manager | Oversees operations |
| Supplier | Provides replacement parts |

---

# Business Workflow

## Vehicle Check-in

1. Customer arrives.
2. Service advisor records customer information.
3. Vehicle information is recorded.
4. Customer describes the problem.
5. A work order is created.

---

## Diagnosis

1. Mechanic inspects the vehicle.
2. Problems are identified.
3. Estimated repair cost is prepared.
4. Customer approves or declines the repair.

---

## Repair

1. Required parts are requested.
2. Mechanic performs repairs.
3. Repair progress is updated.
4. Quality inspection is completed.

---

## Vehicle Release

1. Final bill is generated.
2. Customer pays.
3. Vehicle is released.
4. Repair history is saved.

---

# Information Used

## Customer Information

- Full Name
- Contact Number
- Address

---

## Vehicle Information

- Plate Number
- Vehicle Model
- Brand
- Year Model
- Mileage

---

## Repair Information

- Work Order Number
- Problem Description
- Diagnosis
- Repair Status
- Assigned Mechanic
- Estimated Completion Date

---

## Parts Information

- Part Name
- Quantity
- Supplier
- Cost
- Selling Price

---

## Payment Information

- Labor Cost
- Parts Cost
- Total Amount
- Payment Method

---

# Business Rules

- Every repair must have a work order.
- Repairs begin only after customer approval.
- Spare parts inventory decreases when parts are installed.
- Completed repairs cannot be modified without manager approval.
- Repair history must be permanently stored.
- Vehicles cannot be released until payment is completed.

---

# Problems Without Software

## Lost Work Orders

Paper records can be misplaced.

---

## Repair Delays

Managers cannot easily monitor repair progress.

---

## Inventory Issues

Mechanics may discover required parts are unavailable.

---

## Customer Communication

Customers frequently call to ask for repair updates.

---

## Reporting

Managers manually summarize completed repairs and revenue.

---

# Possible Software Solutions

## Service Management System

Tracks:

- Work orders
- Repair status
- Assigned mechanics
- Estimated completion

---

## Inventory Management

Tracks:

- Spare parts
- Low stock alerts
- Supplier deliveries

---

## Customer Portal

Allows customers to:

- View repair status
- Approve estimates
- View repair history

---

## Reporting Dashboard

Displays:

- Daily repairs
- Revenue
- Mechanic productivity
- Frequently replaced parts

---

# Data Relationships

```
Customer
      |
Vehicle
      |
Work Order
      |
Repair Job
      |
Mechanic
      |
Replacement Parts
```

---

# Future Features

- Online appointment scheduling
- SMS repair updates
- Digital vehicle inspection reports
- Online payment
- Warranty tracking
- Predictive maintenance reminders

---

# Reflection Questions

1. Why should repair history be stored?
2. What happens if a work order is lost?
3. Which actor relies most on inventory?
4. Why must customers approve repairs first?
5. Which tasks can be automated?

---

# Software Engineering Lessons

This case study introduces:

- Service Management Systems
- Workflow Tracking
- Status Management
- Historical Records
- Appointment Scheduling
- Inventory Control
- Customer Notifications

---

# Glossary

**Work Order**

A document authorizing repair work on a vehicle.

**Diagnosis**

The process of identifying vehicle problems.

**Repair History**

A record of previous services performed on a vehicle.

**Spare Parts**

Replacement components used during repairs.

**Service Advisor**

The employee who communicates with customers and manages repair requests.

---

# Summary

A car repair shop manages services rather than simple product sales. Software coordinates customers, vehicles, mechanics, inventory, and billing, allowing repairs to be tracked accurately from start to finish.
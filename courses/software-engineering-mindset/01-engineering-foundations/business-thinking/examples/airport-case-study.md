# Airport Case Study

## Objective

Understand how an airport operates by identifying its actors, workflows, information, and business rules before designing software systems.

---

# Business Overview

An airport is a transportation hub where airlines, passengers, security personnel, baggage handlers, and ground staff work together to ensure safe and efficient travel.

Unlike smaller businesses, an airport coordinates thousands of people and hundreds of flights every day. Multiple independent systems must communicate accurately and in real time.

---

# Main Goal

The airport aims to:

- Ensure passenger safety.
- Manage flight schedules.
- Handle baggage efficiently.
- Coordinate airline operations.
- Reduce delays.
- Provide a smooth travel experience.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Passenger | Travels on scheduled flights |
| Airline Staff | Handles check-in and boarding |
| Security Officer | Performs security screening |
| Ground Staff | Handles baggage and aircraft support |
| Pilot | Operates the aircraft |
| Air Traffic Controller | Coordinates aircraft movement |
| Airport Manager | Oversees airport operations |

---

# Business Workflow

## Before Arrival

1. Passenger books a flight.
2. Passenger receives ticket confirmation.

---

## Check-in

1. Passenger arrives.
2. Identity is verified.
3. Boarding pass is issued.
4. Checked baggage is tagged.

---

## Security

1. Passenger enters security checkpoint.
2. Bags are scanned.
3. Passenger passes screening.

---

## Boarding

1. Passenger waits at assigned gate.
2. Boarding begins.
3. Boarding pass is verified.
4. Passenger boards the aircraft.

---

## Flight

1. Aircraft departs.
2. Flight reaches destination.
3. Passenger collects baggage.

---

# Information Used

## Passenger Information

- Full Name
- Passport Number
- Nationality
- Contact Information

---

## Flight Information

- Flight Number
- Airline
- Departure Time
- Arrival Time
- Gate Number
- Destination
- Flight Status

---

## Baggage Information

- Tag Number
- Weight
- Owner
- Destination

---

## Boarding Information

- Boarding Group
- Seat Number
- Gate Assignment

---

# Business Rules

- Every passenger must have a valid ticket.
- Passport verification is required for international flights.
- Checked baggage must not exceed weight limits.
- Boarding closes before departure.
- One boarding pass is valid for only one passenger.
- Flight status updates must be communicated immediately.

---

# Problems Without Software

## Flight Scheduling

Manual scheduling increases the risk of delays and conflicts.

---

## Lost Baggage

Tracking baggage manually is unreliable.

---

## Boarding Errors

Passengers may board the wrong flight.

---

## Communication Delays

Staff may not receive real-time flight updates.

---

## Reporting

Airport operations become difficult to monitor manually.

---

# Possible Software Solutions

## Flight Management System

Tracks:

- Flight schedules
- Delays
- Gate assignments
- Aircraft status

---

## Check-in System

Manages:

- Passenger verification
- Boarding pass generation
- Seat assignments

---

## Baggage Tracking System

Tracks baggage from check-in to arrival using barcode or RFID technology.

---

## Boarding System

Verifies passenger identity and boarding eligibility.

---

## Airport Operations Dashboard

Displays:

- Flight status
- Gate usage
- Delays
- Passenger counts
- Baggage statistics

---

# Data Relationships

```
Passenger
     |
Booking
     |
Flight
     |
Boarding Pass
     |
Gate
     |
Aircraft

Passenger
     |
Checked Baggage
```

---

# Future Features

- Biometric boarding
- Digital passports
- Self-service baggage drop
- AI delay prediction
- Smart gate allocation
- Real-time airport navigation

---

# Reflection Questions

1. Why is communication critical in airport operations?
2. Which processes require real-time updates?
3. What happens if baggage tracking fails?
4. Which systems depend on accurate scheduling?
5. Which actor interacts with the most systems?

---

# Software Engineering Lessons

This case study introduces:

- Distributed Systems
- Scheduling
- Real-Time Data
- Event-Driven Architecture
- Identity Verification
- Large-Scale Coordination
- System Integration

---

# Glossary

**Boarding Pass**
A document allowing a passenger to board a flight.

**Gate**
The area where passengers board an aircraft.

**RFID**
A technology used to track objects wirelessly.

**Flight Schedule**
The planned departure and arrival times for flights.

**Ground Staff**
Employees responsible for baggage handling and aircraft preparation.

---

# Summary

Airports are complex environments where many independent systems must work together. Software enables real-time coordination, improves passenger experience, enhances safety, and minimizes operational delays.
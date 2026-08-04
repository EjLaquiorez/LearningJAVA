/*
==========================================================
🧠 Practice 1 — Movie Theater Booking System
==========================================================

Scenario:
A client says:

"I want customers to reserve movie tickets online."

1. Goal

Allow customers to reserve movie tickets online quickly, securely, and without double-booking seats.

----------------------------------------------------------

2. Inputs

Customer Information
- Full name (or account)
- Email or phone number
- Login credentials (if required)

Movie Information
- Selected movie
- Preferred cinema branch
- Date
- Showtime

Seat Information
- Number of tickets
- Selected seat(s)

Payment Information
- Payment method
- Payment details

----------------------------------------------------------

3. Outputs

The system should display:

- Reservation successful
- Reservation failed (with reason)
- Booking reference number
- Movie title
- Cinema branch
- Date and time
- Reserved seat numbers
- Total amount paid
- Payment confirmation
- Digital ticket or QR Code
- Error messages if something goes wrong

----------------------------------------------------------

4. Rules

The system should:

- Only allow available seats to be selected.
- Prevent two customers from reserving the same seat.
- Require payment before confirming the reservation.
- Lock selected seats while payment is being processed.
- Release locked seats if payment is cancelled or times out.
- Verify customer account if the cinema requires membership.
- Limit ticket quantity if there is a maximum purchase policy.

----------------------------------------------------------

5. Edge Cases

Possible unusual situations:

- Customer loses internet during payment.
- Payment succeeds but booking fails.
- Another customer reserves the seat at the same time.
- Customer selects an invalid date.
- Selected movie is sold out.
- Customer refreshes the page while booking.
- Payment is cancelled halfway.
- Customer tries to reserve more tickets than allowed.
- System server becomes unavailable.

----------------------------------------------------------

6. Questions for the Client

Business Requirements
- Do customers need an account to book?
- Can guests reserve without registering?
- Can customers choose their own seats?
- Can customers cancel reservations?
- Is there a cancellation fee?
- Is there a time limit for unpaid reservations?
- Which payment methods are supported?
- Is there a maximum number of tickets per booking?
- Should discounts (student, senior citizen, PWD) be supported?
- Should the system send confirmation by email or SMS?
- Will customers receive a QR code for entry?
- Can customers change their reservation after booking?
----------------------------------------------------------

==========================================================
🧠 Practice 2 — Smart Parking System
==========================================================

Scenario:
A shopping mall wants a parking management system.

Without writing Java, answer the following:

1. Goal

Provide an efficient parking management system that allows customers to find, reserve (if supported), enter, and pay for parking while helping the mall monitor available parking spaces in real time.

----------------------------------------------------------

2. Inputs

Customer Information
- Full name (if account is required)
- Email or phone number
- Login credentials (optional)

Vehicle Information
- Vehicle type (Car, Motorcycle, SUV, Van, etc.)
- Plate number

Parking Information
- Preferred parking area or level
- Desired entry date and time (if reservations are allowed)

Payment Information
- Payment method
- Payment details

----------------------------------------------------------

3. Outputs

The system should display:

- Parking reservation successful or failed
- Parking slot number or assigned parking area
- Entry date and time
- Parking status (Reserved, Occupied, Completed, or Cancelled)
- Estimated or final parking fee
- Payment confirmation
- QR Code or digital parking pass (if applicable)
- Error messages when necessary

----------------------------------------------------------

4. Rules

- Only available parking spaces can be reserved or assigned.
- Prevent multiple vehicles from using the same parking space at the same time.
- Vehicle information must be valid before confirming the reservation.
- Lock the selected parking slot while payment is being processed.
- Release the parking slot if payment fails or times out.
- Calculate parking fees based on the mall's pricing policy.
- Mark the parking slot as available again once the vehicle exits.
- One reservation is allowed per registered vehicle unless otherwise specified.

----------------------------------------------------------

5. Edge Cases

- Customer loses internet during payment.
- Payment succeeds but the reservation is not created.
- Two customers attempt to reserve the last available parking slot simultaneously.
- Customer enters an invalid vehicle plate number.
- Customer arrives after the reservation has expired.
- Parking lot becomes full before the reservation is completed.
- Customer exits without completing payment.
- Parking ticket or QR Code cannot be scanned.
- System server becomes unavailable.

----------------------------------------------------------

6. Questions for the Client

- Can customers reserve parking spaces in advance, or are spaces assigned upon arrival?
- Is creating an account required, or can guests use the system?
- How are parking fees calculated (hourly, flat rate, or daily)?
- Are different parking rates applied to different vehicle types?
- Is there a grace period before parking charges begin?
- Can customers cancel a reservation?
- What payment methods should be supported?
- Will the system use QR Codes, RFID cards, or license plate recognition at the entrance?
- Should the system display the number of available parking spaces in real time?
- Are there reserved parking spaces for PWDs, VIPs, or mall employees?
----------------------------------------------------------

==========================================================
🧠 Practice 3 — Online Quiz System
==========================================================

Scenario:
A school wants students to take quizzes online.

Think like a software engineer.

Without writing Java, identify the following:

----------------------------------------------------------

1. Goal

Provide a secure and reliable online quiz system that allows students to take quizzes fairly while enabling teachers to manage quizzes and review results efficiently.

----------------------------------------------------------

2. Inputs

Student Information
- Student ID
- Full name
- Login credentials

Quiz Information
- Selected subject
- Selected quiz

Quiz Answers
- Multiple choice selections
- True or False answers
- Essay responses (if applicable)

----------------------------------------------------------

3. Outputs

The system should display:

- Student login status
- Available quizzes
- Quiz instructions
- Remaining time
- Current question number
- Submission confirmation
- Quiz score (if released immediately)
- Correct and incorrect answers (if allowed)
- Error messages when necessary

----------------------------------------------------------

4. Rules

- Only registered students can take quizzes.
- Each student may only take the quiz once unless permitted by the teacher.
- The quiz automatically starts once opened.
- Students cannot answer after the time limit expires.
- Answers are automatically saved during the quiz.
- The quiz is automatically submitted when time runs out.
- Students can only access quizzes during the scheduled date and time.
- Teachers determine whether scores are shown immediately.

----------------------------------------------------------

5. Edge Cases

- Student loses internet connection during the quiz.
- Browser unexpectedly closes.
- Student refreshes the page.
- Student submits an incomplete quiz.
- Student attempts to open the quiz after the deadline.
- Student tries to take the same quiz twice.
- Server becomes unavailable.
- Auto-save fails during the quiz.

----------------------------------------------------------

6. Questions for the Client

- Do students need to log in using school accounts?
- Can students retake quizzes?
- Should answers be automatically saved?
- Should the quiz continue counting down if the internet disconnects?
- Should scores be shown immediately or after the teacher reviews them?
- Are essay questions supported?
- Can teachers randomize question order?
- Can teachers randomize answer choices?
- Should the system support multiple quiz attempts?
- Is there a passing score?
- Should the system detect cheating attempts?
- What actions should happen if cheating is detected?

==========================================================
🧠 Practice 4 — Grocery Self-Checkout System
==========================================================

Scenario:
A supermarket wants customers to scan items and pay without a cashier.

1. Goal

Provide customers with a fast, accurate, and convenient way to scan, purchase, and pay for groceries independently while reducing checkout waiting time.

----------------------------------------------------------

2. Inputs

Customer Information
- Membership or loyalty card (optional)

Item Information
- Barcode
- Quantity

Payment Information
- Payment method
- Payment details

----------------------------------------------------------

3. Outputs

- List of scanned items
- Quantity of each item
- Running total
- Discounts (if applicable)
- Final amount to pay
- Payment successful or failed
- Receipt
- Error messages when necessary

----------------------------------------------------------

4. Rules

- Every item must have a valid barcode.
- Items can only be paid for after they are successfully scanned.
- Customers may remove items before payment.
- Payment must be completed before the transaction is finalized.
- Inventory is updated after successful payment.
- One transaction belongs to one customer.

----------------------------------------------------------

5. Edge Cases

- Barcode cannot be scanned.
- Barcode does not exist in the database.
- Customer scans the same item multiple times.
- Customer removes an item before payment.
- Payment is declined.
- Internet connection is lost.
- Receipt printer is out of paper.
- Customer leaves without completing payment.
- Power outage occurs during checkout.

----------------------------------------------------------

6. Questions for the Client

- Which payment methods should be supported?
- Can customers pay with cash, or only digital payments?
- Are loyalty cards or memberships supported?
- Should discounts and coupons be accepted?
- How should age-restricted items be verified?
- What should happen if an item's barcode cannot be scanned?
- Should receipts be printed, emailed, or both?
- Should the system immediately update inventory after payment?

----------------------------------------------------------

🧠 Practice 5 — Password Reset Feature
==========================================================

Scenario:
A website needs a "Forgot Password" feature.

Do NOT think about email verification codes yet.

Focus only on the process.

Without writing Java, answer:

1. Goal

2. Inputs

3. Outputs

4. Rules

5. Edge Cases

6. Questions for the Client
*/
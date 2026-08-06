# University Case Study

## Objective

Understand how a university manages students, faculty, courses, enrollment, scheduling, and academic records before designing software.

---

# Business Overview

A university provides higher education through academic programs, courses, and student services. Unlike many businesses, universities manage long-term relationships with students that span multiple years.

A university must coordinate thousands of students, instructors, classrooms, and academic records every semester.

---

# Main Goal

The university aims to:

- Provide quality education.
- Manage student enrollment.
- Maintain accurate academic records.
- Schedule classes efficiently.
- Support faculty operations.
- Ensure students graduate successfully.

---

# Main Actors

| Actor | Responsibility |
|--------|----------------|
| Student | Enrolls in courses and attends classes |
| Professor | Teaches courses |
| Registrar | Manages enrollment and records |
| Department Head | Oversees academic departments |
| Finance Office | Handles tuition payments |
| University Administrator | Oversees university operations |

---

# Business Workflow

## Admission

1. Student submits application.
2. Documents are reviewed.
3. Admission decision is made.
4. Student receives acceptance.

---

## Enrollment

1. Student selects courses.
2. Registrar verifies eligibility.
3. Schedule conflicts are checked.
4. Enrollment is confirmed.

---

## During the Semester

1. Professors conduct classes.
2. Students attend lectures.
3. Assignments and examinations are completed.
4. Grades are recorded.

---

## End of Semester

1. Final grades are submitted.
2. Student records are updated.
3. Academic reports are generated.
4. Students prepare for the next semester.

---

# Information Used

## Student Information

- Student ID
- Full Name
- Degree Program
- Year Level
- Contact Information

---

## Professor Information

- Employee ID
- Department
- Courses Assigned

---

## Course Information

- Course Code
- Course Name
- Units
- Prerequisites

---

## Schedule Information

- Classroom
- Day
- Time
- Semester

---

## Academic Records

- Grades
- GPA
- Completed Courses
- Remaining Requirements

---

# Business Rules

- Students cannot enroll without admission.
- Prerequisites must be completed before enrolling in advanced courses.
- Classrooms cannot have overlapping schedules.
- Professors can only teach assigned courses.
- Grades become permanent after approval.
- Students must complete required units before graduation.

---

# Problems Without Software

## Enrollment Errors

Students may accidentally enroll in conflicting schedules.

---

## Academic Records

Paper records can be lost or damaged.

---

## Scheduling Problems

Multiple classes may be assigned to the same classroom.

---

## Grade Processing

Manual calculations increase the chance of errors.

---

## Reporting

Preparing transcripts manually takes significant time.

---

# Possible Software Solutions

## Student Information System (SIS)

Manages:

- Student profiles
- Enrollment
- Academic records

---

## Course Management System

Tracks:

- Available courses
- Prerequisites
- Class capacity

---

## Scheduling System

Automatically prevents:

- Classroom conflicts
- Professor conflicts
- Student schedule conflicts

---

## Faculty Portal

Allows professors to:

- Record attendance
- Submit grades
- Manage course materials

---

## Student Portal

Allows students to:

- Enroll online
- View schedules
- Check grades
- Pay tuition
- Download transcripts

---

# Data Relationships

```
Student
      |
Enrollment
      |
Course
      |
Professor
      |
Department

Student
      |
Academic Record
```

---

# Future Features

- Online enrollment
- Virtual classrooms
- Mobile student application
- AI academic advising
- Degree progress tracking
- Digital student ID

---

# Reflection Questions

1. Why are prerequisites important?
2. What problems arise from schedule conflicts?
3. Why should academic records be permanent?
4. Which relationships involve many entities?
5. How does software improve student experience?

---

# Software Engineering Lessons

This case study introduces:

- Student Information Systems
- Many-to-Many Relationships
- Scheduling Systems
- Academic Record Management
- Business Rules
- Role-Based Access Control
- Workflow Automation

---

# Glossary

**Enrollment**

The process of registering for courses.

**Prerequisite**

A course that must be completed before another course.

**Transcript**

An official record of a student's academic performance.

**Semester**

A fixed academic period during which courses are taught.

**GPA (Grade Point Average)**

A numerical summary of a student's academic performance.

---

# Summary

A university is a highly interconnected organization with long-term data, complex scheduling, and multiple user roles. Software enables efficient enrollment, accurate academic records, conflict-free scheduling, and improved communication between students, faculty, and administrators.
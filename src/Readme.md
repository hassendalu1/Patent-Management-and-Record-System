# Patient Management and Record System

## The Project Description:

This is a Java Patient Management and Record System made using object oriented programming. The program manages patient records, calculates patient bills, validates patient data, saves records to a text file, and shows a basic JDBC database logging component.

## The Features:

* Add In-Patients and Out-Patients
* Calculate patient bills using polymorphism
* Validate patient age using custom exceptions
* Store patient records in a text file
* Track total number of patients using a static variable
* Demonstrate JDBC database connectivity

## Classes Used:

### 1. Patient (Abstract Class):

Contains common patient information:

* Patient ID
* Name
* Age
* Base Fee

### 2. InPatient:

Extends Patient and calculates bill based on:

* Base Fee
* Days Admitted
* Daily Room Rate

### 3. OutPatient:

Extends Patient and calculates bill based on:

* Base Fee
* Consultation Fee

### 4. InvalidPatientDataException:

Custom exception used for patient data validation.

### 5. MedicalRecordManager:

Handles saving patient records to a text file.

### 6. DatabaseLogger:

Demonstrates JDBC database logging functionality.

### 7. MainApp:

Runs the application and demonstrates all system features.

## OOP Concepts Implemented:

* Classes and Objects
* Inheritance
* Abstraction
* Encapsulation
* Polymorphism
* Method Overriding
* Exception Handling
* Static Members

## File Output:

Patient records are stored in:

patient_records.txt

## Sample Output:

* Patient information displayed on screen
* Bill calculation for each patient
* Validation error for invalid patient age
* Records written to text file
* JDBC logging message

## Author:

* Hassen Mohammed (0049)
* Hamza Tajuddin (0047)
* Eyuel Zelalem (0038)
* Kenean Mulugeta (0059)

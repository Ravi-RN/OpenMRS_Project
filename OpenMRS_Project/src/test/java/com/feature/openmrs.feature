Feature: Online Patient Management website

Background:
Given User launch the url

Scenario: User Login Page
When User send the username
And User send the password
And User click the outpatient clinic link
And User click the login button 

Scenario: User at Outpatient Clinic Page
When User click the register a patient button

Scenario: User Register a Patient Details Page
When User send the patient name and family name

 
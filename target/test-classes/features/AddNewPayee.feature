@regression
Feature: Add new payee under pay bills

  Background:
    Given the user is logged in
    And the user navigates to "Pay Bills" page
    Then goes to "Add New Payee" tab

  Scenario: Add a new payee
    And creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Payee Account | Checking                                 |
      | Payee details | XYZ account                              |
    Then message "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed

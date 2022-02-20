@regression
Feature:    Navigating	to	specific	accounts	in	Accounts	Activity


  Scenario Outline: select "<accountType>" on the Account Summary Page
    Given the user is logged in
    And the user navigates to "Account Summary" page
    When the user clicks on	"<accountType>"	link on	the	Account	Summary	page
    Then the "Account Activity" page should be displayed
    And Account drop down should have "<accountType>" selected
    Examples:
      | accountType |
      | Savings     |
      | Brokerage   |
      | Checking    |
      | Credit Card |
      | Loan        |




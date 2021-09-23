Feature: checking loginpage with automation testing
 Scenario: verification of login page of FrontAccounting
       Given User is on the login page
       When User entred username as "<username>" and password as "<passWord>" and click on login page
       Then login "<Logintype>" happens
       
       Examples:
       |username|passWord|Logintype|
       |demouser|password|Should|
       |admin|admin123|ShouldNot|
       |hr|hr123|Should|
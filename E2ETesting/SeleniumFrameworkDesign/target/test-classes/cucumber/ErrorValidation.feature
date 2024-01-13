
@tag
Feature: Error validation of Login Page
  I want to use this template for my feature file

	
	Background:
	Given I landed on Ecommerce Page
	
  @Error
  Scenario Outline: To verify the error message of Invalid Login
   
    Given Logged in with username <username> and password <password>
    Then "Incorrect email or password." error message is displayed

   Examples: 
      | username              | password         | 
      | prashannarg@gmail.com | Password@17    	 |

   
#		Scenario: To verify the error message of Invalid Login
   #
   #	Given Logged in with username "prashan" and password "123"
    #Then "Incorrect email or password." error message is displayed
   
   
Feature: Using Data Table in feature file

  Scenario: Using Data Tables in feature file
  Given User is on login page with multiple username and passwords using DataTables
    | munish    | root@123  | Tester  |
    | priyanka  | root@321  | Analyst |
    | manju     | root@111  | mother  |



#  Scenario Outline: Using Example in feature file
#  When User is on login page with <username> and "<password>" using Examples
#
#  Examples:
#  | username  | password  |
#  | munish    | root@123  |
#  | priyanka  | root@321  |
#
#
  Scenario: Scenarios without using Data Table or Example
    Given user enters username "vipin" and password "root@123" on page without using Data Table or Example



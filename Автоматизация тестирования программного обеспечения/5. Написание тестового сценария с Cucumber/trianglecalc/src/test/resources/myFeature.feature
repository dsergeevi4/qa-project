Feature: This feature verify calculation of an isoscele triangles  in the triangle calculator 
Scenario: Calculation by the parameters of the three sides of the triangle 
Given I use Triangle Calculator
When I clear all default parameter from calculator
And I set value "6" for side "A"
And I set value "6" for side "B"
And I set value "3" for side "C"
And I click "Calculate" button
Then the calculated result is "Acute Isosceles Triangle"

Scenario: Calculating with the four basic arithmetic operations
Given I use the calculater
When I enter "1" into the calculator
And I add "200"
And I subtract "200"
And I divide by "555"
And I multiply by "555"
Then the calculated result is "1"
@smoke
Feature: Cucumber Demo practice

  Background:
    Given user is on Tesla.com


  Scenario: Order a Model S
    And user clicks Model S header
    Then user should see Model S text
    When user scroll down the page to Order now
    And user clicks Order Now button
    Then user should see Purchase Price
    When user clicks on Continue to Payment button
    Then user should see Your Model S text
    When user clicks on Order with card button
    Then First name, Last name, Email input fields should appear
    And enter in First name Begimai
    And enter in Last name Turusbekova
    And enter in Email field asankadyrova11@gmail.com


    Scenario: Order a Model X
      And user clicks Model X header
      Then user should see Model X text
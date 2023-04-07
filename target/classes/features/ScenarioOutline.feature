@smoke
Feature: Scenario outline practice

  Scenario Outline:
    Given user is on "facebook.com"
    When user enter "<email>" in EMAIL input field
    And user enter "<password>" in password input field
    And user enter <age> in age input field
    Then user successfully log in in facebook
    Examples:
      | email          | password | age |
      | john@mail.ru   | drfghj   | 23  |
      | begish@mail.ru | 12345    | 12  |
      | baha@mail.ru   | 4565789  | 23  |


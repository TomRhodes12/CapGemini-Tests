Feature: Checks

Scenario: Checking API responses
Given a request is sent to the API
When the API is available
Then a 200 response is given

  Scenario Outline: Checking API negative responses
    Given a request is sent to the API
    When the URL is incorrect
    Then the correct incorrect response is given
    Examples:

  Scenario Outline: Checking Frankfurts details
    Given Frankfurt is located in the API
    When it's details are returned
    Then it's location details are correct
    Examples:



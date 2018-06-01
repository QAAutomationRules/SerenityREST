Feature:

  Scenario: As a user I can perform a basic REST task
  Given I set the endpoint to be 'endpoint.demo.1'
  And I set the content type to be 'json'
  When I perform a get at the stored endpoint
  Then the response contains a value of 'true'
  And the status code returned is '200'


Feature: Postman Collections API

  As a consumer of the Postman Collections RESTful API
  I would like to be able to create, read, delete and update my postman collections

  Scenario: GET All of the collections associated with a Postman user account
    Given I have a base service endpoint for the collections methods in the Postman API
    And I have a valid API Key for the Postman Service
    When I execute the GET All collections method
    Then the status code returned is '200'
    And the response contains collections


  Scenario: GET a specific collection associated with a Postman user account and a unique id
    Given I have a base service endpoint for the collections methods in the Postman API
    And I have a valid API Key for the Postman Service
    When I execute the POST collection request
    Then the status code returned is '200'
    And I capture the created collections ID
    When I execute the GET collection by ID request
    Then the status code returned is '200'
    And the response is returned with the collection data associated with the ID


  Scenario: POST a new collection to a POSTMan user account
    Given I have a base service endpoint for the collections methods in the Postman API
    And I have a valid API Key for the Postman Service
    And I set the Content Type to "ContentType.JSON"
    When I execute the POST collection request
    Then the status code returned is '200'
    And the new collection is created in the POSTMAN System


  Scenario: DELETE a collection from a POSTMan user account
    Given I have a base service endpoint for the collections methods in the Postman API
    And I have a valid API Key for the Postman Service
    And I set the Content Type to "ContentType.JSON"
    When I execute the POST collection request
    Then the status code returned is '200'
    And I capture the created collections ID
    When I execute a DELETE collection request
    Then the status code returned is '200'
    When I execute the GET collection by ID request
    Then the status code returned is '404'


  Scenario: Update a collection in a POSTMan user account
    Given I have a base service endpoint for the collections methods in the Postman API
    And I have a valid API Key for the Postman Service
    And I set the Content Type to "ContentType.JSON"
    When I execute the POST collection request
    Then the status code returned is '200'
    And I capture the created collections ID
    When I execute a PUT collection method request
    Then the status code returned is '200'


  Scenario: POST a new collection to a POSTMan user account using Immutable Object
    Given I have a base service endpoint for the collections methods in the Postman API
    And I have a valid API Key for the Postman Service
    And I set the Content Type to "ContentType.JSON"
    When I execute the POST collection request using an Immutable object
    Then the collection is created in POSTMan
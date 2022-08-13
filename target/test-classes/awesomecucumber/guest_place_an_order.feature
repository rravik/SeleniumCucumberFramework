Feature: Place an order

  Scenario: Using default payment option
    Given I'm a guest user
    And my billing details are
      |firstname|lastname|country|address_line1|city|state|zip|email|
      |demo     |user    |United States (US) |6300 Spring creek|Plano|Texas|75024|askomdch@gmail.com|

    And I have a product in the cart
    And I'm on the checkout page
    When I provide billing details
    And I place an order
    Then The order should be placed successfully

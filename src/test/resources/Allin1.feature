Feature: All Inclusive

  Scenario Outline: Sab Hai Ismei
    Given user is on Home Page
    When he searches for Dress
    And choose to but the first item
    And moves to checkout from mini cart
    And enter personal details on checkout page
    And place the order

Feature: get a quote
  In order to know how much I might pay for an insurance
  As a customer
  I want to be able to receive a quote from needs analysis

  Scenario: As a private policy holder I want to receive a quote for a dental plan
    Given I'm a private policy holder
    Given I've selected a dental plan
    When I request a quote
    Then I should receive the correct quote
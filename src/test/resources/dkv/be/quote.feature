Feature: get a quote
  In order to know how much I might pay for an insurance
  As a customer
  I want to be able to receive a quote from needs analysis

  Scenario Outline: As a private policy holder I want to receive a correct quote
    Given I'm a private policy holder
    Given I've selected the plan <plan>
    When I request a quote
    Then I should receive the quote with a total value of <total>

    Examples:
      | plan | total |
      | 82s | 1 |
      | hp | 2 |

Feature: Stark Trek beamer
  We should be able to beam Captain Kirk up when he is in trouble

  Scenario: Beam up Captain Kirk
    Given Captain Kirk is in trouble
    When Kirk ask to be beamed up
    Then Scotty should beam him up
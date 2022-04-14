Feature: This feature will make the search show the results that are determined by editorial, as well
  as generic searches.
  Scenario:
    When I search ‘sky’ in the search bar
    Then I should see an editorial section.
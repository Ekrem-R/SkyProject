Feature: This feature will make sure that the shop page is navigable and usable.
  @deals
  Scenario: User navigates to shop page
    When I navigate to ‘Deals’ on home page
    Then the user should be on the "https://www.sky.com/deals page"
@login
  Scenario Outline: User sees tiles on the shop page
    When I try to sign in with invalid credentials as "<email>"
    Then I should see a box with the text ‘Create your My Sky password’
    Examples:
    |email|
    |muharrem.11tokul11@gmail.com|

@deals
  Scenario: User sees a list of deals on the deals page
    Given I am on the "https://www.sky.com/deals" page
    Then I see a list of deals with a price to it (see Snapshot B)

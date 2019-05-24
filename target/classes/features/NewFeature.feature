Feature: Use google to search for an article about selenium

Scenario: Open first link of selenium search result
Given Open google homepage
And Check page title is "Google"
When Search for "Selenium" topic
Then Open first result
And Check page title is "Selenium - Web Browser Automation"

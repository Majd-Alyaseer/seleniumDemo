$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NewFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Use google to search for an article about selenium",
  "description": "",
  "id": "use-google-to-search-for-an-article-about-selenium",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6954763200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Open first link of selenium search result",
  "description": "",
  "id": "use-google-to-search-for-an-article-about-selenium;open-first-link-of-selenium-search-result",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open google homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Check page title is \"Google\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Search for \"Selenium\" topic",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Open first result",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Check page title is \"Selenium - Web Browser Automation\"",
  "keyword": "And "
});
formatter.match({
  "location": "NavigateToPage.openHomepage()"
});
formatter.write("\u003ca href\u003d\u0027../ScreenShots/ScreenShot_1558648857835.png\u0027\u003e\u003cimg src\u003d\u0027../ScreenShots/ScreenShot_1558648857835.png\u0027 width\u003d\u0027100px\u0027height\u003d\u0027170px\u0027\u003e\u003c/a\u003e");
formatter.result({
  "duration": 3311824900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 21
    }
  ],
  "location": "CheckPageTitle.checkTitle(String)"
});
formatter.result({
  "duration": 11794600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium",
      "offset": 12
    }
  ],
  "location": "SearchForTopic.search_for_topic(String)"
});
formatter.result({
  "duration": 4352771600,
  "status": "passed"
});
formatter.match({
  "location": "ClickLink.clickLink()"
});
formatter.write("\u003ca href\u003d\u0027../ScreenShots/ScreenShot_1558648865162.png\u0027\u003e\u003cimg src\u003d\u0027../ScreenShots/ScreenShot_1558648865162.png\u0027 width\u003d\u0027100px\u0027height\u003d\u0027170px\u0027\u003e\u003c/a\u003e");
formatter.result({
  "duration": 3203143700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium - Web Browser Automation",
      "offset": 21
    }
  ],
  "location": "CheckPageTitle.checkTitle(String)"
});
formatter.result({
  "duration": 19467400,
  "status": "passed"
});
formatter.after({
  "duration": 84717900,
  "status": "passed"
});
});
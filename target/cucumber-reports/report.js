$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./FeatureFile/FeatureFileUsingPageFactory.feature");
formatter.feature({
  "line": 1,
  "name": "All Features of MacD website",
  "description": "",
  "id": "all-features-of-macd-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verification of McDelivery Website",
  "description": "",
  "id": "all-features-of-macd-website;verification-of-mcdelivery-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on McDelivery homepage",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#\tWhen user click on View Profile"
    },
    {
      "line": 7,
      "value": "#\tThen user click on Login/ Sign Up"
    },
    {
      "line": 8,
      "value": "#\tThen user enters mobile number"
    },
    {
      "line": 9,
      "value": "#\tAnd user click on Verify Mobile"
    },
    {
      "line": 10,
      "value": "#\tAnd user enters valid credential"
    },
    {
      "line": 12,
      "value": "#\tWhen user clicks on the change button"
    },
    {
      "line": 13,
      "value": "#\tThen user navigates to address selection page"
    },
    {
      "line": 14,
      "value": "#\tThen user enters the \"\u003caddress\u003e\" in Search building, locality, street address bar"
    },
    {
      "line": 15,
      "value": "#\tThen user clicks on save and select address"
    },
    {
      "line": 16,
      "value": "#"
    },
    {
      "line": 17,
      "value": "#\tWhen user clicks on App Store icon image"
    },
    {
      "line": 18,
      "value": "#\tThen check the title and verify the App Store site in new window"
    },
    {
      "line": 19,
      "value": "#\tWhen user clicks on Google Play icon image"
    },
    {
      "line": 20,
      "value": "#\tThen check the title and verify the Google Play site in new window"
    },
    {
      "line": 21,
      "value": "#"
    },
    {
      "line": 22,
      "value": "#\tWhen user click from the Item List"
    }
  ],
  "line": 23,
  "name": "user click on Search and enters \"\u003ckeyword\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 24,
      "value": "#\tWhen user click on Calories Toggle Button"
    },
    {
      "line": 25,
      "value": "#\tWhen user click on Veg Only Toggle Button"
    },
    {
      "line": 26,
      "value": "#"
    },
    {
      "line": 27,
      "value": "#\tWhen  click on Add+ button"
    },
    {
      "line": 28,
      "value": "#\tThen  customization list should be displayed"
    },
    {
      "line": 29,
      "value": "#\tThen  user should be able to customize items"
    },
    {
      "line": 30,
      "value": "#\tAnd  Add to cart"
    },
    {
      "line": 31,
      "value": "#"
    },
    {
      "line": 32,
      "value": "#\tThen  user click on View Cart"
    },
    {
      "line": 33,
      "value": "#\tAnd  user click on + to add item"
    },
    {
      "line": 34,
      "value": "#\tAnd  user click on pay button"
    },
    {
      "line": 35,
      "value": "#\tThen  user closes the window"
    }
  ],
  "line": 37,
  "name": "",
  "description": "",
  "id": "all-features-of-macd-website;verification-of-mcdelivery-website;",
  "rows": [
    {
      "cells": [
        "address",
        "keyword"
      ],
      "line": 38,
      "id": "all-features-of-macd-website;verification-of-mcdelivery-website;;1"
    },
    {
      "cells": [
        "Medical Square Nagpur Bus Stop",
        "Burger"
      ],
      "line": 39,
      "id": "all-features-of-macd-website;verification-of-mcdelivery-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "Verification of McDelivery Website",
  "description": "",
  "id": "all-features-of-macd-website;verification-of-mcdelivery-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on McDelivery homepage",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#\tWhen user click on View Profile"
    },
    {
      "line": 7,
      "value": "#\tThen user click on Login/ Sign Up"
    },
    {
      "line": 8,
      "value": "#\tThen user enters mobile number"
    },
    {
      "line": 9,
      "value": "#\tAnd user click on Verify Mobile"
    },
    {
      "line": 10,
      "value": "#\tAnd user enters valid credential"
    },
    {
      "line": 12,
      "value": "#\tWhen user clicks on the change button"
    },
    {
      "line": 13,
      "value": "#\tThen user navigates to address selection page"
    },
    {
      "line": 14,
      "value": "#\tThen user enters the \"\u003caddress\u003e\" in Search building, locality, street address bar"
    },
    {
      "line": 15,
      "value": "#\tThen user clicks on save and select address"
    },
    {
      "line": 16,
      "value": "#"
    },
    {
      "line": 17,
      "value": "#\tWhen user clicks on App Store icon image"
    },
    {
      "line": 18,
      "value": "#\tThen check the title and verify the App Store site in new window"
    },
    {
      "line": 19,
      "value": "#\tWhen user clicks on Google Play icon image"
    },
    {
      "line": 20,
      "value": "#\tThen check the title and verify the Google Play site in new window"
    },
    {
      "line": 21,
      "value": "#"
    },
    {
      "line": 22,
      "value": "#\tWhen user click from the Item List"
    }
  ],
  "line": 23,
  "name": "user click on Search and enters \"Burger\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TestStepsPageFactory.user_is_on_McDelivery_homepage()"
});
formatter.result({
  "duration": 5300779300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Burger",
      "offset": 33
    }
  ],
  "location": "TestStepsPageFactory.user_click_on_Search_and_enters(String)"
});
formatter.result({
  "duration": 6116200,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"pageFactory.Search_PF.enterKeyword(String)\" because \"this.search\" is null\r\n\tat stepDefinition.TestStepsPageFactory.user_click_on_Search_and_enters(TestStepsPageFactory.java:189)\r\n\tat ✽.And user click on Search and enters \"Burger\"(./FeatureFile/FeatureFileUsingPageFactory.feature:23)\r\n",
  "status": "failed"
});
});
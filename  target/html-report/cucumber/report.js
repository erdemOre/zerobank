$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivityNavigation.feature");
formatter.feature({
  "name": "Navigating\tto\tspecific\taccounts\tin\tAccounts\tActivity",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "select \"\u003caccountType\u003e\" on the Account Summary Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.step({
  "name": "the user navigates to \"Account Summary\" page",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on\t\"\u003caccountType\u003e\"\tlink on\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "Account\tdrop down should have \"\u003caccountType\u003e\" selected",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountType"
      ]
    },
    {
      "cells": [
        "Savings"
      ]
    },
    {
      "cells": [
        "Brokerage"
      ]
    },
    {
      "cells": [
        "Checking"
      ]
    },
    {
      "cells": [
        "Credit Card"
      ]
    },
    {
      "cells": [
        "Loan"
      ]
    }
  ]
});
formatter.scenario({
  "name": "select \"Savings\" on the Account Summary Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Account Summary\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on\t\"Savings\"\tlink on\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserClicksOnLinkOnTheAccountSummaryPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]Account Activity\u003e but was:\u003c[Zero - ]Account Activity\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(AccountsActivityStepDefs.java:47)\r\n\tat ✽.the \"Account Activity\" page should be displayed(file:///C:/Users/benyu/IdeaProjects/zerobank-automation/src/test/resources/features/AccountActivityNavigation.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Account\tdrop down should have \"Savings\" selected",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "select \"Brokerage\" on the Account Summary Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Account Summary\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on\t\"Brokerage\"\tlink on\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserClicksOnLinkOnTheAccountSummaryPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]Account Activity\u003e but was:\u003c[Zero - ]Account Activity\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(AccountsActivityStepDefs.java:47)\r\n\tat ✽.the \"Account Activity\" page should be displayed(file:///C:/Users/benyu/IdeaProjects/zerobank-automation/src/test/resources/features/AccountActivityNavigation.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Account\tdrop down should have \"Brokerage\" selected",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "select \"Checking\" on the Account Summary Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Account Summary\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on\t\"Checking\"\tlink on\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserClicksOnLinkOnTheAccountSummaryPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]Account Activity\u003e but was:\u003c[Zero - ]Account Activity\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(AccountsActivityStepDefs.java:47)\r\n\tat ✽.the \"Account Activity\" page should be displayed(file:///C:/Users/benyu/IdeaProjects/zerobank-automation/src/test/resources/features/AccountActivityNavigation.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Account\tdrop down should have \"Checking\" selected",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "select \"Credit Card\" on the Account Summary Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Account Summary\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on\t\"Credit Card\"\tlink on\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserClicksOnLinkOnTheAccountSummaryPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]Account Activity\u003e but was:\u003c[Zero - ]Account Activity\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(AccountsActivityStepDefs.java:47)\r\n\tat ✽.the \"Account Activity\" page should be displayed(file:///C:/Users/benyu/IdeaProjects/zerobank-automation/src/test/resources/features/AccountActivityNavigation.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Account\tdrop down should have \"Credit Card\" selected",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "select \"Loan\" on the Account Summary Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.the_user_is_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Account Summary\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on\t\"Loan\"\tlink on\tthe\tAccount\tSummary\tpage",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.theUserClicksOnLinkOnTheAccountSummaryPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the \"Account Activity\" page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]Account Activity\u003e but was:\u003c[Zero - ]Account Activity\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.zerobank.stepdefinitions.AccountsActivityStepDefs.thePageShouldBeDisplayed(AccountsActivityStepDefs.java:47)\r\n\tat ✽.the \"Account Activity\" page should be displayed(file:///C:/Users/benyu/IdeaProjects/zerobank-automation/src/test/resources/features/AccountActivityNavigation.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Account\tdrop down should have \"Loan\" selected",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});
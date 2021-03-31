$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3648560800,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Search Easter egg",
  "description": "",
  "id": "search;search-easter-egg",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that you access wikipedia in portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "search for \"Ovo de Páscoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "displays the expression \"Ovo de Páscoa\" in the title of the tab",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.thatYouAccessWikipediaInPortugues()"
});
formatter.result({
  "duration": 2754802500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 12
    }
  ],
  "location": "Post.searchFor(String)"
});
formatter.result({
  "duration": 1967680400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Páscoa",
      "offset": 25
    }
  ],
  "location": "Post.displaysTheExpressionInTheTitleOfTheTab(String)"
});
formatter.result({
  "duration": 237585700,
  "status": "passed"
});
formatter.after({
  "duration": 1235791000,
  "status": "passed"
});
});
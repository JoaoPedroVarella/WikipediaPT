Feature: Search
  Scenario: Search Easter egg
      Given that you access wikipedia in portugues
      When search for "Ovo de Páscoa"
      Then displays the expression "Ovo de Páscoa" in the title of the tab
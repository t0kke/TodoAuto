Feature: Creating new tasks

  Scenario: Task creation
    Then Add new task "New task"
    When Verify adding a added task "New task"

#  Scenario: Rename task
#    Then Add new task "Задача, которую переименуют"
#    Then Rename task "Задача, которую переименуют" on "Новое название"
#    When Verify adding a added task "Новое название"

  Scenario: Check the display of the created task in the section
    Then Add new task "New task"
    When Verify adding a added task "New task"
    When Go to the section "Active"
    When Checking that the "Active" section is selected
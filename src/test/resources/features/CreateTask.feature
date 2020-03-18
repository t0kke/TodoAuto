Feature: Создание новых задач в ToDo листе

  Scenario: Task creation
    Then Add new task "Новая задача"
    When Verify adding a added task "Новая задача"

#  Scenario: Rename task
#    Then Add new task "Задача, которую переименуют"
#    Then Rename task "Задача, которую переименуют" on "Новое название"
#    When Verify adding a added task "Новое название"

  Scenario: Check the display of the created task in the section
    Then Add new task "New task"
    When Verify adding a added task "New task"
    When The "Active" section displays the task "New task"
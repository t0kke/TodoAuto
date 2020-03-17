Feature: Создание новых задач в ToDo листе

  Scenario: Task creation
    Then Add new task "Новая задача"
    When Verify adding a added task "Новая задача"

#  Scenario: Rename task
#    Then Add new task "Задача, которую переименуют"
#    Then Rename task "Задача, которую переименуют" on "Новое название"
#    When Verify adding a added task "Новое название"

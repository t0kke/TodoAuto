Feature: Выполение задач

  Scenario: Mark all tasks as completed
    When Add new task "Новая задача 1"
    When Add new task "Новая задача 2"
    When Add new task "Новая задача 3"
    Then Select all tasks as completed
    Then Go to active tab
    Then Check that there are no active tasks


  Scenario: Mark the task as completed
    When Add new task "Новая задача"
    When Mark the task "Новая задача" as completed
    Then Task "Новая задача" is marked as completed
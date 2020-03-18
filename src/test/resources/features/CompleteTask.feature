Feature: Сomplete tasks

  Scenario: Mark all tasks as completed
    When Add new task "Task 1"
    When Add new task "Task 1"
    When Add new task "Task 1"
    Then Select all tasks as completed
    Then Go to active tab
    Then Check that there are no active tasks


  Scenario: Mark the task as completed
    When Add new task "Task 1"
    When Mark the task "Task 1" as completed
    Then Task "Task 1 " is marked as completed
package steps;

import io.cucumber.java.en.Then;
import pages.MainPage;

public class MainPageDef {
    MainPage mainPage = new MainPage();

    @Then("Add new task {string}")
    public void addNewTask(String arg0) {
        mainPage.InputTask(arg0);
    }

    @Then("Verify adding a added task {string}")
    public void verifyAddingAAddedTask(String arg0) {
        mainPage.SearchForTaskByName(arg0);
    }

    @Then("Delete a task {string}")
    public void deleteATask(String arg0) {
        mainPage.DeleteTaskByName(arg0);
    }

    @Then("Select all tasks as completed")
    public void selectAllTasksAsCompleted() {
        mainPage.SelectAllTasks();
    }

    @Then("Go to active tab")
    public void goToActiveTab() {
        mainPage.GoToActiveTab();
    }

    @Then("Check that there are no active tasks")
    public void checkThatThereAreNoActiveTasks() {
        mainPage.CheckThatThereAreNoActiveTasks();
    }
}

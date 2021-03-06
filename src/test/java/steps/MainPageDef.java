package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageDef {
    MainPage mainPage = new MainPage();

    @Then("Add new task {string}")
    public void addNewTask(String arg0) {
        mainPage.InputTask(arg0);
    }

    @When("Verify adding a added task {string}")
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

    @When("Mark the task {string} as completed")
    public void markTheTaskAsCompleted(String arg0) {
        mainPage.MarkTaskAsCompleted(arg0);
    }

    @Then("Task {string} is marked as completed")
    public void taskIsMarkedAsCompleted(String arg0) {
        mainPage.CheckThatTaskIsCompleted(arg0);
    }

    @When("Go to the section {string}")
    public void goToTheSection(String arg0) {
        mainPage.GoToTheSection(arg0);
    }

    @When("Checking that the {string} section is selected")
    public void checkingThatTheSectionIsSelected(String arg0) {
        mainPage.checkSelectedSection(arg0);
    }


//    @Then("Rename task {string} on {string}")
//    public void renameTaskOn(String arg0, String arg1) {
//        mainPage.RenameTask(arg0, arg1);
//    }

}

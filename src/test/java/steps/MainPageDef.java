package steps;

import io.cucumber.java.en.Then;
import pages.MainPage;

public class MainPageDef {
    MainPage mainPage = new MainPage();

    @Then("Add new task {string}")
    public void addNewTask(String arg0) {
        mainPage.InputTask(arg0);
    }

}
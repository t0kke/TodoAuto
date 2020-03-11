package steps;

import io.cucumber.java.en.Then;
import pages.BasePage;

public class BasePageDef {
    BasePage basePage = new BasePage();


    @Then("Find element by {string} with value {string} and click on it")
    public void findElementByWithValueAndClickOnIt(String arg0, String arg1) {
        basePage.clickOnItemWith(arg0, arg1);
    }

    @Then("Find element by {string} with value {string} and enter text {string}")
    public void findElementByWithValueAndEnterText(String arg0, String arg1, String arg2) {
    }
}

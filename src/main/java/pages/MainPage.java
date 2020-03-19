package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement TaskInputField = $(By.className("new-todo"));
    private SelenideElement MarkAllTasks = $(By.xpath("//label[text()='Mark all as complete']"));
    private SelenideElement ActiveTasksTab = $(By.xpath("//a[text()='Active']"));

    public void InputTask(String text) {
        this.TaskInputField.val(text).pressEnter();
    }

    public void SelectAllTasks(){ this.MarkAllTasks.click();}

    public void SearchForTaskByName(String name) {
        $(By.xpath("//div[text()='" + name + "']")).isDisplayed();
    }

    public void DeleteTaskByName(String name) {
        $(By.xpath("//label[text()='" + name + "']")).hover();
        $(By.className("destroy")).click();
        $(By.xpath("//label[text()='" + name + "']")).shouldNotHave(Condition.visible);
    }

    public void GoToActiveTab() {
        this.ActiveTasksTab.click();
    }

    public void CheckThatThereAreNoActiveTasks() {
        $(By.cssSelector("li.todo")).shouldNotHave(Condition.visible);
    }

    public void MarkTaskAsCompleted(String name) {
        $(By.xpath("//label[.='" + name + "']/../input")).click();

    }

    public void CheckThatTaskIsCompleted(String name) {
        $(By.xpath("//li[@class='todo completed']//label[.='" + name + "']")).isDisplayed();

    }

//    public void RenameTask(String name, String newName) {
//        $(By.xpath("//label[.='" + name + "']")).doubleClick().waitUntil(Condition.visible, 1000).sendKeys(Keys.CONTROL+"a");
//        //$(By.xpath("//label[.='" + name + "']")).val(newName).click();
//    }

    public void checkSelectedSection(String nameSection) {
        $(By.xpath("//a[.='" + nameSection + "']")).shouldHave(Condition.attribute("class", "selected"));
    }

    public void GoToTheSection(String section) {
        $(By.xpath("//a[.='" + section + "']")).click();
    }
}

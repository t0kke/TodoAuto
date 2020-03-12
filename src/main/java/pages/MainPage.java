package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement TaskInputField = $(By.className("new-todo"));
    private SelenideElement MarkAllTasks = $(By.xpath("//label[text()='Mark all as complete']"));

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
}

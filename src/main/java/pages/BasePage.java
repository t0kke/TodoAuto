package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public void clickOnItemWith(String item, String valueAttribute) {
        if (item == "id"){
            $(By.id(valueAttribute)).click();
        }
        if (item == "class"){
            $(By.className(valueAttribute)).click();
        }
        if (item == "css"){
            $(By.cssSelector(valueAttribute)).click();
        }
        if (item == " xpath"){
            $(By.xpath(valueAttribute)).click();
        }
    }

    public void clickInElementWithText(String text){
        $(By.xpath("//div[text()='" + text + "']")).click();
    }

    public void enterTextIntoElementWith(String item, String valueAttribute, String text){
        if (item == "id"){
            $(By.id(valueAttribute)).setValue(text);
        }
        if (item == "class"){
            $(By.className(valueAttribute)).setValue(text).pressEnter();
        }
        if (item == "css"){
            $(By.cssSelector(valueAttribute)).setValue(text);
        }
        if (item == " xpath"){
            $(By.xpath(valueAttribute)).setValue(text);
        }
    }
}

package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {
    @Before
    public void openURL(){
        open("http://todomvc.com/examples/vue/");
    }
}

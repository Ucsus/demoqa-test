package ru.testmepls;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        String name = "Egor";

        open("/text-box");
//        $("[id=userName]").setValue("Egor");
        $("#userName").setValue(name);
        $("#userEmail").setValue("egor@gmail.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text("egor@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Some address 1"));
        $("#output #permanentAddress").shouldHave(text("Another address 1"));

    }
}

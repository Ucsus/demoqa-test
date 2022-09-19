package ru.testmepls;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {
    void cssXpathExamples() {
        $("[data-testid=email]").setValue("a@a.com");
        $(by("data-testid", "email")).setValue("a@a.com");

        $("#testid").setValue("a@a.com");
        $(byId("email")).setValue("a@a.com");
        $(By.id("email")).setValue("a@a.com");
        $x("//*[@id='email']").setValue("a@a.com");

        $("[name=email]").setValue("a@a.com");
        $(byName("email")).setValue("a@a.com");

        $("[class=login_form_input_box]").setValue("a@a.com");
        $(".login_form_input_box").setValue("a@a.com");
        $(".input.login_form_input_box").setValue("a@a.com");


        $(".input. login_form_input_box").setValue("a@a.com");
        $(".input").$(".login_form_input_box").setValue("a@a.com");

        $(byText("Hello qa-guru"));
        $(withText("llo qa-guru"));
    }
}

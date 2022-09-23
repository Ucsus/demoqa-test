package ru.testmepls.pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ResultsTableComponent {

    private final static String TITLE_TEXT = "Thanks for submitting the form";

    public ResultsTableComponent checkVisible() {
        $(".modal-dialog").should(appear);
        $(".modal-header").shouldHave(text(TITLE_TEXT));

        return this;
    }

    public ResultsTableComponent setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();

        return this;
    }

    public ResultsTableComponent checkResult(String key, String value) {
        $(".table-responsive table").$(byText(key))
                .parent().shouldHave(text(value));

        return this;
    }

}

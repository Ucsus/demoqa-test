package ru.testmepls.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    String firstName = "David",
            lastName = "Courtney",
            email = "dcscroot@gmail.com",
            year = "1985",
            month = "August",
            birthday = "20",
            phoneNumber = "9505674007",
            gender = "Male",
            subject = "Arts",
            hobbies = "Reading",
            address = "Solnechnaya st, 12-1",
            state = "Haryana",
            city = "Karnal";

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
}

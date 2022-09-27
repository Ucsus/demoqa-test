package ru.testmepls.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.testmepls.pages.RegistrationFormPage;

public class AutomationPracticeTestWithPageObjects {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void fillPracticeFormTest() {
        registrationFormPage.openPage()
                .setFirstName("David")
                .setLastName("Courtney")
                .setEmail("dcscroot@gmail.com")
                .setGender("Male")
                .setNumber("7950567400")
                .setBirthDate("20", "July", "1985")
                .setSubject("Arts")
                .setHobbies("Reading")
                .setPicture("16451858.jpg")
                .setAddress("Solnechnaya st, 12-1")
                .setState("Haryana")
                .setCity("Karnal")
                .clickSubmit();

        registrationFormPage.checkResultsTableVisible()
                .checkResult("Student Name", "David Courtney")
                .checkResult("Student Email", "dcscroot@gmail.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7950567400")
                .checkResult("Date of Birth", "20 July,1985")
                .checkResult("Subjects", "Arts")
                .checkResult("Hobbies", "Reading")
                .checkResult("Picture", "16451858.jpg")
                .checkResult("Address", "Solnechnaya st, 12-1")
                .checkResult("State and City", "Haryana Karnal");

    }


}

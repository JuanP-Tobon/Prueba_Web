package com.banistmo.certication.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsPage {
    public static final Target REGISTER_BUTTON = Target.the("The register button").locatedBy(".unauthenticated-nav-bar__sign-up");
    public static final Target FIRST_NAME_INPUT = Target.the("First name field").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Last name field").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email field").located(By.id("email"));
    public static final Target MONTH_LIST = Target.the("List to select a month").located(By.id("birthMonth"));
    public static final Target DAY_LIST = Target.the("List to select a day").located(By.id("birthDay"));
    public static final Target YEAR_LIST = Target.the("List to select a year").located(By.id("birthYear"));

    public static final Target NEXT_BUTTON  = Target.the("Button to next page").locatedBy("//span[contains(text(),'Next')]");

    public static final Target CONFIRMATION_TEXT = Target.the("Confirmation message").locatedBy("//span[text()='Add your address']");

}

package com.banistmo.certication.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class PruebaWebStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user Open the page")
    public void theUserOpenThePage() {
        OnStage.theActorCalled("User").wasAbleTo(Open.browserOn().thePageNamed("pages.urlTest"));
    }

    @When("The user fill the forms")
    public void theUserFillTheForms() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(".unauthenticated-nav-bar__sign-up", WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(".unauthenticated-nav-bar__sign-up")
        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

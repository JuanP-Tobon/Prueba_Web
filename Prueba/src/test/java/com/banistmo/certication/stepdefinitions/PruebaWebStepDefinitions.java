package com.banistmo.certication.stepdefinitions;

import com.banistmo.certication.questions.Validation;
import com.banistmo.certication.tasks.FillForm;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PruebaWebStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user Open the page")
    public void theUserOpenThePage() {
        OnStage.theActorCalled("user").wasAbleTo(Open.browserOn().thePageNamed("pages.urlTest"));
    }

    @When("The user fill the forms")
    public void theUserFillTheForms() {
        OnStage.theActorInTheSpotlight().attemptsTo(FillForm.on());
    }

    @Then("The user see the confirmation message")
    public void theUserSeeTheConfirmationMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validation.message(),is(equalTo("Add your address"))));
    }
}

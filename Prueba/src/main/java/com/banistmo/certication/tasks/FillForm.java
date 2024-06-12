package com.banistmo.certication.tasks;

import com.banistmo.certication.userinterfaces.FormsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FillForm implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(FormsPage.REGISTER_BUTTON),
                WaitUntil.the(FormsPage.FIRST_NAME_INPUT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("Juan").into(FormsPage.FIRST_NAME_INPUT),
                Enter.theValue("Tobon").into(FormsPage.LAST_NAME_INPUT),
                Enter.theValue("juan.p.tobon@banistmo.com").into(FormsPage.EMAIL_INPUT),
                SelectFromOptions.byVisibleText("February").from(FormsPage.MONTH_LIST),
                SelectFromOptions.byVisibleText("25").from(FormsPage.DAY_LIST),
                SelectFromOptions.byVisibleText("2000").from(FormsPage.YEAR_LIST));

                actor.attemptsTo(
                        Scroll.to(FormsPage.NEXT_BUTTON),
                        Click.on(FormsPage.NEXT_BUTTON)
                );
    }

    public static FillForm on(){
        return Tasks.instrumented(FillForm.class);
    }
}

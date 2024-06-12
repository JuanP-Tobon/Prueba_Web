package com.banistmo.certication.questions;

import com.banistmo.certication.userinterfaces.FormsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validation implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(FormsPage.CONFIRMATION_TEXT).asString().answeredBy(actor);
    }

    public static Validation message(){
        return new Validation();
    }
}

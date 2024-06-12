package com.banistmo.certication.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba_web.feature",
        glue = "com.banistmo.certication.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PruebaWeb {
}


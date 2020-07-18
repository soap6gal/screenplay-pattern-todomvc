package net.serenitybdd.demos.todos.cucumber;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "net.serenitybdd.demos.todos.cucumber.steps",
        features = "classpath:features"
)
public class FullTestSuite2 {}

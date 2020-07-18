package net.serenitybdd.demos.todos.cucumber.steps;

import io.cucumber.java.Before;
import net.serenitybdd.cucumber.suiteslicing.SerenityTags;

public class Hooks {
    @Before
    public void before() {
        SerenityTags.create().tagScenarioWithBatchingInfo();
    }

}

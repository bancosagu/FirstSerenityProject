package org.testfasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.testfasttrackit.pages.HomePage;

public class SearchSteps extends ScenarioSteps {
    private HomePage homepage;


    @Step
    public void doSearch(String keyword){
        homepage.setSearchField(keyword);
        homepage.clickSearchIcon();
    }
}

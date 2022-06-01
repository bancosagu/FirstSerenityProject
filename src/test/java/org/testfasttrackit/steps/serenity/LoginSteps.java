package org.testfasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.testfasttrackit.pages.HomePage;

public class LoginSteps extends ScenarioSteps {
    private HomePage homePage;
//    private LoginPage loginPage;
//    private AccountPage accountPage;

    @Step
    void navigateToHomePage(){homePage.open();}

}

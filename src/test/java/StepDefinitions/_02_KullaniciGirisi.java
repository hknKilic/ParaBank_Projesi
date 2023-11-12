package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_KullaniciGirisi {
    DialogContent dc = new DialogContent();

    @When("Enter username and password and click login button")
    public void login() {
        dc.mySendKeys(dc.usernameLoginpage,"TechnoTeam-17");
        dc.mySendKeys(dc.passwordLoginpage,"TechnoTeam-17");
        dc.myClick(dc.loginButton);
    }

    @Then("User should log-in successfully")
    public void positivelogin() {
        dc.verifyContainsText(dc.verifyLogin2,"Welcome");
    }
}

package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _04_YeniBankaHesabiTanimlama {

    DialogContent dc=new DialogContent();

    @Given("Naviga to Open New Account Page")
    public void navigaToOpenNewAccountPage() {
        dc.myClick(dc.openNewAccount);

    }

    @Then("Select Account Type and Account ID and Submit")
    public void selectAccountTypeAndAccountIDAndSubmit() {
        dc.selectEngineByID("type",0);
        dc.selectEngineByID("fromAccountId",0);
        dc.myClick(dc.submitButton);

    }

    @And("Use account should succesfully opened")
    public void useAccountShouldSuccesfullyOpened() {
        dc.verifyContainsText(dc.accountOpenedBox, "Account Opened!");
    }
}

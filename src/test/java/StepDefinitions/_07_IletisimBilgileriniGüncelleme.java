package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _07_IletisimBilgileriniGüncelleme {

    DialogContent dc = new DialogContent();
    Faker f = new Faker();

    @Given("Navigate To ParaBank")
    public void theUserIsOnTheProfilePage() {
      //  GWD.getDriver().get("https://para.testar.org/");
        GWD.getDriver().get("https://parabank.parasoft.com/");}

    @When("Enter click  UpdataContactInfoButton")
    public void enterClickUpdataContactInfoButton() {

   dc.myClick(dc.UpdataContactInfoButton);
    }

    @Then("Enter  in Text Box")
    public void enterInTextBox() {
        dc.mySendKeys(dc.firstName, "hakan");
        dc.mySendKeys(dc.lastName, "umut");
        dc.mySendKeys(dc.adress, "AlturStrasse 5");
        dc.mySendKeys(dc.city, "Achen");
        dc.mySendKeys(dc.state, "Deutschland");
        dc.mySendKeys(dc.zipcode, "0571");
        dc.mySendKeys(dc.phone, "0123456789");
    }

    @And("clicks the UPDATA PROFILE button")
    public void clicksTheUPDATAPROFILEButton() {
        dc.myClick(dc.UPDATAPROFILEButton);
    }


    @And("User should Updata successfully")
    public void userShouldUpdataSuccessfully() throws InterruptedException {
        dc.verifyContainsText(dc.verifyUpdata, "Profile Updated");
    }



}



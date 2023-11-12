package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_Register {

    DialogContent dc = new DialogContent();

    Faker fk = new Faker();

    @Given("Navigate To ParaBank in Register")
    public void navigateToPrestaShop() throws InterruptedException {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=7F4F5092BD42867091CCD544C10878B7");
        Thread.sleep(2000);
    }

    @Then("Enter Data in Text Box")
    public void enterEMailAdressAndPassword() {
        dc.mySendKeys(dc.firstName, "miriam");
        dc.mySendKeys(dc.lastName, "zeynep");
        dc.mySendKeys(dc.adress, "schulstrasse 1");
        dc.mySendKeys(dc.city, "Berlin");
        dc.mySendKeys(dc.state, "Deutschland");
        dc.mySendKeys(dc.zipcode, "13599");
        dc.mySendKeys(dc.phone, "0792222222");
        dc.mySendKeys(dc.ssn, "2023");
        String emailfake = fk.name().username();
        dc.mySendKeys(dc.userName, emailfake);

        dc.mySendKeys(dc.password, "miriam2023");
        dc.mySendKeys(dc.confirm, "miriam2023");
        dc.myClick(dc.REGISTER);
    }

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() throws InterruptedException {
        dc.verifyContainsText(dc.verifyLogin, "Welcome");
    }

}


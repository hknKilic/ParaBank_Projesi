package StepDefinitions;

import Pages.DialogContent;

public class _08_KrediBasvurusuYapma {
    DialogContent dc=new DialogContent();
    @io.cucumber.java.en.Given("Navigate to Request Loan Page")
    public void navigateToRequestLoanPage() {
        dc.myClick(dc.requestLoanPageLink);

    }

    @io.cucumber.java.en.Then("Enter Load Amount, Down Payment, Select Accunt ID and Submit")
    public void enterLoadAmountDownPaymentSelectAccuntIDAndSubmit() {
        dc.mySendKeys(dc.loanAmountBox,"1000");
        dc.mySendKeys(dc.downPaymentBox, "100");
        dc.selectEngineByID("fromAccountId", 0);
        dc.myClick(dc.submitButton);
    }

    @io.cucumber.java.en.And("User Loan Request Result should be succesfully displayed")
    public void userLoanRequestResultShouldBeSuccesfullyDisplayed() {
        dc.verifyContainsText(dc.loanRequestStatus, "approved");
        System.out.println("dc = " + dc.loanRequestStatus.getText());
        //  dc.verifyContainsText(dc.loanRequestStatus, "Denied");


    }
}

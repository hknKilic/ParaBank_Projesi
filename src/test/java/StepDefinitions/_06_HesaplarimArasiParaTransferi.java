package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _06_HesaplarimArasiParaTransferi {

    DialogContent dc=new DialogContent();

    @And("Accessing the page for money transfers")
    public void accessingThePageForMoneyTransfers() {
        dc.myClick(dc.transferFunds);
    }

    @When("Money Transfer Process and Sending Funds")
    public void moneyTransferProcessandSendingFunds() {

        dc.mySendKeys(dc.amountToTransfer,"100");
        dc.myClick(dc.transfer);
    }

    @Then("Transfer Verification and Control")
    public void transferVerificationandControl() {

        dc.verifyContainsText(dc.transferCompleteText,"Transfer Complete!");
    }
}

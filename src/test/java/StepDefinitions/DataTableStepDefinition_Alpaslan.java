package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataTableStepDefinition_Alpaslan {
    DialogContent dc=new DialogContent();
    @io.cucumber.java.en.Given("Click to WebElement")
    public void clickToOpenNewAccountPage(DataTable value) {
        List<String> stringList=value.asList(String.class);
        for (int i = 0; i < stringList.size(); i++) {
            WebElement linkWebElement=dc.getWebElement(stringList.get(i));
            dc.myClick(linkWebElement);

        }


    }

    @Then("Select Account Type and Account ID")
    public void selectAccountTypeAndAccountID(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement selectElement = dc.getWebElement(items.get(i).get(0));
            int indexNumber = Integer.parseInt(items.get(i).get(1));
            dc.selectEngineByWebElement(selectElement, indexNumber);
        }
    }

    @And("Verify Openning succesfully")
    public void verifyOpenningSuccesfully(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            dc.verifyContainsText(element, word);

        }

    }
}

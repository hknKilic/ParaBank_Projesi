package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest ,@Regression",
        features = {"src/test/java/featureFiles/_07_Iletisim_Billgilerini_Güncelleme.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _07_IletisimBilgileriniGuncellemeRunner extends AbstractTestNGCucumberTests{
}

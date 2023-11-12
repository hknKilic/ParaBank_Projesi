package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest ,@Regression",
        features = {"src/test/java/featureFiles/_05_Hesap_Detaylarina_Erisim.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _05_HesapDetaylarinaErisimRunner extends AbstractTestNGCucumberTests{
}

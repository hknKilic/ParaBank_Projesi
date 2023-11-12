package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

      //  tags = "@SmokeTest ,@Regression",
        features = {"src/test/java/featureFiles/_02_Kullanici_Girisi.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _02_KullaniciGirisiRunner extends AbstractTestNGCucumberTests{
}

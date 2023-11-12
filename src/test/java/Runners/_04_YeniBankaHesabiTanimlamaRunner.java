package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/featureFiles/_04_Yeni_Banka_Hesabi_Tanimlama.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _04_YeniBankaHesabiTanimlamaRunner extends AbstractTestNGCucumberTests{
}

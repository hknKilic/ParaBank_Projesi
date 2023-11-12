package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/featureFiles/_06_Hesaplarim_Arasi_Para_Transferi.feature"},
        glue={"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class _06_HesaplarimArasiParaTransferiRunner extends AbstractTestNGCucumberTests{
}


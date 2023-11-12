package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Parent {

    public WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String yazi){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        //action la ESC ye basarak açık kutucuk veya mesaj var ise kapat
        //new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }


    public void selectEngineByID(String selectID, int indexNumber) {
        WebElement webMenu= GWD.getDriver().findElement(By.id(selectID));
        Select ddMenu=new Select(webMenu);
        ddMenu.selectByIndex(indexNumber);
    }

    public String refList(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        List<String> refList = new ArrayList<>();
        String ref=element.getText();
        refList.add(ref);
        return ref;
    }

    public void lastListClick(List<WebElement> elements){
        WebElement element = elements.get(elements.size()-1);
        myClick(element);
    }
    public void selectEngineByWebElement(WebElement selectWebElement, int indexNumber) {
        //WebElement webMenu= GWD.getDriver().findElement(By.id(selectID));
        Select ddMenu=new Select(selectWebElement);
        ddMenu.selectByIndex(indexNumber);
    }
    public void MyAssert(WebElement element,String number){
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        String text=element.getText();
        boolean countainsNumber=text.contains(number);

        Assert.assertTrue(countainsNumber,"No number");
    }
    public void selectEngineByName(String selectName, int indexNumber) {
        WebElement webMenu= GWD.getDriver().findElement(By.name(selectName));
        Select ddMenu=new Select(webMenu);
        ddMenu.selectByIndex(indexNumber);
    }
}

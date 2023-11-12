package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public WebElement CreateAccount;

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='register.htm']")
    public WebElement Registerbutton;
    @FindBy(xpath = "//input[@id ='customer.firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id ='customer.lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id = 'customer.address.street']")
    public WebElement adress;
    @FindBy(xpath = "//input[@id = 'customer.address.city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id = 'customer.address.state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id = 'customer.address.zipCode']")
    public WebElement zipcode;
    @FindBy(xpath = "//input[@id = 'customer.phoneNumber']")
    public WebElement phone;
    @FindBy(xpath = "//input[@id = 'customer.ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id = 'customer.username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id = 'customer.password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id = 'repeatedPassword']")
    public WebElement confirm;
    @FindBy(xpath = " //input[@value= 'Register']")
    public WebElement REGISTER;
    @FindBy(xpath = " //h1[@class= 'title']")
    public WebElement verifyLogin;


    //****************************US_02************************
    @FindBy(xpath = "//input[@name = 'username']")
    public WebElement usernameLoginpage;

    @FindBy(xpath = "//input[@name = 'password']")
    public WebElement passwordLoginpage;

    @FindBy(xpath = "//input[@type= 'submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id= 'leftPanel']//b")
    public WebElement verifyLogin2;

    //****************************US_03************************

    @FindBy(xpath = "//a[@href='/parabank/billpay.htm']")
    public WebElement BillPay;
    @FindBy(name = "payee.name")
    public WebElement PayeeName;
    @FindBy(name = "payee.address.street")
    public WebElement Address;
    @FindBy(name = "payee.address.city")
    public WebElement City;
    @FindBy(name = "payee.address.state")
    public WebElement State;
    @FindBy(name = "payee.address.zipCode")
    public WebElement ZipCode;
    @FindBy(name = "payee.phoneNumber")
    public WebElement Phone;
    @FindBy(name = "payee.accountNumber")
    public WebElement Account;
    @FindBy(name = "verifyAccount")
    public WebElement VerifyAccount;
    @FindBy(name = "amount")
    public WebElement Amount;

    @FindBy(name = "fromAccountId")
    public WebElement FromAccountt;
    @FindBy(xpath = "//input[@class='button']")
    public WebElement SendPayment;

    //****************************US_04************************


    @FindBy(linkText = "Open New Account")
    public WebElement openNewAccount;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//h1[@class='title']")
    public WebElement accountOpenedBox;


    //****************************US_05************************


    //****************************US_06************************
    
    @FindBy(linkText = "Transfer Funds")
    public WebElement transferFunds;

    @FindBy(id = "amount")
    public WebElement amountToTransfer;

    @FindBy(css = "input[value='Transfer']")
    public WebElement transfer;

    @FindBy(xpath = "//h1[text()='Transfer Complete!']")
    public WebElement transferCompleteText;

    //****************************US_07************************

    public WebElement ContactInfobutton;

    @FindBy(xpath = "//a[@href='/parabank/updateprofile.htm']")
    public WebElement UpdataContactInfoButton;
    // @FindBy(xpath = "//input[@id ='customer.firstName']")
    // public WebElement firstName1;
    // @FindBy(xpath = "//input[@id ='customer.lastName']")
    // public WebElement lastName2;
    // @FindBy(xpath="//input[@id = 'customer.address.street']")
    // public WebElement adress;
    // @FindBy(xpath = "//input[@id = 'customer.address.city']")
    // public WebElement city;
    // @FindBy(xpath = "//input[@id = 'customer.address.state']")
    // public WebElement state;
    // @FindBy(xpath = "//input[@id = 'customer.address.zipCode']")
    // public WebElement zipcode;
    // @FindBy(xpath = "//input[@id = 'customer.phoneNumber']")
    // public WebElement phone;
    @FindBy(xpath = "//input[@value='Update Profile']")
    public WebElement UPDATAPROFILEButton;
    @FindBy(xpath = " //h1[@class='title']")
    public WebElement verifyUpdata;


//****************************US_08************************

    @FindBy(linkText = "Request Loan")
    public WebElement requestLoanPageLink;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement loanAmountBox;

    @FindBy(xpath = "//input[@id='downPayment']")
    public WebElement downPaymentBox;
    @FindBy(xpath = "//div[@class='ng-scope']/p")
    public WebElement loanRequestStatus;
    @FindBy(id = "type")
    public WebElement accountType;
    @FindBy(id = "fromAccountId")
    public WebElement accountID;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "openNewAccount":
                return this.openNewAccount;
            case "accountType":
                return this.accountType;
            case "accountID":
                return this.accountID;
            case "submitButton":
                return this.submitButton;
            case "accountOpenedBox":
                return this.accountOpenedBox;


        }
        return null;

    }

}

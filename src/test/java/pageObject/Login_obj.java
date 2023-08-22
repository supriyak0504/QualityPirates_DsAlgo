package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.LoggerLoad;

import static org.testng.Assert.assertTrue;

public class Login_obj {

        @FindBy(xpath = "//a[text()='Sign in']") WebElement SigninBtn;
        @FindBy(xpath = "//input[@type='text']") WebElement UsernameTxt;
        @FindBy(xpath = "//input[@type='password']") WebElement PasswrodTxt;
        @FindBy(xpath = "//input[@type='submit']") WebElement SubmitBtn;
        @FindBy(xpath = "//a[text()='NumpyNinja']") WebElement SigninMsg;
        WebDriver driver = BaseClass.setDriver();

    boolean status;


        public void SigninPage()
        {
            PageFactory.initElements(driver,this);
            SigninBtn.click();

        }

        public void InputSigninData(String username, String password)
    {
        UsernameTxt.sendKeys(username);
        PasswrodTxt.sendKeys(password);

        //SubmitBtn.click();
    }
    public void LogIn()
    {
        SubmitBtn.click();
    }

        public void CheckSignin()
        {
            //boolean status = SigninMsg.isDisplayed();
            try {
                status = SigninMsg.isDisplayed();
                Assert.assertTrue(status);
                LoggerLoad.info("Assert True in try editor block");

            } catch (AssertionError e) {
                LoggerLoad.error("Assert false in try editor block");
                System.out.println(e.getMessage());
            }
            //assertTrue(status);
        }



}

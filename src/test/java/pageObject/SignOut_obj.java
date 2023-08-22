package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.LoggerLoad;

public class SignOut_obj {
    @FindBy(xpath = "//a[text()='NumpyNinja']") WebElement HomePgChk;
    @FindBy(xpath = "//a[@href='/logout']")
    WebElement SignoutBtn;
    @FindBy(xpath = "//div[@role='alert']") WebElement SignoutMsg;
    WebDriver driver = BaseClass.setDriver();
    boolean status;

    public void HomePgDisp()
    {
        PageFactory.initElements(driver,this);


        try {
            status = HomePgChk.isDisplayed();
            Assert.assertTrue(status);
            LoggerLoad.info("Assert True in logout block");

        } catch (AssertionError e) {
            LoggerLoad.error("Assert false in logout block");
            System.out.println(e.getMessage());
        }

    }
    public void SignoutMethod() throws InterruptedException {
        PageFactory.initElements(driver, this);
        Thread.sleep(500);
        SignoutBtn.click();

    }

        public void CheckSignoutMsg() {

            try {
                status = SignoutMsg.isDisplayed();
                Assert.assertTrue(status);
                LoggerLoad.info("Assert True in logout block");

            } catch (AssertionError e) {
                LoggerLoad.error("Assert false in logout block");
                System.out.println(e.getMessage());
            }

        }

    }



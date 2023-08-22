package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.LoggerLoad;

import static org.testng.Assert.assertTrue;

public class HomePage_obj {

        @FindBy(xpath = "//button[@class='btn']")
        WebElement GetStartedbutton;
        @FindBy(xpath = "//div/h5[text()='Array']") WebElement DisplayCheck;

        WebDriver driver = BaseClass.getDriver();
        boolean status;


        public void InitHomePage(String string)
        {
            driver.get(string);
            PageFactory.initElements(driver,this);
        }

        public void GetStartedBtn() throws InterruptedException {
            Thread.sleep(500);
            PageFactory.initElements(driver,this);
            GetStartedbutton.click();

        }

        public void CheckHomePageDisplay()
        {
            //boolean status = DisplayCheck.isDisplayed();
            try {
                status = DisplayCheck.isDisplayed();
                Assert.assertTrue(status);
                LoggerLoad.info("Assert True in try editor block");

            } catch (AssertionError e) {
                LoggerLoad.error("Assert false in try editor block");
                System.out.println(e.getMessage());
            }
            //assertTrue(status);
        }

    }

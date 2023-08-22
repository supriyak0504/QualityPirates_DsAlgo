package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.LoggerLoad;

public class PracticeQuestions_obj {
    WebDriver driver = BaseClass.setDriver();
    @FindBy(xpath = "//a[text()='Practice Questions']")
    WebElement PracQuestionsBtn;

    @FindBy(xpath = "//a[text()='NumpyNinja']")
    WebElement NumpyNinjaDisplay;

    @FindBy(xpath = "//a[@href='/']")
    WebElement NumNinjaBtn;


    Boolean status;

    public void pracQuestionPage()
    {
       PageFactory.initElements(driver, this);
        PracQuestionsBtn.click();
    }

    public void pracQuestionChk()
    {
        PageFactory.initElements(driver,this);
        //status = NumpyNinjaDisplay.isDisplayed();
        try {
            status = NumpyNinjaDisplay.isDisplayed();
            Assert.assertTrue(status);
            LoggerLoad.info("Assert True in try editor block");

        } catch (AssertionError e) {
            LoggerLoad.error("Assert false in try editor block");
            System.out.println(e.getMessage());
        }
        //assertTrue(status);
        driver.navigate().back();
    }

    public void NumpyNinjaHome()
    {
        PageFactory.initElements(driver,this);
        NumNinjaBtn.click();
    }

}

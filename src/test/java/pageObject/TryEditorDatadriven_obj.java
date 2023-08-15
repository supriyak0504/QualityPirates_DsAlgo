package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.LoggerLoad;

public class TryEditorDatadriven_obj {
   // @FindBy(xpath = "//span[@class='cm-variable']") WebElement TextBoxCursor;

    @FindBy(xpath = "//button[@type=\"button\"]")WebElement RunButton;

    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement TextEditor;

    @FindBy(xpath = "//span[@role=\"presentation\"]")WebElement TextEditorclear;

    @FindBy(xpath = "//span[@role='presentation']") WebElement ClearDef;

    @FindBy(xpath = "//pre[@id='output']") WebElement OutputChk;

    WebDriver driver = BaseClass.setDriver();

    Boolean status;
    Actions act = new Actions(driver);

    public void InitTryEditorPage(String string) {

        PageFactory.initElements(driver,this);
    }

  /* public void Pythoncode1(String Code1) throws InterruptedException {
       PageFactory.initElements(driver, this);
       Thread.sleep(5000);
       TextEditor.sendKeys(Code1);
   }*/


  public void Pythoncode(String Code) throws InterruptedException {
       PageFactory.initElements(driver, this);
       Thread.sleep(2000);
       TextEditor.sendKeys(Code);
   }


       public void PythonRun() throws InterruptedException {
        Thread.sleep(2000);
        RunButton.click();
           try {
               Alert alert = driver.switchTo().alert();
               String alertText = alert.getText();
               System.out.println("ERROR: (ALERT BOX DETECTED) - ALERT MSG : " + alertText);
               alert.accept();
               LoggerLoad.error("Error Message Alert Box : " + alertText);
               //driver.navigate().back();
           } catch (Exception e) {
               String opdisplay = OutputChk.getText();
               //     System.out.printf("The output is " + opdisplay);
               LoggerLoad.info("The output value of python code is " + opdisplay);
           }
       }

    public void OutputChkMsg() throws Exception  {
        try {
            status = OutputChk.isDisplayed();
            Assert.assertTrue(status);
            LoggerLoad.info("Assert True in try editor block");

        } catch (AssertionError e) {
            LoggerLoad.error("Assert false in try editor block");
            System.out.println(e.getMessage());
        }
        //driver.navigate().back();
    }
    public void ClearTextEditor() throws InterruptedException {

        PageFactory.initElements(driver, this);

        ClearDef.click();

        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();
    }

    public void BacktoPage() {
        driver.navigate().back();
    }

}

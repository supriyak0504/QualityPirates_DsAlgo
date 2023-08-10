package pageObject;

import baseDriverProperty.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryEditorDatadriven_obj {
   // @FindBy(xpath = "//span[@class='cm-variable']") WebElement TextBoxCursor;

    @FindBy(xpath = "//button[@type=\"button\"]")WebElement RunButton;

    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")WebElement TextEditor;

    @FindBy(xpath = "//span[@role=\"presentation\"]")WebElement TextEditorclear;

    WebDriver driver = BaseClass.setDriver();

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
       Thread.sleep(5000);
       TextEditor.sendKeys(Code);
   }


       public void PythonRun() throws InterruptedException {
        Thread.sleep(2000);
        RunButton.click();

    }

    public void Pythonclear() throws InterruptedException {
        PageFactory.initElements(driver, this);
        Thread.sleep(5000);
        TextEditorclear.clear();

    }

}

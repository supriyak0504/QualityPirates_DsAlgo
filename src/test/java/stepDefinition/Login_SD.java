package stepDefinition;

import baseDriverProperty.BaseClass;
import utilities.ReaderXL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Login_obj;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class Login_SD {

    Login_obj lp = new Login_obj();

    BaseClass bcl = new BaseClass();

    @Given("User clicks on sign in option")
    public void user_clicks_on_sign_in_option() throws InterruptedException {
        Thread.sleep(500);
        lp.SigninPage();

    }

    @When("The user enters the sheetName {string} and rowNumber {int}")
    public void the_user_enters_the_sheet_name_and_row_number(String sheetName, Integer rowNumber) throws InterruptedException, IOException {
        ReaderXL reader = new ReaderXL();
        List<Map<String, String>> testData =
                reader.getData("C:/intellij/QualityPirates_DsAlgo/DataDrivensheet.xlsx", sheetName);
        String Uname = testData.get(rowNumber).get("username");
        String PW = testData.get(rowNumber).get("password");
        lp.InputSigninData(Uname, PW);
    }

    @When("User click LogIn Button")
    public void userClickLogInButton() {
        lp.LogIn();
    }

    @Then("The signed in homepage appears")
    public void the_signed_in_homepage_appears() throws IOException {
        lp.CheckSignin();
        /*try {
            //bcl.FailedScreenshot(String);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    }

}

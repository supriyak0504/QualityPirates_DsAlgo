package stepDefinition;

import baseDriverProperty.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage_obj;

import java.io.IOException;

public class HomePage_SD {

        HomePage_obj hp = new HomePage_obj();

        BaseClass bcl = new BaseClass();

        @Given("The home page opens with the link {string}")
        public void the_home_page_opens_with_the_link(String string) throws IOException {
            System.out.println("String Value" + string);
            System.out.println("HP is" + hp.toString());
            hp.InitHomePage(string);
            bcl.failed();

        }

        @When("User clicks on Get Started intialPage")
        public void User_clicks_on_Get_Started_intialPage() throws InterruptedException {
            System.out.println("HP is" + hp.toString());
            hp.GetStartedBtn();

        }

        @Then("user is redirected to home page")
        public void user_is_redirected_to_home_page() {
            hp.CheckHomePageDisplay();
        }


}


package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SignOut_obj;

public class SignOut_SD {

    SignOut_obj sgn = new SignOut_obj();

    @Given("The user is on the homepage of signed in user")
    public void the_user_is_on_the_homepage_of_signed_in_user() {
        sgn.HomePgDisp();

    }
    @When("User clicks on Sign out link")
    public void user_clicks_on_sign_out_link() throws InterruptedException {
        sgn.SignoutMethod();
    }
    @Then("user is redirected to home page without sign in")
    public void user_is_redirected_to_home_page_without_sign_in() {
        sgn.CheckSignoutMsg();
    }

}

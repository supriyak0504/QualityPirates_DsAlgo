package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.TryEditorDatadriven_obj;

public class TryEditorDatadriven_SD {
    TryEditorDatadriven_obj te = new TryEditorDatadriven_obj();

    @Given("User should able to access try editor link {string}")
    public void user_should_able_to_access_try_editor_link(String Code) throws InterruptedException {

    }

   //@When("User enter valid {string} in try editor box")
   // public void user_enter_valid_in_try_editor_box(String pythoncode) throws InterruptedException {
    //   te.Pythoncode1(pythoncode);
   // }
   @When("User enter valid {string}in try editor box")
   public void userEnterValidInTryEditorBox(String pythoncode) throws InterruptedException {
       te.Pythoncode(pythoncode);
   }
    @When("user click on Run button")
    public void user_click_on_run_button() throws InterruptedException {
        te.PythonRun();
    }

    @Then("User should able to see the output")
    public void user_should_able_to_see_the_output() throws InterruptedException {
        te.Pythonclear();

    }

}
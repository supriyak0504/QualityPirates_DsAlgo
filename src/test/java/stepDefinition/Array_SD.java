package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Array_obj;
import utilities.LoggerLoad;

public class Array_SD {
    Array_obj Ap =new Array_obj();

    @Given("The user is on the home page after logged in {string}.")
    public void the_user_is_on_the_home_page_after_logged_in(String string) {
        System.out.println("Array page" +Ap.toString());
        Ap.InitArrayPage(string);
        LoggerLoad.info("User is on Home Page");
    }

    @When("User click the Array GetStarted button.")
    public void user_click_the_array_get_started_button() throws InterruptedException {
        LoggerLoad.info("AP is" + Ap.toString());
        Ap.GetStartedButton();
    }
    @Then("The user be directed to {string} Data Structure Page.")
    public void the_user_be_directed_to_data_structure_page(String string) throws InterruptedException {
        Ap.ArrayPageDisplay();
    }

    //Scenario 2

    @Given("The user is on the {string} after logged in")
    public void the_user_is_on_the_after_logged_in(String string) {
        LoggerLoad.info("User is on Array Page");
        Ap.InitArrayPage(string);
    }
    @When("The user clicks {string} button")
    public void the_user_clicks_button(String string) throws InterruptedException {
     Ap.ArrayInPythonPage();
    }
    @Then("The user should be redirected to Arrays in Python page")
    public void the_user_should_be_redirected_to_arrays_in_python_page() throws InterruptedException {
     Ap.ArrayInPythonPageDisplay();

    }

    @When("User click on tryhere button")
    public void user_click_on_tryhere_button() throws InterruptedException {
     Ap.ArrayPythonPageTryhereButton();
    }
    @Then("User redirected to the try editor page")
    public void user_redirected_to_the_try_editor_page() {
     Ap.ArrayPythonPageTryhereCodeBoxDisplay();
        LoggerLoad.info("User on TryEditor ");
    }

    @When("User clicks Arrays Using List link")
    public void user_clicks_arrays_using_list_link() throws InterruptedException {
       Ap.ArraysUsingList();
    }

    @Then("User should be redirected to {string} page")
    public void user_should_be_redirected_to_page(String string) throws InterruptedException {

        Ap.ArrayUsingDisplay();
    }

    @Given("User is on the {string}")
    public void user_is_on_the(String string) {

        System.out.println("User on Arrays using list Page");
    }
    @When("User clicks {string} button")
    public void user_clicks_button(String string) throws InterruptedException {
        Ap.ArrayUsingListTryhereButton();

    }
    @Then("User should be redirected to tryEditor page with Run button")
    public void user_should_be_redirected_to_try_editor_page_with_run_button() throws InterruptedException {
        Ap.ArrayUsingListTryhereCodeBoxDisplay();
    }

    @Given("User is on the {string} page")
    public void user_is_on_the_page(String string) {
        System.out.println("");

    }
    @When("User clicks {string} link")
    public void user_clicks_link(String string) throws InterruptedException {
     Ap.BasicOperationInLists();
    }
    @Then("User should be redirected to Basic Operation in Lists page")
    public void user_should_be_redirected_to_basic_operation_in_lists_page() throws InterruptedException {
        Ap.BasicOperationDisplay();
    }

    @Given("User is on the \"Basic Operation in Lists\"page")
    public void user_is_on_the_basic_operation_in_lists_page() throws InterruptedException {

    }
    @When("User clicks {string} button of Basic operation in list page")
    public void user_clicks_button_of_basic_operation_in_list_page(String string) throws InterruptedException {
        Ap.ApplicationsOfArrayTryhereButton();

    }
    @Then("User redirected to tryEditor page with Run")
    public void user_redirected_to_try_editor_page_with_run() throws InterruptedException {
       Ap.BasicOperationTryhereDisplay();
    }

    @Given("User is on the Basic Operation Lists page")
    public void user_is_on_the_basic_operation_lists_page() {

    }
    @When("User clicks Applications of Array link")
    public void user_clicks_applications_of_array_link() throws InterruptedException {
       Ap.ApplicationsOfArray();
    }
    @Then("User should be redirected to Applications of Array page")
    public void User_should_be_redirected_to_applications_of_array_page() {
    Ap.ApplicationsOfArrayDisplay();
    }

    @Given("User is on the Applications of Array page")
    public void user_is_on_the_applications_of_array_page() {
        System.out.println("User is on Application of Array Page");
    }
    @When("User clicks {string} button of Applications of array Page")
    public void user_clicks_button_of_applications_of_array_page(String string) throws InterruptedException {
        Ap.ApplicationsOfArrayTryhereButton();
    }
    @Then("User redirected to tryEditor page with Run Box")
    public void user_redirected_to_try_editor_page (){

        Ap.ApplicationsOfArrayTryhereDisplay();
    }
    @Given("The user is on {string} page")
    public void the_user_is_on_page(String string) {

    }
    @When("User clicks Practice Questions link")
    public void user_clicks_practice_questions_link() throws InterruptedException {
        Ap.PracticeQuestions();
    }
    @Then("User should be redirected to Practice page")
    public void user_should_be_redirected_to_practice_page() {

        Ap.PracticeQuestionsDisplay();
    }

    @Given("The user is on Practice Question page")
    public void the_user_is_on_practice_Question_page() {
    }
    @When("User clicks Search the array link")
    public void user_clicks_search_the_array_link() throws InterruptedException {
        Ap.SearchTheArrayLink();
    }

    @Then("User should be redirected to Question page")
    public void user_should_be_redirected_to_question_page() {

        Ap.SearchTheArrayDisplay();
    }
    @Then("User clear the TryEditor Box")
    public void userClearTheTryEditorBox() throws InterruptedException {
        Ap.ClearTxtEditor();
    }
    @Then("User write the python code after clear the Editor Box")
    public void user_write_the_python_code_after_clear_the_editor_box() throws InterruptedException {

        Ap.TryEditorBox();
    }
    @Then("User click the run button")
    public void user_click_the_run_button() {

        Ap.RunButton();
    }
    @Then("User able to see python program result at editor output window")
    public void user_able_to_see_python_program_result_at_editor_output_window() {

    }

    @Given("User is on the TryEditor afther valid python code")
    public void userIsOnTheTryEditorAftherValidPythonCode() {

    }
    @When("User click the SubmitButton")
    public void userClickTheSubmitButton() throws InterruptedException {
        Ap.SubmitButton();
    }

    @Then("User get the Error message")
    public void userGetTheErrorMessage() throws InterruptedException {
        Ap.ErrorMsgDisplay();

    }

    @When("User clicks Max Consecutive Once link")
    public void user_clicks_max_consecutive_once_link() throws InterruptedException {
        Ap.MaxConsecutiveOnce();
    }
    @Then("User should be redirected to Max Consecutive Once page")
    public void user_should_be_redirected_to_max_consecutive_once_page() {
        Ap.SearchTheArrayDisplay();
    }

    // @Given("The user is on Practice Question page")
    //  public void the_user_is_on_practice_question_page() {

    //}
    @When("User Find Number link")
    public void user_find_number_link() throws InterruptedException {
        Ap. FindNumber();
    }
    @Then("User should be redirected to Find Number page")
    public void user_should_be_redirected_to_find_number_page() {
        Ap.SearchTheArrayDisplay();
    }

    @When("User clicks SquaresOfSortedArray link")
    public void user_clicks_squares_of_sorted_array_link() throws InterruptedException {
        Ap.SquaresOfSortedArray();
    }
    @Then("User should be redirected to SquaresOfSortedArray page")
    public void user_should_be_redirected_to_squares_of_sorted_array_page() throws InterruptedException {
        Ap.SearchTheArrayDisplay();
    }

    @Given("User is on the TryEditor_Box with valid python code")
    public void user_is_on_the_try_editor_box_with_valid_python_code() {

    }
    @Then("User get the {string} Error message")
    public void user_get_the_error_message(String string) throws InterruptedException {
        Ap.SquaresOfSortedArrarSubmitError();
    }

    @When("User click Numphy Ninja link")
    public void user_click_numphy_ninja_link() throws InterruptedException {
        Ap.BackHomePage();
    }
    @When("User click GetStarted link")
    public void user_click_get_started_link() throws InterruptedException {
        Ap.BackHomePage1();
    }
    @Then("User should be redirected to Home Page page")
    public void user_should_be_redirected_to_home_page_page() {

    }

}

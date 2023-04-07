package cucumber.step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline {
    @Given("^user is on \"([^\"]*)\"$")
    public void user_is_on(String URL)  {
        System.out.println("User is on " + URL);
    }

    @When("^user enter \"([^\"]*)\" in EMAIL input field$")
    public void user_enter_in_name_input_field(String userEmail)  {
        System.out.println("User email is " + userEmail);
        
    }

    @And("^user enter \"([^\"]*)\" in password input field$")
    public void user_enter_in_password_input_field(String userPassword)  {
        System.out.println("User password is " + userPassword);
    }

    @And("^user enter (\\\\d+) in age input field$")
    public void user_enter_in_age_input_field(String userAge)  {
        System.out.println("User age is " + userAge);
    }

    @Then("^user successfully log in in facebook$")
    public void user_succesfully_log_in_in_facebook()  {
        System.out.println("User logged in facebook");
    }


    @When("^user enter \"([^\"]*)\" in EMAIL input field$")
    public void user_enter_in_EMAIL_input_field(String arg1) throws Throwable {
        System.out.println("User email is " + arg1);
    }



    @When("^user enter (\\d+) in age input field$")
    public void user_enter_in_age_input_field(int arg1) throws Throwable {
        System.out.println("User age is " + arg1);
    }

    @Then("^user successfully log in in facebook$")
    public void user_successfully_log_in_in_facebook() throws Throwable {
        System.out.println("User logged in facebook");
    }



}

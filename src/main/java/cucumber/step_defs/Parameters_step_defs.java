package cucumber.step_defs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Parameters_step_defs {
    @Given("^user name is \"([^\"]*)\"$")
    public void user_name_is(String userName) {
        System.out.println("User name is " + userName);
    }

    @And("^user  surname is Mask$")
    public void user_surname_is_Mask() {
       
    }

    @And("^user age is (\\d+)$")
    public void user_age_is(int userAge) {
        System.out.println("User age is " + userAge);

   }

    @Then("^user is happy man$")
    public void user_is_happy_man() {

    }


}

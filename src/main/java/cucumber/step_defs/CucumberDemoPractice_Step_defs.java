package cucumber.step_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberDemoPractice_Step_defs {

    @Given("^user is on Tesla\\.com$")
    public void user_is_on_Tesla_com()  {
        System.out.println("User is on Tesla website");
    }

    @Given("^user clicks Model S header$")
    public void user_clicks_Model_S_header()  {
        System.out.println("User clicks Model S header");

    }

    @Then("^user should see Model S text$")
    public void user_should_see_Model_S_text()  {
        System.out.println("User can see text");
       
    }

    @When("^user scroll down the page to Order now$")
    public void user_scroll_down_the_page_to_Order_now()  {
        System.out.println("User scrolled down the page");
    }

    @When("^user clicks Order Now button$")
    public void user_clicks_Order_Now_button()  {
        System.out.println("clicked the button");
       
    }

    @Then("^user should see Purchase Price$")
    public void user_should_see_Purchase_Price()  {
       
    }

    @When("^user clicks on Continue to Payment button$")
    public void user_clicks_on_Continue_to_Payment_button()  {
       
    }

    @Then("^user should see Your Model S text$")
    public void user_should_see_Your_Model_S_text()  {
       
    }

    @When("^user clicks on Order with card button$")
    public void user_clicks_on_Order_with_card_button()  {
       
    }

    @Then("^First name, Last name, Email input fields should appear$")
    public void first_name_Last_name_Email_input_fields_should_appear()  {
       
    }

    @Then("^enter in First name Begimai$")
    public void enter_in_First_name_Begimai()  {
       
    }

    @Then("^enter in Last name Turusbekova$")
    public void enter_in_Last_name_Turusbekova()  {
       
    }

    @Then("^enter in Email field asankadyrova(\\d+)@gmail\\.com$")
    public void enter_in_Email_field_asankadyrova_gmail_com(int arg1)  {
       
    }


    @Given("^user clicks Model X header$")
    public void user_clicks_Model_X_header()  {
      
    }

    @Then("^user should see Model X text$")
    public void user_should_see_Model_X_text()  {
      
    }
}

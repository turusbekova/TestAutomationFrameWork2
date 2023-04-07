package cucumber.step_defs;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.List;

public class DataTable_Step_defs {


    @Given("^customer name is$")
    public void customer_name_is(DataTable customerName)  {
        List<List<String>> listOfCustomer = customerName.raw();

        for (List<String> e: listOfCustomer){
            for (String i: e) {
                System.out.println("User name is " + i);
            }
        }
        System.out.println("Choose one field from table " + listOfCustomer.get(0).get(0));
    }

    @Given("^customer surname is$")
    public void customer_surname_is(DataTable arg1)  {

    }






}

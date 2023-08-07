import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Residence;
import org.example.ServiceMethod;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AddResidence {

    private boolean b = false;
    private String s ;

    Residence rT;
    public static ServiceMethod resTest = new ServiceMethod();


    public AddResidence() {
        super();
        rT = new Residence();
    }

    private static ArrayList<Residence> rArrayTest = new ArrayList<Residence>();

    void resInfo() {
        Residence ow = new Residence("50","999","Rafedia Street",10,"electricity",20);
        resTest.residences.add(ow);
        rArrayTest.add(ow);
    }




    @Given("The owner wants to add Resident")
    public void the_owner_wants_to_add_resident() {
        System.out.println("Add ResidentId");

    }
    @When("The residenceId {string} is new")
    public void the_residence_id_is_new(String rid) {
        resInfo();
        b= resTest.addResidenceCheck(rid);

    }
    @Then("The residence is add")
    public void the_residence_is_add() {
        assertTrue(b);
    }





}

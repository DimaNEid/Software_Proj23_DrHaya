import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.House;
import org.example.Residence;
import org.example.ServiceMethod;
import org.example.UserMethodReg;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class OwnerDashboard {

    private boolean b = false;
    private boolean b1 = false;
    private String s ;

    House hT;
    public static ServiceMethod hoTest = new ServiceMethod();


    public OwnerDashboard() {
        super();
        hT = new House();
    }

    private static ArrayList<House> hArrayTest = new ArrayList<House>();

    void hosInfo() {
        House ow = new House("510", "51", "2", "600","western", 3, 6);
        hoTest.houses.add(ow);
        hArrayTest.add(ow);
    }
    @Given("The owner is has chosen from the panel")
    public void the_owner_is_has_chosen_from_the_panel() {}
    @When("The owner enters available residence Id {string} and floor Id {string}")
    public void the_owner_enters_available_residence_id_and_floor_id(String resId, String florId) {
        hosInfo();
        b = ServiceMethod.getHouseIdByResidentAndFloor(resId, florId);

    }
    @When("The house Id {string} exists")
    public void the_house_id_exists(String hoId) {
        hosInfo();
        b1 = ServiceMethod.searchHouse(hoId);

    }
    @Then("house details are shown")
    public void house_details_are_shown() {
        assertTrue(b);
        assertTrue(b1);

    }

}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class AddResidence {
    public static List<Residence> residences = new ArrayList<>();
    static Residence rr = new Residence();

    public Residence addResidence(String residenceID, String ownerID, String location, String services, Integer numOfFloors, Integer numOfHouses){
        rr.setResidenceID(residenceID);
        rr.setOwnerID(ownerID);
        rr.setLocation(location);
        rr.setServices(services);
        rr.setNumOfFloors(numOfFloors);
        rr.setNumOfHouses(numOfHouses);

     residences.add(rr);
        return rr;
    }
}

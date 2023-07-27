package org.example;

import java.util.ArrayList;
import java.util.List;

public class Residence {
    public String getResidenceID() {
        return residenceID;
    }

    public void setResidenceID(String residenceID) {
        this.residenceID = residenceID;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Residence(String residenceID, String ownerID, String location) {
        this.residenceID = residenceID;
        this.ownerID = ownerID;
        this.location = location;
    }

    private String  residenceID, ownerID, location;
    public List<House> houses = new ArrayList<>();


}


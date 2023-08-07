package org.example;

public class Residence {

    private String  residenceID, ownerID, location, services;
    private Integer numOfFloors, numOfHouses;

    public Residence() {

    }

    public Integer getNumOfFloors(){return numOfFloors;}
    public void setNumOfFloors(Integer numOfFloors){this.numOfFloors=numOfFloors;}

    public String getResidenceID() {return residenceID;}

    public void setResidenceID(String residenceID) {this.residenceID = residenceID;}

    public String getOwnerID() {return ownerID;}

    public void setOwnerID(String ownerID) {this.ownerID = ownerID;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}
    public String getServices() {return services;}

    public void setServices(String services) {this.services = services;}

    public Integer getNumOfHouses() {return numOfHouses;}

    public void setNumOfHouses(Integer numOfHouses) {this.numOfHouses = numOfHouses;}


    public Residence(String residenceID, String ownerID, String location, Integer numOfFloors,String services,Integer numOfHouses ) {
        this.residenceID = residenceID;
        this.ownerID = ownerID;
        this.location = location;
        this.numOfFloors = numOfFloors;
        this.services = services;
        this.numOfHouses = numOfHouses;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "ID " + residenceID +
                ", OwnerId '" + ownerID + '\'' +
                ", location '" + location + '\'' +
                ", number Of Floors '" + numOfFloors + '\'' +
                ", services " + services + '\''+
                ", number Of Houses " + numOfHouses + '\''+
                '}';
    }


}


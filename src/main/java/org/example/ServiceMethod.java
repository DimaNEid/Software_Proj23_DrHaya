package org.example;


import java.util.ArrayList;
import java.util.List;



public class ServiceMethod {

    public static List<Residence> residences = new ArrayList<>();
    static Residence rr = new Residence();

    public static List<House> houses = new ArrayList<>();
    static House hh = new House();



    public boolean addResidence(String residenceID, String ownerID, String location, Integer numOfFloors, String services, Integer numOfHouses) {
        rr.setResidenceID(residenceID);
        rr.setOwnerID(ownerID);
        rr.setLocation(location);
        rr.setNumOfFloors(numOfFloors);
        rr.setServices(services);
        rr.setNumOfHouses(numOfHouses);

        residences.add(rr);
          return true;
    }

    public boolean addHouse(String house_id, String residenceId, String floorId, String monthlyRent, String balcony, Integer bathrooms, Integer bedrooms) {
        hh.setHouseId(house_id);
        hh.setResidenceId(residenceId);
        hh.setFloorId(floorId);
        hh.setMonthlyRent(monthlyRent);
        hh.setBalcony(balcony);
        hh.setBathroomsNum(bathrooms);
        hh.setBedroomsNum(bedrooms);

        houses.add(hh);
        return true;
    }


    public static boolean viewResidences() {

        for (Residence residence : residences) {
            System.out.println(residence.toString());
        }
        return true;
    }

    public static boolean viewResidenceID() {

        for (Residence residence : residences) {
            System.out.println(residence.getResidenceID());
        }
        return true;
    }

    public static boolean viewHouses() {

        for (House house : houses) {
            System.out.println(house.toString());
        }

        return true;
    }



    }




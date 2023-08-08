package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class ServiceMethod {

    private static final Logger logger = Logger.getLogger(ServiceMethod.class.getName());

    public static final List<Residence> residences = new ArrayList<>();
    static Residence rr = new Residence();

    public static final List<House> houses = new ArrayList<>();
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

    public boolean addHouse(String houseId, String residenceId, String floorId, String monthlyRent, String balcony, Integer bathrooms, Integer bedrooms) {
        hh.setHouseId(houseId);
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
        boolean residencesViewed = false;
        if ( !residences.isEmpty()) {
            for (Residence residence : residences) {
                logger.info(residence.toString());
                residencesViewed = true;
            }

        } else {
            logger.warning("Residences collection is null or empty");

        }
        return residencesViewed;
    }


    public static boolean viewResidenceID() {

        for (Residence residence : residences) {
          logger.info(residence.getResidenceID());
        }
        return true;
    }

    public static boolean viewHouses() {
        if ( !houses.isEmpty()) {
            for (House house : houses) {
                logger.info(house.toString());
            }
            return true;
        } else {
            logger.warning("Residences collection is null or empty");
            return false;
        }
    }





    }




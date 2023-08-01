package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Methods {

    static Scanner scanner = new Scanner(System.in);
    public static List<Residence> residences = new ArrayList<>();
    static Residence rr = new Residence();

    public static List<House> houses = new ArrayList<>();
    static House hh = new House();

    public Residence addResidence(String residenceID, String ownerID, String location, String services, Integer numOfFloors, Integer numOfHouses) {
        rr.setResidenceID(residenceID);
        rr.setOwnerID(ownerID);
        rr.setLocation(location);
        rr.setServices(services);
        rr.setNumOfFloors(numOfFloors);
        rr.setNumOfHouses(numOfHouses);

        residences.add(rr);
        return rr;
    }

    public House addHouse(String house_id, String residenceId, String floorId, String monthlyRent, String balcony, Integer bathrooms, Integer bedrooms) {
        hh.setHouseId(house_id);
        hh.setResidenceId(residenceId);
        hh.setFloorId(floorId);
        hh.setMonthlyRent(monthlyRent);
        hh.setBalcony(balcony);
        hh.setBathroomsNum(bathrooms);
        hh.setBedroomsNum(bedrooms);

        houses.add(hh);
        return hh;
    }


    public static List<Residence> viewResidences() {

        for (int i = 0; i < residences.size(); i++) {
            System.out.println(residences.get(i).toString());
        }
        return residences;
    }

    public static List<Residence> viewResidenceID() {

        for (int i = 0; i < residences.size(); i++) {
            System.out.println(residences.get(i).getResidenceID());
        }
        return residences;
    }


    public static List<House> viewHouses() {

        for (int i = 0; i < houses.size(); i++) {
            System.out.println(houses.toString());

        }

        return houses;
    }


    public static String updateHouse(String houseId, String residenceId, String floorId, String monthlyRent, String balcony, Integer bathrooms, Integer bedrooms){
       String str = "The House Information is Updated";
        while(true){
        for (int i = 0; i < houses.size(); i++){
            if (houseId.equals(houses.get(i).getHouse_id())){
                hh.setResidenceId(residenceId);
                hh.setFloorId(floorId);
                hh.setMonthlyRent(monthlyRent);
                hh.setBalcony(balcony);
                hh.setBedroomsNum(bathrooms);
                hh.setBedroomsNum(bedrooms);
                houses.add(hh);

                return str;

            }else {
                System.out.println("Enter Valid House Id");

            }
        }
    }

    }


    public static String getHouseIdByResidentAndFloor(String residentId, String floorId) {
        String out = null;
        for (int i = 0; i < houses.size(); i++) {
            if (residentId.equals(houses.get(i).getResidenceId()) && floorId.equals(houses.get(i).getFloorId())) {
                System.out.println(houses.get(i).getHouse_id());

                System.out.println("Enter The House ID That You Would Like To See Its Details");
                String sss = scanner.nextLine();

                if(sss.equals(houses.get(i).getHouse_id())){
                   out = houses.get(i).toString();
                   break;
                }
            }
        }

        System.out.println("Returning House ID: " + out);
        return out;


    }
}
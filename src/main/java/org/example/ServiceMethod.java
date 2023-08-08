package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ServiceMethod {

    public static Scanner scanner = new Scanner(System.in);
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

        for (int i = 0; i < residences.size(); i++) {
            System.out.println(residences.get(i).toString());
        }
        return true;
    }

    public static boolean viewResidenceID() {

        for (int i = 0; i < residences.size(); i++) {
            System.out.println(residences.get(i).getResidenceID());
        }
        return true;
    }


    public static boolean viewHouses() {

        for (int i = 0; i < houses.size(); i++) {
            System.out.println(houses.get(i).toString());
        }

        return true;
    }

    public static boolean searchHouse(String s){
        for (int i = 0; i < houses.size(); i++) {
            if(s.equals(houses.get(i).getHouse_id())) {
                return true;
            }
        }
        return false;
    }

/*
    //static String sss = scanner.nextLine();
    public static boolean getHouseIdByResidentAndFloor(String residentId, String floorId) {
        String out = null;
        for (int i = 0; i < houses.size(); i++) {
            if (residentId.equals(houses.get(i).getResidenceId()) && floorId.equals(houses.get(i).getFloorId())) {
                System.out.println(houses.get(i).getHouse_id());

                System.out.println("Enter The House ID That You Would Like To See Its Details");




                if(sss.equals(houses.get(i).getHouse_id())){
                    out = houses.get(i).toString();
                    System.out.println(out);

                    return true;


                }

            }
        }

        return false;


    }*/

    public static boolean updateHouse(String id, String residenceId, String floorId, String monthlyRent, String balcony, Integer bathrooms, Integer bedrooms){
        hh.setHouseId(id);
        hh.setResidenceId(residenceId);
        hh.setFloorId(floorId);
        hh.setMonthlyRent(monthlyRent);
        hh.setBalcony(balcony);
        hh.setBathroomsNum(bathrooms);
        hh.setBedroomsNum(bedrooms);

        houses.add(hh);

       return true;
    }

    public static String updateResidence(){
        String str = "The Residence Information is Updated";
        String str1 = "Enter Valid Residence Id";

        while(true){
            for (int i = 0; i < residences.size(); i++){

                System.out.println("Enter The Residence Id That You Would Like To Edit Its Information");
                String n1 = scanner.nextLine();

                if (n1.equals(residences.get(i).getResidenceID())){

                    int xx = scanner.nextInt();

                    System.out.println("Choose From The Panel.");

                    System.out.println("1. Edit Location.");
                    System.out.println("2. Edit Service.");
                    System.out.println("3. Edit Number Of Floors.");
                    System.out.println("4. Edit Number Of Houses.");

                    if (xx == 1){
                        System.out.println("Enter New Location.");
                        String i2 = scanner.nextLine();

                        rr.setLocation(i2);
                        residences.add(rr);}

                    else if (xx==2) {
                        System.out.println("Enter New Service.");
                        String i3 = scanner.nextLine();
                        rr.setServices(i3);
                        residences.add(rr);

                    } else if (xx==3) {
                        System.out.println("Enter New Number Of Floors.");
                        String i4 = scanner.nextLine();
                        rr.setNumOfFloors(Integer.valueOf(i4));
                        residences.add(rr);}

                    else if (xx==4) {
                        System.out.println("Number Of Houses.");
                        String i5 = scanner.nextLine();
                        rr.setNumOfHouses(Integer.valueOf(i5));
                        residences.add(rr);

                    }

                    return str;

                }else {
                    return str1;

                }
            }
        }

    }



}
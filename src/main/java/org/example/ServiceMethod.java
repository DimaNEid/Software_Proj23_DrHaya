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
            System.out.println(houses.get(i).toString());
        }

        return houses;
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

                    return out;


                }
            }
        }

        return null;


    }

    public static String updateHouse(){
        String str = "The House Information is Updated";
        String str1 = "Enter Valid House Id";

        while(true){
            for (int i = 0; i < houses.size(); i++){

                System.out.println("Enter The house Id That You Would Like To Edit Its Information");
                String i1 = scanner.nextLine();

                if (i1.equals(houses.get(i).getHouse_id())){

                    int x = scanner.nextInt();

                    System.out.println("Choose Which Information You Want To Edit.");

                    System.out.println("1. Residence Id.");
                    System.out.println("2. Floor Number.");
                    System.out.println("3. Monthly Rent.");
                    System.out.println("4. Balcony.");
                    System.out.println("5. Bathrooms.");
                    System.out.println("6. Bedrooms");

                    if (x == 1){
                        System.out.println("Enter New House Id.");
                        String i2 = scanner.nextLine();
                        hh.setHouseId(i2);
                        houses.add(hh);}

                    else if (x==2) {
                        System.out.println("Enter New Floor Number.");
                        String i3 = scanner.nextLine();
                        hh.setFloorId(i3);
                        houses.add(hh);

                    } else if (x==3) {
                        System.out.println("Enter New Monthly Rent.");
                        String i4 = scanner.nextLine();
                        hh.setMonthlyRent(i4);
                        houses.add(hh);}

                    else if (x==4) {
                        System.out.println("Enter New Balcony.");
                        String i5 = scanner.nextLine();
                        hh.setBalcony(i5);
                        houses.add(hh);

                    } else if (x==5) {
                        System.out.println("Enter New Balcony Number.");
                        String i5 = scanner.nextLine();
                        hh.setBalcony(i5);
                        houses.add(hh);

                    } else if (x==6) {
                        System.out.println("Enter New Bathrooms Number.");
                        String i6 = scanner.nextLine();
                        hh.setBathroomsNum(Integer.valueOf(i6));
                        houses.add(hh);

                    } else if (x==7) {
                        System.out.println("Enter New Bedrooms Number.");
                        String i7 = scanner.nextLine();
                        hh.setBedroomsNum(Integer.valueOf(i7));
                        houses.add(hh);}

                    return str;

                }else {
                    return str1;

                }
            }
        }

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
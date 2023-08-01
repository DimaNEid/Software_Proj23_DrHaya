package org.example;

import java.util.ArrayList;
import java.util.List;

public class ResidenceMethods {
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


  /*  public List<Residence> viewResidences() {

        System.out.println("All your Residences: ");

        for(int i=0; i<residences.size(); i++){
            System.out.println(residences.toString());

        }

        return residences ;
    }*/


        public static <T> List<T> printArrayList(List<T> arrayList) {
            for (T item : arrayList) {
                System.out.println(item.toString());
            }
            return arrayList;
        }


}

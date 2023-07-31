package org.example;

public class Floor {

    private String id;
    private String residentId;
    private String houseId;
    private Integer numberOfHouses;


    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getResidentId() {return residentId;}
    public void setResidentId(String residentId) {this.residentId = residentId;}
    public String getHouseId() {return houseId;}
    public void setHouseId(String houseId) {this.houseId = houseId;}
    public Integer getNumberOfHouses() {return numberOfHouses;}
    public void setNumberOfHouses(Integer numberOfHouses) {this.numberOfHouses = numberOfHouses;}

    public Floor(String id, String residentId, String houseId, Integer numberOfHouses){
        this.id=id; this.residentId=residentId; this.houseId=houseId; this.numberOfHouses=numberOfHouses;
    }


}

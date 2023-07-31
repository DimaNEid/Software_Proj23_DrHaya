package org.example;

public class House {

    private String house_id, residenceId, floorId, monthlyRent,balcony;
    private Integer  bathrooms, bedrooms;

    public House(String house_id, String residenceId, Integer floor, String monthlyRent,String balcony, Integer bathrooms, Integer bedrooms) {
        this.house_id = house_id;
        this.residenceId = residenceId;
        this.floorId = floorId;
        this.monthlyRent = monthlyRent;
        this.balcony = balcony;
        this.bathrooms=bathrooms;
        this.bedrooms=bedrooms;
    }

    public House() {

    }

    public String getHouse_id() {return house_id;}

    public void setHouseId(String id) {this.house_id = house_id;}

    public String getResidenceId() {return residenceId;}

    public void setResidenceId(String residenceId) {this.residenceId = residenceId;}

    public String getFloorId() {return floorId;}

    public void setFloorId(String floor) {this.floorId = floorId;}

    public String getBalcony() {return balcony;}

    public void setBalcony(String balcony) {this.balcony = balcony;}

   public String getMonthlyRent(){return monthlyRent;}

    public void setMonthlyRent(String monthlyRent){this.monthlyRent=monthlyRent;}

    public Integer getBathroomNum(){return bathrooms;}
    public void setBathroomsNum(Integer bathrooms){this.bathrooms=bathrooms;}
    public Integer getBedroomsNum(){return bedrooms;}
    public void setBedroomsNum(Integer bathrooms){this.bathrooms=bedrooms;}

    @Override
    public String toString() {
        return "Houses{" +
                "ID " + house_id +
                ", ResidenceID '" + residenceId + '\'' +
                ", FloorID '" + floorId + '\'' +
                ", Monthly Rent '" + monthlyRent + '\'' +
                ", Balcony " + balcony + '\''+
                ", Bathrooms " + bathrooms + '\''+
                ", Bedrooms " + bedrooms + '\''+
                '}';
    }


}

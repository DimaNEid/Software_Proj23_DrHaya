package org.example;

public class House {

    private String houseId;
    private String residenceId;
    private String floorId;
    private String monthlyRent;
    private String balcony;
    private Integer  bathrooms;
    private Integer bedrooms;

    public House(String houseId , String residenceId, String floorId, String monthlyRent,String balcony, Integer bathrooms, Integer bedrooms) {
        this.houseId = houseId;
        this.residenceId = residenceId;
        this.floorId = floorId;
        this.monthlyRent = monthlyRent;
        this.balcony = balcony;
        this.bathrooms=bathrooms;
        this.bedrooms=bedrooms;
    }

    public House() {

    }

    public String getHouseId() {return houseId;}

    public void setHouseId(String houseId) {this.houseId = houseId;}

    public String getResidenceId() {return residenceId;}

    public void setResidenceId(String residenceId) {this.residenceId = residenceId;}

    public String getFloorId() {return floorId;}

    public void setFloorId(String floorId) {this.floorId = floorId;}

    public String getBalcony() {return balcony;}

    public void setBalcony(String balcony) {this.balcony = balcony;}

   public String getMonthlyRent(){return monthlyRent;}

    public void setMonthlyRent(String monthlyRent){this.monthlyRent=monthlyRent;}

    public Integer getBathroomNum(){return bathrooms;}
    public void setBathroomsNum(Integer bathrooms){this.bathrooms=bathrooms;}
    public Integer getBedroomsNum(){return bedrooms;}
    public void setBedroomsNum(Integer bedrooms){this.bedrooms=bedrooms;}

    @Override
    public String toString() {
        return "Houses{" +
                "ID " + houseId +
                ", ResidenceID '" + residenceId + '\'' +
                ", FloorID '" + floorId + '\'' +
                ", Monthly Rent '" + monthlyRent + '\'' +
                ", Balcony " + balcony + '\''+
                ", Bathrooms " + bathrooms + '\''+
                ", Bedrooms " + bedrooms + '\''+
                '}';
    }


}

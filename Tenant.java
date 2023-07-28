package org.example;

import java.util.ArrayList;

public class Tenant {
  //  public int TotalPrice;
    private String id, name , phone, password;

    public Tenant(String name,String phone,String id, String password) {
    }

    public Tenant() {

    }

    public static String getCustomerFromLine(String line) {
        return line;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }


    public String getPassword() {
        return password;
    }

    /*ArrayList<Order> orders = new ArrayList<>();
    int numberOfOrders =0 ;

    public void addOrder(Order order) {
        this.orders.add(order);
    }
    public ArrayList<Order> getOrders() {
        return this.orders;
    }
    void setNumberOfOrders(int num){
        if(orders.isEmpty()) num = 0;
        this.numberOfOrders = num;
    }
    int getNumberOfOrders(){
        return numberOfOrders;
    }*/
}

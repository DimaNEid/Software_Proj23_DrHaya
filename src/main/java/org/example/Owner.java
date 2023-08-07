package org.example;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    public Owner(String id,String name,String phone, String address) {
        this.id = id;
        this.name = name;
        this.address=address;
        this.phone=phone;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public Owner() {

    }

    @Override

    public String toString(){
        return "Owner{"+
                ", Id      ='" + id + '\'' +
                ", name    ='" + name + '\'' +
                ", address ='" + address + '\'' +
                ", phone ='"   + phone + '\'' + '}';
    }

    }
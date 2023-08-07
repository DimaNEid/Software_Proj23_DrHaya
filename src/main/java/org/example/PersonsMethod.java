package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonsMethod {

    public static List<Owner> owners = new ArrayList<>();
    static Owner oo = new Owner();

    public static boolean addOwner(String id, String name, String phone, String address) {
        oo.setId(id);
        oo.setName(name);
        oo.setPhone(phone);
        oo.setAddress(address);


        owners.add(oo);
        return true;
    }
}

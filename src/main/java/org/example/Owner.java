package org.example;

import java.util.ArrayList;
import java.util.List;

public class Owner extends User{

    public List<Residence> residences = new ArrayList<>();
    public Owner(String id, String name, String username, String password) {
        super(id, name, username, password);
    }

}

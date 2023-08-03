package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.LoginUsersMethod.OwnerMethod;

public class UserMethod {
    public static List<Owner> owners = new ArrayList<>();
    static Owner oo = new Owner();

    static String success = "Logged In Successfully";
    static String unSuccess = "Enter Valid Username And Password";

    public static String ownerLogin(String username, String password)  {
        while(true){
        for(int i=0 ; i<owners.size();i++){
            if(username.equals(oo.getId()) && password.equals(oo.getPassword())){
                System.out.println("Logged In Successfully");
                OwnerMethod();

                return success;}

            else {return unSuccess;}
        }

    }/*while*/
    }/*ownerLogin*/


    public static Owner addOwner(String id, String name, String username, String password, String address, String phone) {
        oo.setId(id);
        oo.setName(name);
        oo.setUsername(username);
        oo.setPassword(password);
        oo.setAddress(address);
        oo.setPhone(phone);

        owners.add(oo);
        return oo;}


}/*class*/

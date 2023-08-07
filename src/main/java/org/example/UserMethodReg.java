package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMethodReg {

    public static List<UserInfo> usersInfo = new ArrayList<>();
    static UserInfo ui = new UserInfo();

    public static boolean userSignUpCheck(String u, String p) {

        for (int i = 0; i < usersInfo.size(); i++) {
            if (u.equals(usersInfo.get(i).getUsername()) || p.equals(usersInfo.get(i).getPassword()) ){
                System.out.println("Enter Valid Information");

                return false;

            }
        }

        System.out.println("Signed Up Successfully");
        addUser(u,p);
            return true;

    }
    public static boolean addUser(String u, String p){
        ui.setUsername(u);
        ui.setPassword(p);
        usersInfo.add(ui);

        return true;

    }
    public static boolean userLoginCheck(String username, String password)  {

        for(int i=0 ; i<usersInfo.size();i++){
            if(username.equals(usersInfo.get(i).getUsername()) && password.equals(usersInfo.get(i).getPassword())){
                System.out.println("Logged In Successfully");

                return true;}
        }
        return false;
    }


}

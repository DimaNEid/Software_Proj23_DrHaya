package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserMethodReg {

    public static List<UserInfo> usersInfo = new ArrayList<>();
    static UserInfo ui = new UserInfo();

    public static boolean userSignUpCheck(String u, String p) {

        for (UserInfo userInfo : usersInfo) {
            if (u.equals(userInfo.getUsername()) || p.equals(userInfo.getPassword())) {
                System.out.println("Enter Valid Information");

                return false;}
        }

        System.out.println("Signed Up Successfully");
        addUser(u,p);
            return true;

    }

    public static void addUser(String u, String p){
        ui.setUsername(u);
        ui.setPassword(p);
        usersInfo.add(ui);

    }

    public static boolean userLoginCheck(String username, String password)  {

        for (UserInfo userInfo : usersInfo) {
            if (username.equals(userInfo.getUsername()) && password.equals(userInfo.getPassword())) {
                System.out.println("Logged In Successfully");

                return true;
            }
        }
        return false;
    }


}

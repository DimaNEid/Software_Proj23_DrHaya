package org.example;

import static org.example.LoginUsersMethod.scanner;

public class SignUp {

    static String msg = "Your Account Has Been Created";

    public static String OwnerSignUp(){
        System.out.println("Enter Your Id");
        String in1 = scanner.nextLine();

        System.out.println("Enter Your Name");
        String in2 = scanner.nextLine();

        System.out.println("Enter Your UserName");
        String in3 = scanner.nextLine();

        System.out.println("Enter Your Password");
        String in4 = scanner.nextLine();

        System.out.println("Enter Your Address");
        String in5 = scanner.nextLine();

        System.out.println("Enter Your Phone");
        String in6 = scanner.nextLine();

        UserMethod.addOwner(in1, in2, in3, in4, in5, in6);

        return msg;
    }
}

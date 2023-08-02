package org.example;

import java.io.*;
import java.util.*;

import static org.example.Login.scanner;

public class Main {


    public static void main(String[] args) {


            System.out.println("\n Welcome to SakaNcom Application!");
            System.out.println("----------------------------------");
            System.out.println("|                                |");
            System.out.println("|        1. Log In               |");
            System.out.println("|        2. Sign Up              |");
            System.out.println("|                                |");
            System.out.println("----------------------------------\n");

            System.out.println("Enter Your Choice");
            int choiceReg = scanner.nextInt();


            if (choiceReg == 1) {

                    System.out.println("Log In Page");

                    System.out.println("\n---------- Log In As ----------");
                    System.out.println("|                                |");
                    System.out.println("|        1. Owner                |");
                    System.out.println("|        2. Admin                |");
                    System.out.println("|        3. Tenant               |");
                    System.out.println("|                                |");
                    System.out.println("----------------------------------\n");

                    System.out.println("Enter Your Choice");
                    int logUser = scanner.nextInt();

                    if (logUser == 1) {
                        System.out.println("Enter Your Username");
                        String u = String.valueOf(scanner.nextInt());

                        System.out.println("Enter Your Password");
                        String p = String.valueOf(scanner.nextInt());

                        UserMethod.ownerLogin(u, p);}

                    else if (logUser == 2) {}
                    else if (logUser == 3) {}
                    else {System.out.println("Enter Valid Input 1,2,3");}



            }/*1st if Login*/
            else if (choiceReg == 2) {


                    System.out.println("Sign Up As: ");

                    System.out.println("\n---------- Sign Up Page ----------");
                    System.out.println("|                                |");
                    System.out.println("|        1. Owner   Account       |");
                    System.out.println("|        2. Admin   Account       |");
                    System.out.println("|        3. Tenant  Account       |");
                    System.out.println("|                                |");
                    System.out.println("----------------------------------\n");

                    System.out.println("Enter Your Choice");
                    int signUser = scanner.nextInt();

                    if (signUser == 1) {

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

                        UserMethod.addOwner(in1, in2, in3, in4, in5, in6);}

                    else if (signUser == 2) { }
                    else if (signUser == 3) { }
                    else {System.out.println("Enter Valid Input 1,2,3");}


            }/*2nd if Signup*/


        }/*Main Method*/

    }/*Main Class*/


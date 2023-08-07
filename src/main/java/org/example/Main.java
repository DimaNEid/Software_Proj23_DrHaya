package org.example;
import java.util.Scanner;

import static org.example.UserMethodReg.usersInfo;


public class Main {

    static Scanner scanner = new Scanner(System.in);

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

                       // UserMethod.ownerLogin(u, p);
                        boolean loginStatus = (UserMethodReg.userLoginCheck(u, p));

                            if (loginStatus) {

                                 Scanner menu_in = new Scanner(System.in);

                                 Scanner scanner = new Scanner(System.in);

                                 ServiceMethod methodsObj = new ServiceMethod();

                                int xO = 0;

                                while (xO != 1) {
                                    System.out.println("Welcome Owner!");
                                    System.out.println("Please choose one of the following: ");

                                    System.out.println("1. Add Your Information.");
                                    System.out.println("2. Add Residence.");
                                    System.out.println("3. View All Residences.");
                                    System.out.println("4. Add House.");
                                    System.out.println("5. View All House.");
                                    System.out.println("6. Control Panel.");
                                    System.out.println("7. Update House Information.");
                                    System.out.println("8. Update Residence Information.");
                                    System.out.println("9. Check The tenants for a certain house");
                                    System.out.println("10. Check Number Of Communication");


                                    int choice = menu_in.nextInt();
                                    menu_in.nextLine();

                                    if(choice == 1) {

                                        System.out.println("Add Owner ID");
                                        String oii1 = scanner.nextLine();


                                        System.out.println("Add Owner Name");
                                        String oii2 = scanner.nextLine();

                                        System.out.println("Add Owner Phone");
                                        String oii3 = scanner.nextLine();

                                        System.out.println("Add Owner Address");
                                        String oii4 = scanner.nextLine();

                                        PersonsMethod.addOwner(oii1,oii2,oii3,oii4);


                                    }

                                        else if (choice == 2) {


                                            System.out.println("Add Resident ID");
                                            String input1 = scanner.nextLine();


                                            System.out.println("Add your ID");
                                            String input2 = scanner.nextLine();

                                            System.out.println("Add The resident location");
                                            String input3 = scanner.nextLine();

                                            System.out.println("Add The service you offer");
                                            String input4 = scanner.nextLine();

                                            System.out.println("Add The Number Of Floors");
                                            Integer input5 = Integer.valueOf(scanner.nextLine());

                                            System.out.println("Add The Number Of Houses");
                                            Integer input6 = Integer.valueOf(scanner.nextLine());

                                            methodsObj.addResidence(input1, input2, input3, input5, input4, input6);


                                        } else if (choice == 3) {

                                            System.out.println("All your Residences: ");
                                            ServiceMethod.viewResidences();


                                            /* for (int i = 0; i < residences.size(); i++) {System.out.println(residences.get(i).toString());}*/

                                        } else if (choice == 4) {

                                            System.out.println("Add House ID");
                                            String input1 = scanner.nextLine();

                                            System.out.println("Add The Resident ID that the house is located");
                                            String input2 = scanner.nextLine();

                                            System.out.println("Add The Floor ID that the house is located");
                                            String input3 = scanner.nextLine();

                                            System.out.println("Add The Monthly Rent");
                                            String input4 = scanner.nextLine();

                                            System.out.println("Add number of bathrooms ");
                                            String input5 = scanner.nextLine();

                                            System.out.println("Add number of bedrooms");
                                            Integer input6 = Integer.valueOf(scanner.nextLine());

                                            System.out.println("Add if there is a balcony");
                                            Integer input7 = Integer.valueOf(scanner.nextLine());


                                            methodsObj.addHouse(input1, input2, input3, input4, input5, input6, input7);


                                        } else if (choice == 5) {

                                            System.out.println("All your Houses: ");
                                            ServiceMethod.viewHouses();

                                            //for (int i = 0; i < houses.size(); i++) {System.out.println(houses.get(i).toString());}


                                        } else if (choice == 6) {

                                            System.out.println("If You Would Like To Check The Control Panel");
                                            ServiceMethod.viewResidenceID();

                                            /*for (int i = 0; i < residences.size(); i++) {System.out.println(residences.get(i).getResidenceID()); }*/

                                            System.out.println("Enter The Resident ID That You Would Like To See Its Details");
                                            String s = scanner.nextLine();
                                            System.out.println("Enter The Floor ID That You Would Like To See Its house");
                                            String ss = scanner.nextLine();

                                            methodsObj.getHouseIdByResidentAndFloor(s, ss);


                                        } else if (choice == 7) {
                                            ServiceMethod.updateHouse();

                                        } else if (choice == 8) {
                                            ServiceMethod.updateResidence();


                                        } else if (choice == 9) {

                                        } else if (choice == 10) {

                                        } else {
                                            System.out.println("Invalid Input Try One Of The Valid Choices 1,2,3,4,5,6,7");
                                        }


                                }

                            }





                            else{String invalid = "Invalid Input";}


                    }

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

                        System.out.println("Enter Your username");
                        String in1 = scanner.nextLine();

                        System.out.println("Enter Your password");
                        String in2 = scanner.nextLine();

                       }

                    else if (signUser == 2) { }
                    else if (signUser == 3) { }
                    else {System.out.println("Enter Valid Input 1,2,3");}


            }/*2nd if Signup*/


        }/*Main Method*/

    }/*Main Class*/


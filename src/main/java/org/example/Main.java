package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        logger.info("\n Welcome to SakaNcom Application!");
        logger.info("----------------------------------");
        logger.info("|                                |");
        logger.info("|        1. Log In               |");
        logger.info("|        2. Sign Up              |");
        logger.info("|                                |");
        logger.info("----------------------------------\n");

        logger.info("Enter Your Choice");
            int choiceReg = scanner.nextInt();


            if (choiceReg == 1) {

                logger.info("Log In Page");

                logger.info("\n---------- Log In As ----------");
                logger.info("|                                |");
                logger.info("|        1. Owner                |");
                logger.info("|        2. Admin                |");
                logger.info("|        3. Tenant               |");
                logger.info("|                                |");
                logger.info("----------------------------------\n");

                logger.info("Enter Your Choice");
                    int logUser = scanner.nextInt();

                    if (logUser == 1) {
                        logger.info("Enter Your Username");
                        String u = String.valueOf(scanner.nextInt());

                        logger.info("Enter Your Password");
                        String p = String.valueOf(scanner.nextInt());

                       // UserMethod.ownerLogin(u, p);
                        boolean loginStatus = (UserMethodReg.userLoginCheck(u, p));

                            if (loginStatus) {

                                 Scanner menu_in = new Scanner(System.in);

                                 Scanner scanner = new Scanner(System.in);

                                 ServiceMethod methodsObj = new ServiceMethod();

                                while (true) {
                                    logger.info("Welcome Owner!");
                                    logger.info("Please choose one of the following: ");

                                    logger.info("1. Add Your Information.");
                                    logger.info("2. Add Residence.");
                                    logger.info("3. View All Residences.");
                                    logger.info("4. Add House.");
                                    logger.info("5. View All House.");
                                    logger.info("6. Control Panel.");
                                    logger.info("7. Update House Information.");
                                    logger.info("8. Update Residence Information.");
                                    logger.info("9. Check The tenants for a certain house");
                                    logger.info("10. Check Number Of Communication");


                                    int choice = menu_in.nextInt();
                                    menu_in.nextLine();

                                    if(choice == 1) {

                                        logger.info("Add Owner ID");
                                        String oii1 = scanner.nextLine();


                                        logger.info("Add Owner Name");
                                        String oii2 = scanner.nextLine();

                                        logger.info("Add Owner Phone");
                                        String oii3 = scanner.nextLine();

                                        logger.info("Add Owner Address");
                                        String oii4 = scanner.nextLine();

                                        PersonsMethod.addOwner(oii1,oii2,oii3,oii4);


                                    }

                                        else if (choice == 2) {




                                        logger.info("Add Resident ID");
                                        String input1 = scanner.nextLine();


                                        logger.info("Add your ID");
                                        String input2 = scanner.nextLine();

                                        logger.info("Add The resident location");
                                        String input3 = scanner.nextLine();

                                        logger.info("Add The service you offer");
                                        String input4 = scanner.nextLine();

                                        logger.info("Add The Number Of Floors");
                                        Integer input5 = Integer.valueOf(scanner.nextLine());

                                        logger.info("Add The Number Of Houses");
                                        Integer input6 = Integer.valueOf(scanner.nextLine());

                                         methodsObj.addResidence(input1, input2, input3, input5, input4, input6);


                                        } else if (choice == 3) {

                                        logger.info("All your Residences: ");
                                         ServiceMethod.viewResidences();


                                            /* for (int i = 0; i < residences.size(); i++) {System.out.println(residences.get(i).toString());}*/

                                        } else if (choice == 4) {

                                        logger.info("Add House ID");
                                        String input1 = scanner.nextLine();

                                        logger.info("Add The Resident ID that the house is located");
                                        String input2 = scanner.nextLine();

                                        logger.info("Add The Floor ID that the house is located");
                                        String input3 = scanner.nextLine();

                                        logger.info("Add The Monthly Rent");
                                        String input4 = scanner.nextLine();

                                        logger.info("Add number of bathrooms ");
                                        String input5 = scanner.nextLine();

                                        logger.info("Add number of bedrooms");
                                        Integer input6 = Integer.valueOf(scanner.nextLine());

                                        logger.info("Add if there is a balcony");
                                        Integer input7 = Integer.valueOf(scanner.nextLine());


                                            methodsObj.addHouse(input1, input2, input3, input4, input5, input6, input7);


                                        } else if (choice == 5) {

                                        logger.info("All your Houses: ");
                                        ServiceMethod.viewHouses();

                                            //for (int i = 0; i < houses.size(); i++) {System.out.println(houses.get(i).toString());}


                                        } else if (choice == 6) {

                                        logger.info("If You Would Like To Check The Control Panel");
                                        ServiceMethod.viewResidenceID();

                                            /*for (int i = 0; i < residences.size(); i++) {System.out.println(residences.get(i).getResidenceID()); }*/

                                        logger.info("Enter The Resident ID That You Would Like To See Its Details");
                                         String s = scanner.nextLine();
                                        logger.info("Enter The Floor ID That You Would Like To See Its house");
                                          String ss = scanner.nextLine();

                                          //  methodsObj.getHouseIdByResidentAndFloor(s, ss);


                                        } else if (choice == 7) {
                                           // ServiceMethod.updateHouse();

/*
                                                    System.out.println("Enter The house Id That You Would Like To Edit Its Information");
                                                    String i1 = scanner.nextLine();

                                                    if (i1.equals(houses.get(i).getHouse_id())){

                                                        int x = scanner.nextInt();

                                                        System.out.println("Choose Which Information You Want To Edit.");

                                                        System.out.println("1. Residence Id.");
                                                        System.out.println("2. Floor Number.");
                                                        System.out.println("3. Monthly Rent.");
                                                        System.out.println("4. Balcony.");
                                                        System.out.println("5. Bathrooms.");
                                                        System.out.println("6. Bedrooms");

                                                        if (x == 1){
                                                            System.out.println("Enter New House Id.");
                                                            String i2 = scanner.nextLine();
                                                            hh.setHouseId(i2);
                                                            houses.add(hh);}

                                                        else if (x==2) {
                                                            System.out.println("Enter New Floor Number.");
                                                            String i3 = scanner.nextLine();
                                                            hh.setFloorId(i3);
                                                            houses.add(hh);

                                                        } else if (x==3) {
                                                            System.out.println("Enter New Monthly Rent.");
                                                            String i4 = scanner.nextLine();
                                                            hh.setMonthlyRent(i4);
                                                            houses.add(hh);}

                                                        else if (x==4) {
                                                            System.out.println("Enter New Balcony.");
                                                            String i5 = scanner.nextLine();
                                                            hh.setBalcony(i5);
                                                            houses.add(hh);

                                                        } else if (x==5) {
                                                            System.out.println("Enter New Balcony Number.");
                                                            String i5 = scanner.nextLine();
                                                            hh.setBalcony(i5);
                                                            houses.add(hh);

                                                        } else if (x==6) {
                                                            System.out.println("Enter New Bathrooms Number.");
                                                            String i6 = scanner.nextLine();
                                                            hh.setBathroomsNum(Integer.valueOf(i6));
                                                            houses.add(hh);

                                                        } else if (x==7) {
                                                            System.out.println("Enter New Bedrooms Number.");
                                                            String i7 = scanner.nextLine();
                                                            hh.setBedroomsNum(Integer.valueOf(i7));
                                                            houses.add(hh);}

                                                        return str;

                                                    }else {
                                                        return str1;

                                                    }


*/


                                        } else if (choice == 8) {



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
                    else {    logger.info("Enter Valid Input 1,2,3");}



            }/*1st if Login*/
            else if (choiceReg == 2) {


                logger.info("Sign Up As: ");

                logger.info("\n---------- Sign Up Page ----------");
                logger.info("|                                 |");
                logger.info("|        1. Owner   Account       |");
                logger.info("|        2. Admin   Account       |");
                logger.info("|        3. Tenant  Account       |");
                logger.info("|                                 |");
                logger.info("----------------------------------\n");

                logger.info("Enter Your Choice");
                    int signUser = scanner.nextInt();

                    if (signUser == 1) {

                        logger.info("Enter Your username");
                        String in1 = scanner.nextLine();

                        logger.info("Enter Your password");
                        String in2 = scanner.nextLine();

                       }

                    else if (signUser == 2) { }
                    else if (signUser == 3) { }
                    else {    logger.info("Enter Valid Input 1,2,3");}


            }


        }

    }


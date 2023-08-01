package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.Methods.*;


public class Login {


    static Scanner menu_in = new Scanner(System.in);

    static Scanner scanner = new Scanner(System.in);

   static Methods methodsObj = new Methods();


   private static void adminMethod(){

   }

   private static void OwnerMethod() {
       int x = 0;

       while (x != 1) {
           System.out.println("Welcome Owner!");
           System.out.println("Please choose one of the following: ");

           System.out.println("1. Add Residence.");
           System.out.println("2. View All Residences.");
           System.out.println("3. Add House.");
           System.out.println("4. View All House.");
           System.out.println("5. Control Panel.");
           System.out.println("6. Check The tenants for a certain house");
           System.out.println("7. Check Number Of Communication");


           int choice = menu_in.nextInt();
           menu_in.nextLine();

           if (choice == 1) {



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

              /* Residence addResidence =*/ methodsObj.addResidence(input1,input2,input3,input4,input5, input6);



           } else if (choice == 2) {

               System.out.println("All your Residences: ");
               viewResidences();



              /* for (int i = 0; i < residences.size(); i++) {System.out.println(residences.get(i).toString());}*/

           } else if (choice == 3) {

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


            methodsObj.addHouse(input1,input2,input3,input4,input5, input6, input7);


           } else if (choice == 4) {

               System.out.println("All your Houses: ");
                viewHouses();

               //for (int i = 0; i < houses.size(); i++) {System.out.println(houses.get(i).toString());}



           } else if (choice == 5) {

               System.out.println("If You Would Like To Check The Dashboard");
               viewResidenceID();

               /*for (int i = 0; i < residences.size(); i++) {System.out.println(residences.get(i).getResidenceID()); }*/

               System.out.println("Enter The Resident ID That You Would Like To See Its Details");
               String s = scanner.nextLine();
               System.out.println("Enter The Floor ID That You Would Like To See Its house");
               String ss = scanner.nextLine();

               methodsObj.getHouseIdByResidentAndFloor(s,ss);


              /* for (int i = 0; i < houses.size(); i++) {

                   if (s == houses.get(i).getResidenceId() && ss == houses.get(i).getFloorId()) ;
                   {

                       System.out.println(houses.get(i).getHouse_id());

                       System.out.println("Enter The House ID That You Would Like To See Its Details");
                       String sss = scanner.nextLine();

                       if (sss == houses.get(i).getHouse_id()) {

                           System.out.println(houses.get(i).toString());

                       }
                   }
               }*/




           } else if (choice == 6) {


           } else if (choice == 7) {

           } else{
               System.out.println("Invalid Input Try One Of The Valid Choices 1,2,3,4,5,6,7");
           }


       }
   }



}

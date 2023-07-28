import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        while (true) {

            System.out.println("------ Welcome to Sakankom Home Page ------");
            System.out.println("|                                         |");
            System.out.println("|          1. Sign up                     |");
            System.out.println("|          2. Sign in                     |");
            System.out.println("|          3. Exit                        |");
            System.out.println("|                                         |");
            System.out.println("-------------------------------------------\n");
            System.out.print("Enter your choice: ");

            while  (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid integer.");

            }
            choice=scanner.nextInt();
            if (choice == 1)
                System.out.println("------ u choosed 1 ------");


                else if (choice == 2)
                System.out.println("------ u choosed 2 ------");

                else if ( choice == 3)
                System.out.println("------ u choosed 3 ------");

                else
                System.out.println("Invalid input! Please enter a valid integer.");


        }
    }
}

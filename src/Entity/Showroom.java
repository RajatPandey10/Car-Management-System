package Entity;

import java.util.Scanner;

import Utility.Utility;
public class Showroom implements Utility {
        String ShowRoomName;
        String ShowRoomAddress;
        String ShowRoomManagerName;
        int TotalCars=0;
        int TotalEmployees=0;

        Scanner sc = new Scanner(System.in);

    @Override
    public void set_Details(){
        System.out.println("========== Enter Your Showroom Details Here ==========");
        System.out.println();
        System.out.print("Enter Showroom Name: ");
        ShowRoomName = sc.nextLine();

        System.out.print("Enter Showroom Address: ");
        ShowRoomAddress =  sc.nextLine();

        System.out.print("Enter Showroom Manager Name: ");
        ShowRoomManagerName =  sc.nextLine();

        System.out.print("Enter  Total Numbers Of Cars: ");
        TotalCars = sc.nextInt();

        System.out.print("Enter Total Numbers of Employees: ");
        TotalEmployees = sc.nextInt();

    }

    @Override
        public void get_Details(){
            System.out.println("Showroom Name: "+ShowRoomName);
            System.out.println("Showroom Address: "+ShowRoomAddress);
            System.out.println("Showroom Manager Name: "+ShowRoomManagerName);
            System.out.println("Total Number of Cars in Stock: "+TotalCars);
            System.out.println("Total Number of Employees: "+TotalEmployees);

        }

}


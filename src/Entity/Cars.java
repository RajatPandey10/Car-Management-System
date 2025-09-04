package Entity;

import java.util.Scanner;
import Utility.Utility;
public class Cars extends Showroom implements Utility {

    String Car_Name ;
    String Car_Color;
    String Car_type;
    String Fuel_Type;
    String Car_Transmission;
    double Car_Price;

    Scanner sc = new Scanner(System.in);


    @Override
    public void set_Details(){
        System.out.println("========== Enter Your Car Details Here ==========");
        System.out.println();
        System.out.print("Enter Car Name: ");
        Car_Name =  sc.nextLine();

        System.out.print("Enter Car Color: ");
        Car_Color =  sc.nextLine();

        System.out.print("Enter Car Type: ");
        Car_type =  sc.nextLine();

        System.out.print("Enter Fuel type === DIESEL == OR == PETROL ===: ");
        Fuel_Type =  sc.nextLine();

        System.out.print("Enter Car Transmission === AUTOMATIC == OR == MANUAL ===: ");
        Car_Transmission =  sc.nextLine();

        System.out.print("Enter Car Prize: ");
        Car_Price = sc.nextInt();
        TotalCars++;

    }

    @Override
    public void get_Details(){
        System.out.println("Car Name: "+Car_Name);
        System.out.println("Car Color: "+Car_Color);
        System.out.println("Car Type "+Car_type);
        System.out.println("Car transmission:  "+Car_Transmission);
        System.out.println("Car Fuel Type: "+Fuel_Type);
        System.out.println("Car Price: "+Car_Price);
    }
}

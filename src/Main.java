import Entity.Cars;
import Entity.Employee;
import Entity.Showroom;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main_menu(){
        System.out.println("========== Welcome To Car Management System ==========\n");
        System.out.println("============ Please Select a Choice: ============\n");
        System.out.println("1] ADD SHOWROOM\t\t\t 2] ADD EMPLOYEE\t\t\t 3] ADD CAR\n");
        System.out.println("4] GET SHOWROOM\t\t\t 5] GET EMPLOYEE\t\t\t 6] GET CAR\n");
        System.out.println("============== Enter 0 For Exit ==============");


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Showroom> showrooms = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Cars> cars = new ArrayList<>();

        int choice = 100;
        while(choice!=0){
            main_menu();
            System.out.println("Enter your Choice here: ");
            choice = sc.nextInt();

            while(choice!=9 && choice!=0){

                switch (choice){
                    case 1:

                        Showroom showroom = new Showroom();
                        showrooms.add(showroom);
                        showroom.set_Details();
                        System.out.println();
                        System.out.println("Enter 9 for Main Menu");
                        System.out.println("Enter 0 to Exit");
                        System.out.print("Enter Your Choice: ");
                        choice = sc.nextInt();
                        System.out.println();
                        System.out.println();
                        break;

                    case 2:

                        Employee employee = new Employee();
                        employees.add(employee);
                        employee.set_Details();
                        System.out.println();
                        System.out.println("Enter 9 for Main Menu");
                        System.out.println("Enter 0 to Exit");
                        System.out.print("Enter Your Choice: ");
                        choice = sc.nextInt();
                        System.out.println();
                        System.out.println();
                        break;

                    case 3:
                        Cars car = new Cars();
                        cars.add(car);
                        car.set_Details();
                        System.out.println();
                        System.out.println("Enter 9 for Main Menu");
                        System.out.println("Enter 0 to Exit");
                        System.out.print("Enter Your Choice: ");
                        choice = sc.nextInt();
                        System.out.println();
                        System.out.println();
                        break;

                    case 4:
                        if(showrooms.isEmpty()){
                            System.out.println("No Data Available...");
                        }
                        for(Showroom showroom1: showrooms){
                            showroom1.get_Details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("Enter 9 for Main Menu");
                        System.out.println("Enter 0 to Exit");
                        System.out.print("Enter Your Choice: ");
                        choice = sc.nextInt();
                        System.out.println();
                        System.out.println();
                        break;
                    case 5:
                        if(employees.isEmpty()){
                            System.out.println("No Data Available...");
                        }
                        for(Employee employee1: employees){
                            employee1.get_Details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("Enter 9 for Main Menu");
                        System.out.println("Enter 0 to Exit");
                        System.out.print("Enter Your Choice: ");
                        choice = sc.nextInt();
                        System.out.println();
                        System.out.println();
                        break;
                    case 6:
                        if(cars.isEmpty()){
                            System.out.println("No Data Available...");
                        }
                        for(Cars cars1:cars){
                            cars1.get_Details();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("Enter 9 for Main Menu");
                        System.out.println("Enter 0 to Exit");
                        System.out.print("Enter Your Choice: ");
                        choice = sc.nextInt();
                        System.out.println();
                        System.out.println();
                        break;

                }
            }
        }

    }

}


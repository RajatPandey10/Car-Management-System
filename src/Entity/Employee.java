package Entity;
import Utility.Utility;

public class Employee extends Showroom implements Utility {
    String Employee_Name;
    String Employee_Designation;
    double Employee_Salary;
    int Age;
    String Showroom_Worked;



    @Override
    public void set_Details(){
        System.out.println("========== Enter Your Employee Details Here ==========");
        System.out.println();
        System.out.print("Enter Employee Name: ");
        Employee_Name =  sc.nextLine();

        System.out.print("Entity.Showroom Name: ");
        Showroom_Worked = sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        Employee_Designation = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        Employee_Salary = sc.nextDouble();



        System.out.print("Enter Employee Age: ");
        Age = sc.nextInt();


    }
    @Override
    public void get_Details(){
        System.out.println("Employee Name: "+Employee_Name);
        System.out.println("Employee Designation: "+Employee_Designation);
        System.out.println("Employee Salary: "+Employee_Salary);
        System.out.println("Employee Age: "+Age);
        System.out.println("Worked at: "+Showroom_Worked);

    }
}

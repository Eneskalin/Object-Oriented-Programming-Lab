import java.util.Scanner;

public class employee {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;
    void displayInfo(){
        System.out.println("Name:"+name +"Social Security Number:" + socialSecurityNumber);
    }
    void displaySalary(){
        System.out.println("Salary: "+wage*workingHours);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        employee employee1 = new employee();
        System.out.println("Enter name:");
        employee1.name=input.nextLine();
        System.out.println("Enter Social Security Number:");
        employee1.socialSecurityNumber=input.nextInt();
        System.out.println("Enter Working Hours");
        employee1.workingHours=input.nextInt();
        System.out.println("Enter Wage");
        employee1.wage=input.nextFloat();
        employee1.displayInfo();
        employee1.displaySalary();


    }


}




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        WorkDays[] emp1Days = {WorkDays.Sunday, WorkDays.Friday};
        WorkDays[] emp2Days = {WorkDays.Thursday, WorkDays.Saturday};
        WorkDays[] emp3Days = {WorkDays.Thursday, WorkDays.Saturday};
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter First Employee Name");
        String name = inp.nextLine();
        Employee emp1 = new Employee(name, emp1Days);
        System.out.println("Enter Second Employee Name");
        String name2 = inp.nextLine();
        Employee emp2 = new Employee(name2, emp2Days);
        System.out.println("Enter Third Employee Name");
        String name3 = inp.nextLine();
        Employee emp3 = new Employee(name3, emp3Days);
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        System.out.println(emp1.getTotalWorker());

    }
}


import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Worker worker1=new Worker();
        Scanner input =new Scanner(System.in);
        System.out.println("Enter worker name");
        String name=input.nextLine();
        worker1.setName(name);
        System.out.println("Enter worker salary");
        double salary=input.nextDouble();
        worker1.setSalary(salary);

    }
}
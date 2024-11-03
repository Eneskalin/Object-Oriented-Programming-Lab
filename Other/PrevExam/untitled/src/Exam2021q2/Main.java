package Exam2021q2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1=new Car(1,2007);
        Car car2=new Car(2,2010);
        Car car3=new Car(3,2024);
        Car car4=new Car(4,2000);
        Car[] cars={car1,car2,car3,car4};
        int n=0; //Student Number
        Garage g1=new Garage(cars);
        g1.printCarsOlderThan(0);



    }
}
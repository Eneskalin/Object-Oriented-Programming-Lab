package Exam2022q2I4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Car car1=new Car(2017);
            Car car2=new Car(2021,"BMW");
            Car car3=new Car(2024,250,"Renault");
            Car[] cars={car1,car2,car3};
            Factory factory=new Factory(cars);
            factory.printAllCarsInfo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }




    }
}
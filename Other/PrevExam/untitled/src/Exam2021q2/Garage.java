package Exam2021q2;

public class Garage {
    Car[] cars;

    Garage(Car[] cars){
        this.cars=cars;
    }

    void  printCarsOlderThan(int age){
        System.out.println("Cars older than "+age+" years");
        for ( Car cars : cars){
            if (cars.getAge() >age){
                System.out.println(cars);
            }
        }
    }

    int getNumberOfCars(){

        return  cars.length;
    }
}


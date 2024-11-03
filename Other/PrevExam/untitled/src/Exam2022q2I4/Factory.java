package Exam2022q2I4;

public class Factory {
    Car[] cars;
    public Factory(Car[] cars){
        this.cars=cars;
    }
    void printAllCarsInfo(){
        for (Car cars :cars){
            System.out.println(cars.getCarInfo());
        }
    }
}


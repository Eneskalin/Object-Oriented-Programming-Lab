package Exam2021q2;

public class Car {
    int id;
    int productionYear;
    int power;
    static  int counter;

    Car(int id , int productionYear){
        this.id=id;
        this.productionYear=productionYear;
    }

    void setPower(int power){
        this.power=power;

    }
    int getAge(){
        return 2024-productionYear;
    }

    void startAndMove(){


    }
    void  stop(){
        return;

    }
    public String toString(){
        return "Car ID "+id+" Production Year "+productionYear;
    }

}

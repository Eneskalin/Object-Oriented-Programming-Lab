package Exam2022q2I4;

public class Car {
    String brand;
    int maxSpeed;
    int year;
    public Car(int year){
        this(year,500,"Mercedes");
    }
    public  Car(int year,String brand){
        this(year,280,brand);
    }
    public Car(int year,int maxSpeed,String brand){
        setBrand(brand);
        setYear(year);
        setMaxSpeed(maxSpeed);
    }
    void setBrand(String brand){
        this.brand=brand;
    }
    void setYear(int year){
        if (year >2022){
            throw new IllegalArgumentException("Year have to less 2022");
        }
        this.year=year;
    }
    void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    int getMaxSpeed(){
        return this.maxSpeed;
    }
    int getYear(){
        return this.year;
    }
    String getBrand(){
        return this.brand;
    }
    String getCarInfo(){
        return "Car Brand: "+getBrand()+" Year: "+getYear()+" Max Speed: "+getMaxSpeed();
    }
}

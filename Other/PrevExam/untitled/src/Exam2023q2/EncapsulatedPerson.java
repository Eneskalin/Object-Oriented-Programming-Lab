package Exam2023q2;

public class EncapsulatedPerson {
    private  String name;
    private int age;

    public EncapsulatedPerson(String name,int age){
        setAge(age);
        setName(name);
    }
    void  setName(String name){
        this.name=name;
    }
    void setAge(int age){
        if (age <20 || age>60){
            throw new IllegalArgumentException("Age  must be between 20 and 60 ");
        }
        this.age=age;
    }

}

package Exam2023q2;

public class Main {
    public static void main(String[] args) {
        try {
            EncapsulatedPerson person1=new EncapsulatedPerson("Enes",19);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
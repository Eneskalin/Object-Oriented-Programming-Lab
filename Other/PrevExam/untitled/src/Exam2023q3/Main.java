package Exam2023q3;

public class Main {
    public static void main(String[] args) {
        Restaurant aspava=new Restaurant("Aspava");
        aspava.setAddress("Ankara/Mamak");
        Person person1=new Person("Simsek");
        aspava.setOwner(person1);
        System.out.println("Menu: "+ aspava.getMenu());
        System.out.println("Salads: "+aspava.getSaladList());

    }
}
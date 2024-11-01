public class Person {
    int id;
    static int idCounter;
    String firstName;
    String lastName;
    int age;

    public Person(int id ,String firstName , String lastName , int age){
        this.age =age;
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;

    }
    public Person(String firstName ,String lastName){
        this(idCounter++,firstName,lastName,0);

    }
    public Person(int id){
        this(id,"unknown","unknown",0);

    }
    public Person(){
        this(idCounter++,"unknown","unknown",0);


    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Teacher t1=new Teacher("Ahmet","+90545646565","Fiz-101");
    Teacher t2=new Teacher("Veli","+955451354252","Logic");

        t1.printTeacher();
    Course Fizik1=new Course("Fizik1","101","Fiz-101",t1);
    Fizik1.addTeacher(t2);
    Student s1=new Student("Enes","221026464","2","Logic","Circuit","OOP");
    }
}
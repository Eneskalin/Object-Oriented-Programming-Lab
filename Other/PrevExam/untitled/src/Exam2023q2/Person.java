package Exam2023q2;

class Person {
    String name;
    int age;

    public Person(int age) {
        this.name = "not reported";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

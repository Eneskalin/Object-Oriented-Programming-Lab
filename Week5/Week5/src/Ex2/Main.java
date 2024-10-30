package Ex2;



public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher(1,Branch.MATH);
        Teacher t2=new Teacher(2,Branch.CS);
        Teacher t3=new Teacher(3,Branch.ENG);
        Teacher t4=new Teacher(4,Branch.PHYSICS);

        Teacher[] teachers ={t1,t2,t3,t4};
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.id + ", Branch: " + teacher.branch + ", Info: " + teacher.branch.getInfo());
        }




    }
}
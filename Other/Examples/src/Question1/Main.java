package Question1;


public class Main {
    public static void main(String[] args) {
        try {
            EncapsulatedStudent st1=new EncapsulatedStudent(30,100);
            System.out.println("Student 1 Avreage:"+st1.getAverage());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
import java.util.Scanner;

//Program to Add Two Integers
public class sum {

    int sumValues(int x , int y ){
        return x+y;
    }


    public static void main(String[] args){
        sum s = new sum();
        System.out.println("Enter first value: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter seconds value: ");
        int y = input.nextInt();
        System.out.println(x + "+"+ y+"="+s.sumValues(x,y));
    }
}

import  java.util.Scanner;
public class Multiply {
//Multiply Two Floating-Point Numbers
    int CalculateMultiply(int x , int y){
        return x*y;
    }

    public static void main(String[] args){
        Multiply m = new Multiply();
        System.out.println("Enter first value:");
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        System.out.println("Enter second value:");
        int y= input.nextInt();
        System.out.println(x+"*"+y+"="+m.CalculateMultiply(x,y));
    }


}

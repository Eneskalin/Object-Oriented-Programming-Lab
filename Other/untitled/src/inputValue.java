import java.util.Scanner;
public class inputValue {

    //How to Print an Integer entered by an user

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ente a value:");
        int number = input.nextInt();
        System.out.print("You entered " + number);

    }

}

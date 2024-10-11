/*
You need to read an integer value from
keyboard. However, let's say a user typed a
string value.
 This will cause an input mismatch exception.
 Handle this exception.
(Hint: use InputMismatchException
exception.)

 */
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a integer");
            int num = input.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}

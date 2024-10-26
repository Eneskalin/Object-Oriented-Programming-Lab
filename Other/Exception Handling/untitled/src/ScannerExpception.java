import java.util.Scanner;
public class ScannerExpception {
    Scanner input=new Scanner(System.in);
    public void setInput(){
        int b;
        System.out.println("Enter b value");
        try{
            b=input.nextInt();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("End of try");
        }


    }

}

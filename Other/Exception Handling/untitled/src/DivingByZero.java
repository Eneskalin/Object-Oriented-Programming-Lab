public class DivingByZero {

    public void ByZero(){
        int a=0;
        try{
            a=2/0;
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }

    }

}

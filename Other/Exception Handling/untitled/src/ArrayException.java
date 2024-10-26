public class ArrayException {

    public void Arr(){
        int[] arr=new int[3];
        try{
            arr[4]=10;
            System.out.println("This print not working");
        }catch (Exception e){
            System.out.println(e.getMessage());
            
        }

    }
}

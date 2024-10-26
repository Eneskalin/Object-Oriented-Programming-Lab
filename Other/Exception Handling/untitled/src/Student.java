public class Student {
    public  Student() {
    }

    public static Student find(String id)throws StudentException{
        if (id.equals("123")){
            return new Student();
        }else {
            throw new StudentException("The stundet didn't found");
        }
    }
}

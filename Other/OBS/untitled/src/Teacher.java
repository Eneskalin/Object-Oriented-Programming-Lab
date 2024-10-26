public class Teacher {
    String name;
    String mpno;
    String branch;
    Teacher(String name,String mpno,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void printTeacher(){
        System.out.println("Name: "+this.name+"\n"+"Phone: "+this.mpno+"\n"+"Branch: "+this.branch);

    }
}


public class Student {
    String name;
    String  stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;
    Student(String name,String stuNo,String classes,Course course1,Course course2,Course course3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNode(int c1Note,int c2Note,int c3Note){
        if (c1Note>0 && c1Note<100)
            course1.note=c1Note;
        if (c2Note>0 && c2Note<100)
            course2.note=c2Note;
        if (c3Note>0 &&c3Note<100)
            course3.note=c3Note;

    }
    void printNote(){
        System.out.println(course1.name+"Notu:"+course1.note);
        System.out.println(course2.name+"Notu:"+course2.note);
        System.out.println(course3.name+"Notu:"+course3.note);

    }
}

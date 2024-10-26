public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    Course(String name,String code ,String prefix,Teacher teacher){
    this.name=name;
    this.code=code;
    int note=0;
    this.prefix=prefix;
    this.teacher=teacher;
    }
    void printTeacherInfo(){
        this.teacher.printTeacher();
    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix))
            this.teacher=teacher;
        else {
            System.out.println("Ogretmen-ders uyusmuyor");
        }
    }
}

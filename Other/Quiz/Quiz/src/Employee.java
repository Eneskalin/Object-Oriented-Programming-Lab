public class Employee {
    private String name;
    private WorkDays[] workdays;
    private static int totalEmployees = 0;

    public Employee(String name, WorkDays[] days) {
    this.name=name;
    addWorkDays(days);
    totalEmployees++;
    }
    void  addWorkDays(WorkDays[] days){
        this.workdays=days;
    }
    void displayInfo(){
        System.out.println("Employee Name:"+name);
        System.out.println("Working Days:");
        for (WorkDays day : workdays){
            System.out.println(day);
        }

    }
    int getTotalWorker(){
        return totalEmployees;
    }


}
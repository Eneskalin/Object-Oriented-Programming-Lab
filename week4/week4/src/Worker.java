/*Create a Worker class which contains name salary attributes
• Create setName and setSalary methods.
• Your program should throw an exception when salary value is less than zero. (When
you enter an illegal argument)
• The exception message is “salary amount must be greater than zero”
• In main method handle the exception and display the exception message.

 */


public class Worker {
    String name;
    double salary;
    static int counter;
    void setName(String name){
        this.name=name;

    }
    void setSalary(double salary){
            if (salary<0){
                throw new ArithmeticException("salary amount must be greater than zero");
            }
            else {
                this.salary=salary;
            }
    }
}

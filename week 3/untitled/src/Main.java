//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account customer1= new Account("Enes",2000);
        System.out.println("Customer Name:"+customer1.getName()+"\n"+"Customer Balance:"+customer1.getBalance());
        customer1.deposit(500);
        customer1.setName("Osman");
        System.out.println("Customer Name:"+customer1.getName()+"\n"+"Customer Balance:"+customer1.getBalance());

    }
}
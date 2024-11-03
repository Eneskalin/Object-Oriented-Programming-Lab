package Exam2021q3;

public class EncapsulatedNFT {
     double balance; // balance cannot be less than 0 or greater than 10000
     String owner;


    void setBalance(double balance){
        if (balance <0 || balance >1000){
            throw new IllegalArgumentException("Invalid Value");
        }
        else {
            this.balance=balance;
        }
    }
    double getBalance(){
        return balance;
    }
    void setOwner(String owner){
        this.owner=owner;
    }
}

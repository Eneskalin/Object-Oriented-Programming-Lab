package Exam2021q3;

public class Main {
    public static void main(String[] args) {

        try {
            EncapsulatedNFT nft1=new EncapsulatedNFT();
            nft1.setBalance(5000000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
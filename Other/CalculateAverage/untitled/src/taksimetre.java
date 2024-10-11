/*aksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

 */
import java.util.Scanner;
public class taksimetre {

    public static void main(String[] args){
        float km;
        float price;
        Scanner inout=new Scanner(System.in);
        System.out.println("Km giriniz");
        km=inout.nextFloat();
        price=km*2.20f+10;
        if (price<20){
            price=20;

        }
        System.out.println(price);






    }
}

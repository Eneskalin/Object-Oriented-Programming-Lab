
/*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

 */
import java.util.Scanner;
public class KDV {
    public static void main(String[] args){
        float price;
            Scanner input=new Scanner(System.in);
            System.out.println("Fiyat girin");
            price=input.nextFloat();
            if (price>=1000 &&0<= price){
                price=price+(price*18)/100;
            }
            else {
                price=price+(price*8)/100;

            }

            System.out.println("Result" + price);

    }

}

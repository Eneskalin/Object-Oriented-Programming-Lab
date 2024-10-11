
/*Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner input=new Scanner(System.in);
        System.out.println("Matematik degerini giriniz:");
        mat=input.nextInt();

        System.out.println("Fizik degerini giriniz:");
        fizik=input.nextInt();

        System.out.println("Kimya degerini giriniz:");
        kimya=input.nextInt();

        System.out.println("Turkce degerini giriniz:");
        turkce=input.nextInt();

        System.out.println("Tarih degerini giriniz:");
        tarih=input.nextInt();

        System.out.println("Muzik degerini giriniz:");
        muzik=input.nextInt();

        double sum=(muzik+tarih+kimya+fizik+mat+turkce);
        double average=sum/6;
        System.out.println("Result "+ average);
        if (average>60)
            System.out.println("Sinifi gecti");
        else {
            System.out.println("Sinifta kaldi");
        }



    }
}
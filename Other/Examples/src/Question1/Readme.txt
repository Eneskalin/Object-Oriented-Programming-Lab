a. Create a class called EncapsulatedStudent, which applies data encapsulation (data hiding) to
Student class.
public class Student {
public int midterm; // midterm cannot be less than 0 or greater than 100
public int finalExam; // finalExam cannot be less than 0 or greater than 100
}
b. EncapsulatedStudent class should throw an exception (with an error message) if any illegal
arguments (midterm and finalExams) are set.
c. Inside the MainClass, create an instance (student1) from EncapsulatedStudent, set attributes for it,
handle any exception, and print the error message on the screen. Use getAverage() method to return the
average score, then print it on the screen. [averageScore= midTerm *0.4 + finalExam*0.6;]


a. Student 'a data encapsulation (kapsülleme, gizleme) prensibini uygulayan EncapsulatedStudent adlı bir class oluşturun.
b. Illegal bir arguman ( midterm veya finalExams icin) girilirse, EncapsulatedStudent sınıfı bir exception (bir hata mesajıyla)
firlatmalidir.
c. MainClass’ta EncapsulatedStudent sinifindan bir student1 nesnesi (instance) oluşturun ve degiskenleri girin, herhangi bir exception
durumuyla başa çıkın (handle edin) ve hata mesajını ekrana yazdırın. Ortalama puanı döndürmek için getAverage() metodunu kullanın,
ardından ekrana yazdırın. [averageScore= midTerm *0.4 + finalExam*0.6;]
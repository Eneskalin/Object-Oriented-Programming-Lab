**Write outputs in the given table. All the classes are declared in the same package.
Çıktıları verilen tabloya yazın. Tüm sınıflar aynı pakette yazılmıştır.**

```
enum Catagory{
 Antibacterials(100,"treat infections"),
 Antibiotics(200,"effective against bacteria"),
 Analgesics(300,"relieve pain");
 private final int id;
 private final String desc;
 private drugCatagory(int Id,String drugDesc) {
 this.id = Id;
 this.desc= drugDesc;
 }
 int getId(){ return id;}
 String getDesc(){ return desc;}
}// End Of enum Catagory
public class Drug {
 private String drugName;
 private int id;
 private int dose;
 static int c;
 Catagory catagory;
public Drug(String drugName, int dose, Catagory
catagory) {
 this.drugName = drugName;
 this.dose = dose;
 this.catagory = catagory;
 this.id = ++c;
 }
int getId(){ return id;}
 @Override
 public String toString(){
 return drugName +" is an " + catagory +"
drug";
 }
}// End of Drug class
public class Pharmacy {
    static int i;
    Drug[] drugs;
 public Pharmacy(int i){
    this.drugs= new Drug[i];
 }
 public void addDrug(Drug drug) {
    this.drugs[i++] = drug;
 }
 void printDrugs(){
    for(Drug d:drugs)
        System.out.println(d);
 }
}// End of Pharmacy class

public class MidtermExam2023 {
 public static void main(String[] args) {
    Drug d1=new Drug("paracetamol",5, Catagory.Analgesics);
    Drug d2=new Drug("augmentin",6, Catagory.Antibiotics);
    Drug d3=new Drug("amoxicil",7, Catagory.Antibacterials);
    Pharmacy ph=new Pharmacy(2);
    d3.catagory=d2.catagory;
    ph.addDrug(d1);
    ph.addDrug(d2);
    System.out.println(d2); //O1
    System.out.println(ph.i); //O2
    System.out.println(d3.catagory.getDesc()); //O3
    System.out.println(d1.getId()); //O4
    ph.printDrugs(); //O5
 }
} 


```

|      |                                                                    |
|------|--------------------------------------------------------------------|
| (01) | augmentin is an Antibiotics drug                                   | 
| (02) | 2                                                                  | 
| (03) | effective against bacteria                                         | 
| (04) | 1                                                                  | 
| (05) | Paracetamol is an Analgesics drug augmentin is an Antibiotics drug | 
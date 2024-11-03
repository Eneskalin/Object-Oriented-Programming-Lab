QUESTION 3. [24p]: Write outputs in the given table. All the classes are declared in the same package.
Çıktıları verilen tabloya yazın. Tüm sınıflar aynı pakette yazılmıştır.

```
enum AnimalType{
    MAMMAL(100),
    BIRD(200),
    RAPTILE(300),
    FISH(400);
    private final int typeId;
    private AnimalType(int typeId) {
    this.typeId = typeId;
 }
    
 int getId(){
    return typeId;}
}
public class Animal {
    private String name;
    private int id;
    static int counter;
    AnimalType animaltype;

 Animal(String name,AnimalType type){
    this.name = name;
    this.animaltype = type;
    this.id= ++counter;
 }
 int getId(){
    return id;
}
 @Override
 public String toString(){
    return name +" is a " + animaltype;
 }
}// End of Animals class

public class Zoo {
    static int index;
    Animal[] animals;
    public Zoo(int i){
    this.animals= new Animal[i];
}
 void addAnimal(Animal a){
    animals[index] = a;
    index++;
 }
 void printAnimals(){
    for(Animal a:animals)
    System.out.println(a);
 }
}// End of Zoo class

public class Exam2022 {
     public static void main(String[] args) {
     Animal a1= new Animal("Cat",AnimalType.MAMMAL);
     Animal a2= new Animal("Dove",AnimalType.BIRD);
     System.out.println(Animal.counter); //1
     System.out.println(a1); //2
     Animal a3= new Animal("Salmon",AnimalType.FISH);
     a2.animaltype=a3.animaltype;
     Animal a4= new Animal("Snake",AnimalType.RAPTILE);
     System.out.println(a3.getId()); //3
     System.out.println(a2.animaltype.getId()); //4
     Zoo myZoo= new Zoo(2);
     myZoo.addAnimal(a1);
     myZoo.addAnimal(a4);
     myZoo.printAnimals(); //5
  }
 }

```

|      |                                    |
|------|------------------------------------|
| (01) | 2                                  | 
| (02) | Cat is a MAMMAL                    | 
| (03) | 3                                  | 
| (04) | 400                                | 
| (05) | Cat is a MAMMAL Snake is a RAPTILE | 
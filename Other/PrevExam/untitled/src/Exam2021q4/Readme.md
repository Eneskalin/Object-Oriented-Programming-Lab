Find 10 errors in the following Java code. The errors are both compiler and logical errors. For each error,
specify the line number and briefly explain how to fix it. Aşağıdaki Java kodunda 10 hata bulun.
Hatalar hem derleyici hem de mantıksalhatalardır. Her hata için satır numarasını belirtin
 ve nasıl düzeltileceğini kısaca açıklayın.
```
1. public class Patient{
2. private int id;
3. static int counter;
4. private String name;
5. private float temperature=36.5;
6. public static final String doctor="Jone";
7.
8. public patient(String name, double temp,String doctor){
9. this(name,temp,++counter,doctor);
10. }
11. private Patient(String name, float temp,int pId, String doctor){
12. this.name=name;
13. this.temperature= temp;
14. this.id = pId;
15. this.doctor= doctor;
16. }
17. public String getName(){
18. return this.name;
19. }
20. public getId(){
21. return this.id;
22. }
23. @Override
24. public String toString(){
25. return this.id +": name:"+this.name+"; temperature"+this.temperature;
26. }
27. }
28. public class Hospital {
29. static void main(String[] args) {
30.
31. Patient patient1= new Patient("Ahmed", 37.2f, "Jak");
32. System.out.println(patient1);
33. Patient patient2= new Patient("Omer", 37.2f, "Jone");
34. System.out.println(patient2.getName());
35. patient2.name=patient1.name;
36. Patient patient2= new Patient("Ali", 37.2f, "Jan");
37. System.out.println(patient2);
38. System.out.println("number of patients:"Patient.counter);
39. }
40. }
```

 | Line    | Explanation                                                                                                     | Fix                          |
 |---------|:----------------------------------------------------------------------------------------------------------------|------------------------------|
 | Line 8  | double temp is wrong must be float                                                                              | double to float              | 
 | Line 6  | In this line use final keyword so its meaning doctor string is const bu in constructor we want to change string | remove final                 |
 | Line 35 | name is private so not cell directly so patient2.name wrog use capsulation                                      | patient2.getname()           |
 | Line 9  | doctor is a static final                                                                                                           |
 | Line 8  | public patient is wrong patient  must be start  capital                                                         | public Patient               |
 | Line 25 | missing a + before "temperature"                                                                                | temperature: " + this.temperature                             |
 | Line 36 | patient2 object already created                                                                                 | remove or change object name |
 | Line 20 | not write return type                                                                                           | public int getId()           |
 | Line 38 | not use +                                                                                                       | System.out.println("number of patients:"+Patient.counter);|
 
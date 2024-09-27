/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import java.util.Scanner;

/**
 *
 * @author Nehad
 */
class Student{
    String name;
    float midterm;
    float finalExam;
    
    float calcAvg(){
        return midterm*0.4f+finalExam*0.6f;
    }
    
    void printStudentData(){
        System.out.println("Name: "+name+" Average:"+calcAvg());
    }

}
public class Project2 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       Student st1=new Student();
       Student st2=new Student();
       st1.name= input.next();
       st1.midterm=input.nextFloat();
       st1.finalExam=input.nextFloat();
       
       st2.name= input.next();
       st2.midterm=input.nextFloat();
       st2.finalExam=input.nextFloat();
       
       st1.printStudentData();

       st2.printStudentData();
        
    }
}

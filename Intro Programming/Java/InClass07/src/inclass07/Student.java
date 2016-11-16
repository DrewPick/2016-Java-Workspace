package inclass07;

import java.util.*;
/** Student.java
 *  This is the Student Object Class
 *  Drew Pickett
 *  10 - 18 - 2016
 */ 
public class Student {
    
    // Attributes
    private String name;
    private double test1;
    private double test2;
    
    // Constructor
    public Student(String n){
        
        name = n;
        test1 = 0.0;
        test2 = 0.0;
          
    }
    
    // Returns the name of Student
    public String getName(){
        
        return name;
        
    }
    
    // Promt that reads Test Scores
    public void inputGrades(){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter " + name + "'s First Test Grade. "
                + "(EX 98.2)");
        
        test1 = reader.nextDouble();
        
        System.out.println("Please enter " + name + "'s Second Test Grade. "
                + "(EX 78.7)");
        
        test2 = reader.nextDouble();
        
    }
    
    // Returns the average of Student scores
    public double getAverage(){
        
        return (test1 + test2) / 2;
        
    }
    
    // String format for Student
    public String toString(){
        
        return "[ Name: " + name + ", Test1: " + test1 + ", Test2: " + test2
                + " ]";
        
    }
       
}

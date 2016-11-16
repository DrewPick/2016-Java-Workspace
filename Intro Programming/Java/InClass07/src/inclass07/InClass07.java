package inclass07;

/** InClass07.java
 *  This program is for teachers to enter in Students and their test scores to 
 *  find their average
 *  Drew Pickett
 *  10 - 18 -2016
 */
public class InClass07 {

   
    public static void main(String[] args) {
    
        Student drew = new Student("Drew");
        Student jake = new Student("Jake");
        
        // Intro
        System.out.println("Hello!");
        System.out.println("This program is for Teachers to enter in Students and "
                + "their test scores to find their average.");
        
        // Inputs grades
        drew.inputGrades();
        jake.inputGrades();
        
        // Spacer
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("");
        
        // Prints out Students
        System.out.println(drew.toString());
        System.out.println(jake.toString());
        
        // Spacer
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("");
        
        // Prints out averages
        System.out.println("The average for Drew is " + drew.getAverage());
        System.out.println("The average for Jake is " + jake.getAverage());
        
        // Spacer
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("");
        
        // End
        System.out.println("Goodbye.");
        
    }
    
}

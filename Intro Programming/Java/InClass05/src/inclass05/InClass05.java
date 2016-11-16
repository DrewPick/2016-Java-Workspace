package inclass05;

// InClass05.Java
// This program uses simple math to convert Miles into Kilometers
// Drew Pickett
// 9 - 15 - 16

public class InClass05 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variables initialized
        final double MILE_TO_KILO = 1.60935; 
        double marathon = 26.2;
        double halfAthon = 13.1;
       
        // Greets the user
        System.out.println("Hello!");
        System.out.println("");
        
        // Explains what this program is about and gives some examples
        System.out.println("This program converts miles into Kilometers.");
        System.out.println("For example, a marathon is " + marathon * 
                            MILE_TO_KILO + " Kilometers long.");
        System.out.println("Another example would be a half marathon, which is"
                            +", " + halfAthon * MILE_TO_KILO + " Kilometers "
                            + "long.");
        
        
        
    }
    
}

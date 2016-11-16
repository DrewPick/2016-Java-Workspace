
package pa01_calculations;

/** PA01_Calculations.java
 * This program finds the sum, difference and product of 2.3 and 7.8
 * Drew Pickett
 * 9 - 15 - 16 
 */
public class PA01_Calculations {

    public static void main(String[] args) {
        
        // Variables
        double num1 = 2.3;
        double num2 = 7.8;
        double sum = num1 + num2;
        double diff = num2 - num1;
        double product = num1 * num2;
        
        // Introduction to User
        System.out.println("Hello!");
        System.out.println("");
        
        // Summary of the program
        System.out.println("Welcome, this program will find the sum, difference"
                           + ", and product of " + num1 + " and " + num2 + ".");
        
        System.out.println("");
        
        // Output for calculations
        System.out.println("The sum of " + num1 + " and " +num2 + " is " + sum
                           + ".");
        System.out.println("The difference of " + num1 + " and " +num2 + " is " 
                           + diff + ".");
        System.out.println("The product of " + num1 + " and " +num2 + " is " + 
                           product + ".");
        
        // Conclusion
        System.out.println("");
        System.out.println("Goodbye.");
        
        
    }
    
}

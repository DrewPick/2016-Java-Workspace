
package inclass06;

/** InClass06.java
 * Driver Class, This program shows the use of the Object Class Dog.java
 * Drew Pickett
 * 10 - 13 - 2016
 */
public class InClass06 {
    
    public static void main(String[] args) {
        
        // Dog objects created and initialized
        Dog spot = new Dog(5 ,"Spot");
        Dog rover = new Dog(3 ,"Rover");
        Dog fluff = new Dog(1 ,"Fluffy");
        
        // Introductory to user
        System.out.println("Hello,");
        System.out.println("This program creates three Dog objects.");
        System.out.println("Then the program uses important methods from");
        System.out.println("the dog class.");
        
        // Spacer
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println();
        
        // Displays the Dogs age in Human years using the .getHumanYears method
        System.out.println("Spot is " + spot.getHumanYears() + " in Human "
                           + "years.");
        System.out.println("Rover is " + rover.getHumanYears() + " in Human "
                           + "years.");
        System.out.println("Fluffy is " + fluff.getHumanYears() + " in Human "
                           + "years.");
        
        System.out.println();
        
        // Displays the information about all three objects by useing the 
        // .toString method 
        System.out.println(spot.toString());
        System.out.println(rover.toString());
        System.out.println(fluff.toString());
        
        System.out.println();
        
        // Sets spots name to Brutus
        spot.setName("Brutus");
       
        System.out.println("Spot is now " + spot.getName());
        System.out.println(spot.toString());
        
        System.out.println();
        
        System.out.println("Fluffy is now " + fluff.getAge() + " year(s) old.");
        System.out.println(fluff.toString());
        
        
    }
    
}

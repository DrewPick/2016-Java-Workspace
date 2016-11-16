
package exam2;

/** Exam2.java
 * This Driver Class follows the instructions on the Exam by setting up 2 
 * Meeting objects and useing their methods
 * Drew Pickett
 * 11 - 1 - 2016
 */ 
public class Exam2 {
    
    public static void main(String[] args) {
        
        // Makes two Meeting Objects
        Meeting meet1 = new Meeting(8, 224);
        Meeting meet2 = new Meeting(10, 336);
        
        // Prints Meeting Objects
        System.out.println("Meeting 1: " + meet1.toString());
        System.out.println("Meeting 2: " + meet2.toString());
        
        // Uses Meeting.java get methods to print a statement about meeting 2
        System.out.println("Meeting 2 is at " + meet2.getStartTime() + " and "
                + "located in " + meet2.getRoomNum());
        
        // Changes meeting 1 to start at 2
        meet1.setStartTime(2);
        
        // Tells the User meeting 1 had been chaged to 2
        System.out.println("Meeting 1 has been changed to start at " 
                + meet1.getStartTime());
        
        
    }
    
}

/* Tv.java
 * This Program shows how a Object Class is made
 * Drew Pickett
 * 10 - 12 - 2016
 */
package pa05_tvs;
import java.util.*;

public class Tv {
    
    // Attributes, Attributes are Class variables
    int channel = 0;
    String tvName = null;
    Random gen = new Random();
    
    // Constructor, A Constructor creates an object, also parameters can be
    // entered into a Constructor. As an example the varaiable tvName and 
    // channel are set from the initialization of the object
    public Tv(int c, String n){
        
        channel = c;
        tvName = n;
      
    }
    
    // Second Constructor
    public Tv(int c){
        
        channel = c;
        
    }
    
    // Method that sets the varriable channel to a integer
    public void setChannel(int c){
        
        channel = c;
        
    }
    
    // Method that returns the variable channel
    public int getChannel(){
        
        return channel;
        
    }
    
    // Method that returns a random channel 1 - 99
    public int getRandomChannel(){
        
        channel = gen.nextInt(100) + 1;
        return channel;
        
    }
    
    // Method that creates a format and returns all variables of the object
    public String toString(){
        
        return tvName + ": The TV is currently set to channel " + channel;
        
    }
    
    
}

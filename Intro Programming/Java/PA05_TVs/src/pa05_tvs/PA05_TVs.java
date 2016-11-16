
package pa05_tvs;

import java.util.*;

/** PA05.java
 * This program shows you how class interaction is used. It shows how the
 * program uses the Class Tv.java.
 * Drew Pickett
 * 10 - 12 - 2016
 */
public class PA05_TVs {


    public static void main(String[] args) {
        
        // Creates two TV Objects
        Tv tv1 = new Tv(3, "Tv1");
        Tv tv2 = new Tv(24, "Tv2");
        
        // Prints out Tv Objects method .toString
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
       
        System.out.println();
        
        // Spacer
        System.out.println("------------------------------------------");
        
        System.out.println();
        
        // Sets tv1 to channel 99 and tv2 to a random channel
        tv1.setChannel(99);
        tv2.getRandomChannel();
        
        // Prints out Tv Objects method .toString
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        
    }
    
}

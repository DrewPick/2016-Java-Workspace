package pa09_coinflips;

import java.util.*;

/** PA09_CoinFlips.java
 * This program flips a coin 250 times in a for loop and calculates the 
 * percentage of heads and tails
 * @author Drew Pickett
 * 11 - 10 - 2016
 */
public class PA09_CoinFlips {

    public static void main(String[] args) {
        
        // Objects and Variables
        Coin coin = new Coin(); 
        
        final int FLIPS = 250;
        
        int heads = 0;
        int tails = 0;
        
        double headsPerc;
        double tailsPerc;
        
        // Intro
        System.out.println("Welcome, were going to flip a coin 250 times and "
                + "get the percentage of heads and tails");
        
        System.out.println("");
        
        // For loop that flips the coin 250 times
        for(int i = 0; i < FLIPS; i++){
            
            coin.flip();
            
            // Counts heads and tails
            if(coin.isHeads() == true){
                
                heads ++;
                
            }
            else{
               
                tails ++;
                
            }
            
        }
        
        // Obtains percentages
        headsPerc = (heads * 100) / FLIPS;
        tailsPerc = (tails * 100)/ FLIPS;
        
        // Conclusion
        System.out.println("Based on 250 flips of a coin, heads came up " + 
                heads + " times which is " + headsPerc + "% of the time."
                + "\n Tails came up " + tails + " times which is " + tailsPerc +
                "% of the time.");
        
        System.out.println("");
        
        System.out.println("Good bye.");
         
        
    }
    
}

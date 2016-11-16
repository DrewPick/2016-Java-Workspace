package pa07_hilo;

import java.util.*;
import javax.swing.*;
/** HiLo.java
 * This program uses while loops, if and else statements to go through a 
 * guessing game
 * Drew Pickett
 * 11 - 1 - 2016
 */
public class PA07_HiLo {

    public static void main(String[] args) {
        
        // Objects
        Random gen = new Random();
        Scanner reader = new Scanner(System.in);
        
        // String
        String input;
        
        // Integers
        int guess;
        int check;
        int num = gen.nextInt(100) + 1;
        
        // Booleans
        boolean loop1;
        boolean loop2;
        
        // Introduction
        JOptionPane.showMessageDialog(null, "Welcome to the HiLo game!");
        JOptionPane.showMessageDialog(null, "The object of this game is to"
                + " correctly guess a number 1 - 100.");
        JOptionPane.showMessageDialog(null, "Good luck!");
        
        
        // Outer loop
        while(loop1 = true){
            
            // Inner loop
            while(loop2 = true){
                
                input = JOptionPane.showInputDialog("Please enter a number from "
                        + "1 to 100.");
                
                guess = Integer.parseInt(input);
                
                // If the guess is lower than the number 
                if(guess < num){
                    
                    JOptionPane.showMessageDialog(null, "Guess Higher");
                    
                }
                
                // If the guess is higher than the number
                else if(guess > num){
                    
                    JOptionPane.showMessageDialog(null, "Guess Lower");
                    
                }
                
                // If the guess is the number
                else{
                    
                    check = JOptionPane.showConfirmDialog(null, "Correct! Would "
                            + "you like to play another game?");
            
                    // If User selects "Yes"
                    if(check == JOptionPane.YES_OPTION){
                        
                        num = gen.nextInt(100) + 1;
                        loop2 = true;
                     
                    }
            
                    // If User selects "No"
                    else if(check == JOptionPane.NO_OPTION){
                        
                        loop2 = false;
                        break;
                        
                    }
            
                    // If the User selects "Cancel"
                    else{
                    
                        loop2 = false;
                        break;
                        
                    }
                    
                }
                   
            }
            
            check = JOptionPane.showConfirmDialog(null, "Would "
                            + "you like to play another game?");
            
                    // If User selects "Yes"
                    if(check == JOptionPane.YES_OPTION){
                        
                        loop2 = true;
                     
                    }
            
                    // If User selects "No"
                    else if(check == JOptionPane.NO_OPTION){
                        
                        loop2 = false;
                        break;
                        
                    }
            
                    // If the User selects "Cancel"
                    else{
                    
                        loop2 = false;
                        break;
                        
                    }
            
        }
        
        // End of program
        JOptionPane.showMessageDialog(null, "Thank you for playing");
        
        
    }
    
}

package pa08_slotmachine;

import java.util.*;
import javax.swing.*;

/** PA08_SlotMachine.java
 * This programs is a slot machine, it uses three randomly generated numbers
 * and if all 3 numbers are equal to each other then the player wins 
 * @Drew Pickett
 * 11 -10 - 2016
 */
public class PA08_SlotMachine {

    public static void main(String[] args) {
        
        Random gen = new Random();
        
        int check;
        String answer;
        
        int slot1 = 0;
        int slot2 = 0;
        int slot3 = 0;
        
        String name = "";
        
        boolean loop = false;
        boolean loop2 = true;
        boolean jackpot = false;
        
        check = JOptionPane.showConfirmDialog(null, "----- SLOT MACHINE -----"
                + "\n Welcome, ready to play me?");
        
        // If User selects "Yes"
        if(check == JOptionPane.YES_OPTION){
            
            loop = true;
            name = JOptionPane.showInputDialog("Please enter your name:");
            
            if(name.equalsIgnoreCase("sue")){
                
                jackpot = true;
                
            }
            else{
                
                jackpot = false;
                
            }
                     
        }
            
        // If User selects "No"
        else if(check == JOptionPane.NO_OPTION){
                        
            loop = false;
                        
        }
            
        // If the User selects "Cancel"
        else{
                    
            loop = false;
                        
        }
        
        JOptionPane.showMessageDialog(null, "Welcome, " + name);
        
        // Game loop
        while(loop == true){
            
            // Loop for spinning
            while(loop2 == true){
                
                check = JOptionPane.showConfirmDialog(null, "The reels spin..."
                    + "\n Would you like to stop?");
                
                slot1 = gen.nextInt(10) + 1;
                slot2 = gen.nextInt(10) + 1;
                slot3 = gen.nextInt(10) + 1;
            
                if(check == JOptionPane.YES_OPTION){
                
                    loop2 = false;
                
                }
                
            }
            
            // If the professor plays
            if(jackpot == true){
                
                slot1 = gen.nextInt(10) + 1;
                
                JOptionPane.showMessageDialog(null, "[| " + slot1 + " | " + 
                        slot1 + " | " + slot1 + " |]");
                
                check = JOptionPane.showConfirmDialog(null, "JACKPOT!"
                        + "\n Would you like to play again?");
                
                if(check == JOptionPane.YES_OPTION){
                    
                    loop = true;
                    loop2 = true;
                    
                }
                
                else{
                    
                    loop = false;
                    
                }
                
            }
            
            // If professor does not play
            else{
                
                if(slot1 == slot2 && slot1 == slot3){
                    
                    JOptionPane.showMessageDialog(null, "[| " + slot1 + " | " + 
                        slot2 + " | " + slot3 + " |]");
                
                    check = JOptionPane.showConfirmDialog(null, "JACKPOT!"
                        + "\n Would you like to play again?");
                
                    if(check == JOptionPane.YES_OPTION){
                    
                        loop = true;
                    
                    }
                
                    else{
                    
                        loop = false;
                    
                    }
                    
                }
                else{
                    
                    JOptionPane.showMessageDialog(null, "[| " + slot1 + " | " + 
                        slot2 + " | " + slot3 + " |]");
                
                    check = JOptionPane.showConfirmDialog(null, "Bummer"
                        + "\n Would you like to play again?");
                
                    if(check == JOptionPane.YES_OPTION){
                    
                        loop = true;
                        loop2 = true;
                    
                    }
                
                    else{
                    
                        loop = false;
                    
                    }
                    
                }
                   
            }
           
        }
        
        JOptionPane.showMessageDialog(null, "Thanks for playing.");
          
    }
    
}

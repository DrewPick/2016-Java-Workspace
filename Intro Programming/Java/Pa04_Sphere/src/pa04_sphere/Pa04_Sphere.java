
package pa04_sphere;

import java.util.*;
import javax.swing.*;
import java.text.DecimalFormat;

/**
 *
 * @author drewpickett
 */
public class Pa04_Sphere {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Double Variables
        double radius = 0.0;
        double volume;
        double sArea; 
        
        // Integer Variable
        int check;
        
        // String Variables
        String answer;
        String sVolume;
        String sSArea;
        
        // Boolean Variable
        boolean loop = true;
        
        // Objects
        Scanner reader = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#0.0000");
        
        // Introductory to the User
        JOptionPane.showMessageDialog(null,"Hello! This program will give you "
                + "the Volume and Surface Area of a Sphere.");
        
        // Loop to get as many calculations that the User wants
        while(loop = true){
            
            // Gets the Radius from the User
            answer = JOptionPane.showInputDialog("Please enter a Radius. "
                    + "EX: 4.7");
            radius = Double.parseDouble(answer);
        
            // Initializes the Volume and Surface Area for the Sphere
            volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
            sArea = 4 * Math.PI * Math.pow(radius, 2);
        
            // Initializes format for both the Volume and Surface Area
            sVolume = fmt.format(volume);
            sSArea = fmt.format(sArea);
        
            // Displays the Surface Area and Volume of the Sphere.
            JOptionPane.showMessageDialog(null, "Volume of Sphere: " + sVolume
                + "\n" + "Surface Area of Sphere: " + sSArea);
            
            // Checks to continue or end the loop
            check = JOptionPane.showConfirmDialog(null, "Would you like to "
                    + "enter a new Radius?");
            
            // If User selects "Yes"
            if(check == JOptionPane.YES_OPTION){
                loop = true;
            }
            
            // If User selects "No"
            else if(check == JOptionPane.NO_OPTION){
                loop = false;
                break;
            }
            
            // If the User selects "Cancel"
            else{
                loop = false;
                break;
            }
            
        }
        
        // Conclusion to the User
        JOptionPane.showMessageDialog(null, "Goodbye.");
        
        
        
        
    }
    
}

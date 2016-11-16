
package pa06_candysales;

import javax.swing.JOptionPane;
/** PA06_CandySales.java
 * This program is used to enter New sellers and the number of boxes they sold
 *  10 -20 - 16
 * @author drewpickett
 */
public class PA06_CandySales {
    
    public static void main(String[] args) {
        
        String name;
        
        // Intro
        JOptionPane.showMessageDialog(null,"Welcome");
        JOptionPane.showMessageDialog(null,"Please Enter your three sellers names.");
        
        // Obtains Seller names    
        name = JOptionPane.showInputDialog("Seller One:");
        Seller s1 = new Seller(name);
         
        name = JOptionPane.showInputDialog("Seller Two:");
        Seller s2 = new Seller(name);
         
        name = JOptionPane.showInputDialog("Seller Three:");
        Seller s3 = new Seller(name);
         
        int count = 1;
        
        // Enters sales for 2 weeks
        for(int i = 0; i < 1; i++){
             
             JOptionPane.showMessageDialog(null, "Week: " + count ); 
             
             name = JOptionPane.showInputDialog("Enter the number of boxes "
                      + "sold by " + s1.getName() + " this week.");
             s1.updateSales(Integer.parseInt(name));
             
             
             name = JOptionPane.showInputDialog("Enter the number of boxes "
                      + "sold by " + s2.getName() + " this week.");
             s2.updateSales(Integer.parseInt(name));
             
             
             name = JOptionPane.showInputDialog("Enter the number of boxes "
                      + "sold by " + s3.getName() + " this week.");
             s3.updateSales(Integer.parseInt(name));
             
             count ++;
             
             
         }
        
        // Displays total number of boxes sold by all Sellers
        JOptionPane.showMessageDialog(null ,"Total sales of candy"
                + "\n -----------------"
                + "\n "
                + "\n " + s1 +
                "\n " + s2 + 
                "\n " + s3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}

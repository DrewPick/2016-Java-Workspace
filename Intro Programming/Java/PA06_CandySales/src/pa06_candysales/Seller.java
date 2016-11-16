
package pa06_candysales;

/** Seller.java
 *  Object class for an employee with a name and sales
 *  @author Drew Pickett
 *  10 - 20 -16
 */  
public class Seller {
    
    
    String name;
    int boxesSold;
    
    // Constructor
    public Seller(String n){
        
        name = n;
        boxesSold = 0;
       
    }
    
    // Returns the Sellers name
    public String getName(){
        
        return name;
        
    }
    //Sets updated sales 
    public void updateSales(int b){
        
        boxesSold = b;
        
    }
    
    // Returns a format
    public String toString(){
        
        return " " + name + ": " + boxesSold + " boxes of candy.";
        
    } 
    
}





























package inclass06;

/** Dog.java
 * This is an Object Class with simple attributes of a Dog(age and name)
 * Drew Pickett
 * 10 -13 - 2016
 */
public class Dog {
    
    // Attributes
    private int age;
    private String name;
    
    // Constructor
    public Dog(int a, String n){
        
        age = a;
        name = n;
        
    }
    
    // Set Methods
    public void setName(String n){
        
        name = n;
        
    }
    
    public void setAge(int a){
        
        age = a;
       
    }
    
    // Get Methods
    public String  getName(){
        
        return name;
        
    }
    
    public int getAge(){
        
        return age;
        
    }
    
    public int getHumanYears(){
        
        return age * 7;
        
    }
    
    // Method that makes the object into a String
    public String toString(){
        
        return name + " the dog, is " + age + " year(s) old.";
        
    }
      
}

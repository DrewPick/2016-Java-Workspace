
package inclass04;

// InClass04.java
// This program shows another programmer or someone reading the java file how
// escape sequences work, the user will only see what is printed below.
// Drew Pickett
// 9 - 15 - 1

public class InClass04 {

    public static void main(String[] args) {
        
        // String values for Names;
        String fName = "Drew";
        String mName = "Stephen";
        String lName = "Pickett";
        
        // Character values for Initials
        char fInit = 'D';
        char mInit = 'S';
        char lInit = 'P';
        
        // Integer value for Age
        int age = 18;
        
        // Print statements with the use of escape sequences
        System.out.println("My name is " + fName + " " + mName + " " + lName);
        System.out.println("\t" + "My initials are " + "\"" + fInit + " " 
                    + mInit + " " + lInit + "\"");
        System.out.println("\n" + "My age is " + age);
        
    }
    
}

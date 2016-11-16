
package quiz2;

/*
* FortuneCookie.java
* This Object Class is a fortune cookie that give two lucky numbers 
* Drew Pickett
* October 20, 2016
*/


import java.util.Random;



public class FortuneCookie 
{
    //instance data - 2 lucky number for each fortune cookie
    private int luckyNum1;
    private int luckyNum2;
    
    //constructor method - sets initial values for lucky numbers
    public FortuneCookie()
    {
        Random gen = new Random();
        
        luckyNum1 = gen.nextInt(49 - 1) + 1;        //number 1 - 49
        luckyNum2 = gen.nextInt(99 - 50) + 50;        //number 50 - 99
        
    }
    
    //setLuckyNum1 method - changes value of first lucky number
    public void setLuckyNum1(int num)
    {
     
        luckyNum1 = num;
            
    }
    
    //setLuckyNum2 method - changes value of second lucky number
    public void setLuckyNum2(int num)
    {
  
        luckyNum2 = num;
        
    }
    
    //getLuckyNum1 method - returns value of first lucky number
    public int getLuckyNum1()
    {

        return luckyNum1;
        
    }
    
    //getLuckyNum2 method - returns value of second lucky number
    public int getLuckyNum2()
    {

        return luckyNum2;
        
    }
    
    //toString method - one line output of fortune inside cookie
    //should look as follows (lucky numbers will vary): 
    //Your lucky numbers are 11 and 88!
    
    public String toString()
    {
        String output = "Your lucky numbers are " + luckyNum1 + " and "
                + luckyNum2 + "!";
        
        return output;
        
    }
}

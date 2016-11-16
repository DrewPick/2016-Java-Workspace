package quiz2;

/*
* Quiz2.java
* This program makes 3 FortuneCookie Objects for a Cookie Factory
* and uses most of its methods
* Drew Pickett
* October 20, 2016
 */
public class Quiz2 {

    public static void main(String[] args) {
        //instantiate 3 Fortune Cookie objects

        FortuneCookie cookie1 = new FortuneCookie();
        FortuneCookie cookie2 = new FortuneCookie();
        FortuneCookie cookie3 = new FortuneCookie();

        //print header
        System.out.println("Welcome to the Fortune Cookie Factory!");
        System.out.println("----------------------------------------------");

        //print the 3 cookies with a label (ex. Cookie 1: ...)
        System.out.println("");

        System.out.println("Cookie 1: " + cookie1);
        System.out.println("Cookie 2: " + cookie2);
        System.out.println("Cookie 3: " + cookie3);

        System.out.println("");

        //set the first lucky number of the first cookie to 60 and print the updated cookie
        cookie1.setLuckyNum1(60);

        System.out.println("Cookie 1: " + cookie1);

        System.out.println("");

        //set the second lucky number of the second cookie to 24 and print the updated cookie
        cookie2.setLuckyNum2(24);

        System.out.println("Cookie 2: " + cookie2);

        System.out.println("");

        //get the second lucky number of the third cookie and print it as part of a clear statement

        System.out.println("The Second lucky number for Cookie 3 is " 
                + cookie3.getLuckyNum2());

    }

}

import java.io.*;
import java.util.*;

public class Greeter {
    public String happygreeting, sadgreeting;
    // static makes the variable 
    // shared by all instances
    //static private String greeting; 
    
    /* You can initialize instance variables
       when you declare them, like this */
    //private String greeting="Hello"; 

    private String greeting;
    
    public Greeter() 
    {
        happygreeting="Hey";
	sadgreeting="I don't like you";
    }

    public Greeter ( String happy, String sad )
    {
	setHappy (happy);
	setSad (sad);
    }

    /* public Greeter() {
	setGreeting("Hello");
	}*/

    // examples of method overloading
    public void f() {
    }
    public void f(String s) {
    }
    public void f(String s,String s2) {
    }
    public void f(String s,int s2) {
    }
    public void f(int s,String s2) {
    }
    /*
      but this one doesn't work becasue
      we've already used String,String -
      it's about the types, not the names

    public void f(String s2,String s1) {
    }
    */
    

    public void setHappy(String greet) {
	happygreeting = greet;
    }

    public void setSad (String greet) {
	sadgreeting = greet;
    }

    public String happygreet(String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }
    public String sadgreet(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}
/*I looked at Andrew Fisher's code to understand the directions more clearly, and also for some aspects of the code*/

import java.io.*;
import java.util.*;

public class Greeter {

    // static makes the variable 
    // shared by all instances
    //static private String greeting; 
    
    /* You can initialize instance variables
       when you declare them, like this */
    //private String greeting="Hello"; 

    private String greeting, happygreeting, sadgreeting;
    
    public Greeter(String g) {
	setGreeting(g);
    }
    
    public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
    }
    public Greeter() {
	setGreeting("Hello");
	setHappy("Hey");
	setSad("Get lost");
    }

    
    public void setHappy(String greet) {
	happygreeting = greet;
    }

    public void setSad(String greet) {
	sadgreeting = greet;
    }
    public void setGreeting(String greet) {
	greeting = greet;
    }

    public String greet(String name) {
	String message;
	message = greeting + " " + name;
	return message;
    }

    public String happyGreet(String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}

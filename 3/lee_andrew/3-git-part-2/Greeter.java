import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting;
    private String sadgreeting;
    //Instance variable for happygreeting and sadgreeting(both strings)

    public Greeter() {
	happygreeting = "Hello!";
	sadgreeting = "Oh, hi";
    }
    //Constructor with no parameters that gives both reasonable values

    public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
    }
    //Constructor that takes two strings, one for each greeting

    public void setHappy(String greet) {
	happygreeting = greet;
    }
    //setHappy method that returns the happygreeting

    public void setSad(String greet) {
	sadgreeting = greet;
    }
    //setSad method that returns the sadgreeting

    public String happyGreet(String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }
    //happyGreet method that returns the happygreeting 

    public String sadGreet(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
    //sadGreet method that returns the sadgreeting
}
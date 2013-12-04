import java.io.*;
import java.util.*;

public class Greeter {

    //instance variable for happygreeting and sadgreeting (both String)
    private String happygreeting, sadgreeting;

    //constructor with no parameters
    public Greeter() {
	setHappy("Heyyy, how's your day");
	setSad("Don't talk to me");
    }

    //constructor that takes two strings, one for each greeting
    public Greeter(String h, String s) {
	setHappy(h);
	setSad(s);
    }

    //setHappy and setSad methods
    public void setHappy(String greet) {
	happygreeting = greet;
    }
    public void setSad(String greet) {
	sadgreeting = greet;
    }

    //happyGreet and sadGreet method
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

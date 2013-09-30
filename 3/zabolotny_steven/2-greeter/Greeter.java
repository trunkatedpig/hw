import java.io.*;
import java.util.*;

public class Greeter {

    /* We can initialize an instance variable
       when we declare it like this:
    */
    //private String greeting="Go away"; 


    private String greeting;

    private String happygreeting;

    private String sadgreeting;

    public Greeter() {
	happygreeting = "Hi, how are you, ";
	sadgreeting = "Can you go away, ";
    }

    public Greeter(String happy, String sad) {
	happygreeting = happy;
	sadgreeting = sad;
    }

    public Greeter(String g) {
	greeting = g;
    }

    public void setHappy(String happy) {
	happygreeting = happy;
    }

    public void setSad(String sad) {
	sadgreeting = sad;
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
	message = happygreeting + name + "?";
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadgreeting + name + "?";
	return message;
    }
}

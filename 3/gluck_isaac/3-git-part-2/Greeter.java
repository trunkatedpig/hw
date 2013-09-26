import java.io.*;
import java.util.*;

public class Greeter {

    /* We can initialize an instance variable
       when we declare it like this:
    */
    //private String greeting="Go away"; 


    private String greeting;
    private String happyGreeting;
    private String sadGreeting;

    public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
    }

    public Greeter() {
	setHappy("Hey");
	setSad("Piss off");
    }

    public void setHappy(String greet) {
	happyGreeting = greet;
    }
    
    public void setSad(String greet) {
	sadGreeting = greet;
    }

    public String happyGreet(String name) {
	String message;
	message = happyGreeting + " " + name;
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadGreeting  + " " + name;
	return message;
    }


}


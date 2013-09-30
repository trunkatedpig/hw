import java.io.*;
import java.util.*;

public class Greeter {

    /* We can initialize an instance variable
       when we declare it like this:
    */
    //private String greeting="Go away"; 


    private String greeting;
    private String sadGreeting;
    private String happyGreeting;


    public Greeter(String sad, String happy) {
	setSad(sad);
	setHappy(happy);

    }

    public Greeter() {
	setSad("Get away from me");
	setHappy("Heyoooo");
    }
    

    public void setSad(String greet) {
	sadGreeting = greet;
    }

    public void setHappy (String greet){
	happyGreeting = greet;

}

    public String sadgreet(String name) {
	String message;
	message = sadGreeting + " " + name;
	return message;
    }

    public String happygreet(String name) {
	String message;
	message= happyGreeting + " " + name;
	return message;}
}

   



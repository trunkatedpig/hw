import java.io.*;
import java.util.*;

public class Greeter {

    private String happyGreeting;
    private String sadGreeting;
   
    public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
    }

    public Greeter() {
	setHappy("Howdy!");
	setSad("Terrible day,");
    }

    public void setHappy(String greet) {
	happyGreeting = greet;
    }

    public void setSad(String greet) {
	sadGreeting = greet;
    }

    public String happyGreet(String name) {
	String message;
	message = happyGreeting + " " + name + "!";
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadGreeting + " " + name + ".";
	return message;
    }
}

import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting, sadgreeting;
    
    public Greeter() {
	setHappy("I love you");
	setSad("You're my least favorite person");
    }
    
    public void setHappy(String happygreeter){
	happygreeting = happygreeter;
    }

    public void setSad (String sadgreeter){
	sadgreeting = sadgreeter;
    }

    public Greeter(String happy, String sad){
	happygreeting = happy;
	sadgreeting = sad;
    }

    public String happygreet (String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }

    public String sadgreet (String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}


/* Thank you to Brian Guo for helping us understand how to code this */

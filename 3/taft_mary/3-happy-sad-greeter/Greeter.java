import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting;
    private String sadgreeting;

    public void setHappy(String happyGreet) {
	//sets "happygreeting" = "happyGreet"
	happygreeting = happyGreet;
    }

    public void setSad(String sadGreet) {
	//sets "sadgreeting" = "sadGreet"
	sadgreeting = sadGreet;
    }

    public Greeter() {
	//runs "setSad" on something sad
	//runs "setHappy" on something happy
	setHappy("Top o' the mornin' to ya,");
	setSad("You're fired,");
    }

    public Greeter(String happy, String sad) {
	//runs "setHappy" on "happy"
	//runs "setSad" on "sad"
	setHappy(happy);
	setSad(sad);
    }

    public String happyGreet(String name) {
	//creates variable "message" (intended for output)
	//sets "message" = happygreeting+' '+name
	//returns "message"
	String message;
	message = happygreeting+' '+name;
	return message;
    }

    public String sadGreet(String name) {
	//creates variable "message" (intended for output)
	//sets "message" = sadgreeting+' '+name
	//returns "message"
	String message;
	message = sadgreeting+' '+name;
	return message;
    }

}

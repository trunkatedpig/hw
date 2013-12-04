import java.io.*;
import java.util.*;

public class Greeter {


    private String happyGreeting;
	private String sadGreeting;
	//Instance vars for each type of greeting
	
	public Greeter() {
		setHappy("You're a beautiful person,");
		setSad("No one likes you,");
	//Constructor that gives resonable values to each
	}
    
    public Greeter (String greet, String greet2){
		setHappy(greet);
		setSad(greet2);
	// a constructor that takes two strings, one for each greeting
    }

	
    public void setHappy (String happyGreet) { 
	//new method that will set the respective Strings to their parameter values
		happyGreeting = "Happy ";
   }
    
    public void setSad (String sadGreet) { 
	//new method that will set the respective Strings to their parameter values
		sadGreeting = "Sad ";
    }

    public String greet(String person1, String person2) {
	
	String message;
	message = happyGreeting + " " + person1 + "." + "\n" + sadGreeting + person2 + ".";;
	return message;
    }
}

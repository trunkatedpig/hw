import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting;
    public String sadgreeting;
    //an instance variable for happygreeting and sadgreeting
    
    public Greeter() {
	setHappy("happy");
	setSad("sad");
	   
	// a constructor with no parameters that gives both reasonable values
    }
    public Greeter (String greet, String greet2){
	setHappy(greet);
	setSad(greet2);
	// a constructor that takes two strings, one for each greeting
    }

    public void setHappy (String mood1) { //new method that will set the respective Strings to their parameter values
	happygreeting = mood1;
   }
    
    public void setSad (String mood2) { //new method that will set the respective Strings to their parameter values
	sadgreeting = mood2;
    }
     
    public String greet (String name, String name2) {
	String message;
        message = name + " is " + happygreeting + "\n" + name2 + " is " + sadgreeting;
	//created new line
	return message;
	//a happyGreet and sadGreet method that works like greet except returns the happy or sad greeting 
        
    }

    
}

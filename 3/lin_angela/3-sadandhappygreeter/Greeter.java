import java.io.*;
import java.util.*;

public class Greeter {
    // instance variables of Strings
    private String happygreeting, sadgreeting; 
    
    public Greeter() {
	setHappy("HI");
	setSad("hi."); 
    }

 
    public void setHappy(String greet1) {
	happygreeting=greet1;
    }
    public void setSad(String greet2) {
	sadgreeting=greet2;
    }


    public void Greeter() {
	happygreeting="HI";
	sadgreeting="hi.";

    }


    public String greetSad(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
	
    public String greetHappy(String name){
	String message;
	message = happygreeting + " " + name;
	return message;
    }
}


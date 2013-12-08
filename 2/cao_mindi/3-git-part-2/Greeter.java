import java.io.*;
import java.util.*;

public class Greeter {

    // static makes the variable 
    // shared by all instances
    //static private String greeting; 
    
    /* You can initialize instance variables
       when you declare them, like this */
    //private String greeting="Hello"; 

 
    private String happygreeting;
    private String sadgreeting;


    public Greeter(String happy, String sad){
	setHappy(happy);
	setSad(sad);
    }


    public Greeter () {
setHappy(">.<");
setSad("T.TTT");
    }

    public void setHappy(String h){
	happygreeting= h;
}

    public void setSad(String s){
	sadgreeting= s;
}

    public String happyGreet(String name){
	String message;
	message = "I'm feeling " +  happygreeting + " " + name;
	return message;
    }
    public String sadGreet(String name){
	String message;
	message = sadgreeting + " " + name;
	return message;
    }
}

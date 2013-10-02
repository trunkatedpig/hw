import java.io.*;
import java.util.*;

public class Greeter {
    private String greeting, happyGreeting, sadGreeting; 

    public Greeter (){
	//setGreeting ("Hello");
	setHappyGreeting ("This is a wonderful day!");
	setSadGreeting ("Why are you talking to me");
	    }

    /* public void setGreeting (String greet) {
	greeting = greet;
    }*/
    public void setHappyGreeting (String happy){
	happyGreeting = happy;
    }
    public void setSadGreeting (String sad) {
	sadGreeting = sad;
    }

    /*public String greet(String name) {
	String message; 
	message = greeting + " " + name;
	return message; 
	}*/
    public String happyGreet (String name){
	String message;
	message = happyGreeting + " " + name;
	return message;
    }
    public String sadGreet (String name) {
	String message;
	message = sadGreeting + " " + name;
	return message; 
    } 

}

/*I continue to have an error saying:
Exception in thread "main" java.lang.NoSuchMethodError: main
I am unsure as to what to do*/

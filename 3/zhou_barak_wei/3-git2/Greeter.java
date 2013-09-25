import java.io.*;
import java.util.*;

public class Greeter {

    public String greeting; 
	public String happyGreeting;
	public String sadGreeting;
	
	public Greeter() {
	setGreeting("Hi");
	}
	public Greeter(String happyGreet, String sadGreet) {
	setGreeting("Hi");
	setHappy(happyGreet);
	setSad(sadGreet);
	}
   
    public void setGreeting(String greet) {
	greeting = greet;
    }
	
	public void setHappy(String greet) {
	happyGreeting = greet;
	}
	
	public void setSad(String greet) {
	sadGreeting = greet;
	}
	
    public String greet(String name) {
	String message;
	message = greeting + " " + name;
	return message;
    }
	
	public String happyGreet(String name) {
	String message;
	message = happyGreeting + " " + name;
	return message;
	}
	public String sadGreet(String name){
	String message;
	message = sadGreeting + " " + name;
	return message;
	}
}

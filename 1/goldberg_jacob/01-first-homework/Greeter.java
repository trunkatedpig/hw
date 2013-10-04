import java.io.*;
import java.util.*;

public class Greeter {

    // We can initialize instance variables
    // when we declare them
    //private String greeting="default"; 

    private String greeting;
    
    public Greeter(String g) {
	greeting = g;
    }

    public Greeter(){
	setGreeting("Hey");
    {

    public void setGreeting(String greet) {
	greeting = greet;
    }

    public String greet(String name) {
	String message;
	message = greeting + " " + name;
	return message;
    }
}

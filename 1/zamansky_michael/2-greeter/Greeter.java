import java.io.*;
import java.util.*;

public class Greeter {
    
    public String greeting;
    public void setGreeting(String greet) {
	greeting = greet;
//greeting comes first? string = variable
    }

    public String greet(String name) {
//like a function, use greet like a function
	String message;
	message = greeting + " " + name;
	return message;
    }
}
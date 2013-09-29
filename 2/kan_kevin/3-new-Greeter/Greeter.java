import java.io.*;
import java.util.*;

public class Greeter {
    public String greeting;
    
    public Greeter(String g) {
	setHappyGreeting(g);
	setSadGreeting(g);
    }
    public void setSadGreeting(String greet) {
	greeting = greet;
    }
    public void setHappyGreeting(String greet) {
	greeting = greet;
    }
    public String greet(String name) {
	String message;
	message = greeting + " " + name;
	return message;
    }
}

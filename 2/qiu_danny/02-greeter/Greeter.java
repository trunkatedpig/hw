import java.io.*;
import java.util.*;

public class Greeter {

    // static makes the variable 
    // shared by all instances
    //static private String greeting; 
    
    /* You can initialize instance variables
       when you declare them, like this */
    //private String greeting="Hello"; 

    private String greeting;

    public Greeter() {
        double n;
        n = Math.random() * 3;
        if (n < 1) {
            greeting = "What's up";
        }
        else if (n < 2) {
            greeting = "Get lost";
        }
        else {
            greeting = "Hello";
        }
    }

    public Greeter(String g) {
        greeting = g;
    }

    public void setGreeting(String greet) {
        greeting = greet;
    }

    public String greet(String name) {
        String message;
        message = greeting + " " + name;
        return message;
    }
}

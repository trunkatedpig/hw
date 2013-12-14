import java.io.*;
import java.util.*;

public class Greeter {

    private String greeting;
    private String sadgreeting;
    private String happygreeting;


    public Greeter(String x, String y) {
        sethappyGreeting(x);
        setsadGreeting(y);
    }

    public Greeter() {
        setGreeting("hello");
        setsadGreeting("QQ");
        sethappyGreeting("Yo!");
    }

    public void setGreeting (String greet) {
        greeting = greet;
    }

    public void sethappyGreeting (String greet) {
        happygreeting = greet;
    }

    public void setsadGreeting (String greet) {
        sadgreeting = greet;
    }

    public String greet (String name) {
        String message;
        message = greeting + " " + name;
        return message;
    }

    public String sadgreet (String name) {
        String message;
        message = sadgreeting + " " + name;
        return message;
    }

    public String happygreet (String name) {
        String message;
        message = happygreeting + " " + name;
        return message;
    }
}

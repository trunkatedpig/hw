import java.io.*;
import java.util.*;

public class Greeter {

    public Greeter() {
	happyGreeting = "What lovely weather we're having today";
	sadGreeting = "I hate you";
    }

    public Greeter(String happy, String sad) {
	happyGreeting = happy;
	sadGreeting = sad;
    }

    private String happyGreeting, sadGreeting; 


    public void setHappy(String happy) {
	happyGreeting = happy;
    }

    public void setSad(String sad) {
	sadGreeting = sad;
    }

    public String happyGreet(String name) {
	String message;
	message = happyGreeting + " " + name;
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadGreeting + " " + name;
	return message;
    }
}

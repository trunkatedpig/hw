import java.io.*;
import java.util.*;

public class Greeter {

    /* We can initialize an instance variable
       when we declare it like this:
    */
    //private String greeting="Go away";
    //private String greeting;

    /*public Greeter(String g) {
	setGreeting(g);
    }

    public Greeter() {
	setGreeting("Hello");
    }

    /*public void setGreeting(String greet) {
	greeting = greet;
    }

     public String greet(String name) {
		String message;
		message = greeting + " " + name;
		return message;
    }
    */

    private String happyGreeting;
    private String sadGreeting;

	public Greeter(){
		happyGreeting = "Welcome";
		sadGreeting = "Leave me alone";
		}

	public Greeter(String happyGreeting, String sadGreeting) {
		setHappy(happyGreeting);
		setSad(sadGreeting);
		}

	public void setHappy(String happyGreet) {
		happyGreeting = happyGreet;
	}

	public void setSad (String sadGreet) {
		sadGreeting = sadGreet;
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


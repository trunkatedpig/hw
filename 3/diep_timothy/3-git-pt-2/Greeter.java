import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting,sadgreeting; 

    public Greeter() {
	happygreeting = "Welcome";
	sadgreeting = "Begone";
    }	

    public Greeter(String happygreeting, String sadgreeting) {
	setHappy(happygreeting);
	setSad(sadgreeting);
    }

    public void setHappy(String happygreet) {
	happygreeting = happygreet;
    }

    public void setSad(String sadgreet) {
	sadgreeting = sadgreet;
    }

    public String happyGreet(String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }

    public String sadGreet(String name) {
	String message;
	message = sadgreeting + " " + name;
	return message;
    }

}


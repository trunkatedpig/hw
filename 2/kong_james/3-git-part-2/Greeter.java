import java.io.*;
import java.util.*;

public class Greeter {
    public String happygreeting,sadgreeting;
    public Greeter() {
	setHappy ("Hello, today is a good day,");
	setSad ("Hey, today is a bad day,");
    }

    public Greeter (String h, String s){
	setHappy(h);
	setSad(s);
    }

    public void setHappy(String h) {
	happygreeting = h;
    }

    public void setSad(String s) {
	sadgreeting = s;
    }
    
    public String happyGreet(String name){
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

import java.io.*;
import java.util.*;

public class Greeter {

    private String happy,sad;
    public String greeting;
    public Greeter() {
    	setGreeting("I like you,","I hate you,");
     }
    public void setGreeting(String h,String s){
	happy = h;
	sad = s;
    }
    public String happygreet(String name){
	String message;
	message = happy + " " + name + ".";
	return message;
    }
    public String sadgreet(String name){
	String message;
	message = sad + " " + name + ".";
	return message;
    }
}


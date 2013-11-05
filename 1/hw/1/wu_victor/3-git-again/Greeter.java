import java.io.*;
import java.util.*;

public class Greeter {

    private String sadGreeting;
    private String happyGreeting;
 
    
    public Greeter(String hg, String sg) {
	setSad(sg);
        setHappy(hg);
    }
   
    public Greeter() {
	setSad("Go away");
        setHappy("Welcome");
    }
    
    public void setSad(String sad) {
	sadGreeting = sad;
    }
    public void setHappy(String happy) {
        happyGreeting = happy;
    }

    public String sadGreet(String name) {
	String smessage;
	smessage = sadGreeting + " " + name;
	return smessage;
    }
    public String happyGreet(String name) {
	String hmessage;
	hmessage = happyGreeting + " " + name;
	return hmessage;
    }

}

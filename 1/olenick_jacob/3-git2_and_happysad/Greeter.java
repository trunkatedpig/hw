import java.io.*;
import java.util.*;

public class Greeter {
    
    private String happygreeting,sadgreeting;
    
     public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
    }

    public Greeter() {
	setHappy("Why hello");
       	setSad ("What is it");
    }

    public void setHappy(String h) {
	happygreeting  = h;
    }

    public void setSad (String s) {
	sadgreeting = s;
    }

    public String happyGreet(String name) {
	String message;
	message = happygreeting + ", " + name + "!";
	return message;
    }

    public String sadGreet (String name) {
	String message;
	message = sadgreeting + ", " + name + "?";
	return message;
    }
}

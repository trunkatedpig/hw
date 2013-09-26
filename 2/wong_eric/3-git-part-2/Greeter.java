import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting,sadgreeting;
    
    public Greeter() {
	setHappy("Welcome");
	setSad("Oh, hello");
    }
    public Greeter(String h,String s) {
	setHappy(h);
	setSad(s);
    }

    public void setHappy(String greet) {
	happygreeting = greet;
    }
    public void setSad(String greet) {
	sadgreeting = greet;
    }

    public String happyGreet(String name) {
	String happy;
	happy = happygreeting + " " + name;
	return happy;
    }
    public String sadGreet(String name) {
	String sad;
	sad = sadgreeting + " " + name;
	return sad;
    }
}

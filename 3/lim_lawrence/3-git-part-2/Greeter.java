import java.io.*;
import java.util.*;

public class Greeter {
    public String happygreeting;
    public String sadgreeting;

    public Greeter() {
	happygreeting = "ohaidere";
	sadgreeting = "not you again";
    }

    public Greeter(String happy, String sad) {
	happygreeting = happy;
	sadgreeting = sad;
    }	
    
    public void setHappy(String happy) {
	happygreeting = happy;
    }

    public void setSad(String sad) {
	sadgreeting = sad;
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

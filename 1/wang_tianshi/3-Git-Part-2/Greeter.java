import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting, sadgreeting;
    
    public Greeter() {
	setHappy("Please be in my face");
	setSad("Get out of my face");
    }

    public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
    }

    public void setHappy(String happy) {
	happygreeting = happy;
    }

    public void setSad(String sad) {
	sadgreeting = sad;
    }

    public String happyGreet(String name) {
	String msg;
	msg = happygreeting + " " + name + "!";
	return msg;
    }

    public String sadGreet(String name) {
	String msg;
	msg = sadgreeting + " " + name + "!";
	return msg;
    }
}

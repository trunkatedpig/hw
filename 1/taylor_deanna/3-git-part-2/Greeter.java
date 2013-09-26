import java.io.*;
import java.util.*;

public class Greeter {
    public String greeting;
    public String happygreeting;
    public String sadgreeting;

    /*  public String greeter(String Happygreeting, String Sadgreeting) {
	setHappygreeting("I'm happy");
	setSadgreeting("I'm sad");
	} */

    /* public greeter(String... (sad); } coded with help from Isaac Gluck's code */

    public void greeter() {
	setHappy("I love your tie");
	setSad("you're ugly");
    }

    public void setHappy(String arg1) {
	happygreeting = arg1;
    }

    public void setSad(String arg2) {
	sadgreeting = arg2;
    }

    public String greethappy(String name1) {
	String message;
	message = happygreeting + " " + name1;
	return message;
    }

    public String greetsad(String name2) {
	String message2;
        message2 = sadgreeting + " " + name2;
	return message2;
    }
}

   

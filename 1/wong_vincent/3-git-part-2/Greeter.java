import java.io.*;
import java.util.*;

public class Greeter {

    public String happygreeting;
    public String sadgreeting;
    /* 2. change public to private,
       test, then change back 
    */


    /* 3. change public to private,
       test, then change back 
    */

    public Greeter (String g, String g2) {
	happygreeting = g;
	sadgreeting = g2;
    }
    
    public Greeter() {
	happygreeting = "Hi";
	sadgreeting = "I don't want to talk";
    }	

    public void setHappy(String greet) {
	happygreeting = greet;
    }

    public void setSad(String greet) {
	sadgreeting = greet;
    }

    public String happyGreet(String name) {
	String message;
	message = happygreeting + " " + name;
	return message;
    }
    
    public String sadGreet (String name) {
	String message;
	message = sadgreeting + " " + name;
        return message;
    }
}

import java.io.*;
import java.util.*;

public class Greeter {

    private String happygreeting;
    private String sadgreeting;

    /* 2. change public to private,
       test, then change back 
    */


    /* 3. change public to private,
       test, then change back 
    */

    public Greeter(){
	setHappy("Good day");
	setSad("Go away");
    }

    public void setHappy(String name) {
	happygreeting = name;
    }
    public void setSad(String name) {
	sadgreeting = name;
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

import java.io.*;
import java.util.*;

public class Greeter {

    public String happyG, sadG; 
    /* 2. change public to private,
       test, then change back 
    */


    /* 3. change public to private,
       test, then change back 
    */
    public Greeter() {
	happyG = "Hello friend";
	sadG= "Ewwwww you nasty";
	    }
    public Greeter(String h, String s) {
	happyGreeting(h);
	sadGreeting(s);
	    }
    
    public void happyGreeting(String hgreet) {
	happyG  = hgreet;
    }
    
    public void sadGreeting(String sgreet) {
	sadG=sgreet;
    }
    public String happyGreet(String name) {
	String message;
	message = happyG+ " " + name;
        return message;
	    } 
    public String sadGreet(String name) {
	String message;
	message = sadG + " " + name;
	return message;
    }
}
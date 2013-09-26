import java.io.*;
import java.util.*;

public class Greeter {
    public String greeting;
    public String greeting2;
    public String happygreeting;
    public String sadgreeting;

    public Greeter (){
         setHappy( "You look fantastic");
	 setSad( "Slap yourself");
    }

    public Greeter (String sad, String happy){
	greeting2 = sad;
	greeting = happy;

    }

    public void setHappy (String greet){
	greeting = greet;
    }

    public void setSad (String greet2){
	greeting2 = greet2;
    }

    public String sadgreet (String name) {
	String message;
	message = greeting2 + " " + name;
	return message;

    }

    public String happygreet (String name) {
	String message;
	message = greeting + " " + name;
	    return message;
    }
}



/* Partners of Deanna and Thomas */

/* Eugene helped fix the stylistic errors from copying over from Google Docs */

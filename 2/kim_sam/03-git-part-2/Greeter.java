import java.io.*;
import java.util.*;

public class Greeter {
    public String happygreeting;
    public String sadgreeting;

	public Greeter (){
	sethappy ("Happy");
	setsad ("Sad");
	    }

    public void sethappy (String happygreet) {
	happygreeting = happygreet;
    }
    public void setsad (String sadgreet) {
	sadgreeting = sadgreet;
    }
    public String greet(String name1, String name2) {
	String message;
	message = name1 + " is " + happygreeting + "\n" + name2 + " is " + sadgreeting;
	return message;
    }
  

    public Greeter (String greet, String greet2) {
	sethappy (greet);
	setsad (greet2);
    }
}
//referened james chen's homework for the last part
/*  private String greeting;
    public Greeter(String g) {
	greeting=g; }
    public void setGreeting(String greet) {
	greeting = greet; }

    public String greet(String name) {
	String message;
	message = greeting + " " + name;
	return message;
    }
}
*/

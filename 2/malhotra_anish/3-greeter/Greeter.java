import java.io.*;
import java.util.*;

public class Greeter {

    public String hgreeting;
    public String sgreeting;
    
    
    public Greeter(String g, String s) {
	setHappy(g);
	setSad(s);
 }

    public Greeter() {
	setHappy("Hello");
	setSad("Go away I hate you");
}

    public void setHappy(String greet) {
	hgreeting = greet;
}
    public void setSad(String greet) {
	sgreeting = greet;
    }
    public String greet(String name) {
	String message;
	message = hgreeting + " " + name;
	return message;
}
    public String greet2(String name) {
	String message;
	message= sgreeting + " " + name;
	return message; }

}
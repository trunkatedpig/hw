import java.io.*;
import java.util.*;

public class Greeter {
    
    private String happygreeting;
    private String sadgreeting;

    public void setHappy(String happyGreet) {
	happygreeting = happyGreet;
    }

    public void setSad(String sadGreet) {
	sadgreeting = sadGreet;
    }

    public Greeter() {
	setHappy("NO SCHOOL TODAY,");
	setSad("You have 5 tests, 2 projects, and a book report due tomorrow,");
    }

    public Greeter(String happy, String sad) {
	setHappy(happy);
	setSad(sad);
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

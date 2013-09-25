import java.io.*;
import java.util.*;

public class Greeter {
	public String happygreeting, sadgreeting;
	public Greeter() {
		setHappy("Hi, how are you");
		setSad("Leave me alone");
	}
	/*
	just in case Greeter is only given one argument
	public Greeter(String greeter) {
		setHappy(greeter); 
		setSad("Leave me alone"); 
	}
	*/
	public Greeter(String happy, String sad) {
		setHappy(happy); 
		setSad(sad); 
	}
	public void setHappy(String happy){
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
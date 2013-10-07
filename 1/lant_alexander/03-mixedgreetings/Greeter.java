import java.io.*;
import java.util.*;

public class Greeter {
	private String happygreeting,sadgreeting;
	
	// As usual I can't read properly. Disregard the block commented code.
	/*
	public happyGreeter() {
		setHappy("My what a beautiful day it is");
	}
	public happyGreeter(String g) {
		setHappy(g);
	}
	public sadGreeter() {
		setSad("if you don't stop running me, I swear to god");
	}
	*/

	public Greeter() {
		setHappy("I love you");
		setSad("I hate you");
	}
	
	public Greeter(String h, String s) {
		setHappy(h);
		setSad(s);
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
	
	public String sadGreet(String name) {
		String message;
		message = sadgreeting + " " + name;
		return message;
	}
}

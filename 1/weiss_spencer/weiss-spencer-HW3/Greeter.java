import java.io.*;
import java.util.*;

public class Greeter {
	private String happygreeting,sadgreeting;

	public Greeter() {
		setHappy("I like you");
		setSad("I don't particularly like you");
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


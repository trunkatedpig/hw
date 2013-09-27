import java.io.*;
import java.util.*;

public class Greeter  {
	public String happygreeting, sadgreeting;

	public Greeter() {
		setHappy("Hi");
		setSad ("You Suck");
	}

	public Greeter(String h, String s){
		setHappy(h);
		setSad (s);
	}

	public void setHappy (String greet) {
		happygreeting  = greet;
	}

	public void setSad (String greet) {
		sadgreeting = greet;
	}

	public String happyGreet (String name) {
		String result;
		result = happygreeting + " " + name;
		return result;
	}

	public String sadGreet (String name) {
		String result;
		result = sadgreeting + " " + name;
		return result;
	}
}

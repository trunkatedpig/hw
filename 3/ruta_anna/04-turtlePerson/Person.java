import java.io.*;
import java.util.*;

public class Person {

	private String name;
	private Turtle turtle;

/* Creation of 1 construtor that can call the Person method */

	public Person(String n) {
		setName(n);
	}

/* Gives the intance variables a value */

	public void setName(String n) {
		name = n;
	}

	public void setTurtle(Turtle t) {
		turtle = t;
	}

/* Set basic get methods */

	public String getName() {
		return name;
	}

	public Turtle getPet() {
		return turtle;
	}

	public int getTurtleSpeed() {
		return turtle.getSpeed();
	}
}
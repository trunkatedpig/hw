import java.io.*;
import java.util.*;

public class Person {

    private String name2;
    private Turtle Turtle;

    public void setTurtle (Turtle t) {
	Turtle = t;
    }

    public Turtle getPet() {
	return Turtle;
    }

    public String getTurtleName() {
	return Turtle.getName();
    }

    public int getTurtleSpeed() {
	return Turtle.getSpeed();
    }

    public int getTurtleAge() {
	return Turtle.getAge();
    }

}

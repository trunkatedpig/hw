import java.io.*;
import java.util.*;

public class Person {

    private String name;
    private Turtle turtle;

    public Person(String n) {
        name = n;
    }
    public void setTurtle(Turtle myturtle) {
	turtle = myturtle;
    }
    public int getTurtleSpeed() {
	return turtle.getSpeed();
    }
    public Turtle getPet() {
	return turtle;
    }
}

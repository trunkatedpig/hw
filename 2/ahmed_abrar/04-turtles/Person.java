import java.io.*;
import java.util.*;

public class Person {
    public String name;
    public turtles turtle;
    
    public Person (String name) {
	name = "Name";
    }

    public void setTurtle (turtles t) {
	turtle = t;
    }

    public turtles getpet() {
	return turtle;
    }

    public int getTurtleSpeed() {
	return turtle.getSpeed();
    }





}

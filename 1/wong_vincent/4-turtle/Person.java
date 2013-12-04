import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private Turtle turtle;


    //constructor that accepts only name
    public Person (String z) {
	name = z;
    }

    //method that 
    public void setTurtle(Turtle t) {
        turtle = t;
    }

    //method that return's person's name
    public String getPersonName() {
	return name;
    }

    //method that 
    public Turtle getPet() {
	return turtle;
    }

    //method that 
    public int getTurtleSpeed() {
    	return turtle.getspeed();
    }
}
	

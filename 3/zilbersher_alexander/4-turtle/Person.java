import java.io.*;
import java.util.*;

//create person class
public class Person {

    //add name and turtle variables
    public String name;
    public Turtle turtle;

    //write method to store a previous turtle as this turtle
    public void setTurtle(Turtle t) {
	turtle = t;
    }
    
    //write method to return the turtle
    public Turtle getPet() {
	return turtle;
    }

    //write method to return turtle's speed
    public int getTurtleSpeed() {
	return turtle.getSpeed();
    }
}
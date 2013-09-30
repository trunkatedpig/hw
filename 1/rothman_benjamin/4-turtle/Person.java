import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private Turtle turtle;

    public Person(String name, Turtle t) {
	setName(name);
	setTurtle(t);
    }

    public void setName (String n){
	name= n;
    }

    public String getName(){
	return name;
    }

    public void setTurtle(Turtle t) {
	turtle=t;
    }
    public Turtle getPet() {
	return turtle;
    }
    
    public int getTurtleSpeed() {
	return turtle.getSpeed();
    }
}

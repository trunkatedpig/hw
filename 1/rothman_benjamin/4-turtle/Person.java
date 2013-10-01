import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private Turtle pet;

    public Person(String name) {
	setName(name);
	setTurtle();
    }

    public void setName (String n){
	name= n;
    }

    public String getName(){
	return name;
    }

    public void setTurtle(Turtle t) {
        pet = t;
    }

    public Turtle getPet() {
	return turtle;
    }
    
    public int getTurtleSpeed() {
	return turtle.getSpeed();
    }
}

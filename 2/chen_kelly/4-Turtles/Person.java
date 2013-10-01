//Tina Lee and Kelly Chen

import java.io.*;
import java.util.*;

public class Person{
    //INSTANCE VARIABLES
    private String name;
    private Turtle turtle;


    //CONSTRUCTORS
    public Person(String n){
    name = n;
    }

    //METHODS
    public void setTurtle(Turtle t){
	turtle = t;
	}

    public Turtle getPet(){
	return turtle;
    }

    public int getTurtleSpeed(){
	return turtle.getSpeed();
    }
}

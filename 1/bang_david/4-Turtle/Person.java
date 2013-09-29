import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private Turtle turtle;
    
    public Person (String name2) {
	name = name2;
    }

    public void setTurtle (Turtle t) {
	turtle = t;
    }
    
    public Turtle getPet () {
	return turtle;
    }

    public int getTurtleSpeed () {
	return turtle.getSpeed ();
    }
}
    
	
    

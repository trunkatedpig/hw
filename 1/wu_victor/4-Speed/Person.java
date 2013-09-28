import java.io.*;
import java.util.*;

public class Person {
    
    private String name;
    private Turtle turt;

    public Person (String n) {
	name = n;
    }

    public void setTurtle (Turtle t) {
	turt = t;
    }

    public String getName () {
	String n;
	n = name;
	return n;
    }
    
    public String getPet () {
	String name;
	name = turt.gName();
	return name;
    }

    public int getTurtleSpeed () {
	int speed;
	speed = turt.gSpeed();
	return speed;
    }

    
}

import java.io.*;
import java.util.*;

public class Person {
    String name;
    Turtle turtle;
   
    public Person(String n) {
	name = n;
	turtle = new Turtle();
    }      
    public void setTurtle (Turtle t) {
        turtle = t;
    }
    public Turtle getPet() {
        return turtle;
    }
    public int getTurtleSpeed() {
	   return turtle.getSpeed();
    }
}

import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private Turtle turtle;

    //construct
    public Person() {
	setName("Bob");
    }
    public Person(String n) {
	setName(n);
    }

    //get
    public String getName() {return name;}
    public Turtle getPet() {return turtle;}
    public int getTurtleSpeed() {return getPet().getSpeed();}
    //set
    public void setName(String n){name=n;}
    public void setTurtle(Turtle t) {turtle=t;}
}

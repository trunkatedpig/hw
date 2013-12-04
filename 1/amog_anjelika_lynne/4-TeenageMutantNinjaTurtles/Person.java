import java.io.*;
import java.util.*;

public class Person {
    private String name;
    private Turtle TMNT;
    public Person(){
	name = "Splinter";
    }
    public Person(String n){
	name = n;
    }
    public void setTurtle(Turtle t){
	TMNT = t;
    }
    public Turtle getApprentice(){
	return TMNT;
    }
    public int getTurtleSpeed(){
	return TMNT.getSpeed();
    }

    public String getName(){
	return name;
    }
}
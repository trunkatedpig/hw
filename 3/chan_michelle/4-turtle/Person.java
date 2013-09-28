import java.io.*;
import java.util.*;


public class Person{

    public String name;
    public Turtle thing;


    public void giveName(String n){
	name=n;
    }

    public void setTurtle(Turtle t){
	thing=t;
    }

    public Turtle getPet(){
	return thing;
    }

    public int getTurtleSpeed(){
	return thing.getSpeed();
	    }
}

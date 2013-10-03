import java.io.*;
import java.util.*;

public class Person{
    private String name;
    private Turtle sweyn;

    public Person(String n){
	name = n;
    }
    
    public void setTurtle(Turtle t){
	sweyn = t;
    }

    public Turtle getPet(){
	return sweyn;
    }

    public int getTurtleSpeed(){
	return sweyn.getSpeed();
    }

}

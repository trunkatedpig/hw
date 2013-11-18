import java.io.*;
import java.util.*;

<<<<<<< HEAD
public class Person {
    private String name;
    private class Turtle;

    public void setName(String n){
	name = n;
    }

    public Person(String n){
        setName(n);
    }

    public void setTurtle(Turtle t){
	
}

    //Not completed. Will continue trying to figure it out
=======
public class Person{
    private String name;
    private Turtle sweyn;

    public Person(String n){
	name = n;
    }
    
    public void setTurtle(Turtle t){
	sweyn = t;
    }

    public Turtle getPet() {
	return sweyn;
    }

    public int getTurtleSpeed() {
	return sweyn.getSpeed();
    }

}
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3

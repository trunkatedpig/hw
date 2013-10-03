import java.io.*;
import java.util.*;

//create turtle class
public class Turtle {

    //set string for name and ints age and speed
    private String name;
    private int age, speed;

    //CONSTRUCTORS:

    //create a basic parameterless turtle, do not put void
    public Turtle() {
	name = "basic turtle";
	age = 1;
	speed = 1;
    }
    
    //create a turtle with a name input and 
    //reasonable age and speed
    public Turtle(String n) {
	name = n;
	age = 2;
	speed = 3;
    }

    //create a turtle with all variables able to be set
    public Turtle(String n, int a, int s) {
	name = n;
	age = a;
	speed = s;
    }

    //METHODS:

    public void speedUp(int n) {
	speed += n;
    }

    public void slowDown(int n) {
	speed -= n;
    }

    public void getOlder() {
	age += 1;
    }

    //get methods for all variables
    //(note that it needs String or int beforehand)
    
    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }

    public int getSpeed() {
	return speed;
    }
}
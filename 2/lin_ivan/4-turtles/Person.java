import java.io.*;
import java.util.*;

public class Person {
  //Instance Variables;
    private String name;
    private Turtles pet;

    //Constructors
    public Person (String n) {
	name = n;
    }

    //Methods
    public void setTurtle(Turtles t) {
	pet = t;
    }
  
    public Turtles getPet() {
	return pet;
    }
  
    public int getTurtleSpeed() {
	return pet.getSpeed();
    }

}

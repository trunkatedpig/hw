import java.io.*;
import java.util.*;

//Worked with Terrance Liang

public class Person {
    public String name;
    public Turtle pet;

    public Person(String n) {
	name = n;
    }

    public void setTurtle (Turtle t){
	pet = t;
    }

    public String getName (){
	return name;
    }

    public Turtle getPet(){
	return pet;
    }

    public int getTurtleSpeed(){
	return pet.getSpeed();
    }
}

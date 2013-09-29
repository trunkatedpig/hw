import java.io.*;
import java.util.*;

//Worked with Eric Wong

public class Human {
    public String name;
    public Turtle pet;

    public Human(String n) {
	name = n;
    }

    public void setTurtle (Turtle t){
	pet = t;
    }
    
    public Turtle getPet(){
	return pet;
    }

    public int getTurtleSpeed(){
	return pet.getSpeed();
    }
}

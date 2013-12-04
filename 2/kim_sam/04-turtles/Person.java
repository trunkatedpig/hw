//Worked with Andrew Fischer
///Help from Danny Qiu's code.

import java.io.*;
import java.util.*;

public class Person { //person class
    
    private String name;  //name string variable
    private Turtle pet;   //pet turtle variable

    public Person(String n) { 
		name = n;
    }

    public void setTurtle(Turtle t) {   //method
        pet = t;
    }

    public String getOwnerName() { //meethod returns the name of the turtle
        return name;
    }

    public Turtle getPet() {  //returns the turtle
        return pet;
    }

    public int getTurtleSpeed() { //returns the speed of a persons pet turtle
        return pet.getSpeed();
    }
}
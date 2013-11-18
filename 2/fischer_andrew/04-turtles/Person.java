//Worked with Sam Kim
///Help from Danny Qiu's code.

import java.io.*;
import java.util.*;

public class Person { //person class
    
    /*like this*/
    //Instance Vars
    private String name;  //name string variable
    private Turtle pet;   //pet turtle variable


   
    //constructor
    public Person(String n) { 
		name = n;
    }


    //Methods
    public void setTurtle(Turtle t) {   
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

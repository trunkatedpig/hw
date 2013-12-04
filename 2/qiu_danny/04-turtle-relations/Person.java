// Worked with Jane Chen

import java.io.*;
import java.util.*;

public class Person {
    
    private String name;
    private Turtle pet;

    public Person(String n) {
        name = n;
    }

    public void setTurtle(Turtle t) {
        pet = t;
    }

    public String getPersonName() { 
        return name;
    }

    public Turtle getPet() {
        return pet;
    }

    public int getTurtleSpeed() {
        return pet.getSpeed();
    }
}

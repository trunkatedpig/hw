import java.io.*;
import java.util.*;

public class Person {
    public String name;
    public Turtle pet;

    public Person(String n) {
	name = n;
    }

    public void setTurtle(Turtle t) {
	pet = t;
    }

    public Turtle getPet() {
	return pet;
    }

    public int getTurtleSpeed() {
	return pet.speed;
    }
}

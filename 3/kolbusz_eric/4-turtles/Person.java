import java.io.*;
import java.util.*;

public class Person {
    String name;
    Turtle turtle;

    public Person(String n) {
        setName(n);
    }

    public void setName(String n) {
        name = n;
    }

    public void setTurtle(Turtle t) {
        turtle = t;
    }

    public Turtle getPet() {
        return turtle;
    }

    public int getTurtleSpeed() {
        return turtle.getSpeed();
    }

}


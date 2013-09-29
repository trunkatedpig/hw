import java.io.*;
import java.util.*;

public class Human {
    public String name;
    public Turtle turtle;

    public Human(String n) {
	name = n;
    }

    public void setTurtle(Turtle t) {
	turtle = t;
    }
}
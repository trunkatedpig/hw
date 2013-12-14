import java.io.*;
import java.util.*;

public class Person {
    
    public String name;
    public Turtle turtle;

    public void setName (String n) {
	name = n;
    }

    public Person(String name){
	setName(name);
	Turtle a;
	a = new Turtle();
	setTurtle(a);
    }
    
    public void setTurtle(Turtle t){
	turtle = t;
    }

    public Turtle getPet() {
	return turtle;
    }

    public int getTurtleSpeed(){
	Turtle x;
	x = getPet();
	return (x.returnspeed());
    }
}
	

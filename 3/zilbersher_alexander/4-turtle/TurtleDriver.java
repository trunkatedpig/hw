import java.io.*;
import java.util.*;

//State class
public class TurtleDriver {
    //State line in all Driver classes
    public static void main(String[] args) {
	//Create new turtle
	Turtle t1 = new Turtle(); 
	 
	//test names of basic parameterless turtle
	System.out.println("Basic Turtle: ");
	System.out.println("Name: " + t1.getName());
	System.out.println("Age: " + t1.getAge());
	System.out.println("Speed: " + t1.getSpeed());

	//test turtle with name
	Turtle t2 = new Turtle("Josh");

	System.out.println("Turtle with name: ");
	System.out.println("Name: " + t2.getName());
	System.out.println("Age: " + t2.getAge());
	System.out.println("Speed: " + t2.getSpeed());

	//test custom turtle
	Turtle t3 = new Turtle("Tucker", 12, 15);

	System.out.println("Custom Turtle with set parameters Tucker, 12, 15: ");
	System.out.println("Name: " + t3.getName());
	System.out.println("Age: " + t3.getAge());
	System.out.println("Speed: " + t3.getSpeed());

	//test altered turtle
	t3.speedUp(5);
	t3.slowDown(3);
	t3.getOlder();

	System.out.println("Tucker with speedUp 5, slowDown 3 and getOlder: ");
	System.out.println("Name: " + t3.getName());
	System.out.println("Age: " + t3.getAge());
	System.out.println("Speed: " + t3.getSpeed());

	//test person
	Person p1 = new Person();
	p1.setTurtle(t2);
	 
	System.out.println("Person's turtle is " + p1.getPet().getName());
	System.out.println("Person's turtle's speed is " + p1.getTurtleSpeed());
    }
}
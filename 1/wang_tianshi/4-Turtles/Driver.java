import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Turtle t, t1, t2;

	t = new Turtle();
	System.out.println(t.turtleName()+ " is " + String.valueOf(t.turtleAge()) + " years old.");
	System.out.println(t.turtleName()+ " crawls at a rate of " + String.valueOf(t.turtleSpeed())+ " meters per minute.");

	t1 = new Turtle("Tyler Wang");
	System.out.println(t1.turtleName() + " is a very handsome " + String.valueOf(t1.turtleAge())+ " year old turtle.");
	System.out.println(t1.turtleName()+ " crawls at a rate of " + String.valueOf(t1.turtleSpeed())+ " meters per minute.");

	t2 = new Turtle("Doublelift", 20, 9001);
	System.out.println(t2.turtleName() + " is a Diamond I ranked " + String.valueOf(t2.turtleAge())+ " year old ADC turtle.");
	System.out.println(t2.turtleName()+ " farms at a rate of " + String.valueOf(t2.turtleSpeed())+ " CS per minute.");

	Person p;
	p = new Person("Tyler Wang");
	p.setTurtle(t);
	System.out.println("........................");
	System.out.println(p.getPet().turtleName());
	System.out.println("Age = " + String.valueOf(p.getPet().turtleAge()));
	System.out.println("Speed = " + String.valueOf(p.getPet().turtleSpeed()));
	
	   }
}


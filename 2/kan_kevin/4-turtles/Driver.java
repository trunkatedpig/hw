import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
	Turtle t = new Turtle();
	Turtle t2 = new Turtle("Fawn");
	Turtle t3 = new Turtle("Kevin",4,10);
	Person p = new Person("Tom");
	Turtle pet = new Turtle("Jerry");

	// Initial Setup for all three turtles
	System.out.println("Initial Turtle Setup");
	System.out.println("Turtle 1:");
	System.out.println(t.getInfo());
	System.out.println("\nTurtle 2:");
	System.out.println(t2.getInfo());
	System.out.println("\nTurtle 3:");
	System.out.println(t3.getInfo());
	//Make the changes...
	t.speedUp(3);
	t2.getOlder();
	t3.slowDown(2);
	//Print the new Turtles
	System.out.println("\nTurtle 1 Speeds up by 3");
	System.out.println(t.getInfo());
	System.out.println("\nTurtle 2 Ages up");
	System.out.println(t2.getInfo());
	System.out.println("\nTurtle 3 Slows down by 2");
	System.out.println(t3.getInfo());

	//Making a new Turtle with an Owner...
	System.out.println("\nTesting Pet:");
	p.setTurtle(pet);
	System.out.println(p.getPet().getInfo());
	System.out.println("Turtle Speed:");
	System.out.println(p.getTurtleSpeed());
	//Make the changes...
	System.out.println("\nIncrease Speed by 4");
	p.getPet().speedUp(4);
	System.out.println(p.getPet().getInfo());
	System.out.println("Turtle Speed:");
	System.out.println(p.getTurtleSpeed());
    }
}

/* copied from partner (Fawn Wong),
   but understood and edited. */

import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
	Turtle t = new Turtle();
	Turtle t2 = new Turtle("Fawn");
	Turtle t3 = new Turtle("Kevin",4,10);
	Person p = new Person("Sarah");
	Turtle pet = new Turtle("Ben");

	System.out.println(t.getInfo());
	System.out.println(t2.getInfo());
	System.out.println(t3.getInfo());

	System.out.println("\nAfter methods:");
	t.speedUp(3);
	t2.getOlder();
	t3.slowDown(2);

	System.out.println(t.getInfo());
	System.out.println(t2.getInfo());
	System.out.println(t3.getInfo());

	System.out.println("\nTesting Pet:");
	p.setTurtle(pet);
	System.out.println(p.getPet().getInfo());
	System.out.println(p.getTurtleSpeed());
	p.getPet().speedUp(4);
	System.out.println(p.getPet().getInfo());
    }
}
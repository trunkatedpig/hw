import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	System.out.println();

        Turtle t = new Turtle();
	System.out.println("Turtle!");
        t.printTurtle();
        t.speedUp(20);
	System.out.println("Turtle!");
        t.printTurtle();
	System.out.println("=====\n");

	Person p2 = new Person();
	Turtle t2 = new Turtle("Squirt");
	p2.setTurtle(t2);
	System.out.println(p2.getName()+"'s turtle!");
	p2.getPet().printTurtle();

	Person p3 = new Person("Xuuuuuuu");
	Turtle t3 = new Turtle("Gwyn");
	p3.setTurtle(t3);
	t3.getOlder();
	System.out.println(p3.getName()+"'s turtle!");
	System.out.println(p3.getName()+"'s turtle's speed: "+p3.getTurtleSpeed());
	t3.printTurtle();

	System.out.println();
    }
}

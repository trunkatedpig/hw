import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Turtle t,t2,t3;
	t = new Turtle();
	System.out.println("Name- "+t.getName());
	System.out.println("Age- "+t.getAge());
	t.getOlder();
	System.out.println("Age- "+t.getAge());
	System.out.println("Speed- " +t.getSpeed());

	t2 = new Turtle("Stan");
	System.out.println("Name- "+t2.getName());
	System.out.println("Age- "+t2.getAge());
	System.out.println("Speed- "+t2.getSpeed());
	t2.speedUp(5);
	System.out.println("Speed- "+t2.getSpeed());

	t3 = new Turtle("Bob",20,10);
	System.out.println("Name- "+t3.getName());
	System.out.println("Age- "+t3.getAge());
	System.out.println("Speed- "+t3.getSpeed());
	t3.slowDown(1);
	System.out.println("Speed- "+t3.getSpeed());

	Person p;
	p = new Person("Bruno");
	p.setTurtle(t);
	System.out.println("Pet- "+p.getPet().getName());
	System.out.println("Pet Age- "+p.getPet().getAge());
	System.out.println("Pet Speed- "+p.getTurtleSpeed());
    }
}
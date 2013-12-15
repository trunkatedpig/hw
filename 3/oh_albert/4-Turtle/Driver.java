import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	Turtle t1,t2,t3;
	t1 = new Turtle();
	t2 = new Turtle("Batman");
	t2.speedUp(3);
	t2.slowDown(2);
	t3 = new Turtle("Thor",5,15);
	Person p;
	p = new Person();
	p.setTurtle(t1);
	System.out.println(p.getPet());
	System.out.println(p.getTurtleName());
	System.out.println(p.getTurtleSpeed());
	System.out.println(p.getTurtleAge());
	p.setTurtle(t2);
	System.out.println(p.getPet());
	System.out.println(p.getTurtleName());
	System.out.println(p.getTurtleSpeed());
	System.out.println(p.getTurtleAge());
	p.setTurtle(t3);
	System.out.println(p.getPet());
	System.out.println(p.getTurtleName());
	System.out.println(p.getTurtleSpeed());
	System.out.println(p.getTurtleAge());

    }
}

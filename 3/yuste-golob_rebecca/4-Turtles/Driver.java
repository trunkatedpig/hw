import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Turtle t;
	t = new Turtle();
<<<<<<< HEAD
	System.out.println(t.tellname());
	System.out.println(t.tellage());
	System.out.println(t.tellspeed());
	
	Turtle t2;
	t2 = new Turtle("Javert");
	System.out.println(t2.tellname());
	System.out.println(t2.tellage());
	System.out.println(t2.tellspeed());
	
	Turtle t3;
	t3 = new Turtle("Enjoras", 21, 8);
	System.out.println(t3.tellname());
	System.out.println(t3.tellage());
	System.out.println(t3.tellspeed());

	Person p;
	p = new Person("Victor Hugo");
	p.setTurtle(t);
	System.out.println(p.getPet());
	System.out.println(p.getTurtleSpeed());
=======
		System.out.println(t.tellname());
		System.out.println(t.tellage());
		System.out.println(t.tellspeed());
>>>>>>> ba86698f11a53b7e579edc9c6632866387409e38
    }
}

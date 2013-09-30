import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args){
	Turtle t;
	t = new Turtle();
	Person p;
	p = new Person("Dave");
	p.setTurtle(t);
	System.out.println(p.getPet());
	System.out.println(p.getTurtleSpeed());

	System.out.println("=======");	
	Turtle t2, t3;
	t2 = new Turtle("David");
	t3 = new Turtle("Vic", 5, 10);

	System.out.println(t.gSpeed());
	t.speedUp(5);
	System.out.println(t.gSpeed());
	t.slowDown(4);
	System.out.println(t.gSpeed());

	System.out.println("=======");
	System.out.println(t.gAge());
	t.getOlder();
	System.out.println(t.gAge());

	System.out.println("=======");
	System.out.println(t3.gName());
	System.out.println(t2.gName());

	System.out.println("=======");
	System.out.println(p.getName());
	
   }
}


import java.io.*;
import java.util.*;


public class Driver{

    public static void main(String args[]){
	Turtle t, t1, t2;
	Person p;
	t = new Turtle("Sally");
	t1 = new Turtle("Bob", 5, 7);
	t2 = new Turtle();
	p = new Person("Gary");
	p.setTurtle(t);

        System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed());

	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getSpeed());

	System.out.println(t2.getAge());
	t2.getOlder();
	System.out.println(t2.getAge());

	System.out.println(p.getTurtleSpeed());
	System.out.println(p.getPet());

    }
}

import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Turtle t,t2,t3;
	Person p;
	t = new Turtle();
	t2 = new Turtle("Dan");
	t3 = new Turtle("Larry", 7, 4);
	p = new Person("Guy");
	p.setTurtle(t);
	System.out.println("This is " + t.getName());
	System.out.println("he is " + t.getAge());
	System.out.println("and his speed is " + t.getSpeed());
	System.out.println("This is " + t2.getName());
	System.out.println("he is " + t2.getAge());
	System.out.println("and his speed is " + t2.getSpeed());
	System.out.println("This is " + t3.getName());
	System.out.println("he is " + t3.getAge());
	System.out.println("and his speed is " + t3.getSpeed());
	System.out.println("This is someone's pet " + p.getPet().getName());
	System.out.println("and his speed is " + p.getTurtleSpeed());
    }
}

/* Fish Milnikiewicz and Aida Piccato, Pd. 2 */

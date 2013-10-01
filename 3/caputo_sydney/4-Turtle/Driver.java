import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args) {
	Turtle t,t2,t3;
	Person p;

	t = new Turtle();
	p= new Person("Harry");
	p.setTurtle(t);
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getOlder());
	System.out.println(t.getSpeed());
	System.out.println(t.speedUp(1));
	System.out.println(t.slowDown(1));
	System.out.println("turtle speed:" + p.getTurtleSpeed());
	System.out.println("My turtle:" + p.getPet());

	t2 = new Turtle("Claire");
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getOlder());
	System.out.println(t2.getSpeed());
	System.out.println(t2.speedUp(1));
	System.out.println(t2.slowDown(1));
	
	t3 = new Turtle("Sydney", 45, 19);
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getOlder());
	System.out.println(t3.getSpeed());
  	System.out.println(t3.speedUp(1));
	System.out.println(t3.slowDown(1));
    }
}


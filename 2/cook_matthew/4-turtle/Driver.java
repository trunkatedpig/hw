import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Turtle t1,t2,t3;
	Person p1;
	t1 = new Turtle();
	t2 = new Turtle("La-a");
	t3 = new Turtle("big Papi", 37, 1);
	System.out.println(t1.getSpeed());
	System.out.println(t2.getSpeed());
	System.out.println(t3.getSpeed());
	System.out.println(t1.getName());
	System.out.println(t2.getName());
	System.out.println(t3.getName());
	System.out.println(t1.getAge());
	System.out.println(t2.getAge());
	System.out.println(t3.getAge());
	p1= new Person("Vincenzo");
	p1.setTurtle(t3);
	System.out.println(p1.getPet());
	System.out.println(p1.getTurtleSpeed());
    }
}
	
	

import java.io.*;
import java.util.*;

// By Eric Kolbusz and Elvin Shoyfer

public class Driver {
    public static void main(String[] args) {
    	Turtle t1; // Tests constructor with no params. 
    	t1 = new Turtle();

    	Turtle t2; // Tests name constructor.
    	t2 = new Turtle("Test1");

    	Turtle t3; // Tests constructor with all params. 
    	t3 = new Turtle("Test2", 5, 10);

    	System.out.println("Turtle 1");

    	System.out.println(t1.getName());
    	System.out.println(t1.getAge());
    	System.out.println(t1.getSpeed());

     	System.out.println("Turtle 2");
   	
    	System.out.println(t2.getName());
    	System.out.println(t2.getAge());
    	System.out.println(t2.getSpeed());

    	System.out.println("Turtle 3");

    	System.out.println(t3.getName());
    	System.out.println(t3.getAge());
    	System.out.println(t3.getSpeed());

    	System.out.println("Tests Performed on Turtle 1");
    	t1.speedUp(5);
    	t1.slowDown(3);
    	t1.getOlder();
    	System.out.println(t1.getAge());
    	System.out.println(t1.getSpeed());

    	Person p1;
    	p1 = new Person("Person1");
    	p1.setTurtle(t1);
    	System.out.println(p1.getPet().getName());
    	System.out.println(p1.getTurtleSpeed());   	
    }
}

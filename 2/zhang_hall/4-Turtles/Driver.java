import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Turtles t1,t2,t3;
	Person p;

	t1 = new Turtles();
	t1.speedUp(42);
	t1.slowDown(2);
	t1.getOlder();
	System.out.println(t1.getName());
	System.out.println(t1.getSpeed());
	System.out.println(t1.getAge());

	t2 = new Turtles("Tiger");
	t2.speedUp(10);
	t2.slowDown(5);
	t2.getOlder();
	System.out.println(t2.getName());
	System.out.println(t2.getSpeed());
	System.out.println(t2.getAge());

	t3 = new Turtles("Phoneix",34,375);
	System.out.println(t3.getName());
	System.out.println(t3.getSpeed());
	System.out.println(t3.getAge());

	p = new Person("Summoner");
	p.setTurtle(t1);
	System.out.println("My movement speed is " +  p.getTurtleSpeed());
	System.out.println("My turtle is " + p.getPet());

	
    }
}
    


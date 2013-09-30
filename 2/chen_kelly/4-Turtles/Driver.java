//Tina Lee and Kelly Chen

import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Turtle t1,t2,t3;
	Person p;

	t1 = new Turtle();
	t1.speedUp(100);
	t1.slowDown(1);
	t1.getOlder();
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getSpeed());	
	//Why does it only work when speedUp, slow Down and getOlder are at the beginning?

        t2 = new Turtle("Bob");
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getSpeed());

	t3 = new Turtle("George", 57, 29);
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getSpeed());

	p = new Person("Tina");
	p.setTurtle(t1);
	System.out.println("turtle t1's speed: " + p.getTurtleSpeed());
	System.out.println("My pet: " + p.getPet());

    }
}

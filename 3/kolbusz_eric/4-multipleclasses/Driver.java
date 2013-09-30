import java.io.*;
import java.util.*;

//Tried working with Elvin Shoyfer, who, like always, did nothing.

public class Driver { 
    public static void main(String[] args) {
	Turtle t,t2,t3;
	Person p;
	String result;

	t = new Turtle();
	t.getStats();
	t.getOlder();
	System.out.println("Got older");
	t.getStats();
	t.speedUp(2);
	System.out.println("Sped up by 2");
	t.getStats();

	t2 = new Turtle("Jim");
	t2.getStats();
	t2.slowDown(1);
	System.out.println("Slowed down by 1");
	t2.getStats();

	t3 = new Turtle("Oliver", 4, 5);
	t3.getStats();
	t3.getOlder();
	System.out.println("Got older");
	t3.getStats();
	t3.speedUp(5);
	System.out.println("Sped up by 2");
	t3.getStats();
	
	p = new Person("Guile");
	p.setTurtle(t3);
	System.out.println(p.name + " now owns " + p.pet.name + ".");
	
    }
}	



        

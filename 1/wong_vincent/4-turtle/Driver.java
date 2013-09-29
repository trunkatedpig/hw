import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	
	//Part 1
	Turtle t1,t2,t3;

	t1 = new Turtle();
	t2 = new Turtle("Larry");
	t3 = new Turtle ("kevin",100,500);
 
	System.out.println("Turtle 1 is called" + " " + t1.getname());
	System.out.println("Turtle 1 is" + " " + t1.getage() + " " + "years old");
	System.out.println("Turtle 1 is going at" + " " + t1.getspeed() + " " + "mph");

	System.out.println("Turtle 2 is called" + " " + t2.getname());
        System.out.println("Turtle 2 is" + " " + t2.getage() + " " + "years old");
	System.out.println("Turtle 2 is going at" + " " + t2.getspeed() + " " + "mph");

	System.out.println ("--------------------------");

	//Part 2
	Person p1;
	
	p1 = new Person("Vincent");

	p1.setTurtle(t1);
	
	System.out.println(p1.getPersonName() + "'s turtle's speed is" + " " + p1.getTurtleSpeed());
	System.out.println(p1.getPersonName() + "'s turtle's name is" + " " + p1.getPet());
    }
}


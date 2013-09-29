import java.io.*;
import java.util.*;

public class Driver{

// vanessa yu elise zlotnikova//

    public static void main(String[] args){
	Turtle t1,t2,t3;

	//
	t1 = new Turtle();
	System.out.print("Name: ");
	System.out.println(t1.getName());

	System.out.print("Speed: ");
	System.out.println(t1.getSpeed());
	
	System.out.print("Age: ");
	System.out.println(t1.getAge());
        
	//No params

	System.out.println("");

	//
	t2 = new Turtle("Yoe");
	System.out.print("Name: ");
	System.out.println(t2.getName());

	System.out.print("Speed: ");
	System.out.println(t2.getSpeed());
	
	System.out.print("Age: ");
	System.out.println(t2.getAge());
	//has name

	System.out.println("");

	//
	t3 = new Turtle("Wazzuuuuup",50,3);
	System.out.print("Name: ");
	System.out.println(t3.getName());

	System.out.print("Speed: ");
	System.out.println(t3.getSpeed());
	System.out.print("Speed: ");
        t3.speedUp(2);
	System.out.println(t3.getSpeed());
	System.out.print("Speed: ");
	t3.slowDown(4);
	System.out.println(t3.getSpeed());
	
	System.out.print("Age: ");
	System.out.println(t3.getAge());
	System.out.print("Age: ");
	t3.getOlder();
	System.out.println(t3.getAge());
	//All params

	///////////////
	
	Person p;
	p = new Person("John");
	p.setTurtle(t1);
	System.out.println("John's turtle's speed is " + (p.getTurtleSpeed()));

    }
}

import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Turtle A = new Turtle();
	System.out.println("The name of A is: ");
	System.out.println(A.getName());
	System.out.println("The speed of A is: ");
	System.out.println(A.getSpeed());
	System.out.println("The age of A is: ");
	System.out.println(A.getAge());
	A.getOlder();
	System.out.println("The new age of A is: ");
	System.out.println(A.getAge());
	System.out.println("The new speed of A is: ");
	A.speedUp(400);
	System.out.println(A.getSpeed());

	Turtle B = new Turtle("Bee");
	System.out.println("The following is the name, speed, and age of turtles B and C, respectively");
	System.out.println(B.getName());
	System.out.println(B.getSpeed());
	System.out.println(B.getAge());

	Turtle C = new Turtle("Sea",64,1234321);
	System.out.println(C.getName());
	System.out.println(C.getSpeed());
	System.out.println(C.getAge());

	Person D = new Person ("Dee");
	D.setTurtle(C);
	System.out.println("Person D has Turtle C as a pet. This is the name and speed of Person D's pet:");
	System.out.println (D.getPet().getName());
	System.out.println (D.getTurtleSpeed());
    }
}

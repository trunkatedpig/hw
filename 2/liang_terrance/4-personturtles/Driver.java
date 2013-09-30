import java.io.*;
import java.util.*;

//Worked with Eric Wong

public class Driver {
    public static void main(String args[]) {
	Person p;
        Turtle t,t1,t2,tp;

	t = new Turtle();
	System.out.println("The Turtle's name is " + t.getName());
	System.out.println("Its speed is " + t.getSpeed());
	System.out.println("Its age is " + t.getAge()+"\n");

	t1 = new Turtle("George Whitefield");
	System.out.println(t1.getInfo());

	t2 = new Turtle("John Rolfe", 5, 6);
	System.out.println(t2.getInfo());
	t2.speedUp(5);
	System.out.println("Its Speed is now " + t2.getSpeed());
	t2.slowDown(2);
	System.out.println("Its Speed is now " + t2.getSpeed());
	t2.getOlder();
	System.out.println("Its Age is now " + t2.getAge() + "\n");
	
	tp= new Turtle("George");
	p=new Person("The Man in the Yellow Hat");
        p.setTurtle(tp);
	System.out.println(p.getName() + " owns " + p.getPet() +" and named it " + tp.getName() + " who has a speed of " + p.getTurtleSpeed());


    }
}

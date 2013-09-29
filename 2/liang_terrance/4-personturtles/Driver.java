import java.io.*;
import java.util.*;

//Worked with Eric Wong

public class Driver {
    public static void main(String args[]) {
	Person p;
        Turtle t,t1,t2,tp;

	t = new Turtle();
	System.out.println(t.getName()+"\n");
	System.out.println(t.getSpeed());
	System.out.println(t.getAge());

	t1 = new Turtle("George Whitefield");
	System.out.println(t1.getName()+"\n");
	System.out.println(t1.getSpeed());
	System.out.println(t1.getAge());

	t2 = new Turtle("John Rolfe", 5, 6);
	System.out.println(t2.getInfo());
	
	tp= new Turtle("George");
	p=new Person("The Man in the Yellow Hat");
        p.setTurtle(tp);
	System.out.println(p.getPet());
	System.out.println(p.getTurtleSpeed());

    }
}

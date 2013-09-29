import java.io.*;
import java.util.*;

//Worked with Eric Wong

public class Driver {
    public static void main(String args[]) {
	Human h,h2;
        Turtle t,t1,t2,tp,tf;

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
	h=new Human("The Man in the Yellow Hat");
        h.setTurtle(tp);
	System.out.println(h.getPet());
	System.out.println(h.getTurtleSpeed());

    }
}

import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
	Turtle t, t2, t3;
	Person p;
        t = new Turtle();
	t2 = new Turtle ("David");
	t3 = new Turtle ("Daniel" , 16, 13);
	
	System.out.println(t.getSpeed());
	System.out.println (t.getName());
        System.out.println(t.getAge());
        
	System.out.println(t2.getSpeed());
	System.out.println (t2.getName());
        System.out.println(t2.getAge());

	System.out.println(t3.getSpeed());
	System.out.println (t3.getName());
        System.out.println(t3.getAge());

	t.speedUp (7);
	System.out.println(t.getSpeed());

	t.slowDown (7);
	System.out.println(t.getSpeed());

	t.getOlder ();
        System.out.println(t.getAge());

	p = new Person ("David");
	p.setTurtle (t);
	System.out.println(p.getPet().getSpeed());
	System.out.println(p.getTurtleSpeed());
	

	    
    }
}

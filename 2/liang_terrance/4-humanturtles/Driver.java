import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String args[]) {
        Turtle t,t1,t2;
	t = new Turtle();
	System.out.println(t.getSpeed());
	System.out.println(t.getAge());
	System.out.println(t.getName());

	t1 = new Turtle("George Whitefield");
	System.out.println(t1.getSpeed());
	System.out.println(t1.getAge());
	System.out.println(t1.getName());

	t2 = new Turtle("John Rolfe", 5, 6);
	System.out.println(t2.getSpeed());
	System.out.println(t2.getAge());
	System.out.println(t2.getName());
    }
}
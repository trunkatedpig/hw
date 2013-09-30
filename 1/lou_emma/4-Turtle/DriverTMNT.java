import java.io.*;
import java.util.*;

public class DriverTMNT{

    public static void main (String [] args){
	Turtle t, t2, t3;
	String name;

	int speed, age;

	t = new Turtle();
	name = t.nameme();
	System.out.println(name);
	t.speedUP(7);
	System.out.println(t.speedme());

	t2 = new Turtle("Michelangelo");
	System.out.println(t2.nameme());
	t2.getOlder();
	System.out.println(t2.ageme());

	t3 = new Turtle("Leonardo", 10, 15);
	System.out.println(t3.nameme());
	System.out.println(t3.speedme());
	System.out.println(t3.ageme());

    }
}

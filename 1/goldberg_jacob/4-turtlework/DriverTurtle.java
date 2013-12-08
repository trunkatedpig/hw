import java.io.*;
import java.util.*;

public class DriverTurtle{
    public static void main (String[] args){
	Turtle g,g2, g3;
	g = new Turtle();
	g2 = new Turtle("Hello");
	g3 = new Turtle("Lou", 3, 5);
        g2.SpeedUp(100);
	g2.GetOlder();
	g.SpeedUp(100);
	g.GetOlder();
	System.out.println(g3.tellname());
	System.out.println(g3.tellage());
	System.out.println(g3.tellspeed());
	System.out.println(g2.tellname());
	System.out.println(g2.tellage());
	System.out.println(g2.tellspeed());
	System.out.println(g.tellname());
	System.out.println(g.tellage());
	System.out.println(g.tellspeed());
	/* And now part 2 */
	Person j;
	Turtle m;
	m = new Turtle();
	j = new Person("Frank");
	j.setTurtle(m);
	j.getPet();
	System.out.println(j.getTurtleSpeed());
	}
}

import java.io.*;
import java.util.*;

public class DriverTurtle{
    public static void main (String[] args){
	Person j;
	Turtle m;
	m = new Turtle();
	j = new Person("Frank");
	j.setTurtle(m);
	j.getPet();
	System.out.println(j.getTurtleSpeed());
	Turtle g,g2;	
	g = new Turtle();
	g2 = new Turtle("Hello");
        g2.SpeedUp(100);
	g2.SlowDown(20);
	g2.GetOlder();
	g.SpeedUp(100);
	g.SlowDown(20);
	g.GetOlder();
	System.out.println(g2.tellname());
	System.out.println(g2.tellage());
	System.out.println(g2.tellspeed());
	System.out.println(g.tellname());
	System.out.println(g.tellage());
	System.out.println(g.tellspeed()); 
	}
}
//worked with Coby//

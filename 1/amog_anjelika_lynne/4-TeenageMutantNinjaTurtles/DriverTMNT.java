import java.io.*;
import java.util.*;

public class DriverTMNT{

    public static void main (String [] args){
<<<<<<< HEAD
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
	
=======
	Turtle t, t2, t3, t4;
	String name;
	int speed, age;
	t = new Turtle();
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed());
	t2 = new Turtle("Michelangelo");
	System.out.println(t2.getName());
	t2.getOlder();
	System.out.println(t2.getAge());
	t2.speedUp(8);
	System.out.println(t2.getSpeed());
	t3 = new Turtle("Raphael", 10, 18);
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getSpeed());
	t4 = new Turtle("Leonardo", 20, 15);
	System.out.println(t4.getName());
	System.out.println(t4.getAge());
	System.out.println(t4.getSpeed());
	t4.speedUp(8);
	System.out.println(t4.getSpeed());
	t4.slowDown(10);
	System.out.println(t4.getSpeed());
	Person rat;
	rat = new Person();
	rat.setTurtle(t2);
	System.out.println(rat.getName());
	Turtle apprentice;
	apprentice = rat.getApprentice();
	System.out.println(apprentice.getName());
	System.out.println(rat.getTurtleSpeed());
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}
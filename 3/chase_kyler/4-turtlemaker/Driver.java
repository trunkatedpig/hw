import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Turtle t, t2, t3;
		t = new Turtle();
		t2 = new Turtle("George");
		t3 = new Turtle(30, 15, "Bob");
		System.out.println(t.turtleMaker());
		System.out.println(t2.turtleMaker());
		System.out.println(t3.turtleMaker());
		System.out.println("----------------------");
		Person p;
		p = new Person("Kevin");
		p.setTurtle(t3);
		System.out.println(p.getPet());
		System.out.println(p.getTurtleSpeed());
	}

}

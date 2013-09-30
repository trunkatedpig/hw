import java.io.*;

public class Driver
{

	public static void main(String[] args)
	{
		Turtle a,b,c;
		a = new Turtle("Adam",5,1);
		b = new Turtle("Bob",1, 1);
		c = new Turtle("Car",3,4);
		
		a.speedUp(3);
		b.slowDown(1);
		c.getOlder();
		
		Person owner = new Person("Jim");
		owner.setTurtle(c);
		
		System.out.println(a.getSpeed());		
		System.out.println(b.getSpeed());		
		System.out.println(owner.getTurtleSpeed());		
		System.out.println(owner.getPet().getAge());		
	}
}

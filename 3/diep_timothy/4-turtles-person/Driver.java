import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing Part 1: class Turtle *-*");
		System.out.println();

		Turtle t1;
		t1 = new Turtle();
		System.out.println("Turtle 1: (no parameters set)");
		System.out.println("  name: " + t1.getName());
		System.out.println("   age: " + t1.getAge());
		System.out.println(" speed: " + t1.getSpeed());
		System.out.println();

		Turtle t2;
		t2 = new Turtle("Sean");
		System.out.println("Turtle 2: (name set to Sean)");
		System.out.println("  name: " + t2.getName());
		System.out.println("   age: " + t2.getAge());
		System.out.println(" speed: " + t2.getSpeed());
		System.out.println();

		Turtle t3;
		t3 = new Turtle("Anna", 17, 2);
		System.out.println("Turtle 3: (all 3 parameters set)");
		System.out.println("  name: " + t3.getName());
		System.out.println("   age: " + t3.getAge());
		System.out.println(" speed: " + t3.getSpeed());
		System.out.println();

		System.out.println("Turtle 1: (speed up by 5)");
		t1.speedUp(5);
		System.out.println("  name: " + t1.getName());
		System.out.println("   age: " + t1.getAge());
		System.out.println(" speed: " + t1.getSpeed());
		System.out.println();

		System.out.println("Turtle 2: (slow down by 3)");
		t2.slowDown(3);
		System.out.println("  name: " + t2.getName());
		System.out.println("   age: " + t2.getAge());
		System.out.println(" speed: " + t2.getSpeed());
		System.out.println();

		System.out.println("Turtle 3: (get older)");
		t3.getOlder();
		System.out.println("  name: " + t3.getName());
		System.out.println("   age: " + t3.getAge());
		System.out.println(" speed: " + t3.getSpeed());
		System.out.println();

		System.out.println("*-* Testing Part 2: class Person using turtle 3 from Part 1 *-*");
		System.out.println();

		Person p1;
		p1 = new Person("Frank");
		p1.setTurtle(t3);
		Turtle pet;
		pet = p1.getPet();

		System.out.println("Info about " + p1.getName() + "'s pet turtle:");
		System.out.println("  name: " + pet.getName());
		System.out.println("   age: " + pet.getAge());
		System.out.println(" speed: " + pet.getSpeed());
		System.out.println();

		System.out.println("Speed of " + p1.getName() + "'s pet turtle using method from the class Person:");
		System.out.println(" speed: " + p1.getTurtleSpeed());
		System.out.println();
	}
}

import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {
		// Testing default constructor for turtle
		System.out.println("We will generate a default turtle that is a still 15-y.o. Kevin Li.");
		Turtle kevin = new Turtle();
		System.out.println("This turtle is named "+kevin.getName()+".");
		System.out.println(kevin.getName()+" is "+kevin.getAge()+" years old.");
		System.out.println(kevin.getName()+" is going at "+kevin.getSpeed()+" MPH.");
		
		// Testing name-only constructor that we method overloaded.
		System.out.println("We will generate a turtle that is a still 15-y.o. Fresh Man which I chose.");
		Turtle freshman = new Turtle("Fresh Man");
		System.out.println("This turtle is named "+freshman.getName()+".");
		System.out.println(freshman.getName()+" is "+freshman.getAge()+" years old.");
		System.out.println(freshman.getName()+" is going at "+freshman.getSpeed()+" MPH.");
		System.out.println("We will generate a turtle that is a Mr. Zamansky going at the speed of light.");
		Turtle zamansky = new Turtle("Mr. Zamansky",40,670616629);
		System.out.println("This turtle is named "+zamansky.getName()+".");
		System.out.println(zamansky.getName()+" is "+zamansky.getAge()+" years old.");
		System.out.println(zamansky.getName()+" is going at "+zamansky.getSpeed()+" MPH.");	
		
		// Testing Person.java
		Person eugene = new Person("Eugene Lee");
		eugene.setTurtle(kevin);
		System.out.println("The next line should be 0.");
		System.out.println(eugene.getTurtleSpeed());
		System.out.println("The next line should give me Kevin Li's name.");
		System.out.println(eugene.getPet().getName());
	}
}

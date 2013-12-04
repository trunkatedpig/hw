public class Driver {
    public static void main(String[] args) {
	System.out.println("Creating turtles using the various constructors:");

	System.out.println("Turtle 1:");
	Turtle t = new Turtle();
	System.out.println(t);
	t.printAllInformation();

	System.out.println("\nTurtle 2:");
	Turtle t2 = new Turtle("Bob");
	System.out.println(t2);
	t2.printAllInformation();

	System.out.println("\nTurtle 3:");
	Turtle t3 = new Turtle("Joe", 10, 5);
	System.out.println(t3);
	t3.printAllInformation();

	System.out.println("\nMaking Joe (Turtle 3) older and slower:");
	t3.getOlder();
	t3.slowDown(2);
        t3.printAllInformation();
	
	System.out.println("\nMaking Joe (Turtle 3) faster:");
        t3.speedUp(1);
	t3.printAllInformation();

	System.out.println("\nCreating person Kevin:");
	Person p = new Person("Kevin");
	System.out.println(p);
	
	System.out.println("\nAssigning Joe (Turtle 3) to Kevin:");
	p.setTurtle(t3);
	System.out.println(p.getPet());

	System.out.println("\nRedudantly getting the speed of Kevin's turtle:");
	System.out.println(p.getTurtleSpeed());
    }
}

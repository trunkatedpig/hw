public class Driver {
    public static void main(String[] args) {
	Turtle t = new Turtle();
	Turtle t2 = new Turtle("Bob");
	Turtle t3 = new Turtle("Joe", 10, 5);

	System.out.println("Turtle 1:");
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed());

	System.out.println("\nTurtle 2:");
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getSpeed());

	t3.speedUp(5);
	t3.getOlder();

	System.out.println("\nTurtle 3:");
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getSpeed());
    }
}
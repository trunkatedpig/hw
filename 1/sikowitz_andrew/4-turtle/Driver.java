public class Driver {
    public static void main(String[] args) {
	Turtle t = new Turtle();
	Turtle t2 = new Turtle("Bob");
	Turtle t3 = new Turtle("Joe", 10, 5);
	Person p = new Person("Hobbes");

	System.out.println("Turtle 1:");
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed() + "\n");

	System.out.println("Turtle 2:");
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getSpeed() + "\n");

	t3.speedUp(5);
	t3.getOlder();

	System.out.println("Turtle 3:");
	System.out.println(t3.getName());
	System.out.println(t3.getAge());
	System.out.println(t3.getSpeed() + "\n");

	p.setTurtle(t3);
	System.out.println("Owner Name: " + p.getName());
	System.out.println("Turtle Name: " + p.getPet().getName());
	System.out.println("Turtle Age: " + p.getPet().getAge());
	System.out.println("Turtle Speed: " + p.getTurtleSpeed() + "\n");
    }
}

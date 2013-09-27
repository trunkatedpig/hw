public class Driver {
    public static void main(String[] args) {
	Turtle t = new Turtle();
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed());

	t.speedUp(1);
	t.slowDown(1);
	t.getOlder();

	System.out.println("After methods:");
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed());

	Turtle t2 = new Turtle("Improved Turtle");
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getSpeed());

	t2.speedUp(1);
	t2.slowDown(1);
	t2.getOlder();

	System.out.println("After methods:");
	System.out.println(t2.getName());
	System.out.println(t2.getAge());
	System.out.println(t2.getSpeed());
    }
}
public class Driver{
    public static void main(String[]args) {
	Turtles t, t1;
	String result;

	t = new Turtle();
	t1 = new Turtle (2, 3, "Turpie");

	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getOlder());
	System.out.println(t.getSpeed());
	System.out.println(t.speedUp(1));
	System.out.println(t.slowDown(1));
	
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getOlder());
	System.out.println(t1.getSpeed());
	System.out.println(t.speedUp());
	System.out.println(t.slowDown));
}

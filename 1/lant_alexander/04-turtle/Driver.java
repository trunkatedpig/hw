public class Driver {
    public static void main(String[] args) {
    Turtle t;
    
    t = new Turtle();

    System.out.println(t.getAge());
    System.out.println(t.getName());
    System.out.println(t.getSpeed());
    System.out.println(t.getName());

	t.getOlder();
	t.speedUp(10);
	//t.slowDown(4);

    System.out.println(t.getAge());
    System.out.println(t.getName());
    System.out.println(t.getSpeed());
    System.out.println(t.getName());

    }
}

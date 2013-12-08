public class Driver {
    public static void main(String[] args) {
	Turtle t = new Turtle();
	System.out.println(t.getName());
	System.out.println(t.getAge());
	System.out.println(t.getSpeed());

	t.speedUp(1);
	t.getOlder();

	System.out.println("After methods:");
	System.out.println("Name: " + t.getName());
	System.out.println("Age: " + t.getAge());
	System.out.println("Speed: "+t.getSpeed());
	t.slowDown(1);
	System.out.println("Speed: "+t.getSpeed());
	
	Turtle t2 = new Turtle("Improved Turtle");
	System.out.println("Name: "+t2.getName());
	System.out.println("Age: "+t2.getAge());
	System.out.println("Speed: "+t2.getSpeed());

	t2.speedUp(1);
	t2.getOlder();

	System.out.println("After methods:");
	System.out.println("Name: "+t2.getName());
	System.out.println("Age: "+t2.getAge());
	System.out.println("Speed: "+t2.getSpeed());
	t2.slowDown(1);
	System.out.println("Speed: "+t2.getSpeed());
	
	System.out.println("");
	System.out.println("Create the person Ted");
	Person p = new Person("Ted");
	p.setTurtle(t);
	System.out.println("Pet: " + p.getPet().getName());
	System.out.println("Speed of pet: " + p.getTurtleSpeed());
    }
}
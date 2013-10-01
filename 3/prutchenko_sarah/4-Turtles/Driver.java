public class Driver{
    public static void main(String args[]){
	Turtle t1 = new Turtle("Harry", 5, 30);
	Turtle t2 = new Turtle("Bob");
	System.out.println("First Turtle coming up!");
	System.out.println(t1.getName());
	System.out.println(t1.getAge());
	System.out.println(t1.getSpeed());
	System.out.println("First test over and second test begins");
	System.out.println(t2.getName());
	System.out.println(t2.getSpeed());
	t2.speedUp(5);
	System.out.println("Added 5 to the speed");
	System.out.println(t2.getSpeed());
	System.out.println(t2.getAge());
	t2.GetOlder();
	System.out.println("Added 1 to the age");
	System.out.println(t2.getAge());

    }
}

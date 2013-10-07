public class Driver{
    
    public static void main (String[] args){
	
	Turtle t1, t2, t3;
	t1 = new Turtle();
	t2 = new Turtle("Nancy");
	t3 = new Turtle("Mac",45,32);

	System.out.println("Name Age Speed");
	System.out.println(t1.getName() + " " + t1.getAge() + " " + t1.getSpeed());
       	System.out.println(t2.getName() + " " + t2.getAge() + " " + t2.getSpeed());
	System.out.println(t3.getName() + " " + t3.getAge() + " " + t3.getSpeed());

	t1.speedUp(1);
	System.out.println(t1.getName() + " " + t1.getAge() + " " + t1.getSpeed());

	t2.slowDown(2);
	System.out.println(t2.getName() + " " + t2.getAge() + " " + t2.getSpeed());

	t3.getOlder();
	System.out.println(t3.getName() + " " + t3.getAge() + " " + t3.getSpeed());

	Person P;
	P = new Person("Tom");

	P.setTurtle(t1);
	System.out.println("Tom gets turtle  " + P.getPet().getName());
	System.out.println(P.getPet().getName() + " has " + P.getTurtleSpeed() + " speed");
    }
}
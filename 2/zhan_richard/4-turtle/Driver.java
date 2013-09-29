public class Driver {
    public static void main(String args[]){
	Turtle first;
	first = new Turtle("Bob3",20,0);
	System.out.println(first.getName());
	System.out.println(first.getSpeed());
	System.out.println(first.getAge());
	first.speedUp(10);
	first.slowDown(4);
	first.getOlder();
	System.out.println(first.getName());
	System.out.println(first.getSpeed());
	System.out.println(first.getAge());
    }
}
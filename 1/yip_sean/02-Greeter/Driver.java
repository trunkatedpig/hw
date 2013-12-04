public class Driver {
    public static void main(String[] args) {
	Greeter g = new Greeter(), g2 = new Greeter();
	
	g.setGreeting("How are you doing");
	g2.setGreeting("Hello");
	
	System.out.println(g.greet("Tom"));
	System.out.println(g2.greet("Horus"));
    }
}

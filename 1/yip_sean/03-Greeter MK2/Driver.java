public class Driver {
    public static void main(String[] args) {
	Greeter g = new Greeter();
	Greeter g2 = new Greeter("Hey", "Get out of my face");
	
	System.out.println("Default:");
	System.out.println(g.happyGreet("Kevin"));
	System.out.println(g.sadGreet("Jeremy\n"));

	System.out.println("Custom:");
	System.out.println(g2.happyGreet("Kyle"));
	System.out.println(g2.sadGreet("Brock"));
    }
}

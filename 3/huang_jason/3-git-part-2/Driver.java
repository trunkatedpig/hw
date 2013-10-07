public class Driver{

    public static void main(String[] args){

	Greeter G1, G2;
	G1 = new Greeter();
	G2 = new Greeter("Wazzup", "Go home");

	System.out.println(G1.happyGreet("Bob"));
	System.out.println(G1.sadGreet("Fred"));
	System.out.println(G2.happyGreet("Ron"));
	System.out.println(G2.sadGreet("Harry"));
    }
}

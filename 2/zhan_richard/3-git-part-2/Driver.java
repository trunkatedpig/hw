public class Driver{
    public static void main(String[] args){
	Greeter g,g1,g2;
	g = new Greeter();
	g1 = new Greeter();
	g2 = new Greeter("Hi, how are you?", "Don't tell me to have a nice day");
	g1.setHappy("What a wondeful day!");
	g1.setSad("Have a crummy day");
	System.out.println(g.happyGreet("Kevin"));
	System.out.println(g.sadGreet("Kevin"));
	System.out.println(g1.happyGreet("Louie"));
	System.out.println(g1.sadGreet("Louie"));
	System.out.println(g2.happyGreet("Devin"));
	System.out.println(g2.sadGreet("Devin"));
    }
}

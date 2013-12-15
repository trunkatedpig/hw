public class Driver{
    //you need to have a class for driver and greeter
    public static void main(String[]args){
	//have to have that line
	Greeter g, g2;
	String result;
	
	g2 = new Greeter();
	//this one is for the constructor that doesnt accept variables
	g = new Greeter("Hello", "Can you stop?");

	System.out.println(g.sadGreet("Tom"));
	//choose between happy or sad greet (they're like functions)
	System.out.println(g.happyGreet("Bob"));
	System.out.println(g2.happyGreet("Sue"));
    }
}

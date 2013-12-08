import java.io.*;

public class Driver
{
	public static void main(String[] args)
	{
		Greeter g1,g2;
		g1 = new Greeter();
		g2 = new Greeter();
		g1.setGreeting("Hey there");
		g2.setGreeting("Howdy");
		System.out.println(g1.greet("neighbor"));
		System.out.println(g2.greet("pardner"));
	}
}

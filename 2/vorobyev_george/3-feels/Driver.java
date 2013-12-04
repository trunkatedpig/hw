import java.io.*;

public class Driver
{
	public static void main(String[] args)
	{
		Greeter g1,g2;
		g1 = new Greeter();
		g2 = new Greeter();
		g1.setHappy("Hey there");
		g2.setHappy("Howdy");
		System.out.println(g1.greetHappy("neighbor"));
		System.out.println(g2.greetSad("pardner"));
	}
}

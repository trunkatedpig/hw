import java.io.*;

public class Greeter
{
	String greeting;
	
	public String greet(String name)
	{
		return greeting + " " + name;
	}

	public void setGreeting(String g)
	{
		greeting = g;
	}
}

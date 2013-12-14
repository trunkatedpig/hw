import java.io.*;

public class Greeter
{
	String[] greetings; 

	public Greeter(String happy, String sad)
	{
		init(happy,sad);
	}

	public Greeter()
	{
		init("Hey","Bugger off");
	}
	
	public void setHappy(String g)
	{
		greetings[0] = g;
	}
	
	public void setSad(String g)
	{
		greetings[1] = g;
	}

	public void init(String happy, String sad)
	{
		greetings = new String[2];
		greetings[0] = happy;
		greetings[1] = sad;
	}

	public String greetHappy(String name)
	{
		return greetings[0] + " " + name;
	}

	public String greetSad(String name)
	{
		return greetings[1] + " " + name;
	}

}

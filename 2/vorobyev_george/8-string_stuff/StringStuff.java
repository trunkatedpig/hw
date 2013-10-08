
public class StringStuff
{
	public static String capitalize(String name)
	{
		return name.substring(0,1).toUpperCase() + name.split(" ")[0].substring(1) + " " + name.split(" ")[1].substring(0,1).toUpperCase() + name.split(" ")[1].substring(1);
	}
	
	public static String bondify(String name)
	{
		return name.split(" ")[1] + ", " + name;
	}

	public static void main(String[] args)
	{
		System.out.println(capitalize("bames jond"));
		System.out.println(bondify(capitalize("bames jond")));
	}	
}


public class Factorial
{
	public static int fact(int n)
	{
		if(n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static int fact2(int n)
	{
		int result = 1;
		while(n > 1)
		{
			result *= n;
			n--;
		}
		return result;
	}

	public static void main(String[] args)
	{
		System.out.println(fact(5));
		System.out.println(fact2(5));
	}
}	
		

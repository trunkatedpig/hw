public class Rational
{
	public static void main(String[] args)
	{
		Rational a,b,c,d;
		a = new Rational(1,2);
		b = new Rational(0,3);
		c = new Rational(4,6);
		d = new Rational(8,16);
		System.out.println("a,b,c,d:");
		a.print();
		b.print();
		c.print();
		d.print();

		System.out.println("\nc >? a");
		System.out.println(c.compareTo(a));
		
		System.out.println("\nc * b, then reduced");
		Rational temp = c.mult(b);
		temp.print();
		temp.reduce();
		temp.print();

		System.out.println("\nd == a");
		System.out.println(a.equals(d));
	}
		



	public int a,b;

	public Rational(int A, int B)
	{
		a = A;
		b = B;
	}

	public Rational clone()
	{return new Rational(a,b);}

	public Rational reduceClone()
	{Rational temp = clone(); temp.reduce(); return temp;}

	public int gcd(int a,int b) 
	{
		if (b == 0)
			return a;
		else 
		{
			return gcd(b,a%b);
		} 
	}

	public void reduce() 
	{
		int g = gcd(a,b);
		a = a / g;
		b = b / g;
	}

	public boolean equals(Rational other)
	{
		Rational tempA = reduceClone();
		Rational tempB = other.reduceClone();
		return tempB.a == tempA.a && tempB.b== tempA.b;
	}

	public Rational mult(Rational other)
	{return new Rational(a * other.a, b* other.b);}

	public int compareTo(Rational other)
	{return a * other.b - other.a * b;}
	
	public void print()
	{System.out.println(String.valueOf(a) + '/' +  String.valueOf(b));}
}

public class Driver{
    public static void main(String[] args) {
	For f = new For();
	System.out.println("GCD For Loop");
	System.out.println(f.gcd(8,14));
	System.out.println(f.gcd(4239,4122));
	System.out.println("Reverse");
	System.out.println(f.Reverse("hello world!"));
	System.out.println("Chart");
	System.out.println(f.table(5,3));
	System.out.println(f.table(10,20));
    }
}
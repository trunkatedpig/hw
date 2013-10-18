public class Driver{
    public static void main(String[] args){
        Loops loop;
        For f;
        loop = new Loops();
        f = new For();

	System.out.println(loop.gcd(104729,29569));
	System.out.println(loop.gcd2(31342,7402));
        System.out.println(loop.gcdFor(1535,10));
        System.out.println(f.Reverse("Hello"));
        System.out.println(f.Reverse("Hello World"));
        System.out.println(f.table(11,14));
    }        
}

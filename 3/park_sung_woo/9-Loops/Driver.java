public class Driver{
    public static void main(String[] args){
        Loops loop;
        loop = new Loops();

        System.out.println("Recursive method");
        System.out.println(loop.fact(1));
        System.out.println(loop.fact(2));
        System.out.println(loop.fact(3));
        System.out.println(loop.fact(4));
        System.out.println(loop.fact(5));
        System.out.println(loop.fact(6));

        System.out.println("While loop method");
        System.out.println(loop.fact2(1));
        System.out.println(loop.fact2(2));
        System.out.println(loop.fact2(3));
        System.out.println(loop.fact2(4));
        System.out.println(loop.fact2(5));
        System.out.println(loop.fact2(6));

	System.out.println(loop.gcd(104729,29569));
	System.out.println(loop.gcd2(104729,29569));
        System.out.println(loop.isPrime(10));
        System.out.println(loop.isPrime(7));
        System.out.println(loop.isPrime(125));
        System.out.println(loop.isPrime(104729));
    }        
}

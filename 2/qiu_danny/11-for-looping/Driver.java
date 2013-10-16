public class Driver {

    public static void main(String[] args) {
        For f;
        f = new For();

        System.out.println(f.isPrime(1));
        System.out.println(f.isPrime(17));
        System.out.println(f.isPrime(100));
        System.out.println(f.isPrime(Integer.MAX_VALUE));
        System.out.println(f.reverse("Hello World!"));
        System.out.println(f.table(5,3));
        System.out.println(f.table(25,25));
    }
}

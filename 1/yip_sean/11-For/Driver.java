public class Driver {
	public static void main(String[] args) {
		For f = new For();
		System.out.println("isPrime(2147483647) -> " + f.isPrime(2147483647));
		System.out.println("isPrime(1000000) -> " + f.isPrime(1000000) + "\n");
		
		System.out.println("reverse(\"yolo\") -> " + f.reverse("yolo"));
		System.out.println("reverse(\"supercalifragilisticexpialidocious\") -> " + f.reverse("supercalifragilisticexpialidocious") + "\n");
		
		System.out.println("table(5, 3) ->\n" + f.table(5, 3));
	}
}
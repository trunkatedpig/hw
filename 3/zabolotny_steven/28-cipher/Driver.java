public class Driver {
    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println("Hello (13): " + c.encode("Hello",13));
	System.out.println("Hello! (13): " + c.encode("Hello!",13));
	System.out.println("Hello World! (10): " + c.encode("Hello World!",10));
    }
}
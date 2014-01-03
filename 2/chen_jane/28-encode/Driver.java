public class Driver {
    public static void main(String[] args) {
	Cipher c = new Cipher();

	System.out.println(c.encode("hello world",3));
	System.out.println(c.encode("water",13));
	System.out.println(c.encode("goodbye",-3));
    }
}

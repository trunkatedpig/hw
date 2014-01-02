public class Driver {
    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println(c.encode("abc",1));
	System.out.println(c.encode("abc",2));
	System.out.println(c.encode("abc",3));
	System.out.println(c.encode("xyz",1));
	System.out.println(c.encode("xyz",2));
	System.out.println(c.encode("xyz",3));
    }
}

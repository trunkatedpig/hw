public class Driver {
    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println("\"abc\" shifted by 2: " + c.encode("abc",2));
	System.out.println("\"xyz\" shifted by 3: " + c.encode("xyz",3));
	System.out.println("\"Testing Capitals and Symbols.\" shifted by 1: " + c.encode("Testing Capitals and Symbols.",1));
	System.out.println("\"backwards\" shifted by -1: " + c.encode("backwards",-1));
    }
}

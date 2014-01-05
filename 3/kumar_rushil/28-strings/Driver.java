public class Driver{
    public static void main (String[] args){
	Cipher c = new Cipher();
	System.out.println(c.runCipher("hello", 2));
	System.out.println(c.runCipher("aaaa", 1));
	System.out.println(c.runCipher("zzz", 2));
	System.out.println(c.runCipher("aaaa", 26));
    }
}

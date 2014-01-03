public class Driver{
    public static void main(String arg[ ] ){
	Cipher c = new Cipher();
	System.out.println(c.rotate("I, Tyler Wang, will try to Rotate this sentence.", 2));
	System.out.println(c.rotate("Have no idea how to check.", 16));
    }
}

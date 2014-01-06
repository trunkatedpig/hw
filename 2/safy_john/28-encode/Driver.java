public class Driver {
    public static void main(String args[]) {
	encode e = new encode();
	System.out.println(e.encode("hello", 3));
	System.out.println(e.encode("xyzabc", 3));
    }
}
//not sure why this won't compile

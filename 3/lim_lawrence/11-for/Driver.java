public class Driver {
    public static void main(String[] args) {
	For f = new For();
	System.out.println(10*9*8*7*6*5*4*3*2*1);
	System.out.println(f.fact(10));
	
	System.out.println("hello");
	System.out.println(f.reverse("hello"));
	
	System.out.println(f.table(5,3));
    }
}

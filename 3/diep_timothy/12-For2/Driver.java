public class Driver {
    public static void main(String[] args) {
	For2 f = new For2();
	
	System.out.println(f.diag(5));
	System.out.println();
	
	System.out.println(f.diagWord("Hello"));
	System.out.println();
	
	System.out.println("6x5 fence:");
	System.out.println(f.fence(6,5));
	System.out.println();

	System.out.println("1x7 fence:");
	System.out.println(f.fence(1,7));
	System.out.println();

	System.out.println("5x1 fence:");
	System.out.println(f.fence(5,1));
	System.out.println();

	System.out.println("1x1 fence:");
	System.out.println(f.fence(1,1));
    }
}

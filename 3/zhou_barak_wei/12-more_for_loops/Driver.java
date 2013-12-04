public class Driver {
	public static void main(String[] args) {
		System.out.println(Diag.clone("copy", 5));
		System.out.println(Diag.diag(5));
		System.out.println(Diag.diagWord("Hello"));
		//System.out.println(Diag.fence(5, 8));
		//System.out.println(Diag.fence(2, 2));
		//System.out.println(Diag.fence(2, 1));
		//System.out.println(Diag.fence(1, 0));
		//System.out.println(Diag.fence(0, 1));
		System.out.println(Diag.fence(1, 1));
		
	}
}
public class Driver {
    public static void main (String[] args) {
	diagonals d = new diagonals();
	System.out.println ( d.diag ( 3 ) );
	System.out.println ( d.diagWord ( "Hello" ) );
	System.out.println ( d.fence ( 5 , 8 ) );
    }
}

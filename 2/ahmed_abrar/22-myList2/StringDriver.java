public class StringDriver {
    public static void main ( String[] args ) {
	myStringList L = new myStringList();
	L.add ( "zero" );
	L.add ( "one" );
	L.add ( "two" );
	System.out.println ( L );
	System.out.println ( L.find ( "one" ) );
	System.out.println ( L.find ( "3" ) );
    }
}

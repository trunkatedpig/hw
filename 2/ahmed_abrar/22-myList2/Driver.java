public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        System.out.println(L);
        for (int i = 0; i<5;i++) {
            L.add((i+1)*5);
        }
        System.out.println(L);

        for (int i = 0; i<7;i++) {
            L.add((i+1)*5);
        }
        System.out.println(L);

	L.insert ( 2 , 7 );
	System.out.println ( L );

	L.remove ( 3 );
	System.out.println ( L );

	System.out.println ( L.size() );

	System.out.println ( L.get ( 3 ) );
	
	L.set ( 6 , 3 );
	System.out.println ( L );

	System.out.println ( L.find ( 5 ) );
	System.out.println ( L.find ( 3 ) );
	System.out.println ( L.find ( -2 ) );

	L.fremove ( 5 );
	System.out.println ( L );

	/*myList a = new myList();
	System.out.println ( a );
	a.insert ( 0 , 5 );
	System.out.println ( a );*/
    }
}

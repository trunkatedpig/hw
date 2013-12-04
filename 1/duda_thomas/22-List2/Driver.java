public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        for (int i=0;i<5;i++) {
            L.add(i*10);
        }
        System.out.println(L);

        for (int i=0;i<12;i++) {
            L.add(i*10);
        }

        System.out.println(L);

        L.add (5, 23);
        System.out.println (L);

        L.set (5, 3);
        System.out.println (L);

        System.out.println (L.size () );

        L.remove (5);
        System.out.println (L);

        System.out.println (L.size () );

	System.out.println ("----------------");
	System.out.println(L.find(10));
	System.out.println(L.find(52));
	L.fremove(10);
	System.out.println(L);
	L.fremove(52);
	System.out.println(L);


    }


}
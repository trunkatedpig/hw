public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
        
        for (int i=0;i<5;i++) {
            L.add(i*10);
        }

	L.retList ();
        

        for (int i=0;i<12;i++) {
            L.add(i*10);
        }
	L.retList ();


	System.out.println ("-----------------------------");
	L.add (2, 20);
	L.retList ();

	System.out.println ("-----------------------------");
	L.add (4, 10);
	L.retList ();

	System.out.println ("-----------------------------");
	L.remove (4);
	L.retList ();

	System.out.println ("-----------------------------");
	L.remove (10);
	L.retList ();
	System.out.println ("-----------------------------");
	System.out.println (L.size());

	System.out.println ("-----------------------------");

	System.out.println (L.get(3));
	System.out.println ("-----------------------------");

	L.set(5,12);
	L.retList ();
    



    }




}


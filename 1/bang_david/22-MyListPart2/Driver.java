public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
	myStringList S = new myStringList (); 
        
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

	System.out.println(L.find (10));
	System.out.println ("-----------------------------");

	L.fremove (10);
	L.retList ();

	System.out.println( "=============================");


        S.retStr ();
	System.out.println ("-----------------------------");

        S.add("Yooooooo");
	S.retStr ();
	System.out.println ("-----------------------------");

        S.add(3,"Meee");
	S.retStr ();
	System.out.println ("-----------------------------");

        S.fremove("Hey");
	System.out.println ("-----------------------------");

	S.fremove ("Yooooooo");
        S.retStr ();
	System.out.println ("-----------------------------");

        System.out.println(S.find("Meee"));
	S.retStr ();
	System.out.println ("-----------------------------");
        System.out.println(S.find("So"));
	System.out.println ("-----------------------------");
    



    }




}


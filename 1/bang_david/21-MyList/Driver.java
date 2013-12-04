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
	L.insert (2, 20);
	L.retList ();

	System.out.println ("-----------------------------");
	L.insert (4, 10);
	L.retList ();



    }




}


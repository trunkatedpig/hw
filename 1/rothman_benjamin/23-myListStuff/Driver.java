
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

	L.add(2,13);
	System.out.println(L);
	L.remove(2);
	System.out.println(L);


	
	System.out.println (L.find (20));
	L.fRemove (20);
	System.out.println (L);
	L.fRemove (20);
	System.out.println (L);



	//---------------------------------------




	myListStrings L2 = new myListStrings();

	System.out.println(L2);
	for (int i = 0; i<5;i++) {
	    L2.add((i+1)*5);
	}
	System.out.println(L);

	for (int i = 0; i<7;i++) {
	    L2.add((i+1)*5);
	}	
	System.out.println(L2);

	L2.add(2,"13");
	System.out.println(L2);
	L2.remove(2);
	System.out.println(L2);


	
	System.out.println (L2.find ("20"));
	L2.fRemove ("20");
	System.out.println (L2);
	L2.fRemove ("20");
	System.out.println (L2);




	
	
    }	


}

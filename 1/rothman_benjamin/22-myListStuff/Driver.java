
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
	System.out.println ("\n" + "---------------------------------------");



	myStringList L2 = new myStringList();

	System.out.println(L2);
	L2.add ("Yo");
	L2.add ("You");
	L2.add ("Seem");
	L2.add ("Nice");
	L2.add ("Want");
	L2.add ("To");
	L2.add ("Be");
	L2.add ("Friends");

	System.out.println (L2);

	L2.add(2,"Flamingo");
	System.out.println(L2);
	L2.remove(2);
	System.out.println(L2);


	
	System.out.println (L2.find ("Be"));
	L2.fRemove ("Be");
	System.out.println (L2);
	L2.fRemove ("You");
	System.out.println (L2);




	
	
    }	


}

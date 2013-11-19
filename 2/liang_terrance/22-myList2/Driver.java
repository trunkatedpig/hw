
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
	System.out.println("Inserted 3 to position 3");
	L.add (3,3);
	System.out.println(L);
	System.out.println("Inserted 2 to position 5");
	L.add(5,2);
	System.out.println(L);
	

	myList A = new myList();
	System.out.println (A);
	A.add(2);
	System.out.println (A);
	A.add(3,5);
	System.out.println(A);
	A.remove(2);
	System.out.println (A);

L.grow();
	


        
	

    }	
   

}

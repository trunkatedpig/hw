public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	
	for (int i=0;i<15;i++) {
	    L.add(i*10);
	}
	System.out.println(L);
	L.remove(2);
	System.out.println(L);
	System.out.println(L.get(1));
	L.set(3 , 0);
	System.out.println(L);
	System.out.println(L.size());
	    

	/*for (int i=0;i<12;i++) {
	    L.add(i*10);
	}
	for (int i = 0; i < 14; i++)
	    L.insert(2,2);
	*/

    }


}

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
	
	L.insert(2, 6);
	System.out.println(L);
	
	L.remove(2);
	System.out.println(L);
	}
	
}
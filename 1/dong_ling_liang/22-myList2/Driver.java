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
	L.add(10,292112);
	L.add(11, 2983913);
	System.out.println(L);
	L.remove(10);
	L.remove(10);
	System.out.println(L);
	System.out.println(L.size());
	System.out.println(L.get(0));
        L.set(0, 500);
	System.out.println(L.get(0));
	L.set(25, 314);
	System.out.println(L);

    }
}

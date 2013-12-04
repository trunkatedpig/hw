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

	L.insert(0,509239);
	L.insert(1, 509239);
	System.out.println(L);
	L.remove(1);
	System.out.println(L);
    }
}

public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	/*
	  for (int i=0;i<5;i++) {
	    L.add(i*10);
	}
	System.out.println(L);

	for (int i=0;i<12;i++) {
	    L.add(i*10);
	}

	System.out.println(L);
	*/
	L.insert(5,5);
	L.set(6,666);
	System.out.println(L);
	System.out.println(L.find(666));
	L.fremove(666);
	System.out.println(L);
    }
}

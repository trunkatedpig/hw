public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	System.out.println("List L:");
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*5);
	}
	for (int i = 0; i<7;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);


	L.insert(5, 30);
        System.out.println("after inserting 30 at position 5");
	System.out.println(L);

	L.remove(5);
        System.out.println("after removing from position 5");
	System.out.println(L);

	System.out.println(L.size());
	System.out.println(L.get(3));
	L.set(12,40);
	System.out.println(L);
    }	


}

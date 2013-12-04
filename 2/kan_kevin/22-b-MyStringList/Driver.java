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
	L.set(5,15);
	System.out.println(L);

	System.out.println(L.find(15));
	L.fremove(25);
	System.out.println(L);

	System.out.println("*----MyStringList----*");
	myStringList M = new myStringList();
	for (int i = 0; i<6; i++){
	    M.add("a");
	}
	for (int i= 0; i<3; i++){
	    M.add("z");
	}
	System.out.println(M);
	
	M.insert(2, "b");
        System.out.println("after inserting b at position 2");
	System.out.println(M);
	
	M.remove(2);
        System.out.println("after removing from position 2");
	System.out.println(M);

	System.out.println(M.size());
	System.out.println(M.get(3));
	M.set(7,"mn");
	System.out.println(M);

	System.out.println(M.find("mn"));
	M.fremove("mn");
	System.out.println(M);
    }	


}

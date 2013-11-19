
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

	L.insert(2, 14);
	System.out.println(L);

	L.remove(5);
	System.out.println(L);

	L.find(20);

	L.fremove(15);
	System.out.println(L);

    }	


}

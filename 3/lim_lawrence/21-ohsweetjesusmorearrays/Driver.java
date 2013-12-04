
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

	L.insert(4,999);
	L.insert(4,999);
	L.insert(4,999);
	L.insert(4,999);
	System.out.println(L);

	L.remove(12);
	System.out.println(L);
    }	


}

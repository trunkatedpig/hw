
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
      	L.remove(3);
	System.out.println(L);
	System.out.println(L.size());
	System.out.println(L.get(2));
	L.set(3,2);
	System.out.println(L);
	L.add(5,34);
	System.out.println(L);
    }	


}

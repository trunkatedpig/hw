
public class Driver {
    public static void main(String[] args) {
	myList L = new myList();

	System.out.println(L);
	for (int i = 0; i<15;i++) {
	    L.add(i);
	}
	System.out.println(L);

	L.insert(3,20);
	L.insert(10,56);
	System.out.println(L);

	System.out.println("removed 5:" + L.remove(5));
	System.out.println("got 5:" + L.get(5));
	System.out.println("size:" + L.size());
	System.out.println(L);
	
    }	


}

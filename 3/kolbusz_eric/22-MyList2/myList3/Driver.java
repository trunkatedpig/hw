
public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	for (int i = 0; i<7;i++) {
	    L.add((i+1)*5);
	}
	L.add(20);
	System.out.println(L);

	System.out.println("Finding 20: "+L.find(20));
	System.out.println(L);
	System.out.println("Finding and Removing 20: "+L.fremove(20));
	System.out.println(L);
    }	
}

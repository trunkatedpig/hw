
public class Driver {
    public static void main(String[] args) {
		myList L = new myList();

		System.out.println(L);
		for (int i = 0; i<5;i++) {
		    L.add((i+1)*5);
		}
		System.out.println(L);

	    L.add(1,9);
	    System.out.println(L);
	    int a = L.size();
	    for (int i = 0; L.size() > 0; i++){
	    	L.remove(0);
	    	System.out.println(L);
	    }

	    L.add(6);
	    System.out.println(L);
    }	
}

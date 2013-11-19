
public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	myList L2= new myList();
	System.out.println(L);
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);

	for (int i = 0; i<7;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);
	System.out.println("---");
	L.add(4,4);
	System.out.println(L);
	for (int i = 0; i<5;i++) {
            L2.add((i+1)*5);
        }
	System.out.println(L2);
	L2.add(5,45);
	System.out.println(L2);
	System.out.println(L.size());
	L.set(5,8);
	System.out.println(L.get(5));
	System.out.println(L);
	L.remove(2);
	System.out.println(L);
	System.out.println(L);
        L.remove(8);
        System.out.println(L);
	L.fremove(25); 
	System.out.println(L);

    }	



}

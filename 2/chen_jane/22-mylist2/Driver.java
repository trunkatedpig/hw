
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

	System.out.println("\n-------------\n\nAdd");
	L.add(4,1000);
	System.out.println(L);
	L.add(10,2000);
	System.out.println(L);
	L.add(16,3000);
	System.out.println(L);
	System.out.println("\n-------------\n\nRemove");
	L.remove(2);
	System.out.println(L);
	L.remove(6);
	System.out.println(L);
	System.out.print("\n---------------\n\nSize: ");
	System.out.println(L.size());
	System.out.println("\n-------------\n\nList: "+L);
	System.out.println("Pos 5: " + L.get(5));
	System.out.println("Pos 0: " + L.get(0));
	System.out.println("Pos 15: " + L.get(15));
	System.out.println("\n-------------\n\nSet");
	L.set(1,200);
	System.out.println(L);
	L.set(100,400);
	System.out.println(L);
    }	


}

public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	
	for (int i=0;i<5;i++) {
	    L.add(i*10);
	}
	System.out.println(L);

	for (int i=0;i<12;i++) {
	    L.add(i*10);
	}
	System.out.println("---BEFORE--------");
	System.out.println(L);
	System.out.println("-----------ADD-------");
	L.add(0,123456);
	System.out.println(L);
	L.add(5,654321);
	System.out.println(L);
	System.out.println("-----------REMOVE-------");
	L.remove(1);
	System.out.println(L);
	System.out.println("-------SET-------");
	L.set(4,9876);
	System.out.println(L);
	System.out.println("----------get and size-------");
	System.out.println(L.size());
	System.out.println(L.get(4)); 


    }


}

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
        
        for (int i=0;i<10;i++) {
            L.add(i*10);
        }
        System.out.println(L);

	L.add(4,111);
        System.out.println(L);
	L.add(1,10001);
        System.out.println(L);

	L.remove(2);
        System.out.println(L);
	L.remove(5);
        System.out.println(L);
	L.remove(7);
        System.out.println(L);

	System.out.println("size:");
	System.out.println(L.size());

	System.out.println("at 6:");
	System.out.println(L.get(6));
	System.out.println("at 2:");
	System.out.println(L.get(2));

	System.out.println("set 4 to 2013");
	L.set(4,2013);
	System.out.println(L);
	System.out.println("get 7");
	System.out.println(L.get(7));
	
    }
}

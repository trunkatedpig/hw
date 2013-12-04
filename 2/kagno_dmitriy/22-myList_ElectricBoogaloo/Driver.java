public class Driver {
    public static void main(String[] args) {
        myList L = new myList();

        System.out.println(L);
        for (int i = 0; i<5;i++) {
            L.add((i+1)*1);
        }
	
	System.out.println(L);
	L.add(2,42);
	System.out.println(L);
	System.out.println(L.get(4));
	System.out.println(L.get(9));
	
        

        for (int i = 0; i<7;i++) {
            L.add((i+6)*1);
        }
        System.out.println(L);
	L.set(7,100);

        System.out.println(L);
	
	L.remove(6);
        System.out.println(L);

        for (int i = 0; i<2;i++) {
            L.add((i+13)*1);
        }
	System.out.println(L);
	System.out.println(L.size());
	System.out.println(L.get(8));


	System.out.println(L.find(10));
	System.out.println(L);
	System.out.println(L.fremove(12));
	System.out.println(L);
    }        


}

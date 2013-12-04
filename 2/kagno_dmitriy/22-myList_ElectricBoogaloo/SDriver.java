public class SDriver {
    public static void main(String[] args) {
        mySList L = new mySList();

        System.out.println(L);
        for (int i = 0; i<5;i++) {
            L.add("A");
        }
	
	System.out.println(L);
	L.add(2,"B");
	System.out.println(L);
	System.out.println(L.get(4));
	System.out.println(L.get(9));
	
        

        for (int i = 0; i<7;i++) {
            L.add("C");
        }
        System.out.println(L);
	L.set(7,"D");

        System.out.println(L);
	
	L.remove(6);
        System.out.println(L);

        for (int i = 0; i<2;i++) {
            L.add("E");
        }
	System.out.println(L);
	System.out.println(L.size());
	System.out.println(L.get(8));

	System.out.println(L);
	


	System.out.println(L.find("F"));
	System.out.println(L.find("C"));
	System.out.println(L);
	System.out.println(L.fremove("B"));
	System.out.println(L.fremove("F"));
	System.out.println(L);
	
    }        


}

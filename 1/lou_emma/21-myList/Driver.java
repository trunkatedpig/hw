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

        System.out.println(L);
		
		System.out.println("---------------");

		L.insert(3, 25);
		
		System.out.println(L);
		System.out.println("---------------");
		
		L.remove(3);
		System.out.println(L);
    }


}
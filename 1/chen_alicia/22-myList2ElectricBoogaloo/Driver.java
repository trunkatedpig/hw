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

        System.out.println("Inserting 25 at position 3");
        L.insert(3, 25);         
        System.out.println(L);

	System.out.println("Removing item at position 5");
	L.remove(5);
        System.out.println(L);

        System.out.println("Size: " + L.size());
        System.out.println("Get item at pos 9: " + L.get(9));
        System.out.println("Setting item at position 6 to 1000");
	L.set(6,1000);
        System.out.println(L);
	    

               
    }


}

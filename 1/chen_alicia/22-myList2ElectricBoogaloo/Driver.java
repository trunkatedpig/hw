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
	    
	System.out.println( "\n" + "----------------------------------");
	myStringList L2 = new myStringList();

	System.out.println(L2);
        L2.add ("Hey");
        L2.add ("Mr");
        L2.add ("Krabs");
        L2.add ("Corgi");
        L2.add ("Husky");
        L2.add ("Orpah");
        L2.add ("Winfrey");
        L2.add ("Tyra");

	System.out.println (L2);

        L2.insert(2,"Mr. Wang");
        System.out.println("Inserting Mr. Wang at pos 2" + L2);
        L2.remove(2);
        System.out.println("Removing Item at position 2" + L2);

        
        System.out.println (L2.find ("Husky"));
        System.out.println (L2.find ("OoOooO"));
        L2.fRemove ("Husky");
        System.out.println (L2);
        L2.fRemove ("Tyra");
        System.out.println (L2);
               
    }


}

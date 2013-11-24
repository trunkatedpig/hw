public class Driver2 {
    public static void main(String[] args) {
        myStringList L = new myStringList();
        
            L.add("Apple");
	    L.add("Banana");
	    L.add("Chicken");
	    L.add("String");
	    L.add("Random");
	    L.add("Hello");
	    L.add("World");
	    L.add("Victor");
	    L.add("water");
	    L.add("lunch!");

        System.out.println(L);

    System.out.println ("============================================");
    L.insert(4, "QQ");
    System.out.println(L);
    L.remove(4);
    System.out.println(L);
    System.out.println ("================================");
    System.out.println ( L.size());
    System.out.println ("================================");
    System.out.println (L.get(3));
    System.out.println ("================================");
    L.set(7, "Victor");
    System.out.println (L);
    System.out.println ("================================");
    System.out.println ( L.find("Victor"));
    System.out.println ("================================");
    L.fremove("Chicken");
    System.out.println (L);
    }

}

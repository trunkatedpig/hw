public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	/*
	  for (int i=0;i<5;i++) {
	  L.add(i*10);
	  }
	  System.out.println(L);

	  for (int i=0;i<12;i++) {
	  L.add(i*10);
	  }
	*/
	System.out.println(L);

	System.out.println("-------");	
	System.out.println("Insert 2 at Pos 3");
	L.insert(3, 2);
	System.out.println(L);

	System.out.println("-------");
	System.out.println("Remove Int at Pos 3");
	L.remove(3);
	System.out.println(L);
	
    }


}

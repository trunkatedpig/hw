
public class Driver {
    public static void main(String[] args) {
	//Testing myList:
	System.out.println("Testing myList:");
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

	L.add(4,999);
	L.add(4,999);
	L.add(4,999);
	L.add(4,999);
	System.out.println(L);

	L.remove(12);
	System.out.println(L);

	System.out.println(L.size());
	System.out.println(L.get(10));
        L.set(0,-100);
	System.out.println(L);

	System.out.println(L.find(999));
	System.out.println(L.find(-999));
	System.out.println(L.fremove(999));
	System.out.println(L);
	System.out.println();

	//Testing myStringList:    
	System.out.println("Testing myStringList:");
	myStringList SL = new myStringList();

	System.out.println(SL);
	SL.add("one");
	SL.add("two");
	SL.add("three");
	SL.add("four");
	SL.add("five");
	System.out.println(SL);


	SL.add("cat");
	SL.add("dog");
	System.out.println(SL);

	SL.add(4,"tomato");
	SL.add(4,"ketchup");
	SL.add(4,"potato salad");
	SL.add(4,"ranch dressing");
	System.out.println(SL);

	SL.remove(6);
	System.out.println(SL);

	System.out.println(SL.size());
	System.out.println(SL.get(5));
        SL.set(0,"eleventeen");
	System.out.println(SL);

	System.out.println(SL.find("potato salad"));
	System.out.println(SL.find("anti potato salad"));
	System.out.println(SL.fremove("potato salad"));
	System.out.println(SL);
	System.out.println();
    }	


}

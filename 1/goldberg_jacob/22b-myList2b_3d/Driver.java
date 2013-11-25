public class Driver{
    public static void main(String[] args){
	myList a = new myList();
	myList b = new myList();
	long start, t;
	System.out.println(a);
	start = System.currentTimeMillis();
	for (int i = 0; i < 100000; i++){
	    a.add(4);
	}
	t = System.currentTimeMillis() - start;
	//System.out.println("It took " + t + " milliseconds");
	start = System.currentTimeMillis();
	for (int i = 0; i < 100000; i++){
	    b.add(4);
	}
	/*for (int i = 0; i < 100000; i++){
	    b.add(3, 7);
	}
	t = System.currentTimeMillis() - start; */
	//System.out.println("It took " + t + " milliseconds");
	//System.out.println(a);
	System.out.println(a.get(2));
	System.out.println(a.size());
	a.set(2, 6);
	//System.out.println(a);
	a.remove(2);
	//System.out.println(a);
	System.out.println(a.find(7));
	//a.fRemove(7);
	start = System.currentTimeMillis();
	for (int i = 0; i < a.size(); i++){
	    a.remove(0);
	}
	t = System.currentTimeMillis() - start;
	System.out.println("Remove from back took" + t + "milliseconds to remove from front");
	start = System.currentTimeMillis();
	for (int i = 0; i < b.size(); i++){
	    b.remove(b.size() - 1);
	}
	t = System.currentTimeMillis() - start;
	System.out.println("Remove from back took" + t + "milliseconds to remove from back");
    }
}


public class Driver {
    public static void main(String[] args) {
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

	System.out.println("\n-------------\n\nAdd");
	L.add(4,1000);
	System.out.println(L);
	L.add(10,2000);
	System.out.println(L);
	System.out.println("\n-------------\n\nRemove");
	L.remove(2);
	System.out.println(L);
	L.remove(6);
	System.out.println(L);
	System.out.print("\n---------------\n\nSize: ");
	System.out.println(L.size());
	System.out.println("\n-------------\n\nList: "+L);
	System.out.println("Pos 5: " + L.get(5));
	System.out.println("Pos 0: " + L.get(0));
	System.out.println("\n-------------\n\nSet");
	L.set(1,200);
	System.out.println(L);
	L.set(100,400);
	System.out.println(L);
	System.out.println("------------------------------");
	System.out.println(L.find(30));
	System.out.println(L.find(20));
	System.out.println(L.find(22));
	L.fremove(20);
	System.out.println(L);
	L.fremove(1000);
	System.out.println(L);

	System.out.println("--------------STRING LISTS-------------");
	myStringList S = new myStringList();
	System.out.println(S);
	S.add("hello");
	S.add("world");
	S.add("a");
	S.add("b");
	S.add("c");
	System.out.println(S);
	S.add("one");
	S.add("two");
	System.out.println(S);
	System.out.println(S.find("b"));
	System.out.println(S.find("one"));
	System.out.println(S.find("three"));
	S.fremove("world");
	S.fremove("c");
	System.out.println(S);
	S.set(0,"goodbye");
	System.out.println(S);
    }
}

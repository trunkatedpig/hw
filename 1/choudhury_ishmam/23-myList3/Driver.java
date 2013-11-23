
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

	L.add(2,13);
	System.out.println(L);
	L.fremove(20);
	System.out.println(L);

	System.out.println(L.find(20));

	//

	myStringList S = new myStringList();

	System.out.println(S);
	S.add("Bob");

	System.out.println(S);

	S.add(1,"Sally");
	System.out.println(S);
	S.add(1, "Bob");
	System.out.println(S);
	S.fremove("Bob");
	System.out.println(S);

	System.out.println(S.find("Bob"));
	System.out.println(S.find("Frank"));

	
    }	


}

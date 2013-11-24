
public class Driver {
    public static void main(String[] args) {
	myList L = new myList();
	myList L2= new myList();
	System.out.println(L);
	for (int i = 0; i<5;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);

	for (int i = 0; i<7;i++) {
	    L.add((i+1)*5);
	}
	System.out.println(L);
	System.out.println("---");
	L.add(4,4);
	System.out.println(L);
	for (int i = 0; i<5;i++) {
            L2.add((i+1)*5);
        }
	System.out.println(L2);
	L2.add(5,45);
	System.out.println(L2);
	System.out.println(L.size());
	L.set(5,8);
	System.out.println(L.get(5));
	System.out.println(L);
	L.remove(2);
	System.out.println(L);
	System.out.println(L);
        L.remove(8);
        System.out.println(L);
	L.fremove(25); 
	System.out.println(L);
	myStringList S = new myStringList();
        myStringList S2= new myStringList();
        System.out.println(S);
        for (int i = 0; i<5;i++) {
            S.add(((char)(65+i))+ "");
        }
        System.out.println(S);

        for (int i = 0; i<7;i++) {
            S.add(((char)(65+i))+"");
        }
        System.out.println(S);
        System.out.println("---");
        S.add(4,"boogieman");
        System.out.println(S);
        for (int i = 0; i<5;i++) {
            S2.add(((char) (65+i))+"");
        }
        System.out.println(S2);
	S2.add(3,"addedat3");
        System.out.println(S2);
        System.out.println(S.size());
        S.set(5,"setat5");
	System.out.println(S);
        System.out.println(S.get(5));
        System.out.println(S);
        S.remove(2);
        System.out.println(S);
        System.out.println(S);
        S.remove(8);
        System.out.println(S);
        S.fremove("boogieman");
        System.out.println(S);
	S.fremove("B");
        System.out.println(S);
	System.out.println(S.find("setat5"));
    }	



}

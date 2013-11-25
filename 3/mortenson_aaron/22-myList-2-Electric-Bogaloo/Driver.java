public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
	myStringList S = new myStringList();

        System.out.println(L);
	L.add(3);
	L.add(5);
	L.add(1);
	L.add(4);
       	L.add(2,9);
	L.add(41);
	L.remove(1);
	L.add(1,12);
	System.out.println(L.set(0,17));
	System.out.println(L.get(6));
	System.out.println(L);
	System.out.println(L.find(2));
	System.out.println(L.find(9));
	System.out.println(L.fremove(9));
	System.out.println(L);

	System.out.println(S);
	S.add("Herro");
	S.add("Welcome");
	S.add("City");
	S.add("Wok");
       	S.add(2,"Take");
	S.add("Orda");
	S.remove(1);
	S.add(1,"Pri");
	System.out.println(S.set(0,"Moo"));
	System.out.println(S.get(3));
	System.out.println(S);
	System.out.println(S.find("moopers"));
	System.out.println(S.find("Pri"));
	System.out.println(S.fremove("Wok"));
	System.out.println(S);
    }

}
public class Driver{
    public static void main(String[] args){
/*	myList m = new myList();
	m.add(0);
	m.add(1);
	m.add(2);
	m.add(3);
	m.add(4);
	m.add(5);
        System.out.println(m);
        System.out.println(m.find(3));
        m.fremove(4);
        System.out.println(m);*/
        myStringList s = new myStringList();
        s.add("Hello");
        s.add("Hello1");
        s.add("Hello2");
        s.add("Hello3");
        s.add("Hello4");
        s.add("Hello5");
        System.out.println(s);
        s.add(2,"blah");
        System.out.println(s);
        s.remove(2);
        System.out.println(s);
    }
}

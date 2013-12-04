public class Driver{
    public static void main(String[] args){
	MyList a = new MyList();
	MyList b = new MyList(10);
	a.insert(2, 10000);
	System.out.println(a);
	a.remove(2);
	System.out.println(a);
    }
}

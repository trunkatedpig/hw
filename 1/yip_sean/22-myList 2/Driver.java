public class Driver {
	public static void main(String[] args) {
		myList l = new myList();
		System.out.println(l);
		System.out.println(l.toArray());
		System.out.println(l.isFull());
		
		for (int i = 0; i < 5; i++) {l.add(i);}
		System.out.println(l);
		System.out.println(l.isFull());
		
		l.add(5);
		System.out.println(l);
		System.out.println(l.size());
		
		l.add(2, 10);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.set(2, 10);
		System.out.println(l);
		
		//System.out.println(l.get(10));
		
		myListCustom l2 = new myListCustom(new int[] {0, 1, 2, 3, 4});
		System.out.println(l2.subList(2, 5));
	}
}
public class Driver{
    public static void main(String[] args){
	myList list = new myList();
	list.add(5);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(12);
	list.add(32);
	System.out.println("original array: " + list);
	list.remove(2);
	System.out.println("removed index 2: " + list);
	list.add(4,5);
	System.out.println("added 5 at index 4: " + list);
	list.add(20,5);
	System.out.println("Added 5 at index 20: " + list);
    }
}
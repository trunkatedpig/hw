
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
	System.out.println();

	L.remove(1);
	System.out.println("Removed value at index 1.");
	System.out.println(L);
	System.out.println();

	L.add(17);
        System.out.println("Added value 17 to end of array.");
	System.out.println(L);
	System.out.println();

	L.add(5,23);
        System.out.println("Inserted value 23 at index 5.");
	System.out.println(L);
	System.out.println();

	L.set(9,16);
	System.out.println("Changed value at index 9 to 16.");
	System.out.println(L);
	System.out.println();

	System.out.println("Testing get():\nThe value at index 16 is: " + L.get(16)+"\nThe value at index 4 is: " + L.get(4));
	
    }

}

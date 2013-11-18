//Andrew Fischer period 2

public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
                
        //From Z's code, making lists
        for (int i=0;i<5;i++) {
            L.add(i*5);
        }
        

	System.out.println("List:");
        System.out.println(L);
                
	System.out.println("Insert 3 in the 25th Position:");
	L.insert(3, 25);
	System.out.println(L);
                
	System.out.println("Remove the 3rd thing");
	L.remove(3);
	System.out.println(L);
    }


}

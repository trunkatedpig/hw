public class Driver {
    public static void main(String[] args) {
        myList L = new myList();
        
        /*for (int i=0;i<5;i++) {
            L.add(i*10);
        }
        System.out.println(L);

        for (int i=0;i<12;i++) {
            L.add(i*10);
        }

        System.out.println(L);
	*/

	//start of the list without having excess zero elements at the end
	for(int i = 0; i < 10; i ++){
	    L.add(i * 10);
	}

	System.out.println(L);

	L.insert(8,2);
	System.out.println(L);

	L.insert(3,100);
	System.out.println(L);
    }


}

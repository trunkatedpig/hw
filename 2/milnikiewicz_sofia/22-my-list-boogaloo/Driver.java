public class Driver {
        public static void main(String[] args) {
                myList L = new myList();
		System.out.println("\nIntegers:\n");
                System.out.println(L);
                for (int i = 0; i<5;i++) {
                        L.add((i+1)*5);
                }
                System.out.println(L);

                for (int i = 0; i<7;i++) {
                        L.add((i+1)*5);
                }
                System.out.println(L);
                L.add(5,9999);
                System.out.println(L);
                myStringList p = new myStringList();
		System.out.println("\nStrings:\n");
                for (int i = 0; i < 18; i++) {
                        String f = "";
                        for (int z = i +1; z > 0; z--) {
                                f += "ab ";
                        }
                        p.add(f);
                }
                System.out.println(p+"\n");
        }        

}

/*Worked with Jeffrey*/

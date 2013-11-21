public class Driver{
    public static void main(String[] args){
	myList L = new myList();

	System.out.println(L);
	for (int i = 0; i<5;i++) {
            L.add((i+1)*5);
        }
        System.out.println(L);
	L.fRemove(5);
	System.out.println(L);
	L.fRemove(10);
	System.out.println(L);
    }
}
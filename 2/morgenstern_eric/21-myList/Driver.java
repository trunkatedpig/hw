public class Driver {
    public static void main(String[] args){
	myList ml = new myList();
	ml.setData(1,2,3,4,5);
	ml.insert(400,2);
	ml.insert(100,3);
	System.out.println(ml.toString());
    }
}

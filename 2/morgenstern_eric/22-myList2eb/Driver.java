public class Driver {
    public static void main(String[] args){
	myList ml = new myList();
	ml.setData(1,2,3,4,5);
	ml.add(100,2);
	ml.add(200,3);
	ml.add2(300,4);
	ml.add2(400,5);
	System.out.println(ml.toString());
	ml.remove(5);
	System.out.println(ml.toString());
	ml.remove(4);
	System.out.println(ml.toString());
	ml.remove(3);
	System.out.println(ml.toString());
	ml.remove(2);
	System.out.println(ml.toString());
    }
}

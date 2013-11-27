import java.util.*;

public class Redix{
    Random r = new Random();
    ArrayList[] buckets = new ArrayList[10];
    int[] intList = new int[10];
    public Redix(){
	for (int i=0;i<10;i++){
	    buckets[i] = new ArrayList();
    	}
    
    	for (int i=0;i<10;i++){
	    intList[i] = 1000 + r.nextInt(9000);
	}
    System.out.println(Arrays.toString(intList));
    System.out.println((int)Math.pow(10,2));
    }

    public void sort(){
	for (int n=0;n<4;n++){
	    for (int i=0;i<intList.length;i++){
	    	int digit = 0;
		digit = (intList[i]/(int)Math.pow(10,n))%10;
		String s = "Number: " + intList[i] + " ";
		s = s + n + "'s digit " + "Digit: " + digit;
		System.out.println(s);
	    }
	
	}
}
}

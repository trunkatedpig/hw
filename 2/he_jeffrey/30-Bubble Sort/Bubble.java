import java.util.*;

public class Bubble{
    private int[] rando;

    public Bubble() {
    	rando = new int[15];
		for (int i = 0; i < rando.length; i++) {
	    	rando[i] =(int) (Math.random() * 1000000000);
	    }
    }	
	
	public Bubble(int[] n) {
		this.rando = n;
	}
    
    public int[] bubbleSort(int[] list){
		int swaps = 0;
		int comparisons = 0;
		boolean noSwaps = false;
		int store;
		int[] result = Arrays.copyOf(list,list.length);
		int passes = 0;
		while (!noSwaps) {
			noSwaps = true;
		//	System.out.println(Arrays.toString(result));
		    for (int i=0;i<result.length - 1 - passes;i++){
				if (result[i]>result[i+1]){
				    store=result[i];
				    result[i]=result[i+1];
				    result[i+1]=store;
				    swaps++;
				    noSwaps = false;
		//		} else {
		//			System.out.println(result[i]);
		//			System.out.println(result[i+1] + "\n");
				}
				comparisons++;
		    }
		    passes++;
	   }
		System.out.println("Number of swaps = "+swaps);
		System.out.println("Number of comparisons = "+comparisons);
		return result;
    }
}
	
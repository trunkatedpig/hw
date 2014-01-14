import.java.util.*;

public class Bubbles{
    private int[] rando = new int[15];

    public Bubbles() {
	for (int i = 0; i < rando.length; i++) {
	    rando[i] =(int) (Math.random() * 1000000000);
	}

    }
    public int[] optimizedBubbleSort(int[] list){
	int swaps;
	int comparisons;
	boolean sorting;
	int store;
	while (sorting){
	    sorting=false;
	    for (int i=0;i<list.length();i++){
		if (list[i]>list[i+1]){
		    store=list[i];
		    list[i]=list[i+1];
		    list[i+1]=store;
		    swaps++;
		    sorting=true;
		}
		comparisons++;
	    }
	    i=0;
	}
	system.out.println("Number of swaps = "+swaps);
	system.out.println("Number of comparisons = "+comparisons);
	return list;
    }
}
	
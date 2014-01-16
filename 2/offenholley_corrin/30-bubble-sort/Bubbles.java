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
            for (int i=0;i<list.length;i++){
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
    public int[] insertSort(int[] list){
	int assignments;
	int comparisons;
	int i;
	int store;
	boolean moving;
	int j;
	i=1;
	for (;i<list.length;i++){
	    store=list[i];
	    j=i-1;
	    moving=true;
	    while (moving){
		if (list[j]>store){
		    list[j+1]=list[j];
		    j=j-1;
		    
		}
		if (store>=list[j] || j==0){
		    list[j]=store;
		    moving=false;
		}
		assignments++;
		comparisons++;
	    }
	}
	system.out.println("Number of assignments = "+assignments);
        system.out.println("Number of comparisons = "+comparisons);
	return list;
    }
    public int[] selectionSort(int[] list){
	int min;
	int mindex;
	int i;
	for (int j=0;j<list.length;j++){
	    i=0;
	    min=0;
	    mindex=0;
	    for (;i<list.length;i++){
		if (min>list[i] || min==0){
		    min=list[i];
		    mindex=i;
		}
	    }
	    list[mindex]=list[j];
	    list[j]=min;
	}
	return list;
	
}

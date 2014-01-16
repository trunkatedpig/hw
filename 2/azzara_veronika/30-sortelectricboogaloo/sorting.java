import java.util.*;

public class sorting {
    
    int[] data;
    
    public static void main(int[] args){
	sorting s = new sorting(10000,10000);
	s.sort();
    }
    
    
    public void sorting(int size,int max){
	Random r = new Random();
	data = new int[size];
	for(int i = 0; i < size;i++){
	    data[i] = r.nextInt(max);	
	}
    }
    
    public void radixSort(int[] o){
	int numdigits = 3;
	int power = 1;
	while (numdigits>0){
	    ArrayList[] buckets = new ArrayList[10];
	    for (int i=0;i<10;i++){
		buckets[i]=new ArrayList<Object>();
	    }
	    for (int j=0;j<o.length;j++){
		buckets[(o[j]/power)%10].add(o[j]);
	    }
	    int i=0;
	    for (int k=0;k<10;k++){
		for (Object j:buckets[k]){
		    o[i]=(Integer)j; 
		    i++;
		}
	    }
	    power=power * 10;
	    numdigits--;
	}
	//for(int j:o)
	//System.out.print(j + ",");
	//System.out.print("\n");
    }

    
    public void bubbleSort(){
	for (int i=data.length-1;i<0;i--){
	    for (int j=0;j<i-1;j++){
		if (data[j]>data[j+1]){
		    int temp = data[j];
		    data[j]=data[j+1];
		    data[j+1]=temp;
		}	
	    }
	}
    }

   
}

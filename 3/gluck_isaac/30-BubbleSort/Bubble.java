import java.util.*;
import java.io.*;
public class Bubble {
	private ArrayList[] buckets;
	public int[] ran;
	private int compares,swaps = 0;

	public void redixSort(){
		for (int i=0;i<4;i++){
			for (int p=0;p<ran.length;p++)
				buckets[p]=new ArrayList();

			for (int j=0;j<ran.length;j++){
				int n = ran[j]/((int)(Math.pow(10,i)))%10;
				buckets[n].add(ran[j]);
			}

			int x=0;
			for (int k=0;k<ran.length;k++){
				for (int m=0;m<buckets[k].size();m++){
					ran[x] =(Integer)(buckets[k].get(m));
					x++;
				}
			}
		}
	}
	public void bSort(int[] toSort){
		for(int i=0;i<toSort.length;i++){
			for(int n=0;n<toSort.length-1;n++){
				compares++;
				if(toSort[n]>toSort[n+1]){
					swaps++;
					int tmp = toSort[n];
					toSort[n] = toSort[n+1];
					toSort[n+1]=tmp;
				}
			}
		}
	}

	public void insertSort(int[] toSort){
		int big = 0;
		int bigIndex = 0;
		for(int i=0;i<toSort.length;i++){
			for(int n=0;n<toSort.length-i;n++){
				big = toSort[0];
				bigIndex = 0;
				if (toSort[n]>big){
					big = toSort[n];
					bigIndex = n;
				}
			}
			toSort[bigIndex] = toSort[(toSort.length-1)-i];
			toSort[(toSort.length-1)-i] = big;
		}
	}

	public void generate(int num){
		buckets = new ArrayList[num];
		ran = new int[num];
		Random r = new Random();
		for (int i=0;i<num;i++){
			ran[i] = r.nextInt(9999);
		}
	}

	public String toString(){
		String r = "";
		for (int i=0;i<ran.length;i++){
			if (i!=ran.length-1)
				r+=ran[i] + ", ";
			else
				r+=ran[i];
		}
		return r;
	}
	public static void main(String[] args){
		Bubble b = new Bubble();
		double startTime;
		double endTime;

		int num = Integer.parseInt(args[0]);
		b.generate(num);
		//System.out.println("toSort: "+ b);

		startTime = System.currentTimeMillis();
		b.bSort(b.ran);
		endTime = System.currentTimeMillis() - startTime;
		System.out.println(/*b + */"\n" + "Time Bubble: " + endTime);

		System.out.println("\n---------------------\n");

		startTime = System.currentTimeMillis();
		b.insertSort(b.ran);
		endTime = System.currentTimeMillis() - startTime;
		System.out.println(/*b + */"\n" + "Time Insert: " + endTime);
	}
}
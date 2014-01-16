import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	//Radix a = new Radix(10000,3);
	//Radix b = new Radix(1000000,3);
	//Radix c = new Radix(10000,20);
	//Radix d = new Radix(1000000,20);

	Radix a = new Radix(100,3);
	Radix b = new Radix(100000,3);
	Radix c = new Radix(100,20);
	Radix d = new Radix(100000,20);
	System.out.println(Arrays.toString(a.insertSort(a.getData())));
	System.out.println(b.insertSort(b.getData()));
	System.out.println(c.insertSort(c.getData()));
	System.out.println(d.insertSort(d.getData()));//no idea why runs so fast; gotta go fast
	System.out.println(b.getSwaps());
	System.out.println(b.getConds());
	System.out.println(d.getSwaps());
	System.out.println(d.getConds());
	//System.out.println(Arrays.toString(a.selectSort(a.getData())));
	//System.out.println(b.selectSort(b.getData()));
	//System.out.println(c.selectSort(c.getData()));
	//System.out.println(d.selectSort(d.getData()));
	//System.out.println(Arrays.toString(a.bSort(a.getData())));
	//System.out.println(b.bSort(b.getData()));
	//System.out.println(c.bSort(c.getData())); //the 20 digits doesn't seem to work due to the long restriction if it were printed out
	//System.out.println(d.bSort(d.getData()));


	//System.out.println(Arrays.toString(a.optBSort(a.getData())));
	//System.out.println(b.optBSort(b.getData()));
	//System.out.println(c.optBSort(c.getData()));
	//System.out.println(d.optBSort(d.getData()));
	/*double t=System.currentTimeMillis();
	a.sort();
	System.out.print("10000 elements in with 3 digits: ");
	System.out.println(System.currentTimeMillis()-t);
	t=System.currentTimeMillis();
	b.sort();
	System.out.print("1000000 elements in with 3 digits: ");
	System.out.println(System.currentTimeMillis()-t);
	t=System.currentTimeMillis();
	c.sort();
	System.out.print("10000 elements in with 20 digits: ");
	System.out.println(System.currentTimeMillis()-t);
	t=System.currentTimeMillis();
	d.sort();
	System.out.print("1000000 elements in with 20 digits: ");
	System.out.println(System.currentTimeMillis()-t);




        
	t=System.currentTimeMillis();
	int[] data = new int[10000];
	Random r = new Random();
	double r1 = r.nextDouble();
	for (int i = 0; i<data.length;i++){
	    r1=r.nextDouble();
	    data[i]=(int)(r1*Math.pow(10,3));
	}
	Arrays.sort(data);
	System.out.print("Legit Sort 10000 elements in with 3 digits: ");
	System.out.println(System.currentTimeMillis()-t);
	t=System.currentTimeMillis();

	int[] data2 = new int[1000000];
	Random r2 = new Random();
	double r3 = r2.nextDouble();
	for (int i = 0; i<data2.length;i++){
	    r3=r.nextDouble();
	    data2[i]=(int)(r3*Math.pow(10,3));
	}
	Arrays.sort(data2);
	System.out.print("Legit Sort 1000000 elements in with 3 digits: ");
	System.out.println(System.currentTimeMillis()-t);
	t=System.currentTimeMillis();

	int[] data3 = new int[10000];
	Random r4 = new Random();
	double r5 = r4.nextDouble();
	for (int i = 0; i<data3.length;i++){
	    r5=r4.nextDouble();
	    data3[i]=(int)(r5*Math.pow(10,3));
	}
	t=System.currentTimeMillis();
	Arrays.sort(data3);
	System.out.print("Legit Sort 10000 elements in with 20 digits: ");
	System.out.println(System.currentTimeMillis()-t);
	t=System.currentTimeMillis();

	int[] data4 = new int[1000000];
	Random r6 = new Random();
	double r7 = r6.nextDouble();
	for (int i = 0; i<data4.length;i++){
	    r7=r6.nextDouble();
	    data4[i]=(int)(r7*Math.pow(10,3));
	}
	t=System.currentTimeMillis();
	Arrays.sort(data4);
	System.out.print("Legit Sort 1000000 elements in with 20 digits: ");
	System.out.println(System.currentTimeMillis()-t);
	t=System.currentTimeMillis();
	*/

    }
}

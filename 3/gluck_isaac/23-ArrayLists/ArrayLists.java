import java.util.*;
import java.io.*;

public class ArrayLists{
    public void test(int n){
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		long start=System.currentTimeMillis();
		for (int i=0;i<n;i++)
		    a.add("yolo");
		long end=System.currentTimeMillis();
		System.out.println(end-start + ": for adding to the end of an ArrayList");
		
		// long start2=System.currentTimeMillis();
		// for (int i=0;i<n;i++)
		// 	a2.add(0, "yolo");
		// long end2=System.currentTimeMillis();
		// System.out.println(end2-start2 + ": for adding to the beginning of an ArrayList");

		// long start3=System.currentTimeMillis();
		// for (int i=n;i>0;i--)
		//     a.remove(i);
		// long end3=System.currentTimeMillis();
		// System.out.println(end3-start3 + ": for deleting from the end of an ArrayList");

		// long start3=System.currentTimeMillis();
		// for (int i=0;i<a.size();i++)
		//     a.remove(i);
		// long end3=System.currentTimeMillis();
		// System.out.println(end3-start3 + ": for deleting from the beginning of an ArrayList");
	    }

	public void reverse(ArrayList<Integer> a){
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int indexg = a.size()-1;
		for (int i=0;i<a.size();i++){
			tmp.add(i,a.get(indexg));

			// System.out.println("i = "+i);
			// System.out.println("indexg = "+ indexg);
			System.out.println("tmp[i] = "+tmp.get(i));

			indexg=indexg-1;
		}

		a = tmp;
	}
}
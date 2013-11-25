import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int n = 500;
		Random r = new Random();
		for (int i = 0;i<n;i++)
			a.add(r.nextInt(10));
		//System.currentTimeMillis();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0;i<n;i++)
			b.add(0,r.nextInt(10));
		//System.out.println(System.currentTimeMillis());
		for (int i = 0;i<a.Length;i++)
			a.remove(i);
		for (int i = b.Length;i>0;i--)
			b.remove(i);
	}
}

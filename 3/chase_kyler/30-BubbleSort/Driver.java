import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {

		Sort b = new Sort();
		System.out.println(b);
		b.bSort();
		System.out.println(b+ "\n------------------");

		Sort s = new Sort();
		System.out.println(s);
		s.sSort();
		System.out.println(s+"\n-------------------");
		
		Sort i = new Sort();
		System.out.println(i);
		i.iSort();
		System.out.println(i+"\n-------------------");
		
	}
}

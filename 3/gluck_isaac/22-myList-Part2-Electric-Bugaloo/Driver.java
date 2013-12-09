import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args){
		MyList l = new MyList();
		for (int i=1;i<6;i++)
			l.add(i);
		System.out.println(l);
		l.add(2,100);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);

		System.out.println("-----------------------------");
		System.out.println("String List");
		System.out.println();

		StringMyList s = new StringMyList();
		for (int i=1;i<6;i++)
			s.add(""+i);

		System.out.println(s);
		s.add(2,"100");
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
	}
}
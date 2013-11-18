import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args){
		myList l = new myList();
		for (int i=1;i<6;i++)
			l.add(i);
		System.out.println(l);
		l.add(2,100);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
	}
}
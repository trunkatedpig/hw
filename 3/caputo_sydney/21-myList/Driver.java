import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	MyList l = new MyList(100);
	MyList b= new MyList(20);
	System.out.println("This is list one " + l);
	l.insert(2,10);
	System.out.println(l);
	l.remove(3);
	System.out.println(l);
	System.out.println("this is list two " +  b);
	b.insert(3,15);
	System.out.println(b);
	b.remove(0);
	System.out.println(b);
	 

	

    }



}
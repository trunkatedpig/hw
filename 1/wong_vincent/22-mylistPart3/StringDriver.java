import java.util.*;
import java.io.*;

public class StringDriver {
    public static void main(String[] args) {
	MyStringList a = new MyStringList();

	a.add("student1");
	System.out.println(a);

	a.add(1,"student2");
	System.out.println(a);
	
	a.add("student3");
	a.add("student3");
	a.add("student3");
	System.out.println(a);

	a.remove(5);
	System.out.println(a);
	
	System.out.println("-------------------");

	System.out.println(a.find("student3"));
	
	a.fremove("student3");
	System.out.println(a);
    }	    
}
	    

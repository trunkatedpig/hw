import java.io.*;
import java.util.*;


public class Driver {
    public static void main (String [] args) {

	Turtle t, t1, t2;
	String result;
	int result2;
	int result3;

	t = new Turtle();
	result = t.getName();
	result2 =t.getAge();
	result3= t.getSpeed();
	    System.out.println (result);
	    System.out.println (result2);
            System.out.println (result3);

    }
}

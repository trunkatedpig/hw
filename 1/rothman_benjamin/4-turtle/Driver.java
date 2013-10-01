import java.io.*;
import java.util.*;


public class Driver {
    public static void main (String [] args) {

	Turtle t, t1, t2;
	String result;
	int result2;
	int result3;
	Person p;

	t = new Turtle();
	result = t.getName();
	result2 =t.getAge();
	result3= t.getSpeed();
	System.out.println (result);
	System.out.println (result2);
        System.out.println (result3);
	
	t1 = new Turtle("Ethan");
	result = t1.getName();
	result2 = t1.getAge();
	result3 = t1.getSpeed();
	System.out.println (result);
	System.out.println (result2);
        System.out.println (result3);

	t2 = new Turtle("Sylvia", 28, 56);
       	result = t2.getName();
	result2 = t2.getAge();
	result3 = t2.getSpeed();
	System.out.println (result);
	System.out.println (result2);
        System.out.println (result3);

	p = new Person("Beannas Rayluda",Turtle("Billy", 5, 10));
	result = p.getName();
	System.out.println (result);
        result2 = p.getPet();
	System.out.println (result2);

    }

    /* Person Beannas = new Person("Beannas Rayluda");
    //I don't know what I should call to test this... */
}

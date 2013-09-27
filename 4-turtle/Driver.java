import java.util.*;
import java.io.*;

public class Driver{
	public static void main(String[] args){
	        Turtle t1, t2;
		t1 = new Turtle();
		t2 = new Turtle("Albert");
		
		t1.speedUp(5);
		t1.slowDown(5);
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getSpeed());
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getSpeed());
	}
}

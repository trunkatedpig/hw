import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){
	Turtle t1,t2;
	t1 = new Turtle("Sean",3,4);
	System.out.println(t1.getName());
	System.out.println(t1.getSpeed());
	System.out.println(t1.getAge());
	t2 = new Turtle();
	System.out.println(t2.getName());
	System.out.println(t2.getSpeed());
	System.out.println(t2.getAge());
    } 

}
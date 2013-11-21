import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	
	MyList2 ml2 = new MyList2();

	System.out.println("caspa");
	System.out.println(ml2.toString());
	ml2.insert(10, 10);
	System.out.println(ml2.toString());
	System.out.println(ml2.find(10));
	ml2.remove(12);
	System.out.println(ml2.toString());
	ml2.fremove(10);
	System.out.println(ml2.toString());
    }
}
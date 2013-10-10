import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Loops n1,n2;

	n1 = new Loops();
	String result = "" + n1.fact(6);
	System.out.println(result);
	n2 = new Loops();
	String result2 = "" + n2.fact2(3);
	System.out.println(result2);
    }
}

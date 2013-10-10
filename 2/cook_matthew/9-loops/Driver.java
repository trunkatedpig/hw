import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops s= new Loops();
	System.out.println(s.fact(5));//should be 120
	System.out.println(s.fact2(5));
	System.out.println(s.fact2(7));
	System.out.println(s.fact2(9));
	System.out.println(s.fact2(11));
	System.out.println(s.fact2(13));
	System.out.println(s.fact2(15));

    }
}
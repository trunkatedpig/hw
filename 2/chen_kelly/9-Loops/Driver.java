import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

	Loops loop1 = new Loops();
	Loops loop2 = new Loops();

	System.out.println(loop1.fact(0));
	System.out.println(loop1.fact2(0));
	System.out.println(loop1.fact(1));
	System.out.println(loop1.fact2(1));
	System.out.println(loop1.fact(6));
	System.out.println(loop1.fact2(6));
	}
}

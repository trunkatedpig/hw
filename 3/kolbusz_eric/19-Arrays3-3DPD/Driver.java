import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayStuff a;
	a = new ArrayStuff();

	System.out.println(a);
	System.out.println(a.mean());
	System.out.println(a.stddev());
    }
}

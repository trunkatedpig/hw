import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops a;
	a = new Loops();
	System.out.println(a.fact(5));
	System.out.println(a.fact(10));
	System.out.println(a.fact2(5));
	System.out.println(a.fact2(10));
    }
}

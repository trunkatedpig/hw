import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Loops l;
	int n;
	n = 5;
	l = new Loops();
	System.out.println(l.fact(n));
	System.out.println(l.fact2(n));
    }
}

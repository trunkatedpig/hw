import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args) {
	Loops n = new Loops();
	System.out.println(n.fact(3));
	System.out.println(n.fact(5));
	System.out.println(n.fact(0));
	System.out.println(n.fact2(3));
	System.out.println(n.fact2(5));
	System.out.println(n.fact2(0));
    }

}
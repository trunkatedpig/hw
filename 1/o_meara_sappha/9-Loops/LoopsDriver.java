import java.io.*;
import java.util.*;

public class LoopsDriver {
    public static void main (String[] args) {
        Loops loop;
	loop = new Loops();
	System.out.println(loop.fact(0));
	System.out.println(loop.fact(5));
	System.out.println(loop.fact(10));
	System.out.println(loop.fact2(0));
	System.out.println(loop.fact2(5));
	System.out.println(loop.fact2(10));
    }
}

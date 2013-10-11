import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Loops one = new Loops();
	
	System.out.println(one.fact(1));
	System.out.println(one.fact(5));
	System.out.println("Above = recursion. Below = while");
	System.out.println(one.fact2(1));
	System.out.println(one.fact2(5));

    }
}
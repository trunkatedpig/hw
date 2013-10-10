import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Loops n= new Loops();
	System.out.println("Recursions");
	System.out.println(n.fact(4));
	System.out.println(n.fact(0));
	System.out.println(n.fact(10));
	System.out.println("While Loops");
	System.out.println(n.fact2(4));
	System.out.println(n.fact2(0));
	System.out.println(n.fact(10));

    }
}

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Loops a = new Loops();
	System.out.println(a.fact(0));
	System.out.println(a.fact(-1));
	System.out.println(a.fact(1));
	System.out.println(a.fact(4));
	
	System.out.println(a.fact2(4));
	System.out.println(a.fact2(-1));
	System.out.println(a.fact2(0));
    }
}
import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Loops l = new Loops();

	System.out.println("testing fact");
	System.out.println(l.fact(13));
	System.out.println(l.fact(3));

	System.out.println("testing fact2");
	System.out.println(l.fact2(13));
	System.out.println(l.fact2(6));                	
    }
}

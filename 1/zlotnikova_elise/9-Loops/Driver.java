import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Loops Loop; 
	Loop = new Loops();
	System.out.println(Loop.fact(0));
	System.out.println(Loop.fact(2));
	System.out.println(Loop.fact(3));
	System.out.println(Loop.fact2(0));
	System.out.println(Loop.fact2(2));
	System.out.println(Loop.fact2(3));
    }
}

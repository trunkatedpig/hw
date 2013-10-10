import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Factorial f;
	f = new Factorial();
	
	int i1,i2,i3;
	i1 = -2;
	i2 = 0;
	i3 = 5;

	System.out.println(f.fact(i1)); //0
	System.out.println(f.fact(i2)); //1
	System.out.println(f.fact(i3)); //120
	
	System.out.println(f.fact2(i1)); //0
	System.out.println(f.fact2(i2)); //1
	System.out.println(f.fact2(i3)); //120	
    }
}

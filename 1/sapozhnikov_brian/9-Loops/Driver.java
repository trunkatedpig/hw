import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Loops L = new Loops();
	System.out.println(L.fact(5));
	System.out.println(L.fact2(4));
	System.out.println(L.GCD(8,12));
	System.out.println(L.GCD2(40,100));
    }
}

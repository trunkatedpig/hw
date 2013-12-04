import java.io.*;
import java.util.*;

public class LDriver {
    public static void main(String[] args) {
	Loops L1 = new Loops();

	System.out.println(L1.fact(4));
	System.out.println(L1.fact(8));
	System.out.println(L1.fact(-8));
	System.out.println(L1.fact2(5));
	System.out.println(L1.fact2(6));
	System.out.println(L1.fact2(0));
    }
}
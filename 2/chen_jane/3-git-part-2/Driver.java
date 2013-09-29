import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Greeter h,s;
	String result;

	h = new Greeter();
        s = new Greeter();
	System.out.println(h.happyGreet("Kevin"));
	System.out.println(s.sadGreet("Justine"));
    }
}


import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	ArrayStuff array = new ArrayStuff();
	System.out.println(array);
	System.out.println(array.mean());
	System.out.println(array.stddev());
    }
}

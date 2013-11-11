import java.io.*;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		ArrayStuff x = new ArrayStuff();
		System.out.println(x.toString());
		System.out.println(x.mean());
		System.out.println(x.stddev());
	}
}
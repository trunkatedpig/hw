import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		Encoder e = new Encoder();
		System.out.println(e.encode("hello",3));
		System.out.println(e.encode("hELlO",3));
		System.out.println(e.lowerCase("hELlO"));
	}
}

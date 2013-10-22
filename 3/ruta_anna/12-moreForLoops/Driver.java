import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class For *-*");
		System.out.println();

		For f;
		f = new For();

		System.out.println("Star Diagonal For-Loop");
		System.out.println("5 Star Diagonal");
		System.out.println(f.diag(5));
		System.out.println();

		System.out.println("Word Diagonal For-Loop");
		System.out.println("Hello Diagonal");
		System.out.println(f.diagWord("Hello"));
		System.out.println();

		System.out.println("Fence For-Loop");
		System.out.println("5 x 8 Fence");
		System.out.println(f.fence(5,8));
		System.out.println();
		System.out.println("2 x 2 Fence");
		System.out.println(f.fence(2,2));
		System.out.println();
		System.out.println("1 x 1 Fence");
		System.out.println(f.fence(1,1));

	}
}
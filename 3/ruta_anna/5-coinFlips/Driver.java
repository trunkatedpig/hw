import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing Coin Class *-*");
		System.out.println();

		Coin c1;
		c1 = new Coin();

		System.out.println(" Using resetCounts method ");
		c1.resetCounts();
		System.out.println();

		System.out.println(" Using getCurrentFace method ");
		System.out.println(" current face: " + c1.getCurrentFace());

		System.out.println();
	}
}

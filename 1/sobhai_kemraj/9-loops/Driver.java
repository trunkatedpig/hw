import java.io.*;
import java.util.*;

public class Driver{
	public static void main(String[] args){
		Loops loop = new Loops();
		int output = loop.fact(3);
		System.out.println(loop.fact(3));
		System.out.println(loop.fact(0));
		System.out.println(loop.fact(1));
		System.out.println(loop.GCD(6,3));
		System.out.println(loop.GCD(6,2));
		System.out.println(loop.GCD(1,1));
		System.out.println(loop.GCD(0,0));
		System.out.println(loop.GCD(100,10));
		System.out.println(loop.GCD(7,5));

		System.out.println(loop.GCD(100,100));
	}



}

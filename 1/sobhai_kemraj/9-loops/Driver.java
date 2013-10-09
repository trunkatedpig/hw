import java.io.*;
import java.util.*;

public class Driver{
	public static void main(String[] args){
		Loops loop = new Loops();
		int output = loop.fact(3);
		System.out.println(loop.fact(3));
		System.out.println(loop.fact(0));
		System.out.println(loop.fact(1));
	}
}

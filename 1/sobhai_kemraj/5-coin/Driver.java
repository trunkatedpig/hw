import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		//coin flipping session
		Coin one, two;
		one = new Coin();
		one.flip();
		System.out.println(one.getFace());
		two = new Coin(10);
		two.flip();
		System.out.println(two.getFace());
	}

}

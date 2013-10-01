import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		//coin flipping session
		Coin one;
		one = new Coin();
		one.flip();
		System.out.println(one.getFace());
	}

}

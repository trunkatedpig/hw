import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		Cipher test = new Cipher();
		//System.out.println(test.encode("hello", 3));
		//System.out.println(test.encode("rot13", 3));
		//System.out.println(test.encode("123", 3));
		//System.out.println(test.encode("!@#$%^&*()", 3));
		//System.out.println(test.encode("bo0m", 3));
		//System.out.println(test.encode("evad3rs", 3));		
		
		double[] array = test.getCorpusFreq();
		//System.out.println(Arrays.toString(array));
		for (int i = 0; i < 26; i ++){
			System.out.println(array[i]);
		}
	}
}
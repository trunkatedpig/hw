import java.io.*;
import java.util.*;

public class Driver{
	public static void main (String[] args){
		Cipher test = new Cipher();
		System.out.println(test.encode("hello", 3));
	}
}
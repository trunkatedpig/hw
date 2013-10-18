import java.io.*;
import java.util.*;

public class Practice{
	
	public void diag(int n) {
		String part = "";
		for ( int sp = 0; sp < n ; sp++ ) {
			part = "*";
			for (int x = 0; x != sp; x++) {
				part = " " + part ;
				}
			System.out.println(part);
		}
	}
	
	public void diagWord(String s) {
		
	}
}
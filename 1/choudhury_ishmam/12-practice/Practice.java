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
		String part = ""; 
		for ( int sp = 0 ; sp < s.length() ; sp++) {
			part = s.substring(sp, sp + 1);
			for (int x = 0; x != sp ; x++) {
				part = " " + part;
			}
		System.out.println(part);
		}
	}

	public void fence(int h, int w) {
		String bases = "+";
		int l = 0;
		while ( l < w - 2) {
			bases = bases + "-";
			l++; 
			}
		bases = bases + "+";
		
		int s = 0;
		String sides = "|";
		while ( s < w - 2 ) {
			sides = sides + "a";
			s++;
			}
		sides = sides + "|";
		
		System.out.println(bases);
		for ( int i = 0 ; i != h - 2 ; i++) {
			System.out.println(sides);
			}
		System.out.println(bases);
	}
	
}
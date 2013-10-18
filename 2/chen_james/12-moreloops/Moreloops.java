import java.io.*;
import java.util.*;

public class Moreloops {
	public String diag (int n) {
		//int counter;
		String result = "";
		for( int counter = 0; counter < n; counter = counter + 1) {
			int j = counter;
			while ( j > 0 ) {
				result = result + " ";
				j = j - 1;
				}
			result = result + "*" + "\n";
		}
		return result;
		
	}
	
	public String diagWord(String w) {
		String result = "";
		int n = w.length();
		for (int counter = 0; counter < n; counter = counter + 1) {
			int j = counter;
			int letter = j;
			while (j > 0) {
				result = result + " ";
				j = j -1;
			}
			result = result + w.substring(letter,letter+1) + "\n";
		}
		return result;
	
	}
	
	private String end = "+";
	private String mid = "|";
	
	public void  makeEndRow (int h, int w) {
	int counth;
	int countw;
		
	for (countw = 0; countw < (w - 2); countw = countw + 1) {
		end = end + "-";
		}
		end = end + "+" + "\n";
		//return end;
	}
	
	public void  makeMidRow (int h, int w) {
		int counth;
		int countw;
		
		for (countw = 0; countw < (w - 2); countw = countw + 1) {
		mid = mid + " ";
		}
		mid = mid + "|" + "\n";
		//return mid;
	}
	
	
	public String fence(int h, int w) {
		if (h <=2 || w<=2) {
			return "cannot do this";
		}
		this.makeMidRow(h,w);
		this.makeEndRow(h,w);
		String result=end;
		int counth;
		int countw;
		for (counth = 1; counth < (h-2); counth = counth + 1) {
			result = result + mid;
		}
		result = result + end;
		return result;
		}
	}
	
		
	

    
    



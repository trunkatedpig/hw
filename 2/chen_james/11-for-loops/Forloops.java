import java.io.*;
import java.util.*;

public class Forloops {

	public long fact1 (long a) {
		long ans;
		for (ans = 1; a > 0; a = a-1) {
			ans = ans * a;
		}
		return ans;
	}
	
	/* public String reverse (String s) {
		String result="";
		int length;
		for (length = s.length(); length > 0; length = length - 1) {
			result = result + s.substring(length - 1, length);
		}
			return result;
	}
	*/
	
	public String reverse (String s) {
		String results = "";
		int length;
		//int letter;
		for(length = s.length(); length > 0; length = length - 1) {
			result = result + s.substring(length - 1, length);
		}
		return result;
		
	}
	
	private String start="",result="";
	
	public void startTable(int n, int m) {
	int startrow;
	for (startrow = 1; startrow < (n + 1); startrow = startrow + 1) {
		start = start + " " + startrow ;
		}
	result = start + "\n";
	//return result;
	}
	
	public String table (int n, int m) {
	
	int row;
	int column;
	this.startTable(n, m);
	for (row = 1; row < (m + 1); row = row + 1) {
		result = result + row + " ";
		for (column = 1; column < (n + 1); column = column + 1) {
			result = result + (column * row) + " ";
			}
		result = result + "\n";	
	}
	return result;
			
			
	}
	private String results="";
	
	public void startDivTable (double n, double m) {
		double column;
		double row;
		String startDivTableresults = " ";
		for (column = 1; column < (m + 1); column = column + 1) {
			startDivTableresults =startDivTableresults + column + " ";
		}
		startDivTableresults = startDivTableresults + "\n";
		results = startDivTableresults;
		//return results;
		}
	
	
	
	
	public String divtable (double n, double m) {
		this.startDivTable(n,m);
		double column;
		double row;
		for (row = 1; row < (n + 1); row = row + 1) {
			result = result + row + " ";
			for (column = 1; column < (n + 1); column = column + 1) {
				results = results + column + " " + (column / row);
			}
			results = results + "\n";
		}
		return results;
	
	
	}
	
	}

	
	



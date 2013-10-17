import java.io.*;
import java.util.*;

public class For {
	
	//Question one
	//rewriting of the GCD method in a for loop
	public int GCD (int a, int b){
		int r;
		//Since b is already initialized, it is set to itself
		for (b=b; b!= 0; b=r){
			r= a%b;
			a=b;
			b=r;
		}
		return a;
	}

	//Question 2, Reverse a string
	public String Reverse (String s){
		//This is based on the way we did it in Python
		String sub,reversed;
		int place, length;

		length = s.length();
		place = 0;
		reversed = "";

		for (length = s.length(); place < length; place++){
			sub = s.substring((length-place)-1, length-place);
			reversed = reversed + sub;
		}
		return reversed;
	}

	//Question 3, output a N x M Table
	
	
}

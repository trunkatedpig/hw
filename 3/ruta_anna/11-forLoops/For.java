import java.io.*;
import java.util.*;

public class For {

/* A for loop factorial method */
	public int factorial(int n) {
		int fact = 1;
		for (int i=1; i<=n; i++){
			fact = fact * i;
			}
		return fact;
	}

/*A for loop which will reverse the order of the letters in a string*/
	public String reverse(String s){
		String reverseWord = "";
		for (int length = s.length(); length > 0; length = length - 1){
			reverseWord = reverseWord + s.substring(length-1, length);
			}
		return reverseWord;
	}

/*A for loop which will create a product table for two integers */
	public String table(int a, int b) {
		String productTable = "";
		for (int i=1; i<=b; i++){
			for (int j=1; j<=a; j++){
				productTable += (i*j)+" ";
			}
			productTable += "\n";
		}
		return productTable;
	}

}



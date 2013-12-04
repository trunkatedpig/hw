import java.io.*;
import java.util.*;

public class For{

    public int gcd(int a, int b) {
	int i;
	for(i = a; i > 0; i--) {
	    if (a%i == 0 && b%i == 0)
		return i;
	}
	return 1;
    }

    public String reverse(String s) {
	String temp = "";
	for(int i = s.length(); i > 0; i--)
	    temp = temp + s.substring(i-1, i);
	return temp;
    }


    public String table(int n, int m) {
	String temp = "\t";
	if (n == 0 || m == 0)
	    return "0";
	for(int i = 1; i <=n; i++)
	    temp = temp + i + "\t";
	temp = temp + "\n";
	for(int i = 1; i <= m; i++) {
	    temp = temp + i + "\t";
	    for(int j = 1; j <= n; j++)
		temp = temp + (i*j) + "\t";
	    temp = temp + "\n";
	}
	return temp;
    }

}

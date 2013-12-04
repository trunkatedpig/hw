import java.util.*;
import java.io.*;

public class For {
    public boolean isPrime(int p){
	int x = p-1;
	for (;p%x !=0; x--){}
	return x==1;
    }

    public String Reverse(String s){
	String endstring =  "";
	int len = s.length();
	for (int l=0; l< len; l++){
	    int lenofsub = s.length();
	    endstring= endstring+ s.substring(lenofsub-1);
	    s=s.substring(0, lenofsub-1);
	}
	return endstring;

    }

}
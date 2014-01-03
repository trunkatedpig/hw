import java.io.*;
import java.util.*;

public class Cipher{

    public String encode(String s, int n){
	s.toLowerCase();
	int a=Character.getNumericValue('a');
	int z=Character.getNumericValue('z');
	String result=new String();
       	for (int i=0;i<s.length();i++){
	    // if (s.charAt(i)>=a || s.charAt(i)<=z){
		int x=Character.getNumericValue(s.charAt(i));
		//	System.out.println(x);
		int y=x+n;
		//	System.out.println(y);
		char c=Character.forDigit(y,16);
		result=result+ (String)c;
		// }
		// else{
		//result=result+s.charAt(i);
		// }
	}
	return result;
    }
}
//having some difficulties, will resolve later

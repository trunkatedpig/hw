import java.io.*; 
import java.util.*;

public class For{
    
    public String Reverse(String s){
	int r = s.length();
	String result = " "; 
	for(; r > 0; r--)
	    result = result + s.substring(r-1,r);
	return result; 
    }


    public String mulitply(int a, String b){
	String c = ""; 
	for (; a >= 0; a--)
	    c = c + b; 
	return c;
    }

    public String diag(int n){
	String a = ""; 
	int i = 0;
	while (n >= i){
	    a = a + multiply(i, " ") + "*"+ "/n";
	    i = i + 1; 
	} 
	return a ;
     }
   
    public String diadWord(String W){
	String a = "";
	int b = 0;
	int i = W.length(); 
	for (; i >= b; b++)
	    a = a + multiply(b, " ") + W.substring(i, i+1) + "/n";
	return a;
    }
   
    public String fence(int h, int w){
	String a; 
	String b;
	String c;
	int d = h-2;
	int e = 1;
	for (a= ""; e >= 0; e--)
	    a = a + "+" + multiply(w-2, "-") + "-" + "/n";
	for (b = ""; d >= 0; d--)
	    b = b + "|" + multiplu(w-2, " ") + "|" + "/n" ;
	for (c = ""; e >= 0; e--)
	    e = e + "+" + multiply(w-2, "-") + "-" + "/n";
	return a + b + c;
	    }
	    
		
		
	       
		  
	

}

public java.io.*; 
public java.util.*; 


public class Cipher{ 
    public string encode(String s, int offset){ 
	String x = ""; 
	char c;
	s = s.toLowerCase(); 
	for (int i = 0; i < s.length(); i++){ 
	    c = charAt(i); 
	    if (c >= 'a' && c <= 'z')
		x = x + (char) (((c-'a'+offset)%26)+'a');
	}
	return x; 
    } 


	       
       

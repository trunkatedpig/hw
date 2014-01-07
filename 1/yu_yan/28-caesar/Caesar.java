import java.util.*;
import java.io.*;

public class Caesar{
    public String decode;
    public String shakespeare;
    public int[] percentage = new int[26];
    public double[] charpercent = new double[26];
    public Caesar(){
	try {
	    Scanner sc = new Scanner (new File("shakespeare.txt"));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c>='a' && c<='z')
			percentage[c-97] = percentage[c-97]+1;
		    else{}
		}
	    }
	}catch (Exception e){}

	double total = 0;
        for(int x=0; x<percentage.length; x++){
	    total = total + (double)percentage[x];
	}

	for(int x=0; x<charpercent.length; x++){
	    charpercent[x] = (double)percentage[x]/total;
	    System.out.println(charpercent[x]*100);
	}	
    }
    
    public String encode(String s, int n){
	n = n%26;
	s = s.toLowerCase();
	System.out.println(s);
	String str = "";
	System.out.println(str);
	for (int x=0; x<s.length();x++){
	    char c = s.charAt(x);
	    if (c >= 'a' && c <= 'z'){
		//if they're lowercase alphabets
		if (c+n > 122)
		    str = str + (char)(97+(c+n - 123));
		else
		    str = str + (char)(c+n);
	    }
	    else
		str = str + (char)c;
	}
	System.out.println(str);
	return str;
    }

    public String decode(String s){
    }
    
}

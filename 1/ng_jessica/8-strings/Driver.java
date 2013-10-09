import java.io.*; 
import java.util.*; 

public class Driver {
    
    public static void main (String[] args) {
	
	String n; 
	n = "nita callahan";
	String k;
	k = "kit rodriguez";

	String i; 
	i = StringStuff.capitalize (n); 
	String j; 
	j = StringStuff.capitalize (k); 

	System.out.println (i); 
	System.out.println (j); 

	String x; 
	x = i; 
	x = StringStuff.bondify (x); 
	String y; 
	y = j; 
	y = StringStuff.bondify (y); 

	System.out.println (x); 
	System.out.println(y); 


	String a;
	String b; 
	a = "defenestrate"; 
	b = "ubiquitous"; 
	a = StringStuff.pigLatinify (a); 
	b = StringStuff.pigLatinify (b); 
	
	System.out.println (a); 
	System.out.println (b); 
    }
}

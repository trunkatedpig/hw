import java.util.*;
import java.io.*;

public class Cipher{
    
    public String encode(String s, int n){
	String u="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String l="abcdefghijklmnopqrstuvwxyz";
	for (int i=0;i<s.length();i++){
	    //Below will lowercase the string	
	    if (u.indexOf(s.substring(i,i+1))!=-1){
		String a="";
		int q=u.indexOf(s.substring(i,i+1));
		a=s.substring(0,i)+l.substring(q,q+1)+s.substring(i+1);
		s=a;}
	    
	    //Below will encode the string
	    String a="";
	    if (l.indexOf(s.substring(i,i+1))!=-1){
		a=s.substring(0,i);
		int q=(l.indexOf(s.substring(i,i+1))+n)%26;
		a=a+l.substring(q,q+1)+s.substring(i+1);
		s=a;}
	}
	return s;
    }
    
    private double[] CorpusFreqs=new double[26];

    private void buildCorpusFreq(String filename){
	int q=0;
	try{
	    Scanner sc=new Scanner (new File(filename));
	    while (sc.hasNext()){
		String s =sc.nextLine();
		s=s.toLowerCase();
		for (int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if (c>='a' && c<='z'){
			CorpusFreqs[c-'a']=CorpusFreqs[c-'a']+1;
			q=q+1;}
		}
	    }
	} catch (Exception e) {System.out.println(e);}
	for (int i=0;i<CorpusFreqs.length;i++){
	    CorpusFreqs[i]=CorpusFreqs[i]/q;}
	System.out.println(Arrays.toString(CorpusFreqs));
    }
    
    public static void main(String[] args){
	Cipher c=new Cipher();
	System.out.println(c.encode("hello",3));
	System.out.println(c.encode("abcxyz",3));
	System.out.println(c.encode("hi there!",1));
	System.out.println(c.encode("HI THERE!",1));
	c.buildCorpusFreq("The Mechanical Properties of Wood by Samuel J. Record.txt");
    }    
}

import java.io.*;
import java.util.*;

public class ForLoops{
    public String reverse(String s){
	int i,length;
	String reversed=new String();
	length=s.length();
	for (i=0;i<length;i=i+1){
	    reversed= s.substring(i,i+1)+reversed;
	}
	return reversed;
    }
    public String table(int n, int m){
	String answer=new String();
	int i,j,x;
	for (i=0;i<=n;i=i+1){
	    answer=(n-i)+ answer;
	}
	answer=answer + "\n";    
	for (j=0;j<=m;j=j+1){
	    answer=j+ " ";
	    for (x=0;x<=n;x=x+1){
		answer=((n-x)*j)+" "+answer;
	    }
	    answer=answer+"\n";
	}
	
	return answer;
    }
}

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
	int i;
	for (i=0;i<n;i=i+1){
	    answer=(n-i)+ answer;
	}
	for (i=0;i<(n*m);i=i+1){
	    answer=(n-i)*m + answer;
	}
	return answer;
    }
}

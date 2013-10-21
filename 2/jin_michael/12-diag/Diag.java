import java.io.*;
import java.util.*;
public class Diag{
    public String diag(int n){
	String answer = "";
	for(int w=0;w<n;w++){
	    for (int z=w;z>0;z--){
		answer = answer + " ";
	    }
	    answer = answer + "*" + "\n";
	}
	return answer;
    }


    public String diagWord(String s){
	String answer = "";
	for(int w=0;w<s.length();w++){
	    for (int z=w;z>0;z--){
		answer = answer + " ";
	    }
	    answer = answer + s.substring(w,w+1) + "\n";
	}
	return answer;
    }

    public String diagWord2(String s){
	String answer="";
	int n=0;
	while (n<s.length()){
	    int w=n;	    
	    while (w>0){
		answer=answer+" ";
		w=w-1;}
	    answer=answer+s.substring(n,n+1)+"\n";
	    n=n+1;}
	return answer;
    }

    public String fence(int a,int b){
	String answer="+";
	for (int n=b-2;n>0;n--){
	    answer=answer+"-";}
	answer=answer+"+\n";
	for (int n=a-2;n>0;n--){
	    answer=answer+"|";
	    int w=b-2;	    
	    for (;w>0;){
		answer=answer+" ";
		w=w-1;}
	    answer=answer+"|\n";}
	answer=answer+"+";
	for (int n=b-2;n>0;n--){
	    answer=answer+"-";}
	answer=answer+"+";
	return answer;
    }

}
